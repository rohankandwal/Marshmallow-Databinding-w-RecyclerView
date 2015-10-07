package com.itcse.databinding_m.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.itcse.databinding_m.POJO.SimpleInfo;
import com.itcse.databinding_m.databinding.RecycleviewChildBinding;

/**
 * View Holder class extending RecycleView's ViewHolder.
 */
public class SimpleViewHolder extends RecyclerView.ViewHolder {

    RecycleviewChildBinding recycleviewChildBinding;

    // Construction to get the ViewDataBinding object
    public SimpleViewHolder(final RecycleviewChildBinding recycleviewChildBinding) {
        super(recycleviewChildBinding.getRoot());
        this.recycleviewChildBinding = recycleviewChildBinding;
    }

    // Setting the SimpleInfo class in the ViewDataBinding adapter.  The ViewDataBinding adapter will
    // then automatically populate Views on the basis of data members of the SimpleInfo class.
    public void bindConnection(final SimpleInfo simpleInfo) {
        recycleviewChildBinding.setSimpleInfo(simpleInfo);
    }
}
