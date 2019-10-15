package com.android.ahmed.arabic.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.ahmed.arabic.R;
import com.android.ahmed.arabic.StoryDetailActivity;
import com.android.ahmed.arabic.controllers.AppKeys;
import com.android.ahmed.arabic.model.SubStory;

import java.util.ArrayList;

public class SubStoryAdapter extends RecyclerView.Adapter<SubStoryAdapter.SubStoryViewHolder> {

    Context context;
    ArrayList<SubStory> subStories;
    RecyclerView recyclerView;

    public SubStoryAdapter(Context context, ArrayList<SubStory> subStories, RecyclerView subStoriesRecycle) {
        this.context = context;
        this.subStories = subStories;
        this.recyclerView = subStoriesRecycle;
    }

    @NonNull
    @Override
    public SubStoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_story_row, parent, false);
        view.setOnClickListener(new getStoryDetails());
        return new SubStoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubStoryViewHolder holder, int position) {

        holder.number.setText(subStories.get(position).getSubStoryNumber());
        holder.title.setText(subStories.get(position).getSubStoryTitle());
    }

    @Override
    public int getItemCount() {
        return subStories.size();
    }

    private class getStoryDetails implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int itemPosition = recyclerView.getChildAdapterPosition(view);
            Intent intent=new Intent(context, StoryDetailActivity.class);
            intent.putExtra(AppKeys.STORY_NUMBER,subStories.get(itemPosition).getSubStoryNumber());
            context.startActivity(intent);



        }
    }

    public class SubStoryViewHolder extends RecyclerView.ViewHolder{
        TextView number , title;
        public SubStoryViewHolder(View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.sub_number);
            title = itemView.findViewById(R.id.sub_title);
        }
    }
}
