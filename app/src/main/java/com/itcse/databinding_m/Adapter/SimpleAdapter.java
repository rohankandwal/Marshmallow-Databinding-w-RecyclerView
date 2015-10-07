package com.itcse.databinding_m.Adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.itcse.databinding_m.POJO.SimpleHandlers;
import com.itcse.databinding_m.POJO.SimpleInfo;
import com.itcse.databinding_m.R;
import com.itcse.databinding_m.ViewHolder.SimpleViewHolder;
import com.itcse.databinding_m.databinding.RecycleviewChildBinding;

import java.util.ArrayList;

/**
 * Adapter extending RecyclerView's Adapter. In this class, we are binding adapter class with the view holder class.
 */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    // An ArrayList containing SimpleInfo class objects
    private final ArrayList<SimpleInfo> simpleInfoList;

    public SimpleAdapter(final ArrayList<SimpleInfo> simpleInfoList) {
        this.simpleInfoList = simpleInfoList;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // The ViewDataBinding class might be different for everybody. This class is generated automatically by Android and depends on the
        // name of your XML file. eg- Name of my XML file was "recycleview_child", hence "RecycleViewChildBinding". If name of your XML
        // file is "child.xml" then the name of your class will be ChildBinding
        RecycleviewChildBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.recycleview_child, parent, false);
        // Adding the Handler to the binding class, without it "SimpleHandler's" function will not be called
        binding.setSimplehandlers(new SimpleHandlers());
        return new SimpleViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        // Binding the "SimpleInfo" object to the View Holder
        holder.bindConnection(simpleInfoList.get(position));
    }

    @Override
    public int getItemCount() {
        return simpleInfoList.size();
    }
}
