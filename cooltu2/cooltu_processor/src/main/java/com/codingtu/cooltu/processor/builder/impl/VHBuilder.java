package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.constant.Pkg;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.processor.builder.core.CoreBuilder;
import com.codingtu.cooltu.processor.lib.lines.DatasGetter;
import com.codingtu.cooltu.processor.lib.lines.MethodLines;
import com.codingtu.cooltu.processor.lib.log.Logs;
import com.codingtu.cooltu.processor.lib.tools.IdTools;
import com.codingtu.cooltu.processor.lib.tools.LayoutTools;

import java.util.List;

public class VHBuilder extends CoreBuilder {
    private final IdTools.Id layoutId;
    private final List<LayoutTools.ViewInfo> viewInfos;

    public VHBuilder(JavaInfo info, IdTools.Id layoutId) {
        super(info);
        this.layoutId = layoutId;
        viewInfos = LayoutTools.convert(layoutId.rName);
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
    protected String[] getParents() {
        return new String[]{
                FullName.CORE_ADAPTER_VH,
        };
    }

    @Override
    protected void addLines() {
        //控件字段
        addFieldLine("    public TextView viewName;", viewInfos, new DatasGetter<LayoutTools.ViewInfo>() {
            @Override
            public Object[] data(int position, LayoutTools.ViewInfo viewInfo) {
                return new Object[]{
                        "viewName", viewInfo.fieldName,
                        "TextView", viewInfo.tag,
                };
            }
        });

        //构造函数
        MethodLines.create()
                .addLine("    public VHClass(ViewGroup parent) {")
                .addLine("        super(R.layout.layout_vh, parent);")
                .forLine("        viewName = itemView.findViewById(R.id.viewId);", 0)
                .addLine("    }")
                .data(
                        "VHClass", javaInfo.name,
                        "ViewGroup", FullName.VIEW_GROUP,
                        "R.layout.layout_vh", layoutId.toString()
                )
                .forData(0, viewInfos, new DatasGetter<LayoutTools.ViewInfo>() {
                    @Override
                    public Object[] data(int position, LayoutTools.ViewInfo viewInfo) {
                        String parent = "itemView.";
                        if (!viewInfo.fieldName.equals(viewInfo.id)) {
                            parent = viewInfo.parent.fieldName + ".";
                        }
                        return new Object[]{
                                "viewName", viewInfo.fieldName,
                                "itemView.", parent,
                                "R.id.viewId", Pkg.R + ".R.id." + viewInfo.id,
                        };
                    }
                })
                .add(methodLines);
    }
}


