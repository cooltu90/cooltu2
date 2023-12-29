package com.codingtu.cooltu.processor.builder.core;

import com.codingtu.cooltu.constant.ClassType;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.lib4j.data.symbol.Symbol;
import com.codingtu.cooltu.lib4j.file.write.FileWriter;
import com.codingtu.cooltu.lib4j.tools.CountTool;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;
import com.codingtu.cooltu.processor.BuilderType;
import com.codingtu.cooltu.processor.lib.BuilderMap;
import com.codingtu.cooltu.processor.lib.tools.TagTools;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CoreBuilder implements Symbol {

    protected JavaInfo javaInfo;
    protected List<String> fieldLines = new ArrayList<>();
    protected List<String> methodLines = new ArrayList<>();
    protected List<String> beforeClassLines = new ArrayList<>();
    protected List<String> importLines = new ArrayList<>();
    private Map<Integer, String> tempLines = new HashMap<>();

    @Override
    public String obtainSymbol() {
        return getClass().getCanonicalName();
    }

    public CoreBuilder(JavaInfo info) {
        this.javaInfo = info;
        BuilderMap.add(getBuilderType(), this);
    }

    protected BuilderType getBuilderType() {
        return BuilderType.DEFAULT;
    }

    public void create() {
        if (javaInfo == null) {
            return;
        }
        File file = new File(javaInfo.path);
        if (isGetLines() && (isForce() || !file.exists())) {
            List<String> lines = getLines();
            beforeBuild(lines);
            if (isBuild() && !CountTool.isNull(lines)) {
                FileWriter.to(file).cover().write(lines);
            }
        }
    }

    protected boolean isGetLines() {
        return true;
    }

    protected boolean isBuild() {
        return true;
    }

    protected boolean isForce() {
        return true;
    }


    protected void beforeBuild(List<String> lines) {

    }

    protected List<String> getLines() {
        addLines();

        List<String> strings = new ArrayList<>();
        //pkg
        strings.add("package " + javaInfo.pkg + ";");
        strings.add("");
        //imports
        strings.addAll(importLines);
        strings.add("");
        strings.addAll(beforeClassLines);

        //class的描述
        StringBuilder classSb = new StringBuilder();
        classSb.append(classType()).append(" ");
        if (isFinal()) {
            classSb.append("final ");
        }
        if (isInterface()) {
            classSb.append("interface ");
        } else {
            if (isAbstract()) {
                classSb.append("abstract ");
            }
            classSb.append("class ");
        }
        classSb.append(javaInfo.name).append(" ");
        String[] parents = getParents();
        if (!CountTool.isNull(parents)) {
            if (isInterface()) {
                classSb.append("implements ");
            } else {
                classSb.append("extends ");
            }

            Ts.ls(parents, new BaseTs.EachTs<String>() {
                @Override
                public boolean each(int position, String s) {
                    if (position != 0) {
                        classSb.append(", ");
                    }
                    classSb.append(s);
                    return false;
                }
            });
            classSb.append(" ");
        }
        classSb.append("{");
        strings.add(classSb.toString());
        strings.add("");
        //中间的需要补充


        strings.addAll(fieldLines);
        strings.addAll(methodLines);

        //class结束
        strings.add("}");
        return strings;
    }

    protected abstract void addLines();

    protected String[] getParents() {
        return new String[0];
    }

    protected String classType() {
        return ClassType.PUBLIC;
    }

    protected boolean isAbstract() {
        return false;
    }

    protected boolean isInterface() {
        return false;
    }

    protected boolean isFinal() {
        return false;
    }


    protected void tempLines(String line, int index) {
        tempLines.put(index, line);
    }

    protected void addFields(String line, Object... datas) {
        fieldLines.add(TagTools.dealLine(line, datas));
    }

    protected void addFields(int index, Object... datas) {
        fieldLines.add(TagTools.dealLine(tempLines.get(index), datas));
    }

    protected void addMethod(String line, Object... datas) {
        methodLines.add(TagTools.dealLine(line, datas));
    }

    protected void addMethod(int index, Object... datas) {
        methodLines.add(TagTools.dealLine(tempLines.get(index), datas));
    }

    protected void addHeader(String line, Object... datas) {
        beforeClassLines.add(TagTools.dealLine(line, datas));
    }

    protected void addHeader(int index, Object... datas) {
        beforeClassLines.add(TagTools.dealLine(tempLines.get(index), datas));
    }

    protected void addImport(String line, Object... datas) {
        importLines.add(new StringBuilder().append("import ").append(TagTools.dealLine(line, datas)).append(";").toString());
    }

    protected void addImports(String... imports) {
        Ts.ls(imports, new BaseTs.EachTs<String>() {
            @Override
            public boolean each(int position, String importLine) {
                addImport(importLine);
                return false;
            }
        });
    }

    protected void addImport(int index, Object... datas) {
        importLines.add(new StringBuilder().append("import ").append(TagTools.dealLine(tempLines.get(index), datas)).append(";").toString());
    }

}
