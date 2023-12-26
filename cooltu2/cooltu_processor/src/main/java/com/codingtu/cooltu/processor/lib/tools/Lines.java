package com.codingtu.cooltu.processor.lib.tools;

import com.codingtu.cooltu.lib4j.tools.CountTool;

import java.util.ArrayList;
import java.util.List;

public class Lines {
    private List<String> lines;
    private String line;
    private List<Getter> getters = new ArrayList<>();
    private int size;


    public static interface Getter {
        public Object get(int position);
    }

    public static Lines lines(List<String> mLines) {
        Lines lines = new Lines();
        lines.lines = mLines;
        return lines;
    }

    public Lines size(int size) {
        this.size = size;
        return this;
    }

    public Lines line(String line) {
        this.line = line;
        return this;
    }

    public Lines getter(Getter getter) {
        getters.add(getter);
        return this;
    }

    public void start() {
        for (int i = 0; i < size; i++) {
            Object[] objects = new Object[CountTool.count(getters)];
            for (int j = 0; j < objects.length; j++) {
                objects[j] = getters.get(j).get(i);
            }
            lines.add(TagTools.dealLine(line, objects));
        }
    }
}
