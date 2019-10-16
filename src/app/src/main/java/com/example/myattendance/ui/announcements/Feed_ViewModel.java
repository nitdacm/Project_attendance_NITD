package com.example.myattendance.ui.announcements;

import android.arch.lifecycle.ViewModel;

import com.example.myattendance.ui.announcements.Feed_model;

public class Feed_ViewModel extends ViewModel {

    String feed_banner;
    String feed_clubname;
    String feed_chip_date;
    String feed_chip_vanue;
    String chip_forgot;

    public Feed_ViewModel() {
    }

    public Feed_ViewModel(Feed_model feed_model) {
        this.feed_banner = feed_banner;
        this.feed_clubname = feed_clubname;
        this.feed_chip_date = feed_chip_date;
        this.feed_chip_vanue = feed_chip_vanue;
        this.chip_forgot = chip_forgot;
    }
}
