package com.example.myattendance.ui.announcements;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myattendance.R;

import java.util.List;

public class Feed_adapter extends RecyclerView.Adapter<Feed_adapter.ViewHolder> {
    private List<Feed_model> feedData;
    public Feed_adapter(List<Feed_model> feedData){
        this.feedData=feedData;
    }
    @NonNull
    @Override
    public Feed_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());
        View view = mInflater.inflate(R.layout.feed_recyclerview_itemlist, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Feed_adapter.ViewHolder viewHolder, int i) {
        viewHolder.clubName.setText(feedData.get(i).getFeed_clubname());
        viewHolder.feedVenueChip.setText(feedData.get(i).feed_chip_vanue);
        viewHolder.feedDateChip.setText(feedData.get(i).feed_chip_date);
        //not done for feed banner

    }

    @Override
    public int getItemCount() {
        return feedData == null ? 0 : feedData.size();
    }

    @Override
    public void onBindViewHolder(@NonNull Feed_adapter.ViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView clubName,feedDateChip,feedVenueChip,feedForgotChip;
        ImageView feedBanner;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            clubName=itemView.findViewById(R.id.feed_clubname);
            feedDateChip=itemView.findViewById(R.id.feed_date_chip);
            feedVenueChip=itemView.findViewById(R.id.feed_venue_chip);
            feedForgotChip=itemView.findViewById(R.id.feed_forgot_chip);
        }

    }
}
