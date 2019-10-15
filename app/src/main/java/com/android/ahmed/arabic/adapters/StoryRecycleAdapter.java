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
import com.android.ahmed.arabic.SubStoriesActivity;
import com.android.ahmed.arabic.controllers.AppKeys;
import com.android.ahmed.arabic.model.Story;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryRecycleAdapter extends RecyclerView.Adapter <StoryRecycleAdapter.StoryHolder> {
    private List<Story> mStoriesList;
    private RecyclerView mRecyclerView;
    Context mContext;


    public StoryRecycleAdapter(List <Story> stories,RecyclerView recyclerView,Context context){
           mRecyclerView=recyclerView;
            this.mStoriesList=stories;
            this.mContext=context;
       }

    @NonNull
    @Override
    public StoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row = inflater.inflate(R.layout.story_item, parent, false);
        row.setOnClickListener(new getSubStories());
        return new StoryRecycleAdapter.StoryHolder(row);



    }

    @Override
    public void onBindViewHolder(@NonNull StoryHolder holder, int position) {
        Story story=mStoriesList.get(position);

        holder.mStoryimage.setImageResource(story.getStoryImage());
        holder.mStoryNumber.setImageResource(story.getStoryNumber());
        holder.mArabicStoryTitle.setText(story.getStoryArabicTitle());
        holder.mEnglishStoryTitle.setText(story.getStoryEnglishTitle());

    }

    @Override
    public int getItemCount() {
        return mStoriesList.size();
    }

    private class getSubStories implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int itemPosition = mRecyclerView.getChildAdapterPosition(view);
            Intent intent=new Intent(mContext, SubStoriesActivity.class);

//            ArrayList<SubStory> sub=mStoriesList.get(itemPosition).getSubStories();
//            intent.putExtra("sub",sub);
            intent.putExtra(AppKeys.STORY_NUMBER,Integer.toString(itemPosition+1));
            mContext.startActivity(intent);



        }
    }
    public class StoryHolder extends RecyclerView.ViewHolder{

        private CircleImageView mStoryimage;
        private CircleImageView mStoryNumber;
        private TextView mArabicStoryTitle;
        private TextView mEnglishStoryTitle;


        public StoryHolder(View itemView) {

            super(itemView);
            mStoryimage=itemView.findViewById(R.id.story_image);
            mStoryNumber=itemView.findViewById(R.id.story_number);
            mArabicStoryTitle=itemView.findViewById(R.id.story_title_arabic_tv);
            mEnglishStoryTitle=itemView.findViewById(R.id.story_title_english_tv);

        }
    }

}
