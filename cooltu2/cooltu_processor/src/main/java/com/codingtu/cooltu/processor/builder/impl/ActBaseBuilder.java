package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.processor.builder.core.CoreBuilder;
import com.codingtu.cooltu.processor.lib.log.Logs;
import com.codingtu.cooltu.processor.lib.tools.IdTools;

import java.util.List;

public class ActBaseBuilder extends CoreBuilder {
    public String baseClass;
    public IdTools.Id layout;

    public ActBaseBuilder(JavaInfo info) {
        super(info);
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

//        import android.view.View;
//
//import java.util.List;
//
//import okhttp3.ResponseBody;
//import retrofit2.adapter.rxjava2.Result;


        addImports(FullName.VIEW,FullName.LIST);

    }
}
