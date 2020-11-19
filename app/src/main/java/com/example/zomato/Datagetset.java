package com.example.zomato;

public class Datagetset {
    String name;
    int photo;

    public Datagetset() {
    }

    public Datagetset(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
