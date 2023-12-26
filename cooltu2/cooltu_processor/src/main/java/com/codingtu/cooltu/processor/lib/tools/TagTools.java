package com.codingtu.cooltu.processor.lib.tools;

import com.codingtu.cooltu.lib4j.tools.CountTool;
import com.codingtu.cooltu.lib4j.tools.StringTool;
import com.codingtu.cooltu.lib4j.ts.Ts;
import com.codingtu.cooltu.lib4j.ts.impl.BaseTs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TagTools {

    public static interface TagValue {
        String tagValue(int i, String tag);
    }

    public static String dealLine(String line, String startTag, String endTag, TagValue tagValue) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = 0;
        int num = 0;
        while (true) {
            start = line.indexOf(startTag, end);
            if (start > 0) {
                sb.append(line.substring(end, start));
            } else if (start < 0) {
                sb.append(line.substring(end, line.length()));
                break;
            }
            end = line.indexOf(endTag, start + startTag.length());
            if (end > 0) {
                String tag = line.substring(start + startTag.length(), end);
                if (StringTool.isNotBlank(tag)) {
                    sb.append(tagValue.tagValue(num++, tag));
                } else {
                    sb.append(startTag + endTag);
                }
            } else if (end < 0) {
                sb.append(line.substring(start));
                break;
            }
            end += endTag.length();
        }
        return sb.toString();
    }


    public static void addLnTag(StringBuilder tag, String line, Object... tags) {
        tag.append(dealLine(line, tags)).append("\r\n");
    }

    public static String dealLine(String line, Object... tags) {
        if (CountTool.isNull(tags)) {
            return line;
        }
        return dealLine(line, "[", "]", new TagValue() {
            @Override
            public String tagValue(int i, String tag) {
                Object value = tags[i];
                if (value != null) {
                    return StringTool.toString(value);
                }
                return "";
            }
        });
    }

    public static List<String> dealLines(final Map<String, StringBuilder> tags, List<String> readLines) {
        final ArrayList<String> lines = new ArrayList<String>();
        TagValue tagValue = new TagValue() {

            @Override
            public String tagValue(int i, String tag) {
                StringBuilder tagValue = tags.get(tag);
                if (tagValue != null) {
                    return tagValue.toString();
                }
                return "";
            }
        };
        Ts.ls(readLines, new BaseTs.EachTs<String>() {
            @Override
            public boolean each(int position, String line) {
                lines.add(dealLine(line, "[[", "]]", tagValue));
                return false;
            }
        });
        return lines;
    }

}
