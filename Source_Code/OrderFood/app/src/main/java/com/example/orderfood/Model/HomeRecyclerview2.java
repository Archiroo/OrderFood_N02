package com.example.orderfood.Model;

public class HomeRecyclerview2 {
    private int image;

    private String image_name;

    private String image_price;

    public HomeRecyclerview2(int image, String image_name, String image_price) {
        this.image = image;
        this.image_name = image_name;
        this.image_price = image_price;
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

    public String getImage_price() {
        return image_price;
    }

    public void setImage_price(String image_price) {
        this.image_price = image_price;
    }
}
