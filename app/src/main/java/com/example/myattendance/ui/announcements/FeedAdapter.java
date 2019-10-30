package com.example.myattendance.ui.announcements;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {
    private List<FeedModel> feedData=new ArrayList<>();
    private int layoutId;
    private FeedViewModel feedViewModel;
    public FeedAdapter(@LayoutRes int layoutId, FeedViewModel viewModel){
        this.layoutId=layoutId;
        this.feedViewModel=viewModel;
    }
    @NonNull
    @Override
    public FeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(mInflater, i, viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(FeedAdapter.ViewHolder viewHolder, int i) {
        viewHolder.bind(feedData.get(i), i);
    }

    @Override
    public int getItemCount() {
        return feedData == null ? 0 : feedData.size();
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapter.ViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public int getItemViewType(int position) {
        return layoutId;
    }
    public void setFeedModel(List<FeedModel> feedData) {
        this.feedData = feedData;
    }
    public void addFeedModel(FeedModel feed_model){
        if(this.feedData!=null)
            this.feedData.add(feed_model);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding;
        public ViewHolder(@NonNull ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        void bind(FeedModel feed_model, Integer position) {
            binding.setVariable(com.example.myattendance.BR.model, feed_model);
            binding.setVariable(com.example.myattendance.BR.position, position);
            binding.setVariable(com.example.myattendance.BR.view,binding.getRoot());
            binding.setVariable(com.example.myattendance.BR.viewModel,feedViewModel);
            binding.executePendingBindings();
        }

    }
}
