package com.codingtu.cooltu.processor.builder.base;
import java.util.ArrayList;
import java.util.List;

public abstract class ActBaseBuilderBase extends com.codingtu.cooltu.processor.builder.core.CoreBuilder {
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
    protected java.util.Map<String, Boolean> findViewIfs;
    protected java.util.Map<String, Integer> findViewCounts;
    protected StringBuilder findViewSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> findView;
    protected java.util.Map<String, Boolean> setOnClickIfs;
    protected java.util.Map<String, Integer> setOnClickCounts;
    protected StringBuilder setOnClickSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> setOnClick;
    protected java.util.Map<String, Boolean> setOnLongClickIfs;
    protected java.util.Map<String, Integer> setOnLongClickCounts;
    protected StringBuilder setOnLongClickSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> setOnLongClick;
    protected java.util.Map<String, Boolean> colorStrInitIfs;
    protected java.util.Map<String, Integer> colorStrInitCounts;
    protected StringBuilder colorStrInitSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> colorStrInit;
    protected java.util.Map<String, Boolean> colorResInitIfs;
    protected java.util.Map<String, Integer> colorResInitCounts;
    protected StringBuilder colorResInitSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> colorResInit;
    protected java.util.Map<String, Boolean> dpInitIfs;
    protected java.util.Map<String, Integer> dpInitCounts;
    protected StringBuilder dpInitSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> dpInit;
    protected java.util.Map<String, Boolean> dimenInitIfs;
    protected java.util.Map<String, Integer> dimenInitCounts;
    protected StringBuilder dimenInitSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> dimenInit;
    protected java.util.Map<String, Boolean> startInitIfs;
    protected java.util.Map<String, Integer> startInitCounts;
    protected StringBuilder startInitSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> startInit;
    protected java.util.Map<String, Boolean> listAdapterIfs;
    protected java.util.Map<String, Integer> listAdapterCounts;
    protected StringBuilder listAdapterSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> listAdapter;
    protected java.util.Map<String, Boolean> formInitIfs;
    protected java.util.Map<String, Integer> formInitCounts;
    protected StringBuilder formInitSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> formInit;
    protected java.util.Map<String, Boolean> onCreateCompleteInitIfs;
    protected java.util.Map<String, Integer> onCreateCompleteInitCounts;
    protected StringBuilder onCreateCompleteInitSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> onCreateCompleteInit;
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
    protected java.util.Map<String, Boolean> permissionBackIfs;
    protected java.util.Map<String, Integer> permissionBackCounts;
    protected StringBuilder permissionBackSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> permissionBack;
    protected java.util.Map<String, Boolean> permissionBackMethodIfs;
    protected java.util.Map<String, Integer> permissionBackMethodCounts;
    protected StringBuilder permissionBackMethodSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> permissionBackMethod;
    protected java.util.Map<String, Boolean> bindHandlerIfs;
    protected java.util.Map<String, Integer> bindHandlerCounts;
    protected StringBuilder bindHandlerSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> bindHandler;
    protected java.util.Map<String, Boolean> checkFormsIfs;
    protected java.util.Map<String, Integer> checkFormsCounts;
    protected StringBuilder checkFormsSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> checkForms;
    protected java.util.Map<String, Boolean> loadMoreIfs;
    protected java.util.Map<String, Integer> loadMoreCounts;
    protected StringBuilder loadMoreSb;
    protected com.codingtu.cooltu.lib4j.data.map.ListValueMap<String, String> loadMore;
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

    public ActBaseBuilderBase(com.codingtu.cooltu.lib4j.data.java.JavaInfo info) {
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
        findViewIfs = new java.util.HashMap<>();
        findViewCounts = new java.util.HashMap<>();
        findViewSb = map.get("findView");
        findView = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        setOnClickIfs = new java.util.HashMap<>();
        setOnClickCounts = new java.util.HashMap<>();
        setOnClickSb = map.get("setOnClick");
        setOnClick = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        setOnLongClickIfs = new java.util.HashMap<>();
        setOnLongClickCounts = new java.util.HashMap<>();
        setOnLongClickSb = map.get("setOnLongClick");
        setOnLongClick = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        colorStrInitIfs = new java.util.HashMap<>();
        colorStrInitCounts = new java.util.HashMap<>();
        colorStrInitSb = map.get("colorStrInit");
        colorStrInit = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        colorResInitIfs = new java.util.HashMap<>();
        colorResInitCounts = new java.util.HashMap<>();
        colorResInitSb = map.get("colorResInit");
        colorResInit = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        dpInitIfs = new java.util.HashMap<>();
        dpInitCounts = new java.util.HashMap<>();
        dpInitSb = map.get("dpInit");
        dpInit = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        dimenInitIfs = new java.util.HashMap<>();
        dimenInitCounts = new java.util.HashMap<>();
        dimenInitSb = map.get("dimenInit");
        dimenInit = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        startInitIfs = new java.util.HashMap<>();
        startInitCounts = new java.util.HashMap<>();
        startInitSb = map.get("startInit");
        startInit = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        listAdapterIfs = new java.util.HashMap<>();
        listAdapterCounts = new java.util.HashMap<>();
        listAdapterSb = map.get("listAdapter");
        listAdapter = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        formInitIfs = new java.util.HashMap<>();
        formInitCounts = new java.util.HashMap<>();
        formInitSb = map.get("formInit");
        formInit = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        onCreateCompleteInitIfs = new java.util.HashMap<>();
        onCreateCompleteInitCounts = new java.util.HashMap<>();
        onCreateCompleteInitSb = map.get("onCreateCompleteInit");
        onCreateCompleteInit = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
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
        permissionBackIfs = new java.util.HashMap<>();
        permissionBackCounts = new java.util.HashMap<>();
        permissionBackSb = map.get("permissionBack");
        permissionBack = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        permissionBackMethodIfs = new java.util.HashMap<>();
        permissionBackMethodCounts = new java.util.HashMap<>();
        permissionBackMethodSb = map.get("permissionBackMethod");
        permissionBackMethod = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        bindHandlerIfs = new java.util.HashMap<>();
        bindHandlerCounts = new java.util.HashMap<>();
        bindHandlerSb = map.get("bindHandler");
        bindHandler = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        checkFormsIfs = new java.util.HashMap<>();
        checkFormsCounts = new java.util.HashMap<>();
        checkFormsSb = map.get("checkForms");
        checkForms = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
        loadMoreIfs = new java.util.HashMap<>();
        loadMoreCounts = new java.util.HashMap<>();
        loadMoreSb = map.get("loadMore");
        loadMore = new com.codingtu.cooltu.lib4j.data.map.ListValueMap<>();
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
        return count(findViewCounts, getForKey("findView"));
    }
    public void findView(int i0, String fieldName, String parent, String rPkg, String id) {
        addForMap(this.findView, getForKey("findView", i0), fieldName, parent, rPkg, id);
        countAdd(findViewCounts, getForKey("findView"));
    }
    public int setOnClickCount() {
        return count(setOnClickCounts, getForKey("setOnClick"));
    }
    public void setOnClick(int i0, String fieldName) {
        addForMap(this.setOnClick, getForKey("setOnClick", i0), fieldName);
        countAdd(setOnClickCounts, getForKey("setOnClick"));
    }
    public int setOnLongClickCount() {
        return count(setOnLongClickCounts, getForKey("setOnLongClick"));
    }
    public void setOnLongClick(int i0, String fieldName) {
        addForMap(this.setOnLongClick, getForKey("setOnLongClick", i0), fieldName);
        countAdd(setOnLongClickCounts, getForKey("setOnLongClick"));
    }
    public int colorStrInitCount() {
        return count(colorStrInitCounts, getForKey("colorStrInit"));
    }
    public void colorStrInit(int i0, String name, String color) {
        addForMap(this.colorStrInit, getForKey("colorStrInit", i0), name, color);
        countAdd(colorStrInitCounts, getForKey("colorStrInit"));
    }
    public int colorResInitCount() {
        return count(colorResInitCounts, getForKey("colorResInit"));
    }
    public void colorResInit(int i0, String name, String resourceToolFullName, String id) {
        addForMap(this.colorResInit, getForKey("colorResInit", i0), name, resourceToolFullName, id);
        countAdd(colorResInitCounts, getForKey("colorResInit"));
    }
    public int dpInitCount() {
        return count(dpInitCounts, getForKey("dpInit"));
    }
    public void dpInit(int i0, String name, String mobileToolFullName, String value) {
        addForMap(this.dpInit, getForKey("dpInit", i0), name, mobileToolFullName, value);
        countAdd(dpInitCounts, getForKey("dpInit"));
    }
    public int dimenInitCount() {
        return count(dimenInitCounts, getForKey("dimenInit"));
    }
    public void dimenInit(int i0, String name, String resourceToolFullName, String id) {
        addForMap(this.dimenInit, getForKey("dimenInit", i0), name, resourceToolFullName, id);
        countAdd(dimenInitCounts, getForKey("dimenInit"));
    }
    public int startInitCount() {
        return count(startInitCounts, getForKey("startInit"));
    }
    public void startInit(int i0, String name, String passFullName) {
        addForMap(this.startInit, getForKey("startInit", i0), name, passFullName, name);
        countAdd(startInitCounts, getForKey("startInit"));
    }
    public int listAdapterCount() {
        return count(listAdapterCounts, getForKey("listAdapter"));
    }
    public void listAdapter(int i0, String adapterName, String vhFullName, String rvName) {
        addForMap(this.listAdapter, getForKey("listAdapter", i0), adapterName, vhFullName, adapterName, rvName, adapterName, rvName);
        countAdd(listAdapterCounts, getForKey("listAdapter"));
    }
    public int rgInitCount() {
        return count(formInitCounts, getForKey("rgInit"));
    }
    public void rgInit(int i0, String viewName, String radioGroupFullName, String onSetItem, String rPkg) {
        addForMap(this.formInit, getForKey("rgInit", i0), viewName, viewName, radioGroupFullName, viewName, onSetItem, viewName, rPkg, viewName);
        countAdd(formInitCounts, getForKey("rgInit"));
    }
    public int editTextInitCount() {
        return count(formInitCounts, getForKey("editTextInit"));
    }
    public void editTextInit(int i0, String name, String handlerTextWatcherFullName, String formTypeFullName, String type, String index) {
        addForMap(this.formInit, getForKey("editTextInit", i0), name, handlerTextWatcherFullName, formTypeFullName, type, index);
        countAdd(formInitCounts, getForKey("editTextInit"));
    }
    public int textViewInitCount() {
        return count(formInitCounts, getForKey("textViewInit"));
    }
    public void textViewInit(int i0, String name, String handlerTextWatcherFullName, String formTypeFullName, String type, String index) {
        addForMap(this.formInit, getForKey("textViewInit", i0), name, handlerTextWatcherFullName, formTypeFullName, type, index);
        countAdd(formInitCounts, getForKey("textViewInit"));
    }
    public int rgBindCount() {
        return count(formInitCounts, getForKey("rgBind"));
    }
    public void rgBind(int i0, String viewName, String handlerOnSelectChangeFullName, String formTypeFullName, String type, String index) {
        addForMap(this.formInit, getForKey("rgBind", i0), viewName, handlerOnSelectChangeFullName, formTypeFullName, type, index);
        countAdd(formInitCounts, getForKey("rgBind"));
    }
    public int seekBarBindCount() {
        return count(formInitCounts, getForKey("seekBarBind"));
    }
    public void seekBarBind(int i0, String name, String handlerOnSeekBarChangeListenerFullName, String formTypeFullName, String type, String index) {
        addForMap(this.formInit, getForKey("seekBarBind", i0), name, handlerOnSeekBarChangeListenerFullName, formTypeFullName, type, index);
        countAdd(formInitCounts, getForKey("seekBarBind"));
    }
    public int addLinkCount(int i0) {
        return count(formInitCounts, getForKey("addLink", i0));
    }
    public void addLink(int i0, int i1, String viewId, String linkName) {
        addForMap(this.formInit, getForKey("addLink", i0, i1), viewId, linkName);
        countAdd(formInitCounts, getForKey("addLink", i0));
    }
    public int bindMultiCount() {
        return count(formInitCounts, getForKey("bindMulti"));
    }
    public void bindMulti(int i0, String formLinkFullName, String linkName, String linkType, String beanName, String views) {
        addForMap(this.formInit, getForKey("bindMulti", i0), formLinkFullName, linkName, linkType, beanName, views);
        countAdd(formInitCounts, getForKey("bindMulti"));
    }
    public int echosCount() {
        return count(formInitCounts, getForKey("echos"));
    }
    public void echos(int i0, String echos) {
        addForMap(this.formInit, getForKey("echos", i0), echos);
        countAdd(formInitCounts, getForKey("echos"));
    }
    public int etEchoWithParseCount() {
        return count(formInitCounts, getForKey("etEchoWithParse"));
    }
    public void etEchoWithParse(int i0, String viewToolFullName, String view, String parse, String bean, String field) {
        addForMap(this.formInit, getForKey("etEchoWithParse", i0), viewToolFullName, view, parse, bean, field);
        countAdd(formInitCounts, getForKey("etEchoWithParse"));
    }
    public int etEchoCount() {
        return count(formInitCounts, getForKey("etEcho"));
    }
    public void etEcho(int i0, String viewToolFullName, String view, String bean, String field) {
        addForMap(this.formInit, getForKey("etEcho", i0), viewToolFullName, view, bean, field);
        countAdd(formInitCounts, getForKey("etEcho"));
    }
    public int tvEchoWithParseCount() {
        return count(formInitCounts, getForKey("tvEchoWithParse"));
    }
    public void tvEchoWithParse(int i0, String viewToolFullName, String view, String parse, String bean, String field) {
        addForMap(this.formInit, getForKey("tvEchoWithParse", i0), viewToolFullName, view, parse, bean, field);
        countAdd(formInitCounts, getForKey("tvEchoWithParse"));
    }
    public int tvEchoCount() {
        return count(formInitCounts, getForKey("tvEcho"));
    }
    public void tvEcho(int i0, String viewToolFullName, String view, String bean, String field) {
        addForMap(this.formInit, getForKey("tvEcho", i0), viewToolFullName, view, bean, field);
        countAdd(formInitCounts, getForKey("tvEcho"));
    }
    public int rgEchoCount() {
        return count(formInitCounts, getForKey("rgEcho"));
    }
    public void rgEcho(int i0, String viewName, String defaultRadioGroupToStringFullName, String items, String bean, String field) {
        addForMap(this.formInit, getForKey("rgEcho", i0), viewName, defaultRadioGroupToStringFullName, items, bean, field);
        countAdd(formInitCounts, getForKey("rgEcho"));
    }
    public int rgEchoWithParseCount() {
        return count(formInitCounts, getForKey("rgEchoWithParse"));
    }
    public void rgEchoWithParse(int i0, String viewName, String parse, String bean, String field) {
        addForMap(this.formInit, getForKey("rgEchoWithParse", i0), viewName, parse, bean, field);
        countAdd(formInitCounts, getForKey("rgEchoWithParse"));
    }
    public int seekBarEchoCount() {
        return count(formInitCounts, getForKey("seekBarEcho"));
    }
    public void seekBarEcho(int i0, String viewName, String bean, String field) {
        addForMap(this.formInit, getForKey("seekBarEcho", i0), viewName, bean, field);
        countAdd(formInitCounts, getForKey("seekBarEcho"));
    }
    public int seekBarEchoWithParseCount() {
        return count(formInitCounts, getForKey("seekBarEchoWithParse"));
    }
    public void seekBarEchoWithParse(int i0, String viewName, String parse, String bean, String field) {
        addForMap(this.formInit, getForKey("seekBarEchoWithParse", i0), viewName, parse, bean, field);
        countAdd(formInitCounts, getForKey("seekBarEchoWithParse"));
    }
    public int linkEchoCount() {
        return count(formInitCounts, getForKey("linkEcho"));
    }
    public void linkEcho(int i0, String lineName) {
        addForMap(this.formInit, getForKey("linkEcho", i0), lineName);
        countAdd(formInitCounts, getForKey("linkEcho"));
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
    public int permissionBackCount() {
        return count(permissionBackCounts, getForKey("permissionBack"));
    }
    public void permissionBack(int i0, String ifSign, String permissionsFullName, String methodNameStatic, String actStaticName, String methodName) {
        addForMap(this.permissionBack, getForKey("permissionBack", i0), ifSign, permissionsFullName, methodNameStatic, actStaticName, methodName);
        countAdd(permissionBackCounts, getForKey("permissionBack"));
    }
    public int permissionBackMethodCount() {
        return count(permissionBackMethodCounts, getForKey("permissionBackMethod"));
    }
    public void permissionBackMethod(int i0, String methodName) {
        addForMap(this.permissionBackMethod, getForKey("permissionBackMethod", i0), methodName);
        countAdd(permissionBackMethodCounts, getForKey("permissionBackMethod"));
    }
    public int handlerItemCount(int i0) {
        return count(bindHandlerCounts, getForKey("handlerItem", i0));
    }
    public void handlerItem(int i0, int i1, String index) {
        addForMap(this.bindHandler, getForKey("handlerItem", i0, i1), index);
        countAdd(bindHandlerCounts, getForKey("handlerItem", i0));
    }
    public int handlerCount() {
        return count(bindHandlerCounts, getForKey("handler"));
    }
    public void handler(int i0, String formTypeFullName, String type) {
        addForMap(this.bindHandler, getForKey("handler", i0), formTypeFullName, type);
        countAdd(bindHandlerCounts, getForKey("handler"));
    }
    public int checkCount() {
        return count(checkFormsCounts, getForKey("check"));
    }
    public void check(int i0) {
        addForMap(this.checkForms, getForKey("check", i0));
        countAdd(checkFormsCounts, getForKey("check"));
    }
    public int loadMoreCount() {
        return count(loadMoreCounts, getForKey("loadMore"));
    }
    public void loadMore(int i0, String adapterName) {
        addForMap(this.loadMore, getForKey("loadMore", i0), adapterName);
        countAdd(loadMoreCounts, getForKey("loadMore"));
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

    public void layoutIf(String layout) {
        addForMap(this.layout, getIfKey("layout"), layout);
        layoutIfs.put(getIfKey("layout"), true);
    }
    public void defaultListAdapterIf(int i0, String adapterName, String adapterFullName) {
        addForMap(this.listAdapter, getIfKey("defaultListAdapter", i0), adapterName, adapterName, adapterFullName);
        listAdapterIfs.put(getIfKey("defaultListAdapter", i0), true);
    }
    public void defaultListMoreAdapterIf(int i0, String adapterName, String adapterFullName) {
        addForMap(this.listAdapter, getIfKey("defaultListMoreAdapter", i0), adapterName, adapterName, adapterFullName, adapterName);
        listAdapterIfs.put(getIfKey("defaultListMoreAdapter", i0), true);
    }
    public void rgOnSetItemInitIf(int i0, String name, String type) {
        addForMap(this.formInit, getIfKey("rgOnSetItemInit", i0), name, type);
        formInitIfs.put(getIfKey("rgOnSetItemInit", i0), true);
    }
    public void rgDefaultItemIf(int i0, String viewName, String index) {
        addForMap(this.formInit, getIfKey("rgDefaultItem", i0), viewName, index);
        formInitIfs.put(getIfKey("rgDefaultItem", i0), true);
    }
    public void formInitIf(String name, String type) {
        addForMap(this.formInit, getIfKey("formInit"), name, name, name, type, name);
        formInitIfs.put(getIfKey("formInit"), true);
    }
    public void isOnCreateCompleteInit(boolean is) {
        onCreateCompleteInitIfs.put(getIfKey("onCreateCompleteInit"), is);
    }
    public void isSuperOnClick(boolean is) {
        superOnClickIfs.put(getIfKey("superOnClick"), is);
    }
    public void isOnClickCheckLogin(int i0, boolean is) {
        onClickSwithIfs.put(getIfKey("onClickCheckLogin", i0), is);
    }
    public void onClickCheckFormIf(int i0, String formBean) {
        addForMap(this.onClickSwith, getIfKey("onClickCheckForm", i0), formBean);
        onClickSwithIfs.put(getIfKey("onClickCheckForm", i0), true);
    }
    public void onClickSwitchParamsIf(int i0, String divider) {
        addForMap(this.onClickSwith, getIfKey("onClickSwitchParams", i0), divider);
        onClickSwithIfs.put(getIfKey("onClickSwitchParams", i0), true);
    }
    public void isOnLongClickCheckLogin(int i0, boolean is) {
        onLongClickSwithIfs.put(getIfKey("onLongClickCheckLogin", i0), is);
    }
    public void onLongClickCheckFormIf(int i0, String formBean) {
        addForMap(this.onLongClickSwith, getIfKey("onLongClickCheckForm", i0), formBean);
        onLongClickSwithIfs.put(getIfKey("onLongClickCheckForm", i0), true);
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
    public void allowIf(int i0, String permissionToolFullName) {
        addForMap(this.permissionBack, getIfKey("allow", i0), permissionToolFullName);
        permissionBackIfs.put(getIfKey("allow", i0), true);
    }
    public void isAllowParam(int i0, boolean is) {
        permissionBackMethodIfs.put(getIfKey("allowParam", i0), is);
    }
    public void handlerItemStringIf(int i0, int i1, String beanName, String field) {
        addForMap(this.bindHandler, getIfKey("handlerItemString", i0, i1), beanName, field);
        bindHandlerIfs.put(getIfKey("handlerItemString", i0, i1), true);
    }
    public void handlerItemRgIf(int i0, int i1, String beanName, String field, String defaultRadioGroupToStringFullName, String items) {
        addForMap(this.bindHandler, getIfKey("handlerItemRg", i0, i1), beanName, field, defaultRadioGroupToStringFullName, items);
        bindHandlerIfs.put(getIfKey("handlerItemRg", i0, i1), true);
    }
    public void handlerItemIntIf(int i0, int i1, String beanName, String field) {
        addForMap(this.bindHandler, getIfKey("handlerItemInt", i0, i1), beanName, field);
        bindHandlerIfs.put(getIfKey("handlerItemInt", i0, i1), true);
    }
    public void handlerItemParseIf(int i0, int i1, String beanName, String field, String parse) {
        addForMap(this.bindHandler, getIfKey("handlerItemParse", i0, i1), beanName, field, parse);
        bindHandlerIfs.put(getIfKey("handlerItemParse", i0, i1), true);
    }
    public void handlerItemLinkIf(int i0, int i1, String viewId) {
        addForMap(this.bindHandler, getIfKey("handlerItemLink", i0, i1), viewId);
        bindHandlerIfs.put(getIfKey("handlerItemLink", i0, i1), true);
    }
    public void bindHandlerIf(String beanType, String beanName, String formLinkFullName, String listValueMapFullName, String tsFullName) {
        addForMap(this.bindHandler, getIfKey("bindHandler"), beanType, beanName, beanType, beanName, beanName, beanName, formLinkFullName, listValueMapFullName, formLinkFullName, listValueMapFullName, formLinkFullName, listValueMapFullName, tsFullName);
        bindHandlerIfs.put(getIfKey("bindHandler"), true);
    }
    public void checkStringIf(int i0, String stringToolFullName, String bean, String field, String promp) {
        addForMap(this.checkForms, getIfKey("checkString", i0), stringToolFullName, bean, field, promp);
        checkFormsIfs.put(getIfKey("checkString", i0), true);
    }
    public void checkWithDealIf(int i0, String checkClass, String bean, String field, String promp) {
        addForMap(this.checkForms, getIfKey("checkWithDeal", i0), checkClass, bean, bean, field, promp);
        checkFormsIfs.put(getIfKey("checkWithDeal", i0), true);
    }
    public void checkRgIf(int i0, String defaultRadioGroupFormCheckFullName, String bean, String viewName, String promp) {
        addForMap(this.checkForms, getIfKey("checkRg", i0), defaultRadioGroupFormCheckFullName, bean, viewName, promp);
        checkFormsIfs.put(getIfKey("checkRg", i0), true);
    }
    public void checkFormsIf(String bean) {
        addForMap(this.checkForms, getIfKey("checkForms"), bean);
        checkFormsIfs.put(getIfKey("checkForms"), true);
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
            addLnTag(layoutSb, "        setContentView([layout]);", layout0.get(0));
        }
        for (int i0 = 0; i0 < count(findViewCounts, getForKey("findView")); i0++) {
            List<String> findView0 = findView.get(getForKey("findView", i0));
            addLnTag(findViewSb, "        [fieldName] = [parent]findViewById([rPkg].R.id.[id]);", findView0.get(0), findView0.get(1), findView0.get(2), findView0.get(3));
        }
        for (int i0 = 0; i0 < count(setOnClickCounts, getForKey("setOnClick")); i0++) {
            List<String> setOnClick0 = setOnClick.get(getForKey("setOnClick", i0));
            addLnTag(setOnClickSb, "        [fieldName].setOnClickListener(this);", setOnClick0.get(0));
        }
        for (int i0 = 0; i0 < count(setOnLongClickCounts, getForKey("setOnLongClick")); i0++) {
            List<String> setOnLongClick0 = setOnLongClick.get(getForKey("setOnLongClick", i0));
            addLnTag(setOnLongClickSb, "        [fieldName].setOnLongClickListener(this);", setOnLongClick0.get(0));
        }
        for (int i0 = 0; i0 < count(colorStrInitCounts, getForKey("colorStrInit")); i0++) {
            List<String> colorStrInit0 = colorStrInit.get(getForKey("colorStrInit", i0));
            addLnTag(colorStrInitSb, "        [name] = android.graphics.Color.parseColor(\"[color]\");", colorStrInit0.get(0), colorStrInit0.get(1));
        }
        for (int i0 = 0; i0 < count(colorResInitCounts, getForKey("colorResInit")); i0++) {
            List<String> colorResInit0 = colorResInit.get(getForKey("colorResInit", i0));
            addLnTag(colorResInitSb, "        [name] = [resourceToolFullName].getColor([id]);", colorResInit0.get(0), colorResInit0.get(1), colorResInit0.get(2));
        }
        for (int i0 = 0; i0 < count(dpInitCounts, getForKey("dpInit")); i0++) {
            List<String> dpInit0 = dpInit.get(getForKey("dpInit", i0));
            addLnTag(dpInitSb, "        [name] = [mobileToolFullName].dpToPx([value]);", dpInit0.get(0), dpInit0.get(1), dpInit0.get(2));
        }
        for (int i0 = 0; i0 < count(dimenInitCounts, getForKey("dimenInit")); i0++) {
            List<String> dimenInit0 = dimenInit.get(getForKey("dimenInit", i0));
            addLnTag(dimenInitSb, "        [name] = [resourceToolFullName].getDimen([id]);", dimenInit0.get(0), dimenInit0.get(1), dimenInit0.get(2));
        }
        for (int i0 = 0; i0 < count(startInitCounts, getForKey("startInit")); i0++) {
            List<String> startInit0 = startInit.get(getForKey("startInit", i0));
            addLnTag(startInitSb, "        [name] = [passFullName].[name](getIntent());", startInit0.get(0), startInit0.get(1), startInit0.get(2));
        }
        for (int i0 = 0; i0 < count(listAdapterCounts, getForKey("listAdapter")); i0++) {
            List<String> listAdapter0 = listAdapter.get(getForKey("listAdapter", i0));
            if (isIf(listAdapterIfs, getIfKey("defaultListAdapter", i0))) {
                List<String> listAdapter1 = listAdapter.get(getIfKey("defaultListAdapter", i0));
                addLnTag(listAdapterSb, "        // [adapterName]", listAdapter1.get(0));
                addLnTag(listAdapterSb, "        [adapterName] = new [adapterFullName]();", listAdapter1.get(1), listAdapter1.get(2));
            }
            if (isIf(listAdapterIfs, getIfKey("defaultListMoreAdapter", i0))) {
                List<String> listAdapter1 = listAdapter.get(getIfKey("defaultListMoreAdapter", i0));
                addLnTag(listAdapterSb, "        // [adapterName]", listAdapter1.get(0));
                addLnTag(listAdapterSb, "        [adapterName] = new [adapterFullName]() {", listAdapter1.get(1), listAdapter1.get(2));
                addLnTag(listAdapterSb, "            @Override");
                addLnTag(listAdapterSb, "            protected void loadMore(int page) {");
                addLnTag(listAdapterSb, "                [adapterName]LoadMore(page);", listAdapter1.get(3));
                addLnTag(listAdapterSb, "            }");
                addLnTag(listAdapterSb, "        };");
            }
            addLnTag(listAdapterSb, "        [adapterName].setVH([vhFullName].class);", listAdapter0.get(0), listAdapter0.get(1));
            addLnTag(listAdapterSb, "        [adapterName].setClick(this);", listAdapter0.get(2));
            addLnTag(listAdapterSb, "        [rvName].setAdapter([adapterName]);", listAdapter0.get(3), listAdapter0.get(4));
            addLnTag(listAdapterSb, "        [rvName].setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));", listAdapter0.get(5));
        }
        if (isIf(formInitIfs, getIfKey("formInit"))) {
            List<String> formInit0 = formInit.get(getIfKey("formInit"));
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("rgInit")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("rgInit", i0));
                addLnTag(formInitSb, "        //[viewName]Rg", formInit1.get(0));
                if (isIf(formInitIfs, getIfKey("rgOnSetItemInit", i0))) {
                    List<String> formInit2 = formInit.get(getIfKey("rgOnSetItemInit", i0));
                    addLnTag(formInitSb, "        [name] = new [type]();", formInit2.get(0), formInit2.get(1));
                }
                addLnTag(formInitSb, "        [viewName]Rg = [radioGroupFullName].obtain(this).setBts([viewName]).setOnSetItem([onSetItem]);", formInit1.get(1), formInit1.get(2), formInit1.get(3), formInit1.get(4));
                if (isIf(formInitIfs, getIfKey("rgDefaultItem", i0))) {
                    List<String> formInit2 = formInit.get(getIfKey("rgDefaultItem", i0));
                    addLnTag(formInitSb, "        [viewName]Rg.setSelected([index]);", formInit2.get(0), formInit2.get(1));
                }
                addLnTag(formInitSb, "        [viewName].setTag([rPkg].R.id.tag_0, [viewName]Rg);", formInit1.get(5), formInit1.get(6), formInit1.get(7));
            }
            addLnTag(formInitSb, "        //[name]", formInit0.get(0));
            addLnTag(formInitSb, "        if ([name] == null) {", formInit0.get(1));
            addLnTag(formInitSb, "            [name] = new [type]();", formInit0.get(2), formInit0.get(3));
            addLnTag(formInitSb, "            initFormBean = true;");
            addLnTag(formInitSb, "        }");
            addLnTag(formInitSb, "        bindHandler = new BindHandler([name]);", formInit0.get(4));
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("editTextInit")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("editTextInit", i0));
                addLnTag(formInitSb, "        [name].addTextChangedListener(new [handlerTextWatcherFullName](bindHandler, [formTypeFullName].[type], [index]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3), formInit1.get(4));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("textViewInit")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("textViewInit", i0));
                addLnTag(formInitSb, "        [name].addTextChangedListener(new [handlerTextWatcherFullName](bindHandler, [formTypeFullName].[type], [index]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3), formInit1.get(4));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("rgBind")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("rgBind", i0));
                addLnTag(formInitSb, "        [viewName]Rg.addOnSelectChange(new [handlerOnSelectChangeFullName](bindHandler, [formTypeFullName].[type], [index]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3), formInit1.get(4));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("seekBarBind")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("seekBarBind", i0));
                addLnTag(formInitSb, "        [name].setOnSeekBarChangeListener(new [handlerOnSeekBarChangeListenerFullName](bindHandler, [formTypeFullName].[type], [index]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3), formInit1.get(4));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("bindMulti")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("bindMulti", i0));
                addLnTag(formInitSb, "        [formLinkFullName] [linkName] = new [linkType](this)", formInit1.get(0), formInit1.get(1), formInit1.get(2));
                addLnTag(formInitSb, "                .setBean([beanName])", formInit1.get(3));
                addLnTag(formInitSb, "                .setViews([views]);", formInit1.get(4));
                for (int i1 = 0; i1 < count(formInitCounts, getForKey("addLink", i0)); i1++) {
                    List<String> formInit2 = formInit.get(getForKey("addLink", i0, i1));
                    addLnTag(formInitSb, "        bindHandler.addLink([viewId], [linkName]);", formInit2.get(0), formInit2.get(1));
                }
            }
            addLnTag(formInitSb, "        if (!initFormBean) {");
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("echos")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("echos", i0));
                addLnTag(formInitSb, "[echos]", formInit1.get(0));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("etEchoWithParse")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("etEchoWithParse", i0));
                addLnTag(formInitSb, "            [viewToolFullName].setText([view], new [parse]().toView([bean].[field]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3), formInit1.get(4));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("etEcho")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("etEcho", i0));
                addLnTag(formInitSb, "            [viewToolFullName].setText([view], [bean].[field]);", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("tvEchoWithParse")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("tvEchoWithParse", i0));
                addLnTag(formInitSb, "            [viewToolFullName].setText([view], new [parse]().toView([bean].[field]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3), formInit1.get(4));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("tvEcho")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("tvEcho", i0));
                addLnTag(formInitSb, "            [viewToolFullName].setText([view], [bean].[field]);", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("rgEcho")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("rgEcho", i0));
                addLnTag(formInitSb, "            [viewName]Rg.setSelected(new [defaultRadioGroupToStringFullName]([items]).toView([bean].[field]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3), formInit1.get(4));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("rgEchoWithParse")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("rgEchoWithParse", i0));
                addLnTag(formInitSb, "            [viewName]Rg.setSelected(new [parse]().toView([bean].[field]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("seekBarEcho")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("seekBarEcho", i0));
                addLnTag(formInitSb, "            [viewName].setProgress([bean].[field]);", formInit1.get(0), formInit1.get(1), formInit1.get(2));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("seekBarEchoWithParse")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("seekBarEchoWithParse", i0));
                addLnTag(formInitSb, "            [viewName].setProgress(new [parse]().toView([bean].[field]));", formInit1.get(0), formInit1.get(1), formInit1.get(2), formInit1.get(3));
            }
            for (int i0 = 0; i0 < count(formInitCounts, getForKey("linkEcho")); i0++) {
                List<String> formInit1 = formInit.get(getForKey("linkEcho", i0));
                addLnTag(formInitSb, "            [lineName].echo();", formInit1.get(0));
            }
            addLnTag(formInitSb, "        }");
        }
        if (isIf(onCreateCompleteInitIfs, getIfKey("onCreateCompleteInit"))) {
            List<String> onCreateCompleteInit0 = onCreateCompleteInit.get(getIfKey("onCreateCompleteInit"));
            addLnTag(onCreateCompleteInitSb, "        onCreateComplete();");
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
            if (isIf(onClickSwithIfs, getIfKey("onClickCheckForm", i0))) {
                List<String> onClickSwith1 = onClickSwith.get(getIfKey("onClickCheckForm", i0));
                addLnTag(onClickSwithSb, "                if (!check[formBean]()) {", onClickSwith1.get(0));
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
            if (isIf(onLongClickSwithIfs, getIfKey("onLongClickCheckForm", i0))) {
                List<String> onLongClickSwith1 = onLongClickSwith.get(getIfKey("onLongClickCheckForm", i0));
                addLnTag(onLongClickSwithSb, "                if (!check[formBean]()) {", onLongClickSwith1.get(0));
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
            addLnTag(onLongClickMethodsSb, "    protected boolean [methodName]([params]) {return false;}", onLongClickMethods0.get(0), onLongClickMethods0.get(1));
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
        for (int i0 = 0; i0 < count(permissionBackCounts, getForKey("permissionBack")); i0++) {
            List<String> permissionBack0 = permissionBack.get(getForKey("permissionBack", i0));
            addLnTag(permissionBackSb, "        [ifSign] (requestCode == [permissionsFullName].CODE_[methodNameStatic]_IN_[actStaticName]) {", permissionBack0.get(0), permissionBack0.get(1), permissionBack0.get(2), permissionBack0.get(3));
            StringBuilder allowSb = new StringBuilder();
            if (isIf(permissionBackIfs, getIfKey("allow", i0))) {
                List<String> permissionBack1 = permissionBack.get(getIfKey("allow", i0));
                addTag(allowSb, "[permissionToolFullName].allow(grantResults)", permissionBack1.get(0));
            }
            addLnTag(permissionBackSb, "            [methodName]([allow]);", permissionBack0.get(4), allowSb.toString());
            addLnTag(permissionBackSb, "        }");
        }
        for (int i0 = 0; i0 < count(permissionBackMethodCounts, getForKey("permissionBackMethod")); i0++) {
            List<String> permissionBackMethod0 = permissionBackMethod.get(getForKey("permissionBackMethod", i0));
            StringBuilder allowParamSb = new StringBuilder();
            if (isIf(permissionBackMethodIfs, getIfKey("allowParam", i0))) {
                List<String> permissionBackMethod1 = permissionBackMethod.get(getIfKey("allowParam", i0));
                addTag(allowParamSb, "boolean isAllow");
            }
            addLnTag(permissionBackMethodSb, "    protected void [methodName]([allowParam]) {}", permissionBackMethod0.get(0), allowParamSb.toString());
        }
        if (isIf(bindHandlerIfs, getIfKey("bindHandler"))) {
            List<String> bindHandler0 = bindHandler.get(getIfKey("bindHandler"));
            addLnTag(bindHandlerSb, "    public static class BindHandler extends android.os.Handler {");
            addLnTag(bindHandlerSb, "        private [beanType] [beanName];", bindHandler0.get(0), bindHandler0.get(1));
            addLnTag(bindHandlerSb, "");
            addLnTag(bindHandlerSb, "        public BindHandler([beanType] [beanName]) {", bindHandler0.get(2), bindHandler0.get(3));
            addLnTag(bindHandlerSb, "            this.[beanName] = [beanName];", bindHandler0.get(4), bindHandler0.get(5));
            addLnTag(bindHandlerSb, "        }");
            addLnTag(bindHandlerSb, "");
            addLnTag(bindHandlerSb, "        @Override");
            addLnTag(bindHandlerSb, "        public void handleMessage(android.os.Message msg) {");
            addLnTag(bindHandlerSb, "            super.handleMessage(msg);");
            for (int i0 = 0; i0 < count(bindHandlerCounts, getForKey("handler")); i0++) {
                List<String> bindHandler1 = bindHandler.get(getForKey("handler", i0));
                addLnTag(bindHandlerSb, "            if (msg.what == [formTypeFullName].[type]) {", bindHandler1.get(0), bindHandler1.get(1));
                addLnTag(bindHandlerSb, "                switch (msg.arg1) {");
                for (int i1 = 0; i1 < count(bindHandlerCounts, getForKey("handlerItem", i0)); i1++) {
                    List<String> bindHandler2 = bindHandler.get(getForKey("handlerItem", i0, i1));
                    addLnTag(bindHandlerSb, "                    case [index]:", bindHandler2.get(0));
                    if (isIf(bindHandlerIfs, getIfKey("handlerItemString", i0, i1))) {
                        List<String> bindHandler3 = bindHandler.get(getIfKey("handlerItemString", i0, i1));
                        addLnTag(bindHandlerSb, "                        [beanName].[field] = (java.lang.String) msg.obj;", bindHandler3.get(0), bindHandler3.get(1));
                    }
                    if (isIf(bindHandlerIfs, getIfKey("handlerItemRg", i0, i1))) {
                        List<String> bindHandler3 = bindHandler.get(getIfKey("handlerItemRg", i0, i1));
                        addLnTag(bindHandlerSb, "                        [beanName].[field] = new [defaultRadioGroupToStringFullName]([items]).toBean(msg.obj);", bindHandler3.get(0), bindHandler3.get(1), bindHandler3.get(2), bindHandler3.get(3));
                    }
                    if (isIf(bindHandlerIfs, getIfKey("handlerItemInt", i0, i1))) {
                        List<String> bindHandler3 = bindHandler.get(getIfKey("handlerItemInt", i0, i1));
                        addLnTag(bindHandlerSb, "                        [beanName].[field] = (int) msg.obj;", bindHandler3.get(0), bindHandler3.get(1));
                    }
                    if (isIf(bindHandlerIfs, getIfKey("handlerItemParse", i0, i1))) {
                        List<String> bindHandler3 = bindHandler.get(getIfKey("handlerItemParse", i0, i1));
                        addLnTag(bindHandlerSb, "                        [beanName].[field] = new [parse]().toBean(msg.obj);", bindHandler3.get(0), bindHandler3.get(1), bindHandler3.get(2));
                    }
                    if (isIf(bindHandlerIfs, getIfKey("handlerItemLink", i0, i1))) {
                        List<String> bindHandler3 = bindHandler.get(getIfKey("handlerItemLink", i0, i1));
                        addLnTag(bindHandlerSb, "                        link([viewId]);", bindHandler3.get(0));
                    }
                    addLnTag(bindHandlerSb, "                        break;");
                }
                addLnTag(bindHandlerSb, "                }");
                addLnTag(bindHandlerSb, "            }");
            }
            addLnTag(bindHandlerSb, "        }");
            addLnTag(bindHandlerSb, "");
            addLnTag(bindHandlerSb, "        public void addLink(int viewId, [formLinkFullName] link) {", bindHandler0.get(6));
            addLnTag(bindHandlerSb, "            getLinks().get(viewId).add(link);");
            addLnTag(bindHandlerSb, "        }");
            addLnTag(bindHandlerSb, "");
            addLnTag(bindHandlerSb, "        private [listValueMapFullName]<Integer, [formLinkFullName]> links;", bindHandler0.get(7), bindHandler0.get(8));
            addLnTag(bindHandlerSb, "");
            addLnTag(bindHandlerSb, "        private [listValueMapFullName]<Integer, [formLinkFullName]> getLinks() {", bindHandler0.get(9), bindHandler0.get(10));
            addLnTag(bindHandlerSb, "            if (links == null) {");
            addLnTag(bindHandlerSb, "                links = new [listValueMapFullName]<>();", bindHandler0.get(11));
            addLnTag(bindHandlerSb, "            }");
            addLnTag(bindHandlerSb, "            return links;");
            addLnTag(bindHandlerSb, "        }");
            addLnTag(bindHandlerSb, "        private void link(int id) {");
            addLnTag(bindHandlerSb, "            [tsFullName].ls(getLinks().get(id), (position, formLink) -> {", bindHandler0.get(12));
            addLnTag(bindHandlerSb, "                formLink.link();");
            addLnTag(bindHandlerSb, "                return false;");
            addLnTag(bindHandlerSb, "            });");
            addLnTag(bindHandlerSb, "        }");
            addLnTag(bindHandlerSb, "    }");
        }
        if (isIf(checkFormsIfs, getIfKey("checkForms"))) {
            List<String> checkForms0 = checkForms.get(getIfKey("checkForms"));
            addLnTag(checkFormsSb, "    protected boolean check[bean]() {", checkForms0.get(0));
            for (int i0 = 0; i0 < count(checkFormsCounts, getForKey("check")); i0++) {
                List<String> checkForms1 = checkForms.get(getForKey("check", i0));
                if (isIf(checkFormsIfs, getIfKey("checkString", i0))) {
                    List<String> checkForms2 = checkForms.get(getIfKey("checkString", i0));
                    addLnTag(checkFormsSb, "        if ([stringToolFullName].isBlank([bean].[field])) {", checkForms2.get(0), checkForms2.get(1), checkForms2.get(2));
                    addLnTag(checkFormsSb, "            toast(\"[promp]\");", checkForms2.get(3));
                    addLnTag(checkFormsSb, "            return false;");
                    addLnTag(checkFormsSb, "        }");
                }
                if (isIf(checkFormsIfs, getIfKey("checkWithDeal", i0))) {
                    List<String> checkForms2 = checkForms.get(getIfKey("checkWithDeal", i0));
                    addLnTag(checkFormsSb, "        if (new [checkClass]().check([bean], [bean].[field])) {", checkForms2.get(0), checkForms2.get(1), checkForms2.get(2), checkForms2.get(3));
                    addLnTag(checkFormsSb, "            toast(\"[promp]\");", checkForms2.get(4));
                    addLnTag(checkFormsSb, "            return false;");
                    addLnTag(checkFormsSb, "        }");
                }
                if (isIf(checkFormsIfs, getIfKey("checkRg", i0))) {
                    List<String> checkForms2 = checkForms.get(getIfKey("checkRg", i0));
                    addLnTag(checkFormsSb, "        if (new [defaultRadioGroupFormCheckFullName]().check([bean], [viewName]Rg.getSelected())) {", checkForms2.get(0), checkForms2.get(1), checkForms2.get(2));
                    addLnTag(checkFormsSb, "            toast(\"[promp]\");", checkForms2.get(3));
                    addLnTag(checkFormsSb, "            return false;");
                    addLnTag(checkFormsSb, "        }");
                }
            }
            addLnTag(checkFormsSb, "        return true;");
            addLnTag(checkFormsSb, "    }");
        }
        for (int i0 = 0; i0 < count(loadMoreCounts, getForKey("loadMore")); i0++) {
            List<String> loadMore0 = loadMore.get(getForKey("loadMore", i0));
            addLnTag(loadMoreSb, "    protected abstract void [adapterName]LoadMore(int page);", loadMore0.get(0));
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
        lines.add("import android.view.View;");
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
        lines.add("    protected void onCreate(android.os.Bundle savedInstanceState) {");
        lines.add("        super.onCreate(savedInstanceState);");
        lines.add("[[layout]]");
        lines.add("[[findView]]");
        lines.add("[[setOnClick]]");
        lines.add("[[setOnLongClick]]");
        lines.add("[[colorStrInit]]");
        lines.add("[[colorResInit]]");
        lines.add("[[dpInit]]");
        lines.add("[[dimenInit]]");
        lines.add("[[startInit]]");
        lines.add("");
        lines.add("[[listAdapter]]");
        lines.add("");
        lines.add("[[formInit]]");
        lines.add("[[onCreateCompleteInit]]");
        lines.add("    }");
        lines.add("");
        lines.add("    @Override");
        lines.add("    public void onClick(View v) {");
        lines.add("[[superOnClick]]");
        lines.add("        switch (v.getId()) {");
        lines.add("[[onClickSwith]]");
        lines.add("        }");
        lines.add("    }");
        lines.add("");
        lines.add("[[onClickMethods]]");
        lines.add("");
        lines.add("    @Override");
        lines.add("    public boolean onLongClick(View v) {");
        lines.add("        switch (v.getId()) {");
        lines.add("[[onLongClickSwith]]");
        lines.add("        }");
        lines.add("[[superOnLongClick]]");
        lines.add("[[superOnLongClickFalse]]");
        lines.add("    }");
        lines.add("");
        lines.add("[[onLongClickMethods]]");
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
        lines.add("    @Override");
        lines.add("    public void back(int requestCode, String[] permissions, int[] grantResults) {");
        lines.add("        super.back(requestCode, permissions, grantResults);");
        lines.add("[[permissionBack]]");
        lines.add("    }");
        lines.add("[[permissionBackMethod]]");
        lines.add("[[bindHandler]]");
        lines.add("[[checkForms]]");
        lines.add("[[loadMore]]");
        lines.add("[[toastDialog]]");
        lines.add("[[noticeDialog]]");
        lines.add("[[editDialog]]");
        lines.add("[[dialog]]");
        lines.add("");
        lines.add("}");
        lines.add("");

        return lines;
    }
}
