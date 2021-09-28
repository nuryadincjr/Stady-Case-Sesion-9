package com.nuryadincjr.stadycase09.pojo;

public class Hiros {

    private int img;
    private String title;
    private String reting;
    private String description;

    public Hiros() {
    }

    public Hiros(int img, String title, String reting, String description) {
        this.img = img;
        this.title = title;
        this.reting = reting;
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReting() {
        return reting;
    }

    public void setReting(String reting) {
        this.reting = reting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
