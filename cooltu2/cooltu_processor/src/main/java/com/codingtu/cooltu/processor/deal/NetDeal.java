package com.codingtu.cooltu.processor.deal;

import com.codingtu.cooltu.lib4j.data.java.JavaInfo;
import com.codingtu.cooltu.lib4j.tools.CountTool;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.processor.annotation.net.Apis;
import com.codingtu.cooltu.processor.annotation.net.method.GET;
import com.codingtu.cooltu.processor.annotation.net.method.POST;
import com.codingtu.cooltu.processor.bean.NetInfo;
import com.codingtu.cooltu.processor.builder.impl.ApiServiceBuilder;
import com.codingtu.cooltu.processor.builder.impl.NetBackBuilder;
import com.codingtu.cooltu.processor.builder.impl.NetBuilder;
import com.codingtu.cooltu.processor.builder.impl.NetParamsBuilder;
import com.codingtu.cooltu.processor.deal.base.TypeBaseDeal;
import com.codingtu.cooltu.processor.lib.path.CurrentPath;
import com.codingtu.cooltu.processor.lib.tools.ElementTools;

import java.util.HashMap;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public class NetDeal extends TypeBaseDeal {

    public static final HashMap<String, String> RETURN_TYPES = new HashMap<>();

    @Override
    protected void dealTypeElement(TypeElement te) {

        Apis apis = te.getAnnotation(Apis.class);
        String apiName = ElementTools.simpleName(te);
        ApiServiceBuilder apiServiceBuilder = new ApiServiceBuilder(CurrentPath.apiService(apiName));

        Ts.ls(te.getEnclosedElements(), (position, element) -> {
            if (element instanceof ExecutableElement) {
                ExecutableElement ee = (ExecutableElement) element;
                apiServiceBuilder.addMethod(ee);
                if (!CountTool.isNull(ee.getParameters())) {
                    new NetParamsBuilder(CurrentPath.sendParams(ElementTools.simpleName(ee)), ElementTools.getMethodParamKvs(ee));
                }

                JavaInfo netBackJavaInfo = CurrentPath.netBack(ElementTools.simpleName(ee));
                String returnType = ee.getReturnType().toString();
                RETURN_TYPES.put(netBackJavaInfo.fullName, returnType);

                new NetBackBuilder(netBackJavaInfo, ee);

                GET get = ee.getAnnotation(GET.class);
                POST post = ee.getAnnotation(POST.class);
                NetInfo netInfo = new NetInfo();
                netInfo.methodName = ElementTools.simpleName(ee);
                netInfo.apisBaseUrl = apis.baseUrl();
                netInfo.apisName = ElementTools.simpleName(te);
                netInfo.isGet = get != null;
                if (netInfo.isGet) {
                    netInfo.methodValue = get.value();
                    netInfo.methodBaseUrl = get.baseUrl();
                } else {
                    netInfo.methodValue = post.value();
                    netInfo.methodBaseUrl = post.baseUrl();
                    netInfo.isJsonBody = post.isJsonBody();
                }
                netInfo.params = ee.getParameters();

                NetBuilder.BUILDER.addNetInfo(netInfo);

            }
            return false;
        });

    }
}
