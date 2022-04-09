package com.example.orderfood.Model;

import java.io.Serializable;

public class HomeRecyclerview3 implements Serializable {
    private int image;

    private String image_name;

    private String image_details;

    public HomeRecyclerview3(int image, String image_name, String image_details) {
        this.image = image;
        this.image_name = image_name;
        this.image_details = image_details;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getImage_details() {
        return image_details;
    }

    public void setImage_details(String image_details) {
        this.image_details = image_details;
    }
}
