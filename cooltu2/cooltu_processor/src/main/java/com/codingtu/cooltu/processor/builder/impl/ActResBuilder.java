package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
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
        return false;
    }

    @Override
    protected void beforeBuild(List<String> lines) {
        super.beforeBuild(lines);
        Logs.i(lines);
    }

    @Override
    protected void addLines() {
        addImports(FullName.RES_FOR, actJavaInfo.fullName);

        addHeader("@[ResFor]([Activity].class)", FullName.RES_FOR_SHORT_NAME, actJavaInfo.name);
    }
}
