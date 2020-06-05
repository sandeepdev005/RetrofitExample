package com.dev.retrofitexample;

public class ApiRequestModel {
    private String api_key;
    private String lang;
    private String user_id;


    // Getter Methods

    public String getApi_key() {
        return api_key;
    }

    public String getLang() {
        return lang;
    }

    public String getUser_id() {
        return user_id;
    }

    // Setter Methods

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
