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
import java.util.List;

public abstract class CoreBuilder implements Symbol {

    protected JavaInfo javaInfo;
    private List<String> fieldLines = new ArrayList<>();
    private List<String> methodLines = new ArrayList<>();

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
        List<String> strings = new ArrayList<>();
        //pkg
        strings.add("package " + javaInfo.pkg + ";");
        strings.add("");
        //imports
        Ts.ls(getImports(), new BaseTs.EachTs<String>() {
            @Override
            public boolean each(int position, String s) {
                strings.add("import " + s + ";");
                return false;
            }
        });
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

        addLines();

        strings.addAll(fieldLines);
        strings.addAll(methodLines);

        //class结束
        strings.add("}");
        return strings;
    }

    protected abstract void addLines();

    protected String[] getImports() {
        return new String[0];
    }

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

    protected void addfieldLine(String line, Object... tags) {
        fieldLines.add(TagTools.dealLine(line, tags));
    }

    protected void addMethodLine(String line, Object... tags) {
        methodLines.add(TagTools.dealLine(line, tags));
    }

}
