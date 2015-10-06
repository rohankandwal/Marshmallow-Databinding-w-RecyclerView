package com.itcse.databinding_m.POJO;

import com.itcse.databinding_m.databinding.RecycleviewChildBinding;

/**
 * Created by User on 06-10-2015.
 */
public class SimpleInfo {

    private String simpleTitle;
    private int simpleInt;

    public String getSimpleTitle() {
        return simpleTitle;
    }

    public String getSimpleInt() {
        return String.valueOf(simpleInt);
    }

    public void setSimpleInt(int simpleInt) {
        this.simpleInt = simpleInt;
    }

    public void setSimpleTitle(String simpleTitle) {
        this.simpleTitle = simpleTitle;
    }
}
