package com.codingtu.cooltu.processor.deal;

import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.lib4j.file.copy.FileCopy;
import com.codingtu.cooltu.processor.annotation.create.CreateAct;
import com.codingtu.cooltu.processor.builder.impl.ActResBuilder;
import com.codingtu.cooltu.processor.deal.base.TypeBaseDeal;
import com.codingtu.cooltu.processor.lib.path.CurrentPath;
import com.codingtu.cooltu.processor.lib.tools.IdTools;

import java.io.File;

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


    }
}
