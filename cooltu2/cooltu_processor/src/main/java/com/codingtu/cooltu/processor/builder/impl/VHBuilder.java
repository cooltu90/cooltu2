package com.codingtu.cooltu.processor.builder.impl;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.constant.Pkg;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;
import com.codingtu.cooltu.processor.builder.core.CoreBuilder;
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
    protected String[] getParents() {
        return new String[]{
                FullName.CORE_ADAPTER_VH,
        };
    }

    @Override
    protected void addLines() {
        tempLines("    public [TextView] [tv];", 0);
        addMethod("    public [VHClass]([ViewGroup] parent) {", javaInfo.name, FullName.VIEW_GROUP);
        addMethod("        super([R.layout.layout_name], parent);", layoutId.toString());
        tempLines("        [tv] = [itemView.]findViewById([rPkg].R.id.[tv]);", 1);
        Ts.ls(viewInfos, new BaseTs.EachTs<LayoutTools.ViewInfo>() {
            @Override
            public boolean each(int position, LayoutTools.ViewInfo viewInfo) {
                addFields(0, viewInfo.tag, viewInfo.fieldName);
                String parent = "itemView.";
                if (!viewInfo.fieldName.equals(viewInfo.id)) {
                    parent = viewInfo.parent.fieldName + ".";
                }
                addMethod(1, viewInfo.fieldName, parent, Pkg.R, viewInfo.id);
                return false;
            }
        });
        addMethod("    }");

    }
}


