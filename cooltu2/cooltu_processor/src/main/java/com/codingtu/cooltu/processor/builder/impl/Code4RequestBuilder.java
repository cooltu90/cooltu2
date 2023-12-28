package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;
import com.codingtu.cooltu.processor.builder.core.CoreBuilder;
import com.codingtu.cooltu.processor.lib.path.CurrentPath;

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
        tempLines("    public static final int [CODES_TEST] = [0];", 0);
        Ts.ts(fullNames.keySet()).ls(new BaseTs.EachTs<String>() {
            @Override
            public boolean each(int position, String fullName) {
                addFields(0, fullName, position);
                return false;
            }
        });
    }

}
