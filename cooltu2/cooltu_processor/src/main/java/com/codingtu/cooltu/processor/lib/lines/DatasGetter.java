package com.codingtu.cooltu.processor.lib.lines;

public interface DatasGetter<T> {
    public Object[] data(int position, T t);
}
