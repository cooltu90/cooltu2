package com.codingtu.cooltu.processor;

import com.codingtu.cooltu.processor.annotation.ModuleInfo;
import com.codingtu.cooltu.processor.annotation.ui.DefaultCode;
import com.codingtu.cooltu.processor.deal.DefaultCodeDeal;
import com.codingtu.cooltu.processor.deal.ModuleInfoDeal;

/**************************************************
 *
 * 此处的顺序决定了读取顺序
 *
 **************************************************/
public class SupportTypes {

    public static Class[] types() {
        return new Class[]{
                ModuleInfo.class, ModuleInfoDeal.class,
                DefaultCode.class, DefaultCodeDeal.class,
        };
    }

}
