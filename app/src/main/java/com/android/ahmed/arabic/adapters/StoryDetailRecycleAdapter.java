package com.android.ahmed.arabic.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.ahmed.arabic.R;
import com.android.ahmed.arabic.controllers.AppKeys;
import com.android.ahmed.arabic.model.LessonDetails;

import java.util.List;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class StoryDetailRecycleAdapter extends RecyclerView.Adapter <StoryDetailRecycleAdapter.StoryDetailHolder> {

    private List <LessonDetails> mBodiesList;
    private RecyclerView mRecyclerView;
    Context mContext;
    public static int audioPosition;

    SharedPreferences dataSaver;
    String fontType;
    String languageToShow;
    int arabicTextSize=25 , englishTextSize=25  ;


    public StoryDetailRecycleAdapter(List<LessonDetails> list, RecyclerView recyclerView, Context context){
        mRecyclerView=recyclerView;
        mBodiesList=list;
        mContext=context;
    }
    @NonNull
    @Override

    public StoryDetailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row = inflater.inflate(R.layout.story_detail_item, parent, false);

        return new StoryDetailRecycleAdapter.StoryDetailHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryDetailHolder holder, int position) {
        dataSaver = getDefaultSharedPreferences(mContext);
        languageToShow = dataSaver.getString(AppKeys.LANGUAGE_TO_SHOW,"ar-en");
        arabicTextSize = dataSaver.getInt(AppKeys.ARABIC_TEXT_SIZE,25);
        englishTextSize = dataSaver.getInt(AppKeys.ENGLISH_TEXT_SIZE,25);
        holder.englishTV.setTextSize(englishTextSize);
        holder.arabicTV.setTextSize(arabicTextSize);
        switch (languageToShow){
            case "ar":
                holder.arabicTV.setVisibility(View.VISIBLE);
                holder.englishTV.setVisibility(View.GONE);
                break;

            case "en":
                holder.arabicTV.setVisibility(View.GONE);
                holder.englishTV.setVisibility(View.VISIBLE);
                break;

            case "ar-en":
                holder.arabicTV.setVisibility(View.VISIBLE);
                holder.englishTV.setVisibility(View.VISIBLE);
                break;
        }
        fontType = dataSaver.getString(AppKeys.TEXT_FORMAT,"extra");

        Typeface type = Typeface.createFromAsset(mContext.getAssets(),"fonts/"+fontType+".ttf");
        holder.englishTV.setTypeface(type);
        holder.arabicTV.setTypeface(type);

        LessonDetails body=mBodiesList.get(position);
        holder.arabicTV.setText(body.getArabicText());
        holder.englishTV.setText(body.getEnglishText());

        holder.itemView.setBackgroundColor(-1);
        if (audioPosition == position){
            holder.itemView.setBackgroundColor(mContext.getResources().getColor(R.color.pink));
        }

    }



    @Override
    public int getItemCount() {
        return mBodiesList.size();
    }

    public class StoryDetailHolder extends RecyclerView.ViewHolder {
        private TextView arabicTV;
        private TextView englishTV;

        public StoryDetailHolder(View itemView) {
            super(itemView);
            arabicTV=itemView.findViewById(R.id.arabic_text_tv);
            englishTV=itemView.findViewById(R.id.english_text_tv);
        }
    }
}
