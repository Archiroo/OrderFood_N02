package com.example.orderfood.Model;

import java.io.Serializable;

public class ObjectFood implements Serializable {
    private byte[] imageFood;

    private String nameFood;

    private String priceFood;

    private String detailFood;

    public ObjectFood(byte[] imageFood, String nameFood, String priceFood, String detailFood) {
        this.imageFood = imageFood;
        this.nameFood = nameFood;
        this.priceFood = priceFood;
        this.detailFood = detailFood;
    }

    public byte[] getImageFood() {
        return imageFood;
    }

    public void setImageFood(byte[] imageFood) {
        this.imageFood = imageFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(String priceFood) {
        this.priceFood = priceFood;
    }

    public String getDetailFood() {
        return detailFood;
    }

    public void setDetailFood(String detailFood) {
        this.detailFood = detailFood;
    }
}
