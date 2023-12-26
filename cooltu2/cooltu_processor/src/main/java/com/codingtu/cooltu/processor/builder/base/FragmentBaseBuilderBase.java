package com.codingtu.cooltu.processor.builder.base;
import java.util.ArrayList;
import java.util.List;

public abstract class FragmentBaseBuilderBase extends com.codingtu.cooltu.processor.builder.core.CoreBuilder {
    protected StringBuilder pkg;
    protected StringBuilder name;
    protected StringBuilder baseClass;
    protected StringBuilder netBackIFullName;
    protected java.util.Map<String, Boolean> fieldIfs;
    protected java.util.Map<String, Integer> fieldCounts;
    protected StringBuilder fieldSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> field;
    protected java.util.Map<String, Boolean> layoutIfs;
    protected java.util.Map<String, Integer> layoutCounts;
    protected StringBuilder layoutSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> layout;
    protected java.util.Map<String, Boolean> superOnClickIfs;
    protected java.util.Map<String, Integer> superOnClickCounts;
    protected StringBuilder superOnClickSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> superOnClick;
    protected java.util.Map<String, Boolean> onClickSwithIfs;
    protected java.util.Map<String, Integer> onClickSwithCounts;
    protected StringBuilder onClickSwithSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> onClickSwith;
    protected java.util.Map<String, Boolean> onClickMethodsIfs;
    protected java.util.Map<String, Integer> onClickMethodsCounts;
    protected StringBuilder onClickMethodsSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> onClickMethods;
    protected java.util.Map<String, Boolean> onLongClickSwithIfs;
    protected java.util.Map<String, Integer> onLongClickSwithCounts;
    protected StringBuilder onLongClickSwithSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> onLongClickSwith;
    protected java.util.Map<String, Boolean> superOnLongClickIfs;
    protected java.util.Map<String, Integer> superOnLongClickCounts;
    protected StringBuilder superOnLongClickSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> superOnLongClick;
    protected java.util.Map<String, Boolean> superOnLongClickFalseIfs;
    protected java.util.Map<String, Integer> superOnLongClickFalseCounts;
    protected StringBuilder superOnLongClickFalseSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> superOnLongClickFalse;
    protected java.util.Map<String, Boolean> onLongClickMethodsIfs;
    protected java.util.Map<String, Integer> onLongClickMethodsCounts;
    protected StringBuilder onLongClickMethodsSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> onLongClickMethods;
    protected java.util.Map<String, Boolean> loadMoreIfs;
    protected java.util.Map<String, Integer> loadMoreCounts;
    protected StringBuilder loadMoreSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> loadMore;
    protected StringBuilder coreSendParamsFullName;
    protected java.util.Map<String, Boolean> superAcceptIfs;
    protected java.util.Map<String, Integer> superAcceptCounts;
    protected StringBuilder superAcceptSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> superAccept;
    protected java.util.Map<String, Boolean> acceptIfs;
    protected java.util.Map<String, Integer> acceptCounts;
    protected StringBuilder acceptSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> accept;
    protected java.util.Map<String, Boolean> acceptMethodIfs;
    protected java.util.Map<String, Integer> acceptMethodCounts;
    protected StringBuilder acceptMethodSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> acceptMethod;
    protected java.util.Map<String, Boolean> actBackIfs;
    protected java.util.Map<String, Integer> actBackCounts;
    protected StringBuilder actBackSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> actBack;
    protected java.util.Map<String, Boolean> actBackMethodIfs;
    protected java.util.Map<String, Integer> actBackMethodCounts;
    protected StringBuilder actBackMethodSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> actBackMethod;
    protected java.util.Map<String, Boolean> toastDialogIfs;
    protected java.util.Map<String, Integer> toastDialogCounts;
    protected StringBuilder toastDialogSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> toastDialog;
    protected java.util.Map<String, Boolean> noticeDialogIfs;
    protected java.util.Map<String, Integer> noticeDialogCounts;
    protected StringBuilder noticeDialogSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> noticeDialog;
    protected java.util.Map<String, Boolean> editDialogIfs;
    protected java.util.Map<String, Integer> editDialogCounts;
    protected StringBuilder editDialogSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> editDialog;
    protected java.util.Map<String, Boolean> dialogIfs;
    protected java.util.Map<String, Integer> dialogCounts;
    protected StringBuilder dialogSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> dialog;

    public FragmentBaseBuilderBase(com.codingtu.cooltu.lib4j.data.java.JavaInfo info) {
        super(info);
        pkg = map.get("pkg");
        name = map.get("name");
        baseClass = map.get("baseClass");
        netBackIFullName = map.get("netBackIFullName");
        fieldIfs = new java.util.HashMap<>();
        fieldCounts = new java.util.HashMap<>();
        fieldSb = map.get("field");
        field = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        layoutIfs = new java.util.HashMap<>();
        layoutCounts = new java.util.HashMap<>();
        layoutSb = map.get("layout");
        layout = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        superOnClickIfs = new java.util.HashMap<>();
        superOnClickCounts = new java.util.HashMap<>();
        superOnClickSb = map.get("superOnClick");
        superOnClick = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        onClickSwithIfs = new java.util.HashMap<>();
        onClickSwithCounts = new java.util.HashMap<>();
        onClickSwithSb = map.get("onClickSwith");
        onClickSwith = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        onClickMethodsIfs = new java.util.HashMap<>();
        onClickMethodsCounts = new java.util.HashMap<>();
        onClickMethodsSb = map.get("onClickMethods");
        onClickMethods = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        onLongClickSwithIfs = new java.util.HashMap<>();
        onLongClickSwithCounts = new java.util.HashMap<>();
        onLongClickSwithSb = map.get("onLongClickSwith");
        onLongClickSwith = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        superOnLongClickIfs = new java.util.HashMap<>();
        superOnLongClickCounts = new java.util.HashMap<>();
        superOnLongClickSb = map.get("superOnLongClick");
        superOnLongClick = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        superOnLongClickFalseIfs = new java.util.HashMap<>();
        superOnLongClickFalseCounts = new java.util.HashMap<>();
        superOnLongClickFalseSb = map.get("superOnLongClickFalse");
        superOnLongClickFalse = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        onLongClickMethodsIfs = new java.util.HashMap<>();
        onLongClickMethodsCounts = new java.util.HashMap<>();
        onLongClickMethodsSb = map.get("onLongClickMethods");
        onLongClickMethods = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        loadMoreIfs = new java.util.HashMap<>();
        loadMoreCounts = new java.util.HashMap<>();
        loadMoreSb = map.get("loadMore");
        loadMore = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        coreSendParamsFullName = map.get("coreSendParamsFullName");
        superAcceptIfs = new java.util.HashMap<>();
        superAcceptCounts = new java.util.HashMap<>();
        superAcceptSb = map.get("superAccept");
        superAccept = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        acceptIfs = new java.util.HashMap<>();
        acceptCounts = new java.util.HashMap<>();
        acceptSb = map.get("accept");
        accept = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        acceptMethodIfs = new java.util.HashMap<>();
        acceptMethodCounts = new java.util.HashMap<>();
        acceptMethodSb = map.get("acceptMethod");
        acceptMethod = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        actBackIfs = new java.util.HashMap<>();
        actBackCounts = new java.util.HashMap<>();
        actBackSb = map.get("actBack");
        actBack = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        actBackMethodIfs = new java.util.HashMap<>();
        actBackMethodCounts = new java.util.HashMap<>();
        actBackMethodSb = map.get("actBackMethod");
        actBackMethod = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        toastDialogIfs = new java.util.HashMap<>();
        toastDialogCounts = new java.util.HashMap<>();
        toastDialogSb = map.get("toastDialog");
        toastDialog = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        noticeDialogIfs = new java.util.HashMap<>();
        noticeDialogCounts = new java.util.HashMap<>();
        noticeDialogSb = map.get("noticeDialog");
        noticeDialog = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        editDialogIfs = new java.util.HashMap<>();
        editDialogCounts = new java.util.HashMap<>();
        editDialogSb = map.get("editDialog");
        editDialog = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        dialogIfs = new java.util.HashMap<>();
        dialogCounts = new java.util.HashMap<>();
        dialogSb = map.get("dialog");
        dialog = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();

    }

    public int fieldCount() {
        return count(fieldCounts, getForKey("field"));
    }
    public void field(int i0, String sign, String type, String name) {
        addForMap(this.field, getForKey("field", i0), sign, type, name);
        countAdd(fieldCounts, getForKey("field"));
    }
    public int findViewCount() {
        return count(layoutCounts, getForKey("findView"));
    }
    public void findView(int i0, String fieldName, String parent, String rPkg, String id) {
        addForMap(this.layout, getForKey("findView", i0), fieldName, parent, rPkg, id);
        countAdd(layoutCounts, getForKey("findView"));
    }
    public int setOnClickCount() {
        return count(layoutCounts, getForKey("setOnClick"));
    }
    public void setOnClick(int i0, String fieldName) {
        addForMap(this.layout, getForKey("setOnClick", i0), fieldName);
        countAdd(layoutCounts, getForKey("setOnClick"));
    }
    public int setOnLongClickCount() {
        return count(layoutCounts, getForKey("setOnLongClick"));
    }
    public void setOnLongClick(int i0, String fieldName) {
        addForMap(this.layout, getForKey("setOnLongClick", i0), fieldName);
        countAdd(layoutCounts, getForKey("setOnLongClick"));
    }
    public int colorStrInitCount() {
        return count(layoutCounts, getForKey("colorStrInit"));
    }
    public void colorStrInit(int i0, String name, String color) {
        addForMap(this.layout, getForKey("colorStrInit", i0), name, color);
        countAdd(layoutCounts, getForKey("colorStrInit"));
    }
    public int colorResInitCount() {
        return count(layoutCounts, getForKey("colorResInit"));
    }
    public void colorResInit(int i0, String name, String resourceToolFullName, String id) {
        addForMap(this.layout, getForKey("colorResInit", i0), name, resourceToolFullName, id);
        countAdd(layoutCounts, getForKey("colorResInit"));
    }
    public int dpInitCount() {
        return count(layoutCounts, getForKey("dpInit"));
    }
    public void dpInit(int i0, String name, String mobileToolFullName, String value) {
        addForMap(this.layout, getForKey("dpInit", i0), name, mobileToolFullName, value);
        countAdd(layoutCounts, getForKey("dpInit"));
    }
    public int dimenInitCount() {
        return count(layoutCounts, getForKey("dimenInit"));
    }
    public void dimenInit(int i0, String name, String resourceToolFullName, String id) {
        addForMap(this.layout, getForKey("dimenInit", i0), name, resourceToolFullName, id);
        countAdd(layoutCounts, getForKey("dimenInit"));
    }
    public int startInitCount() {
        return count(layoutCounts, getForKey("startInit"));
    }
    public void startInit(int i0, String name, String passFullName) {
        addForMap(this.layout, getForKey("startInit", i0), name, passFullName, name);
        countAdd(layoutCounts, getForKey("startInit"));
    }
    public int listAdapterCount() {
        return count(layoutCounts, getForKey("listAdapter"));
    }
    public void listAdapter(int i0, String adapterName, String vhFullName, String rvName) {
        addForMap(this.layout, getForKey("listAdapter", i0), adapterName, vhFullName, adapterName, rvName, adapterName, rvName);
        countAdd(layoutCounts, getForKey("listAdapter"));
    }
    public int onClickCaseCount(int i0) {
        return count(onClickSwithCounts, getForKey("onClickCase", i0));
    }
    public void onClickCase(int i0, int i1, String id) {
        addForMap(this.onClickSwith, getForKey("onClickCase", i0, i1), id);
        countAdd(onClickSwithCounts, getForKey("onClickCase", i0));
    }
    public int onClickSwitchParamsCount(int i0) {
        return count(onClickSwithCounts, getForKey("onClickSwitchParams", i0));
    }
    public void onClickSwitchParams(int i0, int i1, String type, String pkg, String index, String divider) {
        addForMap(this.onClickSwith, getForKey("onClickSwitchParams", i0, i1), type, pkg, index, divider);
        countAdd(onClickSwithCounts, getForKey("onClickSwitchParams", i0));
    }
    public int onClickSwithCount() {
        return count(onClickSwithCounts, getForKey("onClickSwith"));
    }
    public void onClickSwith(int i0, String methodName) {
        addForMap(this.onClickSwith, getForKey("onClickSwith", i0), methodName);
        countAdd(onClickSwithCounts, getForKey("onClickSwith"));
    }
    public int onClickMethodsCount() {
        return count(onClickMethodsCounts, getForKey("onClickMethods"));
    }
    public void onClickMethods(int i0, String methodName, String params) {
        addForMap(this.onClickMethods, getForKey("onClickMethods", i0), methodName, params);
        countAdd(onClickMethodsCounts, getForKey("onClickMethods"));
    }
    public int onLongClickCaseCount(int i0) {
        return count(onLongClickSwithCounts, getForKey("onLongClickCase", i0));
    }
    public void onLongClickCase(int i0, int i1, String id) {
        addForMap(this.onLongClickSwith, getForKey("onLongClickCase", i0, i1), id);
        countAdd(onLongClickSwithCounts, getForKey("onLongClickCase", i0));
    }
    public int onLongClickSwitchParamsCount(int i0) {
        return count(onLongClickSwithCounts, getForKey("onLongClickSwitchParams", i0));
    }
    public void onLongClickSwitchParams(int i0, int i1, String type, String pkg, String index, String divider) {
        addForMap(this.onLongClickSwith, getForKey("onLongClickSwitchParams", i0, i1), type, pkg, index, divider);
        countAdd(onLongClickSwithCounts, getForKey("onLongClickSwitchParams", i0));
    }
    public int onLongClickSwithCount() {
        return count(onLongClickSwithCounts, getForKey("onLongClickSwith"));
    }
    public void onLongClickSwith(int i0, String methodName) {
        addForMap(this.onLongClickSwith, getForKey("onLongClickSwith", i0), methodName);
        countAdd(onLongClickSwithCounts, getForKey("onLongClickSwith"));
    }
    public int onLongClickMethodsCount() {
        return count(onLongClickMethodsCounts, getForKey("onLongClickMethods"));
    }
    public void onLongClickMethods(int i0, String methodName, String params) {
        addForMap(this.onLongClickMethods, getForKey("onLongClickMethods", i0), methodName, params);
        countAdd(onLongClickMethodsCounts, getForKey("onLongClickMethods"));
    }
    public int loadMoreCount() {
        return count(loadMoreCounts, getForKey("loadMore"));
    }
    public void loadMore(int i0, String adapterName) {
        addForMap(this.loadMore, getForKey("loadMore", i0), adapterName);
        countAdd(loadMoreCounts, getForKey("loadMore"));
    }
    public int acceptCount() {
        return count(acceptCounts, getForKey("accept"));
    }
    public void accept(int i0, String methodName, String netBackFullName, String coreSendParamsFullName, String params) {
        addForMap(this.accept, getForKey("accept", i0), methodName, netBackFullName, coreSendParamsFullName, methodName, params);
        countAdd(acceptCounts, getForKey("accept"));
    }
    public int acceptMethodCount() {
        return count(acceptMethodCounts, getForKey("acceptMethod"));
    }
    public void acceptMethod(int i0, String methodName, String params) {
        addForMap(this.acceptMethod, getForKey("acceptMethod", i0), methodName, params);
        countAdd(acceptMethodCounts, getForKey("acceptMethod"));
    }
    public int actBackParamCount(int i0) {
        return count(actBackCounts, getForKey("actBackParam", i0));
    }
    public void actBackParam(int i0, int i1, String passFullName, String name) {
        addForMap(this.actBack, getForKey("actBackParam", i0, i1), passFullName, name);
        countAdd(actBackCounts, getForKey("actBackParam", i0));
    }
    public int actBackCount() {
        return count(actBackCounts, getForKey("actBack"));
    }
    public void actBack(int i0, String ifSign, String code4RequestFullName, String code, String methodName) {
        addForMap(this.actBack, getForKey("actBack", i0), ifSign, code4RequestFullName, code, methodName);
        countAdd(actBackCounts, getForKey("actBack"));
    }
    public int actBackMethodCount() {
        return count(actBackMethodCounts, getForKey("actBackMethod"));
    }
    public void actBackMethod(int i0, String methodName, String params) {
        addForMap(this.actBackMethod, getForKey("actBackMethod", i0), methodName, params);
        countAdd(actBackMethodCounts, getForKey("actBackMethod"));
    }
    public int editDialogCount() {
        return count(editDialogCounts, getForKey("editDialog"));
    }
    public void editDialog(int i0, String editDialogFullName, String edName, String edClassName, String title, String hint, String inputType, String layout, String setObject) {
        addForMap(this.editDialog, getForKey("editDialog", i0), editDialogFullName, edName, edClassName, edName, edName, editDialogFullName, title, hint, inputType, layout, editDialogFullName, edName, edName, edName, setObject, edName, edName);
        countAdd(editDialogCounts, getForKey("editDialog"));
    }
    public int showDialogCount(int i0) {
        return count(dialogCounts, getForKey("showDialog", i0));
    }
    public void showDialog(int i0, int i1, String dialogClassName, String showDialogParam, String dialogName, String dialogFullName, String title, String left, String right, String layout, String onBtClickFullName, String obj) {
        addForMap(this.dialog, getForKey("showDialog", i0, i1), dialogClassName, showDialogParam, dialogName, dialogName, dialogFullName, title, left, right, layout, onBtClickFullName, dialogName, dialogName, dialogName, obj, dialogName);
        countAdd(dialogCounts, getForKey("showDialog", i0));
    }
    public int dialogCount() {
        return count(dialogCounts, getForKey("dialog"));
    }
    public void dialog(int i0, String dialogFullName, String dialogName) {
        addForMap(this.dialog, getForKey("dialog", i0), dialogFullName, dialogName, dialogName, dialogName);
        countAdd(dialogCounts, getForKey("dialog"));
    }

    public void defaultListAdapterIf(int i0, String adapterName, String adapterFullName) {
        addForMap(this.layout, getIfKey("defaultListAdapter", i0), adapterName, adapterName, adapterFullName);
        layoutIfs.put(getIfKey("defaultListAdapter", i0), true);
    }
    public void defaultListMoreAdapterIf(int i0, String adapterName, String adapterFullName) {
        addForMap(this.layout, getIfKey("defaultListMoreAdapter", i0), adapterName, adapterName, adapterFullName, adapterName);
        layoutIfs.put(getIfKey("defaultListMoreAdapter", i0), true);
    }
    public void layoutIf(String inflateToolFullName, String layout) {
        addForMap(this.layout, getIfKey("layout"), inflateToolFullName, layout);
        layoutIfs.put(getIfKey("layout"), true);
    }
    public void isSuperOnClick(boolean is) {
        superOnClickIfs.put(getIfKey("superOnClick"), is);
    }
    public void isOnClickCheckLogin(int i0, boolean is) {
        onClickSwithIfs.put(getIfKey("onClickCheckLogin", i0), is);
    }
    public void onClickSwitchParamsIf(int i0, String divider) {
        addForMap(this.onClickSwith, getIfKey("onClickSwitchParams", i0), divider);
        onClickSwithIfs.put(getIfKey("onClickSwitchParams", i0), true);
    }
    public void isOnLongClickCheckLogin(int i0, boolean is) {
        onLongClickSwithIfs.put(getIfKey("onLongClickCheckLogin", i0), is);
    }
    public void onLongClickSwitchParamsIf(int i0, String divider) {
        addForMap(this.onLongClickSwith, getIfKey("onLongClickSwitchParams", i0), divider);
        onLongClickSwithIfs.put(getIfKey("onLongClickSwitchParams", i0), true);
    }
    public void isSuperOnLongClick(boolean is) {
        superOnLongClickIfs.put(getIfKey("superOnLongClick"), is);
    }
    public void isSuperOnLongClickFalse(boolean is) {
        superOnLongClickFalseIfs.put(getIfKey("superOnLongClickFalse"), is);
    }
    public void isSuperAccept(boolean is) {
        superAcceptIfs.put(getIfKey("superAccept"), is);
    }
    public void isActBackParamDivider(int i0, int i1, boolean is) {
        actBackIfs.put(getIfKey("actBackParamDivider", i0, i1), is);
    }
    public void toastDialogIf(String toastDialogFullName, String layout, String onHiddenFinishedFullName, String handlerToolFullName) {
        addForMap(this.toastDialog, getIfKey("toastDialog"), toastDialogFullName, toastDialogFullName, toastDialogFullName, layout, toastDialogFullName, onHiddenFinishedFullName, handlerToolFullName, onHiddenFinishedFullName, handlerToolFullName);
        toastDialogIfs.put(getIfKey("toastDialog"), true);
    }
    public void noticeDialogIf(String noticeDialogFullName, String layout) {
        addForMap(this.noticeDialog, getIfKey("noticeDialog"), noticeDialogFullName, noticeDialogFullName, layout);
        noticeDialogIfs.put(getIfKey("noticeDialog"), true);
    }
    public void edShowParamIf(int i0, String type, String name) {
        addForMap(this.editDialog, getIfKey("edShowParam", i0), type, name);
        editDialogIfs.put(getIfKey("edShowParam", i0), true);
    }
    public void setTextWatcherIf(int i0, String edClassName) {
        addForMap(this.editDialog, getIfKey("setTextWatcher", i0), edClassName);
        editDialogIfs.put(getIfKey("setTextWatcher", i0), true);
    }
    public void isStopAnimation(int i0, boolean is) {
        editDialogIfs.put(getIfKey("stopAnimation", i0), is);
    }
    public void edUseYesConvertIf(int i0, String type) {
        addForMap(this.editDialog, getIfKey("edUseYesConvert", i0), type);
        editDialogIfs.put(getIfKey("edUseYesConvert", i0), true);
    }
    public void isEdUseYes(int i0, boolean is) {
        editDialogIfs.put(getIfKey("edUseYes", i0), is);
    }
    public void edYesParamIf(int i0, String type, String name) {
        addForMap(this.editDialog, getIfKey("edYesParam", i0), type, name);
        editDialogIfs.put(getIfKey("edYesParam", i0), true);
    }
    public void setTextWatcherMethodIf(int i0, String edTextWatcherFullName, String edClassName) {
        addForMap(this.editDialog, getIfKey("setTextWatcherMethod", i0), edTextWatcherFullName, edClassName);
        editDialogIfs.put(getIfKey("setTextWatcherMethod", i0), true);
    }
    public void isShowDialogSetContentStr(int i0, int i1, boolean is) {
        dialogIfs.put(getIfKey("showDialogSetContentStr", i0, i1), is);
    }
    public void isShowDialogSetContent(int i0, int i1, boolean is) {
        dialogIfs.put(getIfKey("showDialogSetContent", i0, i1), is);
    }
    public void showDialogLeftObjConvertIf(int i0, int i1, String type) {
        addForMap(this.dialog, getIfKey("showDialogLeftObjConvert", i0, i1), type);
        dialogIfs.put(getIfKey("showDialogLeftObjConvert", i0, i1), true);
    }
    public void isShowDialogLeftObj(int i0, int i1, boolean is) {
        dialogIfs.put(getIfKey("showDialogLeftObj", i0, i1), is);
    }
    public void showDialogRightObjConvertIf(int i0, int i1, String type) {
        addForMap(this.dialog, getIfKey("showDialogRightObjConvert", i0, i1), type);
        dialogIfs.put(getIfKey("showDialogRightObjConvert", i0, i1), true);
    }
    public void isShowDialogRightObj(int i0, int i1, boolean is) {
        dialogIfs.put(getIfKey("showDialogRightObj", i0, i1), is);
    }
    public void isShowDialogElse(int i0, int i1, boolean is) {
        dialogIfs.put(getIfKey("showDialogElse", i0, i1), is);
    }
    public void showDialogUpdataContentIf(int i0, int i1, String dialogName) {
        addForMap(this.dialog, getIfKey("showDialogUpdataContent", i0, i1), dialogName);
        dialogIfs.put(getIfKey("showDialogUpdataContent", i0, i1), true);
    }
    public void leftParamIf(int i0, String type, String name) {
        addForMap(this.dialog, getIfKey("leftParam", i0), type, name);
        dialogIfs.put(getIfKey("leftParam", i0), true);
    }
    public void rightParamIf(int i0, String type, String name) {
        addForMap(this.dialog, getIfKey("rightParam", i0), type, name);
        dialogIfs.put(getIfKey("rightParam", i0), true);
    }

    @Override
    protected void dealLinesInParent() {
        for (int i0 = 0; i0 < count(fieldCounts, getForKey("field")); i0++) {
            List<String> field0 = field.get(getForKey("field", i0));
            addLnTag(fieldSb, "    [sign] [type] [name];", field0.get(0), field0.get(1), field0.get(2));
        }
        if (isIf(layoutIfs, getIfKey("layout"))) {
            List<String> layout0 = layout.get(getIfKey("layout"));
            addLnTag(layoutSb, "    @Nullable");
            addLnTag(layoutSb, "    @Override");
            addLnTag(layoutSb, "    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {");
            addLnTag(layoutSb, "        View view = [inflateToolFullName].inflate(inflater, [layout], container);", layout0.get(0), layout0.get(1));
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("findView")); i0++) {
                List<String> layout1 = layout.get(getForKey("findView", i0));
                addLnTag(layoutSb, "        [fieldName] = [parent]findViewById([rPkg].R.id.[id]);", layout1.get(0), layout1.get(1), layout1.get(2), layout1.get(3));
            }
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("setOnClick")); i0++) {
                List<String> layout1 = layout.get(getForKey("setOnClick", i0));
                addLnTag(layoutSb, "        [fieldName].setOnClickListener(this);", layout1.get(0));
            }
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("setOnLongClick")); i0++) {
                List<String> layout1 = layout.get(getForKey("setOnLongClick", i0));
                addLnTag(layoutSb, "        [fieldName].setOnLongClickListener(this);", layout1.get(0));
            }
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("colorStrInit")); i0++) {
                List<String> layout1 = layout.get(getForKey("colorStrInit", i0));
                addLnTag(layoutSb, "        [name] = android.graphics.Color.parseColor(\"[color]\");", layout1.get(0), layout1.get(1));
            }
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("colorResInit")); i0++) {
                List<String> layout1 = layout.get(getForKey("colorResInit", i0));
                addLnTag(layoutSb, "        [name] = [resourceToolFullName].getColor([id]);", layout1.get(0), layout1.get(1), layout1.get(2));
            }
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("dpInit")); i0++) {
                List<String> layout1 = layout.get(getForKey("dpInit", i0));
                addLnTag(layoutSb, "        [name] = [mobileToolFullName].dpToPx([value]);", layout1.get(0), layout1.get(1), layout1.get(2));
            }
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("dimenInit")); i0++) {
                List<String> layout1 = layout.get(getForKey("dimenInit", i0));
                addLnTag(layoutSb, "        [name] = [resourceToolFullName].getDimen([id]);", layout1.get(0), layout1.get(1), layout1.get(2));
            }
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("startInit")); i0++) {
                List<String> layout1 = layout.get(getForKey("startInit", i0));
                addLnTag(layoutSb, "        [name] = [passFullName].[name](getIntent());", layout1.get(0), layout1.get(1), layout1.get(2));
            }
            addLnTag(layoutSb, "");
            for (int i0 = 0; i0 < count(layoutCounts, getForKey("listAdapter")); i0++) {
                List<String> layout1 = layout.get(getForKey("listAdapter", i0));
                if (isIf(layoutIfs, getIfKey("defaultListAdapter", i0))) {
                    List<String> layout2 = layout.get(getIfKey("defaultListAdapter", i0));
                    addLnTag(layoutSb, "        // [adapterName]", layout2.get(0));
                    addLnTag(layoutSb, "        [adapterName] = new [adapterFullName]();", layout2.get(1), layout2.get(2));
                }
                if (isIf(layoutIfs, getIfKey("defaultListMoreAdapter", i0))) {
                    List<String> layout2 = layout.get(getIfKey("defaultListMoreAdapter", i0));
                    addLnTag(layoutSb, "        // [adapterName]", layout2.get(0));
                    addLnTag(layoutSb, "        [adapterName] = new [adapterFullName]() {", layout2.get(1), layout2.get(2));
                    addLnTag(layoutSb, "            @Override");
                    addLnTag(layoutSb, "            protected void loadMore(int page) {");
                    addLnTag(layoutSb, "                [adapterName]LoadMore(page);", layout2.get(3));
                    addLnTag(layoutSb, "            }");
                    addLnTag(layoutSb, "        };");
                }
                addLnTag(layoutSb, "        [adapterName].setVH([vhFullName].class);", layout1.get(0), layout1.get(1));
                addLnTag(layoutSb, "        [adapterName].setClick(this);", layout1.get(2));
                addLnTag(layoutSb, "        [rvName].setAdapter([adapterName]);", layout1.get(3), layout1.get(4));
                addLnTag(layoutSb, "        [rvName].setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getAct()));", layout1.get(5));
            }
            addLnTag(layoutSb, "        return view;");
            addLnTag(layoutSb, "    }");
        }
        if (isIf(superOnClickIfs, getIfKey("superOnClick"))) {
            List<String> superOnClick0 = superOnClick.get(getIfKey("superOnClick"));
            addLnTag(superOnClickSb, "        super.onClick(v);");
        }
        for (int i0 = 0; i0 < count(onClickSwithCounts, getForKey("onClickSwith")); i0++) {
            List<String> onClickSwith0 = onClickSwith.get(getForKey("onClickSwith", i0));
            for (int i1 = 0; i1 < count(onClickSwithCounts, getForKey("onClickCase", i0)); i1++) {
                List<String> onClickSwith1 = onClickSwith.get(getForKey("onClickCase", i0, i1));
                addLnTag(onClickSwithSb, "            case [id]:", onClickSwith1.get(0));
            }
            if (isIf(onClickSwithIfs, getIfKey("onClickCheckLogin", i0))) {
                List<String> onClickSwith1 = onClickSwith.get(getIfKey("onClickCheckLogin", i0));
                addLnTag(onClickSwithSb, "                if (!isLogin(getAct())) {");
                addLnTag(onClickSwithSb, "                    return;");
                addLnTag(onClickSwithSb, "                }");
            }
            addLnTag(onClickSwithSb, "                [methodName](", onClickSwith0.get(0));
            if (isIf(onClickSwithIfs, getIfKey("onClickSwitchParams", i0))) {
                List<String> onClickSwith1 = onClickSwith.get(getIfKey("onClickSwitchParams", i0));
                addLnTag(onClickSwithSb, "                        v[divider]", onClickSwith1.get(0));
            }
            for (int i1 = 0; i1 < count(onClickSwithCounts, getForKey("onClickSwitchParams", i0)); i1++) {
                List<String> onClickSwith1 = onClickSwith.get(getForKey("onClickSwitchParams", i0, i1));
                addLnTag(onClickSwithSb, "                        ([type]) v.getTag([pkg].R.id.tag_[index])[divider]", onClickSwith1.get(0), onClickSwith1.get(1), onClickSwith1.get(2), onClickSwith1.get(3));
            }
            addLnTag(onClickSwithSb, "                );");
            addLnTag(onClickSwithSb, "                break;");
        }
        for (int i0 = 0; i0 < count(onClickMethodsCounts, getForKey("onClickMethods")); i0++) {
            List<String> onClickMethods0 = onClickMethods.get(getForKey("onClickMethods", i0));
            addLnTag(onClickMethodsSb, "    protected void [methodName]([params]) {}", onClickMethods0.get(0), onClickMethods0.get(1));
        }
        for (int i0 = 0; i0 < count(onLongClickSwithCounts, getForKey("onLongClickSwith")); i0++) {
            List<String> onLongClickSwith0 = onLongClickSwith.get(getForKey("onLongClickSwith", i0));
            for (int i1 = 0; i1 < count(onLongClickSwithCounts, getForKey("onLongClickCase", i0)); i1++) {
                List<String> onLongClickSwith1 = onLongClickSwith.get(getForKey("onLongClickCase", i0, i1));
                addLnTag(onLongClickSwithSb, "            case [id]:", onLongClickSwith1.get(0));
            }
            if (isIf(onLongClickSwithIfs, getIfKey("onLongClickCheckLogin", i0))) {
                List<String> onLongClickSwith1 = onLongClickSwith.get(getIfKey("onLongClickCheckLogin", i0));
                addLnTag(onLongClickSwithSb, "                if (!isLogin(getAct())) {");
                addLnTag(onLongClickSwithSb, "                    return false;");
                addLnTag(onLongClickSwithSb, "                }");
            }
            addLnTag(onLongClickSwithSb, "                return [methodName](", onLongClickSwith0.get(0));
            if (isIf(onLongClickSwithIfs, getIfKey("onLongClickSwitchParams", i0))) {
                List<String> onLongClickSwith1 = onLongClickSwith.get(getIfKey("onLongClickSwitchParams", i0));
                addLnTag(onLongClickSwithSb, "                        v[divider]", onLongClickSwith1.get(0));
            }
            for (int i1 = 0; i1 < count(onLongClickSwithCounts, getForKey("onLongClickSwitchParams", i0)); i1++) {
                List<String> onLongClickSwith1 = onLongClickSwith.get(getForKey("onLongClickSwitchParams", i0, i1));
                addLnTag(onLongClickSwithSb, "                        ([type]) v.getTag([pkg].R.id.tag_[index])[divider]", onLongClickSwith1.get(0), onLongClickSwith1.get(1), onLongClickSwith1.get(2), onLongClickSwith1.get(3));
            }
            addLnTag(onLongClickSwithSb, "                );");
            addLnTag(onLongClickSwithSb, "                break;");
        }
        if (isIf(superOnLongClickIfs, getIfKey("superOnLongClick"))) {
            List<String> superOnLongClick0 = superOnLongClick.get(getIfKey("superOnLongClick"));
            addLnTag(superOnLongClickSb, "        return super.onLongClick(v);");
        }
        if (isIf(superOnLongClickFalseIfs, getIfKey("superOnLongClickFalse"))) {
            List<String> superOnLongClickFalse0 = superOnLongClickFalse.get(getIfKey("superOnLongClickFalse"));
            addLnTag(superOnLongClickFalseSb, "        return false;");
        }
        for (int i0 = 0; i0 < count(onLongClickMethodsCounts, getForKey("onLongClickMethods")); i0++) {
            List<String> onLongClickMethods0 = onLongClickMethods.get(getForKey("onLongClickMethods", i0));
            addLnTag(onLongClickMethodsSb, "    protected void [methodName]([params]) {}", onLongClickMethods0.get(0), onLongClickMethods0.get(1));
        }
        for (int i0 = 0; i0 < count(loadMoreCounts, getForKey("loadMore")); i0++) {
            List<String> loadMore0 = loadMore.get(getForKey("loadMore", i0));
            addLnTag(loadMoreSb, "    protected abstract void [adapterName]LoadMore(int page);", loadMore0.get(0));
        }
        if (isIf(superAcceptIfs, getIfKey("superAccept"))) {
            List<String> superAccept0 = superAccept.get(getIfKey("superAccept"));
            addLnTag(superAcceptSb, "        super.accept(code, result, params, objs);");
        }
        for (int i0 = 0; i0 < count(acceptCounts, getForKey("accept")); i0++) {
            List<String> accept0 = accept.get(getForKey("accept", i0));
            addLnTag(acceptSb, "        if (\"[methodName]\".equals(code)) {", accept0.get(0));
            addLnTag(acceptSb, "            new [netBackFullName]() {", accept0.get(1));
            addLnTag(acceptSb, "                @Override");
            addLnTag(acceptSb, "                public void accept(String code, Result<ResponseBody> result, [coreSendParamsFullName] params, List objs) {", accept0.get(2));
            addLnTag(acceptSb, "                    super.accept(code, result, params, objs);");
            addLnTag(acceptSb, "                    [methodName]([params]);", accept0.get(3), accept0.get(4));
            addLnTag(acceptSb, "                }");
            addLnTag(acceptSb, "            }.accept(code, result, params, objs);");
            addLnTag(acceptSb, "        }");
        }
        for (int i0 = 0; i0 < count(acceptMethodCounts, getForKey("acceptMethod")); i0++) {
            List<String> acceptMethod0 = acceptMethod.get(getForKey("acceptMethod", i0));
            addLnTag(acceptMethodSb, "    protected void [methodName]([params]) {}", acceptMethod0.get(0), acceptMethod0.get(1));
        }
        for (int i0 = 0; i0 < count(actBackCounts, getForKey("actBack")); i0++) {
            List<String> actBack0 = actBack.get(getForKey("actBack", i0));
            addLnTag(actBackSb, "            [ifSign] (requestCode == [code4RequestFullName].[code]) {", actBack0.get(0), actBack0.get(1), actBack0.get(2));
            StringBuilder actBackParamSb = new StringBuilder();
            for (int i1 = 0; i1 < count(actBackCounts, getForKey("actBackParam", i0)); i1++) {
                List<String> actBack1 = actBack.get(getForKey("actBackParam", i0, i1));
                StringBuilder actBackParamDividerSb = new StringBuilder();
                if (isIf(actBackIfs, getIfKey("actBackParamDivider", i0, i1))) {
                    List<String> actBack2 = actBack.get(getIfKey("actBackParamDivider", i0, i1));
                    addTag(actBackParamDividerSb, ", ");
                }
                addTag(actBackParamSb, "[passFullName].[name](data)[actBackParamDivider]", actBack1.get(0), actBack1.get(1), actBackParamDividerSb.toString());
            }
            addLnTag(actBackSb, "                [methodName]([actBackParam]);", actBack0.get(3), actBackParamSb.toString());
            addLnTag(actBackSb, "            }");
        }
        for (int i0 = 0; i0 < count(actBackMethodCounts, getForKey("actBackMethod")); i0++) {
            List<String> actBackMethod0 = actBackMethod.get(getForKey("actBackMethod", i0));
            addLnTag(actBackMethodSb, "    protected void [methodName]([params]) {}", actBackMethod0.get(0), actBackMethod0.get(1));
        }
        if (isIf(toastDialogIfs, getIfKey("toastDialog"))) {
            List<String> toastDialog0 = toastDialog.get(getIfKey("toastDialog"));
            addLnTag(toastDialogSb, "    private [toastDialogFullName] toastDialog;", toastDialog0.get(0));
            addLnTag(toastDialogSb, "");
            addLnTag(toastDialogSb, "    protected [toastDialogFullName] getToastDialog() {", toastDialog0.get(1));
            addLnTag(toastDialogSb, "        if (toastDialog == null)");
            addLnTag(toastDialogSb, "            toastDialog = new [toastDialogFullName](getAct())", toastDialog0.get(2));
            addLnTag(toastDialogSb, "                    .setLayout([layout])", toastDialog0.get(3));
            addLnTag(toastDialogSb, "                    .build();");
            addLnTag(toastDialogSb, "        return toastDialog;");
            addLnTag(toastDialogSb, "    }");
            addLnTag(toastDialogSb, "    protected void toastShow(String msg) {");
            addLnTag(toastDialogSb, "        [toastDialogFullName] td = getToastDialog();", toastDialog0.get(4));
            addLnTag(toastDialogSb, "        td.setContent(msg);");
            addLnTag(toastDialogSb, "        if (!td.isShow()) {");
            addLnTag(toastDialogSb, "            td.show();");
            addLnTag(toastDialogSb, "        }");
            addLnTag(toastDialogSb, "    }");
            addLnTag(toastDialogSb, "    protected void toastShow(long time, String msg, [onHiddenFinishedFullName] onHiddenFinished) {", toastDialog0.get(5));
            addLnTag(toastDialogSb, "        toastShow(msg);");
            addLnTag(toastDialogSb, "        [handlerToolFullName].getMainHandler().postDelayed(new java.lang.Runnable() {", toastDialog0.get(6));
            addLnTag(toastDialogSb, "            @Override");
            addLnTag(toastDialogSb, "            public void run() {");
            addLnTag(toastDialogSb, "                getToastDialog().hidden(onHiddenFinished);");
            addLnTag(toastDialogSb, "            }");
            addLnTag(toastDialogSb, "        }, time);");
            addLnTag(toastDialogSb, "    }");
            addLnTag(toastDialogSb, "");
            addLnTag(toastDialogSb, "    protected void toastShow(long time, String msg) {");
            addLnTag(toastDialogSb, "        toastShow(time, msg, null);");
            addLnTag(toastDialogSb, "    }");
            addLnTag(toastDialogSb, "");
            addLnTag(toastDialogSb, "    protected void toastHidden(long time, String msg, [onHiddenFinishedFullName] onHiddenFinished) {", toastDialog0.get(7));
            addLnTag(toastDialogSb, "        getToastDialog().setContent(msg);");
            addLnTag(toastDialogSb, "        [handlerToolFullName].getMainHandler().postDelayed(new java.lang.Runnable() {", toastDialog0.get(8));
            addLnTag(toastDialogSb, "            @Override");
            addLnTag(toastDialogSb, "            public void run() {");
            addLnTag(toastDialogSb, "                getToastDialog().hidden(onHiddenFinished);");
            addLnTag(toastDialogSb, "            }");
            addLnTag(toastDialogSb, "        }, time);");
            addLnTag(toastDialogSb, "    }");
            addLnTag(toastDialogSb, "");
            addLnTag(toastDialogSb, "    protected void toastHidden(long time, String msg) {");
            addLnTag(toastDialogSb, "        toastHidden(time, msg, null);");
            addLnTag(toastDialogSb, "    }");
        }
        if (isIf(noticeDialogIfs, getIfKey("noticeDialog"))) {
            List<String> noticeDialog0 = noticeDialog.get(getIfKey("noticeDialog"));
            addLnTag(noticeDialogSb, "    private [noticeDialogFullName] noticeDialog;", noticeDialog0.get(0));
            addLnTag(noticeDialogSb, "");
            addLnTag(noticeDialogSb, "    protected void noticeShow(String msg) {");
            addLnTag(noticeDialogSb, "        if (noticeDialog == null)");
            addLnTag(noticeDialogSb, "            noticeDialog = new [noticeDialogFullName](getAct())", noticeDialog0.get(1));
            addLnTag(noticeDialogSb, "                    .setLayout([layout])", noticeDialog0.get(2));
            addLnTag(noticeDialogSb, "                    .build();");
            addLnTag(noticeDialogSb, "        noticeDialog.setContent(msg);");
            addLnTag(noticeDialogSb, "        noticeDialog.show();");
            addLnTag(noticeDialogSb, "    }");
        }
        for (int i0 = 0; i0 < count(editDialogCounts, getForKey("editDialog")); i0++) {
            List<String> editDialog0 = editDialog.get(getForKey("editDialog", i0));
            addLnTag(editDialogSb, "    private [editDialogFullName] [edName];", editDialog0.get(0), editDialog0.get(1));
            addLnTag(editDialogSb, "");
            StringBuilder edShowParamSb = new StringBuilder();
            if (isIf(editDialogIfs, getIfKey("edShowParam", i0))) {
                List<String> editDialog1 = editDialog.get(getIfKey("edShowParam", i0));
                addTag(edShowParamSb, ", [type] [name]", editDialog1.get(0), editDialog1.get(1));
            }
            addLnTag(editDialogSb, "    protected void show[edClassName](String text[edShowParam]) {", editDialog0.get(2), edShowParamSb.toString());
            addLnTag(editDialogSb, "        if ([edName] == null)", editDialog0.get(3));
            addLnTag(editDialogSb, "            [edName] = new [editDialogFullName].Builder(getAct())", editDialog0.get(4), editDialog0.get(5));
            addLnTag(editDialogSb, "                    .setTitle(\"[title]\")", editDialog0.get(6));
            addLnTag(editDialogSb, "                    .setHint(\"[hint]\")", editDialog0.get(7));
            addLnTag(editDialogSb, "                    .setInputType([inputType])", editDialog0.get(8));
            addLnTag(editDialogSb, "                    .setLayout([layout])", editDialog0.get(9));
            if (isIf(editDialogIfs, getIfKey("setTextWatcher", i0))) {
                List<String> editDialog1 = editDialog.get(getIfKey("setTextWatcher", i0));
                addLnTag(editDialogSb, "                    .setTextWatcher(get[edClassName]TextWatcher())", editDialog1.get(0));
            }
            if (isIf(editDialogIfs, getIfKey("stopAnimation", i0))) {
                List<String> editDialog1 = editDialog.get(getIfKey("stopAnimation", i0));
                addLnTag(editDialogSb, "                    .stopAnimation()");
            }
            addLnTag(editDialogSb, "                    .setYes(new [editDialogFullName].Yes() {", editDialog0.get(10));
            addLnTag(editDialogSb, "                        @Override");
            addLnTag(editDialogSb, "                        public boolean yes(String text, Object obj) {");
            StringBuilder edUseYesSb = new StringBuilder();
            if (isIf(editDialogIfs, getIfKey("edUseYes", i0))) {
                List<String> editDialog1 = editDialog.get(getIfKey("edUseYes", i0));
                StringBuilder edUseYesConvertSb = new StringBuilder();
                if (isIf(editDialogIfs, getIfKey("edUseYesConvert", i0))) {
                    List<String> editDialog2 = editDialog.get(getIfKey("edUseYesConvert", i0));
                    addTag(edUseYesConvertSb, "([type])", editDialog2.get(0));
                }
                addTag(edUseYesSb, ", [edUseYesConvert]obj", edUseYesConvertSb.toString());
            }
            addLnTag(editDialogSb, "                            return [edName]Yes(text[edUseYes]);", editDialog0.get(11), edUseYesSb.toString());
            addLnTag(editDialogSb, "                        }");
            addLnTag(editDialogSb, "                    })");
            addLnTag(editDialogSb, "                    .build();");
            addLnTag(editDialogSb, "        [edName].setEditText(text);", editDialog0.get(12));
            addLnTag(editDialogSb, "        [edName].setObject([setObject]);", editDialog0.get(13), editDialog0.get(14));
            addLnTag(editDialogSb, "        [edName].show();", editDialog0.get(15));
            addLnTag(editDialogSb, "    }");
            addLnTag(editDialogSb, "");
            addLnTag(editDialogSb, "");
            StringBuilder edYesParamSb = new StringBuilder();
            if (isIf(editDialogIfs, getIfKey("edYesParam", i0))) {
                List<String> editDialog1 = editDialog.get(getIfKey("edYesParam", i0));
                addTag(edYesParamSb, ", [type] [name]", editDialog1.get(0), editDialog1.get(1));
            }
            addLnTag(editDialogSb, "    protected boolean [edName]Yes(String text[edYesParam]) {", editDialog0.get(16), edYesParamSb.toString());
            addLnTag(editDialogSb, "        return false;");
            addLnTag(editDialogSb, "    }");
            if (isIf(editDialogIfs, getIfKey("setTextWatcherMethod", i0))) {
                List<String> editDialog1 = editDialog.get(getIfKey("setTextWatcherMethod", i0));
                addLnTag(editDialogSb, "    protected [edTextWatcherFullName] get[edClassName]TextWatcher() {", editDialog1.get(0), editDialog1.get(1));
                addLnTag(editDialogSb, "        return null;");
                addLnTag(editDialogSb, "    }");
            }
        }
        for (int i0 = 0; i0 < count(dialogCounts, getForKey("dialog")); i0++) {
            List<String> dialog0 = dialog.get(getForKey("dialog", i0));
            addLnTag(dialogSb, "    private [dialogFullName] [dialogName];", dialog0.get(0), dialog0.get(1));
            for (int i1 = 0; i1 < count(dialogCounts, getForKey("showDialog", i0)); i1++) {
                List<String> dialog1 = dialog.get(getForKey("showDialog", i0, i1));
                addLnTag(dialogSb, "    protected void show[dialogClassName]([showDialogParam]) {", dialog1.get(0), dialog1.get(1));
                addLnTag(dialogSb, "        if ([dialogName] == null) {", dialog1.get(2));
                addLnTag(dialogSb, "            [dialogName] = new [dialogFullName](getAct())", dialog1.get(3), dialog1.get(4));
                addLnTag(dialogSb, "                    .setTitle(\"[title]\")", dialog1.get(5));
                if (isIf(dialogIfs, getIfKey("showDialogSetContentStr", i0, i1))) {
                    List<String> dialog2 = dialog.get(getIfKey("showDialogSetContentStr", i0, i1));
                    addLnTag(dialogSb, "                    .setContent(\"请选择照片的来源\")");
                }
                if (isIf(dialogIfs, getIfKey("showDialogSetContent", i0, i1))) {
                    List<String> dialog2 = dialog.get(getIfKey("showDialogSetContent", i0, i1));
                    addLnTag(dialogSb, "                    .setContent(content)");
                }
                addLnTag(dialogSb, "                    .setLeftBtText(\"[left]\")", dialog1.get(6));
                addLnTag(dialogSb, "                    .setRighBtText(\"[right]\")", dialog1.get(7));
                addLnTag(dialogSb, "                    .setLayout([layout])", dialog1.get(8));
                addLnTag(dialogSb, "                    .setOnBtClick(new [onBtClickFullName]() {", dialog1.get(9));
                addLnTag(dialogSb, "                        @Override");
                addLnTag(dialogSb, "                        public void onLeftClick(Object obj) {");
                StringBuilder showDialogLeftObjSb = new StringBuilder();
                if (isIf(dialogIfs, getIfKey("showDialogLeftObj", i0, i1))) {
                    List<String> dialog2 = dialog.get(getIfKey("showDialogLeftObj", i0, i1));
                    StringBuilder showDialogLeftObjConvertSb = new StringBuilder();
                    if (isIf(dialogIfs, getIfKey("showDialogLeftObjConvert", i0, i1))) {
                        List<String> dialog3 = dialog.get(getIfKey("showDialogLeftObjConvert", i0, i1));
                        addTag(showDialogLeftObjConvertSb, "([type])", dialog3.get(0));
                    }
                    addTag(showDialogLeftObjSb, "[showDialogLeftObjConvert]obj", showDialogLeftObjConvertSb.toString());
                }
                addLnTag(dialogSb, "                            [dialogName]Left([showDialogLeftObj]);", dialog1.get(10), showDialogLeftObjSb.toString());
                addLnTag(dialogSb, "                        }");
                addLnTag(dialogSb, "");
                addLnTag(dialogSb, "                        @Override");
                addLnTag(dialogSb, "                        public void onRightClick(Object obj) {");
                StringBuilder showDialogRightObjSb = new StringBuilder();
                if (isIf(dialogIfs, getIfKey("showDialogRightObj", i0, i1))) {
                    List<String> dialog2 = dialog.get(getIfKey("showDialogRightObj", i0, i1));
                    StringBuilder showDialogRightObjConvertSb = new StringBuilder();
                    if (isIf(dialogIfs, getIfKey("showDialogRightObjConvert", i0, i1))) {
                        List<String> dialog3 = dialog.get(getIfKey("showDialogRightObjConvert", i0, i1));
                        addTag(showDialogRightObjConvertSb, "([type])", dialog3.get(0));
                    }
                    addTag(showDialogRightObjSb, "[showDialogRightObjConvert]obj", showDialogRightObjConvertSb.toString());
                }
                addLnTag(dialogSb, "                            [dialogName]Right([showDialogRightObj]);", dialog1.get(11), showDialogRightObjSb.toString());
                addLnTag(dialogSb, "                        }");
                addLnTag(dialogSb, "                    })");
                addLnTag(dialogSb, "                    .build();");
                StringBuilder showDialogElseSb = new StringBuilder();
                if (isIf(dialogIfs, getIfKey("showDialogElse", i0, i1))) {
                    List<String> dialog2 = dialog.get(getIfKey("showDialogElse", i0, i1));
                    addTag(showDialogElseSb, " else {");
                }
                addLnTag(dialogSb, "        }[showDialogElse]", showDialogElseSb.toString());
                if (isIf(dialogIfs, getIfKey("showDialogUpdataContent", i0, i1))) {
                    List<String> dialog2 = dialog.get(getIfKey("showDialogUpdataContent", i0, i1));
                    addLnTag(dialogSb, "            [dialogName].updateContent(content);", dialog2.get(0));
                    addLnTag(dialogSb, "        }");
                }
                addLnTag(dialogSb, "        [dialogName].setObject([obj]);", dialog1.get(12), dialog1.get(13));
                addLnTag(dialogSb, "        [dialogName].show();", dialog1.get(14));
                addLnTag(dialogSb, "    }");
            }
            StringBuilder leftParamSb = new StringBuilder();
            if (isIf(dialogIfs, getIfKey("leftParam", i0))) {
                List<String> dialog1 = dialog.get(getIfKey("leftParam", i0));
                addTag(leftParamSb, "[type] [name]", dialog1.get(0), dialog1.get(1));
            }
            addLnTag(dialogSb, "    protected void [dialogName]Left([leftParam]) { }", dialog0.get(2), leftParamSb.toString());
            StringBuilder rightParamSb = new StringBuilder();
            if (isIf(dialogIfs, getIfKey("rightParam", i0))) {
                List<String> dialog1 = dialog.get(getIfKey("rightParam", i0));
                addTag(rightParamSb, "[type] [name]", dialog1.get(0), dialog1.get(1));
            }
            addLnTag(dialogSb, "    protected void [dialogName]Right([rightParam]) { }", dialog0.get(3), rightParamSb.toString());
        }

    }

    @Override
    protected List<String> getTempLines() {
        List<String> lines = new ArrayList<>();
        lines.add("package [[pkg]];");
        lines.add("");
        lines.add("import android.os.Bundle;");
        lines.add("import android.view.LayoutInflater;");
        lines.add("import android.view.View;");
        lines.add("import android.view.ViewGroup;");
        lines.add("");
        lines.add("import androidx.annotation.NonNull;");
        lines.add("import androidx.annotation.Nullable;");
        lines.add("");
        lines.add("import java.util.List;");
        lines.add("");
        lines.add("import okhttp3.ResponseBody;");
        lines.add("import retrofit2.adapter.rxjava2.Result;");
        lines.add("");
        lines.add("public abstract class [[name]] extends [[baseClass]] implements View.OnClickListener, View.OnLongClickListener, [[netBackIFullName]]{");
        lines.add("[[field]]");
        lines.add("");
        lines.add("    @Override");
        lines.add("    public void onCreate(@Nullable Bundle savedInstanceState) {");
        lines.add("        super.onCreate(savedInstanceState);");
        lines.add("");
        lines.add("    }");
        lines.add("[[layout]]");
        lines.add("    @Override");
        lines.add("    public void onClick(View v) {");
        lines.add("[[superOnClick]]");
        lines.add("        switch (v.getId()) {");
        lines.add("[[onClickSwith]]");
        lines.add("        }");
        lines.add("    }");
        lines.add("[[onClickMethods]]");
        lines.add("");
        lines.add("    @Override");
        lines.add("    public boolean onLongClick(View v) {");
        lines.add("        switch (v.getId()) {");
        lines.add("[[onLongClickSwith]]");
        lines.add("        }");
        lines.add("[[superOnLongClick]]");
        lines.add("[[superOnLongClickFalse]]");
        lines.add("");
        lines.add("    }");
        lines.add("");
        lines.add("[[onLongClickMethods]]");
        lines.add("");
        lines.add("");
        lines.add("[[loadMore]]");
        lines.add("    @Override");
        lines.add("    public void accept(String code, Result<ResponseBody> result, [[coreSendParamsFullName]] params, List objs) {");
        lines.add("[[superAccept]]");
        lines.add("");
        lines.add("[[accept]]");
        lines.add("    }");
        lines.add("[[acceptMethod]]");
        lines.add("    @Override");
        lines.add("    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {");
        lines.add("        super.onActivityResult(requestCode, resultCode, data);");
        lines.add("        if (resultCode == android.app.Activity.RESULT_OK) {");
        lines.add("[[actBack]]");
        lines.add("        }");
        lines.add("    }");
        lines.add("[[actBackMethod]]");
        lines.add("[[toastDialog]]");
        lines.add("[[noticeDialog]]");
        lines.add("[[editDialog]]");
        lines.add("[[dialog]]");
        lines.add("}");

        return lines;
    }
}
