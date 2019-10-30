package com.example.myattendance.ui.announcements;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.myattendance.R;

import java.util.ArrayList;
import java.util.List;

public class FeedViewModel extends ViewModel {

    private FeedAdapter adapter;
    public List<FeedModel> feedData;
    boolean isLoading,loadMore;


    public List<FeedModel> getFeedData() {
        return feedData;
    }

    public void setFeedData(List<FeedModel> feedData) {
        this.feedData = feedData;
    }

    public FeedAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(FeedAdapter adapter) {
        this.adapter = adapter;
    }
    public void init() {
        feedData=new ArrayList<>();
        adapter = new FeedAdapter(R.layout.feed_recyclerview_itemlist,this);
    }
    public void setFeedDataInAdapter(List<FeedModel> feedData) {
        this.adapter.setFeedModel(feedData);
        this.adapter.notifyDataSetChanged();
    }
    public FeedModel getFeedDataAt(Integer index) {
        if (feedData!= null && index != null &&
                feedData.size() > index) {
            Log.d("message : ","position number is : "+index);
            return feedData.get(index);
        }
        return null;
    }
    public void onClickItem(View view) {
        LinearLayout l=view.findViewById(R.id.expandableId);
        if(l.getVisibility()==View.VISIBLE)
            l.setVisibility(View.GONE);
        else
            l.setVisibility(View.VISIBLE);
    }

    public void addNewData(FeedModel feed_model) {
        if(feedData==null) {
            Log.d("feedData is null ...","");
            return;
        }
        this.adapter.addFeedModel(feed_model);
        this.adapter.notifyDataSetChanged();
    }

    public void fetchNewData(RecyclerView recyclerView,int dx,int dy) {
        int visibleItem=recyclerView.getLayoutManager().getChildCount();
        int totalItem=recyclerView.getLayoutManager().getItemCount();
        int lastVisibleItem=((LinearLayoutManager)(recyclerView.getLayoutManager())).findFirstVisibleItemPosition();
        if(dy > 0){
            if(isLoading){
                if(totalItem>lastVisibleItem){
                    isLoading=false;
                }
            }
            if(!isLoading && (totalItem-visibleItem)<=lastVisibleItem){
                //startNewFetching();
                isLoading=true;
                loadMore=true;
            }
        }
    }
}
