package com.codingtu.cooltu.processor.lib.tools;

import javax.lang.model.element.Element;

public class ElementTools {

    public static String getType(Element e) {
        return e.asType().toString();
    }

}
