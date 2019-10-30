package com.example.myattendance.ui.announcements;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.myattendance.R;
import com.example.myattendance.databinding.ActivityFeedBinding;

import java.util.ArrayList;
import java.util.List;


public class FeedActivity extends AppCompatActivity {

    FeedViewModel feedViewModel;
    SwipeRefreshLayout mLayout;
    RecyclerView recyclerView;
    private List<FeedModel> feedData=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFeedBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_feed);
        feedViewModel=ViewModelProviders.of(this).get(FeedViewModel.class);
        if (savedInstanceState == null) {
            feedViewModel.init();             //when activity will be started first time .
            //  feedViewModel.setFeedData(feedData);                   //from here we will fecth feed data and set to adapter

        }
        feedViewModel.addNewData(new FeedModel("1","2","3","4","5"));
        binding.setFeedModel(feedViewModel);
        mLayout=findViewById(R.id.swipeRefreshId);
        mLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //feedViewModel.fetchData();
                mLayout.setRefreshing(false);
            }
        });
        recyclerView=findViewById(R.id.feed_recyclerview);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                feedViewModel.fetchNewData(recyclerView,dx,dy);
            }
        });
    }


    //for adding any new data
    public void addNewData() {
        feedViewModel.addNewData(new FeedModel("1","2","3",null,"5"));
    }

    public void addNew(View view) {
        addNewData();
    }

}
