package com.codingtu.cooltu.processor;

import com.codingtu.cooltu.processor.annotation.ModuleInfo;
import com.codingtu.cooltu.processor.annotation.create.CreateAct;
import com.codingtu.cooltu.processor.annotation.create.CreateAdapter;
import com.codingtu.cooltu.processor.annotation.create.CreateFragment;
import com.codingtu.cooltu.processor.annotation.form.FormBean;
import com.codingtu.cooltu.processor.annotation.net.Apis;
import com.codingtu.cooltu.processor.annotation.path.PathFilter;
import com.codingtu.cooltu.processor.annotation.path.Paths;
import com.codingtu.cooltu.processor.annotation.res.ResForFragment;
import com.codingtu.cooltu.processor.annotation.ui.ActBase;
import com.codingtu.cooltu.processor.annotation.res.ResFor;
import com.codingtu.cooltu.processor.annotation.ui.DefaultCode;
import com.codingtu.cooltu.processor.annotation.ui.DefaultDialogLayout;
import com.codingtu.cooltu.processor.annotation.ui.DefaultEditDialogLayout;
import com.codingtu.cooltu.processor.annotation.ui.DefaultNoticeDialogLayout;
import com.codingtu.cooltu.processor.annotation.ui.DefaultToastDialogLayout;
import com.codingtu.cooltu.processor.annotation.ui.FragmentBase;
import com.codingtu.cooltu.processor.annotation.ui.VH;
import com.codingtu.cooltu.processor.deal.ActBaseDeal;
import com.codingtu.cooltu.processor.deal.CreateActDeal;
import com.codingtu.cooltu.processor.deal.CreateAdapterDeal;
import com.codingtu.cooltu.processor.deal.CreateFragmentDeal;
import com.codingtu.cooltu.processor.deal.DefaultCodeDeal;
import com.codingtu.cooltu.processor.deal.DefaultDialogLayoutDeal;
import com.codingtu.cooltu.processor.deal.DefaultEditDialogLayoutDeal;
import com.codingtu.cooltu.processor.deal.DefaultNoticeDialogLayoutDeal;
import com.codingtu.cooltu.processor.deal.DefaultToastDialogLayoutDeal;
import com.codingtu.cooltu.processor.deal.FormBeanDeal;
import com.codingtu.cooltu.processor.deal.FragmentBaseDeal;
import com.codingtu.cooltu.processor.deal.ModuleInfoDeal;
import com.codingtu.cooltu.processor.deal.NetDeal;
import com.codingtu.cooltu.processor.deal.PathDeal;
import com.codingtu.cooltu.processor.deal.PathFilterDeal;
import com.codingtu.cooltu.processor.deal.ResForDeal;
import com.codingtu.cooltu.processor.deal.ResForFragmentDeal;
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
                ActBase.class, ActBaseDeal.class,
                FragmentBase.class, FragmentBaseDeal.class,
                PathFilter.class, PathFilterDeal.class,
                Paths.class, PathDeal.class,
                ResFor.class, ResForDeal.class,
                ResForFragment.class, ResForFragmentDeal.class,
                Apis.class, NetDeal.class,
                CreateAct.class, CreateActDeal.class,
                FormBean.class, FormBeanDeal.class,
                CreateAdapter.class, CreateAdapterDeal.class,
                CreateFragment.class, CreateFragmentDeal.class
        };
    }

}
