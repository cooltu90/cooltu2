package com.codingtu.cooltu.processor.deal;

import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;
import com.codingtu.cooltu.processor.annotation.ui.DefaultCode;
import com.codingtu.cooltu.processor.builder.impl.Code4RequestBuilder;
import com.codingtu.cooltu.processor.deal.base.TypeBaseDeal;

import javax.lang.model.element.TypeElement;

public class DefaultCodeDeal extends TypeBaseDeal {
    @Override
    protected void dealTypeElement(TypeElement te) {
        DefaultCode defaultCode = te.getAnnotation(DefaultCode.class);
        String[] codes = defaultCode.value();
        Ts.ls(codes, new BaseTs.EachTs<String>() {
            @Override
            public boolean each(int position, String code) {
                Code4RequestBuilder.BUILDER.addStaticName(code);
                return false;
            }
        });
    }
}
