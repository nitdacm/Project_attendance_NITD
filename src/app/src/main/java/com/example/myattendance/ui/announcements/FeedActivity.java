package com.example.myattendance.ui.announcements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myattendance.R;

public class FeedActivity extends AppCompatActivity {

    private RecyclerView feed_recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        feed_recyclerview=findViewById(R.id.feed_recyclerview);
        feed_recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}
