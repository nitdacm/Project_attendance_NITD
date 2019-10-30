package com.example.myattendance.ui.announcements;

public class FeedModel {
    public String feed_banner;
    public String feed_clubname;
    public String feed_chip_date;
    public String feed_chip_venue;
    public String chip_forgot;
    public String data;

    public FeedModel() {
    }

    public FeedModel(String feed_banner, String feed_clubname, String feed_chip_date, String feed_chip_venue, String chip_forgot) {
        this.feed_banner = feed_banner;
        this.feed_clubname = feed_clubname;
        this.feed_chip_date = feed_chip_date;
        this.feed_chip_venue = feed_chip_venue;
        this.chip_forgot = chip_forgot;
        this.data="data";
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getFeed_chip_venue() {
        return feed_chip_venue;
    }

    public void setFeed_chip_venue(String feed_chip_venue) {
        this.feed_chip_venue = feed_chip_venue;
    }

    public String getChip_forgot() {
        return chip_forgot;
    }

    public void setChip_forgot(String chip_forgot) {
        this.chip_forgot = chip_forgot;
    }
}
