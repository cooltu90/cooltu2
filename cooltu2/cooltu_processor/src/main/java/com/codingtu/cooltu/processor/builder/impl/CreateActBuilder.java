package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.constant.Pkg;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.processor.builder.core.CoreBuilder;
import com.codingtu.cooltu.processor.lib.log.Logs;

import java.util.List;

public class CreateActBuilder extends CoreBuilder {

    private final String layoutName;
    private final JavaInfo actResJavaInfo;
    private final JavaInfo actBaseJavaInfo;

    public CreateActBuilder(JavaInfo info, String layoutName, JavaInfo actResJavaInfo, JavaInfo actBaseJavaInfo) {
        super(info);
        this.layoutName = layoutName;
        this.actResJavaInfo = actResJavaInfo;
        this.actBaseJavaInfo = actBaseJavaInfo;
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
    protected String[] getParents() {
        return new String[]{actBaseJavaInfo.name};
    }

    @Override
    protected void addLines() {
        addImports(
                Pkg.R + ".R",
                FullName.TO,
                FullName.ACT_BASE,
                actBaseJavaInfo.fullName,
                actResJavaInfo.fullName);

        addHeader("@[To]([ActivityRes].class)", FullName.TO_SHORT_NAME, actResJavaInfo.name);

        addHeader("@[ActBase](layout = R.layout.[activity_layout])", FullName.ACT_BASE_SHORT_NAME, layoutName);
    }
}
