package com.dev.retrofitexample;

import java.util.ArrayList;

public class DataModel {
    private float status;
    private String message;
    ArrayList<DataDetailsModel> data = new ArrayList<DataDetailsModel>();
    private String base_url;

    // Getter Methods

    public float getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getBase_url() {
        return base_url;
    }

    // Setter Methods

    public void setStatus(float status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }
}