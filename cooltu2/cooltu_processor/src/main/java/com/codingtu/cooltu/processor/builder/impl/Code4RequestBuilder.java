package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;
import com.codingtu.cooltu.processor.builder.core.CoreBuilder;
import com.codingtu.cooltu.processor.lib.lines.DatasGetter;
import com.codingtu.cooltu.processor.lib.path.CurrentPath;
import com.codingtu.cooltu.processor.lib.tools.LayoutTools;

import java.util.HashMap;
import java.util.Map;

public class Code4RequestBuilder extends CoreBuilder {

    public static final Code4RequestBuilder BUILDER = new Code4RequestBuilder();

    public Map<String, String> fullNames = new HashMap<>();

    public Code4RequestBuilder() {
        super(CurrentPath.javaInfo(FullName.CODE_4_REQUEST));
    }

    public void addAct(String actFullName) {
        addStaticName(CurrentPath.actStaticName(actFullName));
    }

    public void addStaticName(String name) {
        fullNames.put(name, name);
    }

    @Override
    protected void addLines() {
        addFieldLine("    public static final int CODE_STATIC_NAME = 0;", fullNames.keySet(), new DatasGetter<String>() {
            @Override
            public Object[] data(int position, String s) {
                return new Object[]{
                        "CODE_STATIC_NAME", s,
                        "0", position,
                };
            }
        });
    }

}
