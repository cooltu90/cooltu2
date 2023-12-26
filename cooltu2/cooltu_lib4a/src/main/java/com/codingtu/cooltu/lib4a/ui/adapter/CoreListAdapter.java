package com.codingtu.cooltu.lib4a.ui.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.codingtu.cooltu.lib4a.ui.adapter.viewholder.CoreAdapterVH;
import com.codingtu.cooltu.lib4j.tools.CountTool;

import java.lang.reflect.Constructor;
import java.util.List;

public abstract class CoreListAdapter<VH extends CoreAdapterVH, T> extends CoreAdapter<VH> {
    protected List<T> items;
    private Class<VH> vhClass;

    @Override
    public int getItemCount() {
        return CountTool.count(items);
    }

    public void updateItems(List<T> items) {
        this.items = items;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        try {
            Constructor<VH> constructor = this.vhClass.getConstructor(ViewGroup.class);
            return (VH) constructor.newInstance(parent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setVH(Class vhClass) {
        this.vhClass = vhClass;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        onBindVH(holder, position, items.get(position));
    }

    protected abstract void onBindVH(@NonNull VH holder, int position, T t);

    public List<T> getItems() {
        return items;
    }

    public void addItem(T t) {
        this.items.add(t);
        notifyDataSetChanged();
    }
}
