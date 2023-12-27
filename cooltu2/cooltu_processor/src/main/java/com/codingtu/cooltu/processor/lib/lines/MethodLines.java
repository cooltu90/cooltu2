package com.codingtu.cooltu.processor.lib.lines;

import com.codingtu.cooltu.lib4j.data.map.ListValueMap;
import com.codingtu.cooltu.lib4j.tools.CountTool;
import com.codingtu.cooltu.lib4j.tools.StringTool;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;
import com.codingtu.cooltu.processor.lib.log.Logs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodLines {
    public static final String TAG_FOR_LINES = "[forLines]";

    private List<String> lines = new ArrayList<>();

    private ListValueMap<Integer, String> forLines = new ListValueMap<>();
    private Map<Integer, Integer> indexs = new HashMap<>();
    private Map<Integer, List> tss = new HashMap<>();
    private Map<Integer, DatasGetter> datasGetters = new HashMap<>();
    private Object[] datas;

    public static MethodLines create() {
        MethodLines methodLines = new MethodLines();
        return methodLines;
    }

    public MethodLines addLine(String line, int... index) {
        lines.add(line);
        return this;
    }

    public MethodLines forLine(String line, int index) {
        indexs.put(CountTool.count(lines), index);
        lines.add(TAG_FOR_LINES);
        forLines.get(index).add(line);
        return this;
    }

    public MethodLines data(Object... datas) {
        this.datas = datas;
        return this;
    }

    public <T> MethodLines forData(int index, List<T> ts, DatasGetter<T> datasGetter) {
        tss.put(index, ts);
        datasGetters.put(index, datasGetter);
        return this;
    }

    public void add(List<String> methodLines) {
        Ts.ls(lines, new BaseTs.EachTs<String>() {
            @Override
            public boolean each(int position, String line) {
                if (TAG_FOR_LINES.equals(line)) {
                    //for
                    Logs.i("position:" + position);
                    Integer index = indexs.get(position);
                    Logs.i("index:" + index);
                    Ts.ls(tss.get(index), new BaseTs.EachTs<Object>() {
                        @Override
                        public boolean each(int position, Object o) {
                            Object[] datas = datasGetters.get(index).data(position, o);
                            int count = CountTool.count(datas);
                            if (count > 0) {
                                Ts.ls(MethodLines.this.forLines.get(index), new BaseTs.EachTs<String>() {
                                    @Override
                                    public boolean each(int position, String forLine) {
                                        for (int i = 0; i < count; i += 2) {
                                            String tag = (String) datas[i];
                                            String value = StringTool.toString(datas[i + 1]);
                                            forLine = forLine.replace(tag, value);
                                        }
                                        methodLines.add(forLine);
                                        return false;
                                    }
                                });
                            }
                            return false;
                        }
                    });
                } else {
                    int count = CountTool.count(datas);
                    if (count > 0) {
                        for (int i = 0; i < count; i += 2) {
                            String tag = (String) datas[i];
                            String value = StringTool.toString(datas[i + 1]);
                            line = line.replace(tag, value);
                        }
                    }
                    methodLines.add(line);
                }
                return false;
            }
        });
    }
}
