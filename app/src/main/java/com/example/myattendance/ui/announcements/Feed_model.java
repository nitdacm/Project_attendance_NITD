package com.example.myattendance.ui.announcements;

public class Feed_model {
    String feed_banner;
    String feed_clubname;
    String feed_chip_date;
    String feed_chip_vanue;
    String chip_forgot;

    public Feed_model() {
    }

    public Feed_model(String feed_banner, String feed_clubname, String feed_chip_date, String feed_chip_vanue, String chip_forgot) {
        this.feed_banner = feed_banner;
        this.feed_clubname = feed_clubname;
        this.feed_chip_date = feed_chip_date;
        this.feed_chip_vanue = feed_chip_vanue;
        this.chip_forgot = chip_forgot;
    }

    public String getFeed_banner() {
        return feed_banner;
    }

    public void setFeed_banner(String feed_banner) {
        this.feed_banner = feed_banner;
    }

    public String getFeed_clubname() {
        return feed_clubname;
    }

    public void setFeed_clubname(String feed_clubname) {
        this.feed_clubname = feed_clubname;
    }

    public String getFeed_chip_date() {
        return feed_chip_date;
    }

    public void setFeed_chip_date(String feed_chip_date) {
        this.feed_chip_date = feed_chip_date;
    }

    public String getFeed_chip_vanue() {
        return feed_chip_vanue;
    }

    public void setFeed_chip_vanue(String feed_chip_vanue) {
        this.feed_chip_vanue = feed_chip_vanue;
    }

    public String getChip_forgot() {
        return chip_forgot;
    }

    public void setChip_forgot(String chip_forgot) {
        this.chip_forgot = chip_forgot;
    }
}
