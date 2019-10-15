package com.android.ahmed.arabic.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.android.ahmed.arabic.R;
import com.android.ahmed.arabic.controllers.SQLiteHelper;
import com.android.ahmed.arabic.model.CommonWords;

import java.util.ArrayList;

public class CommonWordsRecyclerAdapter extends RecyclerView.Adapter<CommonWordsRecyclerAdapter.CommonWordsViewHolder> {


    ArrayList<CommonWords> commonWords;
    Context context;
    boolean isCommonFragment;
    SQLiteHelper sqLiteHelper;


    public CommonWordsRecyclerAdapter(ArrayList<CommonWords> commonWords, Context context, boolean isCommonFragment) {
        this.commonWords = commonWords;
        this.context = context;
        this.isCommonFragment = isCommonFragment;
    }

    @Override
    public CommonWordsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.words_item, parent, false);
        return new CommonWordsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CommonWordsViewHolder holder, final int position) {

        sqLiteHelper = new SQLiteHelper(context, "WORDDB.sqlite", null, 1);
        Log.e("Postion", position + "");

        if (isCommonFragment) {


            holder.arabicWord.setText(commonWords.get(position).getArabicWord());
            holder.englishWord.setText(commonWords.get(position).getEnglishWord().toUpperCase());
            if (commonWords.get(position).getFavourite().equals("0")) {
                holder.star.setImageResource(R.drawable.star_hollow);
            } else {
                holder.star.setImageResource(R.drawable.star);
            }

            holder.star.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (commonWords.get(position).getFavourite().equals("0")) {
                        holder.star.setImageResource(R.drawable.star);
                        commonWords.get(position).setFavourite("1");

                        sqLiteHelper.updateData(commonWords.get(position).getArabicWord(), commonWords.get(position).getEnglishWord(), "1", commonWords.get(position).getLesson(), commonWords.get(position).getId());
                    } else if (commonWords.get(position).getFavourite().equals("1")) {
                        holder.star.setImageResource(R.drawable.star_hollow);
                        commonWords.get(position).setFavourite("0");
                        sqLiteHelper.updateData(commonWords.get(position).getArabicWord(), commonWords.get(position).getEnglishWord(), "0", commonWords.get(position).getLesson(), commonWords.get(position).getId());


                    }

                }
            });
        } else {


            sqLiteHelper = new SQLiteHelper(context, "WORDDB.sqlite", null, 1);

            if (commonWords.get(position).getFavourite().equals("1"))

                holder.arabicWord.setText(commonWords.get(position).getArabicWord());
            holder.englishWord.setText(commonWords.get(position).getEnglishWord());
            holder.star.setImageResource(R.drawable.star);
            holder.star.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    sqLiteHelper.updateData(commonWords.get(position).getArabicWord(), commonWords.get(position).getEnglishWord(), "0", commonWords.get(position).getLesson(), commonWords.get(position).getId());

                    commonWords.remove(position);
                    notifyItemRemoved(position);
                    notifyItemRangeChanged(position, commonWords.size());
                    notifyDataSetChanged();



                }
            });


        }


    }

    @Override
    public int getItemCount() {

        return commonWords.size();
    }

    public class CommonWordsViewHolder extends RecyclerView.ViewHolder {

        TextView arabicWord;
        TextView englishWord;
        ImageView star;

        public CommonWordsViewHolder(View itemView) {
            super(itemView);

            arabicWord = itemView.findViewById(R.id.arabicWord);
            englishWord = itemView.findViewById(R.id.englisWord);
            star = itemView.findViewById(R.id.star);

        }
    }
}
