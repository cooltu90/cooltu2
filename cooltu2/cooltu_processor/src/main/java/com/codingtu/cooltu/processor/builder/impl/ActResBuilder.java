package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.processor.annotation.res.ResFor;
import com.codingtu.cooltu.processor.builder.core.CoreBuilder;
import com.codingtu.cooltu.processor.lib.log.Logs;

import java.util.List;

public class ActResBuilder extends CoreBuilder {
    private final JavaInfo actJavaInfo;

    public ActResBuilder(JavaInfo info, JavaInfo actJavaInfo) {
        super(info);
        this.actJavaInfo = actJavaInfo;
    }

    @Override
    protected boolean isBuild() {
        return true;
    }

    @Override
    protected void beforeBuild(List<String> lines) {
        super.beforeBuild(lines);
        Logs.i(lines);
    }

    @Override
    protected String[] getImports() {
        return new String[]{
                FullName.RES_FOR,
                actJavaInfo.fullName
        };
    }

    @Override
    protected void addLines() {
        addHeader("@[ResFor]([Activity].class)", FullName.RES_FOR_SHORT_NAME, actJavaInfo.name);
    }
}
