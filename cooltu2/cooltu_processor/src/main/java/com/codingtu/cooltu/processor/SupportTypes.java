package com.codingtu.cooltu.processor;

import com.codingtu.cooltu.processor.annotation.ModuleInfo;
import com.codingtu.cooltu.processor.annotation.create.CreateAct;
import com.codingtu.cooltu.processor.annotation.ui.DefaultCode;
import com.codingtu.cooltu.processor.annotation.ui.DefaultDialogLayout;
import com.codingtu.cooltu.processor.annotation.ui.DefaultEditDialogLayout;
import com.codingtu.cooltu.processor.annotation.ui.DefaultNoticeDialogLayout;
import com.codingtu.cooltu.processor.annotation.ui.DefaultToastDialogLayout;
import com.codingtu.cooltu.processor.annotation.ui.VH;
import com.codingtu.cooltu.processor.deal.CreateActDeal;
import com.codingtu.cooltu.processor.deal.DefaultCodeDeal;
import com.codingtu.cooltu.processor.deal.DefaultDialogLayoutDeal;
import com.codingtu.cooltu.processor.deal.DefaultEditDialogLayoutDeal;
import com.codingtu.cooltu.processor.deal.DefaultNoticeDialogLayoutDeal;
import com.codingtu.cooltu.processor.deal.DefaultToastDialogLayoutDeal;
import com.codingtu.cooltu.processor.deal.ModuleInfoDeal;
import com.codingtu.cooltu.processor.deal.VHDeal;

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
                DefaultToastDialogLayout.class, DefaultToastDialogLayoutDeal.class,
                DefaultNoticeDialogLayout.class, DefaultNoticeDialogLayoutDeal.class,
                DefaultEditDialogLayout.class, DefaultEditDialogLayoutDeal.class,
                DefaultDialogLayout.class, DefaultDialogLayoutDeal.class,
                VH.class, VHDeal.class,
                CreateAct.class, CreateActDeal.class,
        };
    }

}
