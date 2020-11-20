package com.example.zomato;

public class Datagetsetshop {
    String name;
    String loc;
    String time;
    String rate;
    int photo;
    public Datagetsetshop() {
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Datagetsetshop(String name, String loc, String time, String rate, int photo) {
        this.name = name;
        this.loc = loc;
        this.time = time;
        this.rate = rate;
        this.photo=photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
