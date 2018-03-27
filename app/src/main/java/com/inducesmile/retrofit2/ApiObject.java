package com.inducesmile.retrofit2;

import com.google.gson.annotations.SerializedName;

public class ApiObject {

    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;

    public ApiObject(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
