package com.example.pavan.recyclerview;

public class holder {

    private String Title;
    int Image;

    public holder() {
    }

    public holder(String title, int image) {
        Title = title;
        Image=image;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
