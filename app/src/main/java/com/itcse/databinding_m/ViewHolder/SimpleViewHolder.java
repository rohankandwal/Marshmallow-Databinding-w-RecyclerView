package com.itcse.databinding_m.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.itcse.databinding_m.POJO.SimpleInfo;
import com.itcse.databinding_m.databinding.RecycleviewChildBinding;

/**
 * Created by User on 06-10-2015.
 */
public class SimpleViewHolder extends RecyclerView.ViewHolder {

    RecycleviewChildBinding recycleviewChildBinding;

    public SimpleViewHolder(final RecycleviewChildBinding recycleviewChildBinding) {
        super(recycleviewChildBinding.getRoot());
        this.recycleviewChildBinding = recycleviewChildBinding;
    }

    public void bindConnection(final SimpleInfo simpleInfo) {
        recycleviewChildBinding.setSimpleInfo(simpleInfo);
    }
}
