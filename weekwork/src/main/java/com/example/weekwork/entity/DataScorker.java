package com.example.weekwork.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DataScorker {
    private boolean isSuccess;
    private String msg;
    private HashMap<String, Object> data = new HashMap<>();

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
