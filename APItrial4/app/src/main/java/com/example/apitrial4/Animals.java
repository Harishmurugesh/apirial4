package com.example.apitrial4;

import com.google.gson.annotations.SerializedName;

import okhttp3.ResponseBody;

public class Animals {

    @SerializedName("name")
    public String name;
    @SerializedName("origin")
    public String origin;

    public Animals(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}


