package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.constant.Pkg;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.lib4j.tools.CountTool;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;
import com.codingtu.cooltu.processor.builder.core.CoreBuilder;
import com.codingtu.cooltu.processor.lib.log.Logs;
import com.codingtu.cooltu.processor.lib.tools.IdTools;
import com.codingtu.cooltu.processor.lib.tools.LayoutTools;
import com.codingtu.cooltu.processor.lib.tools.Lines;

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
        return false;
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

        Lines.lines(fieldLines)
                .line("    public [tag] [fieldName];")
                .size(CountTool.count(viewInfos))
                .getter(position -> viewInfos.get(position).tag)
                .getter(position -> viewInfos.get(position).fieldName)
                .start();


        addMethodLine("");
        addMethodLine("    public [vhName]([viewGroupFullName] parent) {", javaInfo.name, FullName.VIEW_GROUP);
        addMethodLine("        super([layout], parent);", layoutId.toString());

        Ts.ls(viewInfos, new BaseTs.EachTs<LayoutTools.ViewInfo>() {
            @Override
            public boolean each(int position, LayoutTools.ViewInfo viewInfo) {

                String parent = "itemView.";
                if (!viewInfo.fieldName.equals(viewInfo.id)) {
                    parent = viewInfo.parent.fieldName + ".";
                }

                addMethodLine("        [name] = [parent]findViewById([rPkg].R.id.[id]);"
                        , viewInfo.fieldName, parent, Pkg.R, viewInfo.id
                );

                return false;
            }
        });

        addMethodLine("    }");
    }

}
