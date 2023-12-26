package com.codingtu.cooltu.processor.deal.base;

import com.codingtu.cooltu.lib4j.data.kv.KV;
import com.codingtu.cooltu.lib4j.tools.ClassTool;
import com.codingtu.cooltu.lib4j.tools.CountTool;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;
import com.codingtu.cooltu.processor.annotation.res.ColorRes;
import com.codingtu.cooltu.processor.annotation.res.ColorStr;
import com.codingtu.cooltu.processor.annotation.res.Dimen;
import com.codingtu.cooltu.processor.annotation.res.Dp;
import com.codingtu.cooltu.processor.annotation.res.ResFor;
import com.codingtu.cooltu.processor.annotation.ui.Adapter;
import com.codingtu.cooltu.processor.annotation.ui.InBase;
import com.codingtu.cooltu.processor.annotation.ui.NoStart;
import com.codingtu.cooltu.processor.annotation.ui.dialog.DialogUse;
import com.codingtu.cooltu.processor.annotation.ui.dialog.EditDialogUse;
import com.codingtu.cooltu.processor.annotation.ui.dialog.NoticeDialogUse;
import com.codingtu.cooltu.processor.annotation.ui.dialog.ToastDialogUse;
import com.codingtu.cooltu.processor.builder.core.UiBaseBuilder;
import com.codingtu.cooltu.processor.lib.log.Logs;
import com.codingtu.cooltu.processor.lib.tools.BaseTools;
import com.codingtu.cooltu.processor.lib.tools.ElementTools;
import com.codingtu.cooltu.processor.lib.tools.IdTools;

import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;

public abstract class ResForBaseDeal extends TypeBaseDeal {
    protected String uiClass;

    @Override
    protected void dealTypeElement(TypeElement te) {
        uiClass = getUiClass(te);

        BaseTools.GetThis<UiBaseBuilder> uiBaseBuilderGetter = getUiBaseBuilderGetter();
        UiBaseBuilder uiBaseBuilder = uiBaseBuilderGetter.getThis(uiClass);

        Ts.ls(te.getEnclosedElements(), (position, element) -> {
            if (element instanceof VariableElement) {
                VariableElement ve = (VariableElement) element;
                dealField(uiClass, ve, ElementTools.getFieldKv(ve), uiBaseBuilderGetter, uiBaseBuilder);
            }
            return false;
        });

        uiBaseBuilder.isToastDialog = te.getAnnotation(ToastDialogUse.class) != null;
        uiBaseBuilder.isNoticeDialog = te.getAnnotation(NoticeDialogUse.class) != null;

    }

    protected void dealField(String fullName, VariableElement ve, KV<String, String> kv,
                             BaseTools.GetThis<UiBaseBuilder> uiBaseBuilderGetter,
                             UiBaseBuilder uiBaseBuilder) {

        InBase inBase = ve.getAnnotation(InBase.class);
        if (inBase != null) {
            BaseTools.getThisWithChilds(fullName, new BaseTs.EachTs<UiBaseBuilder>() {
                @Override
                public boolean each(int position, UiBaseBuilder uiBaseBuilder) {
                    if (position == 0) {
                        uiBaseBuilder.addInBase(kv);
                    } else {
                        uiBaseBuilder.removeInBase(kv);
                    }
                    return false;
                }
            }, uiBaseBuilderGetter);
        }
        ColorStr ColorStr = ve.getAnnotation(ColorStr.class);
        if (ColorStr != null) {
            uiBaseBuilder.colorStrs.add(new KV<>(kv.v, ColorStr.value()));
        }

        ColorRes colorRes = ve.getAnnotation(ColorRes.class);
        if (colorRes != null) {
            IdTools.Id id = IdTools.elementToId(ve, ColorRes.class, colorRes.value());
            uiBaseBuilder.colorReses.add(new KV<>(kv.v, id));
        }

        Dp dp = ve.getAnnotation(Dp.class);
        if (dp != null) {
            uiBaseBuilder.dps.add(new KV<>(kv.v, dp.value()));
        }

        Dimen dimen = ve.getAnnotation(Dimen.class);
        if (dimen != null) {
            IdTools.Id id = IdTools.elementToId(ve, Dimen.class, dimen.value());
            uiBaseBuilder.dimens.add(new KV<>(kv.v, id));
        }

        Adapter adapter = ve.getAnnotation(Adapter.class);
        if (adapter != null) {
            uiBaseBuilder.adapters.add(ve);
        }

        EditDialogUse editDialogUse = ve.getAnnotation(EditDialogUse.class);
        if (editDialogUse != null) {
            uiBaseBuilder.editDialogUses.add(ve);
        }

        DialogUse dialogUse = ve.getAnnotation(DialogUse.class);
        if (dialogUse != null) {
            uiBaseBuilder.dialogUses.add(ve);
        }
    }

    protected abstract BaseTools.GetThis<UiBaseBuilder> getUiBaseBuilderGetter();

    protected abstract String getUiClass(TypeElement te);
}
