package com.codingtu.cooltu.processor.deal;

import com.codingtu.cooltu.constant.FullName;
import com.codingtu.cooltu.constant.Pkg;
import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.lib4j.file.copy.FileCopy;
import com.codingtu.cooltu.lib4j.file.deal.FileLineDealer;
import com.codingtu.cooltu.lib4j.tools.ClassTool;
import com.codingtu.cooltu.lib4j.tools.StringTool;
import com.codingtu.cooltu.processor.annotation.create.CreateAct;
import com.codingtu.cooltu.processor.builder.impl.ActBaseBuilder;
import com.codingtu.cooltu.processor.builder.impl.ActResBuilder;
import com.codingtu.cooltu.processor.builder.impl.CreateActBuilder;
import com.codingtu.cooltu.processor.deal.base.TypeBaseDeal;
import com.codingtu.cooltu.processor.lib.path.CurrentPath;
import com.codingtu.cooltu.processor.lib.tools.IdTools;

import java.io.File;
import java.util.List;

import javax.lang.model.element.TypeElement;

public class CreateActDeal extends TypeBaseDeal {
    @Override
    protected void dealTypeElement(TypeElement te) {
        CreateAct createAct = te.getAnnotation(CreateAct.class);
        String name = createAct.name();
        String packages = createAct.packages();

        JavaInfo actJavaInfo = CurrentPath.act(packages, name);
        if (new File(actJavaInfo.path).exists())
            return;

        //创建layout
        IdTools.Id layoutTempId = IdTools.elementToId(te, CreateAct.class, createAct.layoutTemp());
        String layoutName = "activity_" + name;
        FileCopy
                .src(CurrentPath.layout(layoutTempId.rName))
                .to(new File(CurrentPath.layout(layoutName)));

        //创建ActRes
        JavaInfo actResJavaInfo = CurrentPath.actRes(packages, name);
        new ActResBuilder(actResJavaInfo, actJavaInfo);

        //创建ActBase
        JavaInfo actBaseJavaInfo = CurrentPath.actBase(actJavaInfo.fullName);
        ActBaseBuilder builder = new ActBaseBuilder(actBaseJavaInfo);
        builder.baseClass = FullName.ACT_BASE;
        builder.layout = new IdTools.Id(Pkg.R, "layout", layoutName);

        //创建Act
        new CreateActBuilder(actJavaInfo, layoutName, actResJavaInfo, actBaseJavaInfo);
        //创建Manifest
        String manifestPath = CurrentPath.manifest();
        File manifestFile = new File(manifestPath);
        FileLineDealer.create(manifestFile).deal(new FileLineDealer.Dealer() {
            @Override
            public void before(String line, List<String> lines) {
                if (line.trim().equals("</application>")) {
                    lines.add("        <activity");
                    if (StringTool.isBlank(createAct.screenOrientation())) {
                        lines.add("            android:name=\"" + actJavaInfo.fullName + "\" />");
                    } else {
                        lines.add("            android:name=\"" + actJavaInfo.fullName + "\"");
                        lines.add("            android:screenOrientation=\"" + createAct.screenOrientation() + "\" />");
                    }
                }
            }

            @Override
            public String deal(String line) {
                return line;
            }
        });
    }
}
