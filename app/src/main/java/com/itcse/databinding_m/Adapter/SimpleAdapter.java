package com.itcse.databinding_m.Adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.itcse.databinding_m.POJO.SimpleInfo;
import com.itcse.databinding_m.R;
import com.itcse.databinding_m.ViewHolder.SimpleViewHolder;
import com.itcse.databinding_m.databinding.RecycleviewChildBinding;

import java.util.ArrayList;

/**
 * Created by User on 06-10-2015.
 */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    private final ArrayList<SimpleInfo> simpleInfoList;

    public SimpleAdapter(final ArrayList<SimpleInfo> simpleInfoList) {
        this.simpleInfoList = simpleInfoList;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecycleviewChildBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.recycleview_child, parent, false);
        return new SimpleViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.bindConnection(simpleInfoList.get(position));
    }

    @Override
    public int getItemCount() {
        return simpleInfoList.size();
    }
}
