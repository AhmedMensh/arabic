package com.android.ahmed.arabic;

import android.database.Cursor;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.android.ahmed.arabic.adapters.CommonWordsRecyclerAdapter;
import com.android.ahmed.arabic.controllers.AppKeys;
import com.android.ahmed.arabic.controllers.FragmentLifecycle;
import com.android.ahmed.arabic.controllers.SQLiteHelper;
import com.android.ahmed.arabic.model.CommonWords;

import java.util.ArrayList;

public class CommonWordsFragment extends Fragment implements FragmentLifecycle {

    ArrayList<CommonWords> commonWordsList = new ArrayList<>();
    RecyclerView commonWordsRecycleView;
    CommonWordsRecyclerAdapter commonWordsRecyclerAdapter;
    SQLiteHelper sqLiteHelper;

    String lessonNumber="";
    Cursor cursor;


    public CommonWordsFragment() {
    }

    private static final String TAG = "CommonWordsFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_common_words, container, false);
        commonWordsRecycleView = view.findViewById(R.id.common_words_recycel);
        commonWordsRecycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        commonWordsRecycleView.setHasFixedSize(true);

        lessonNumber=getActivity().getIntent().getExtras().getString(AppKeys.STORY_NUMBER);


        Log.e(TAG, "onCreateView: "+lessonNumber);
        readFromDataBase();
        return view;
    }


    public void readFromDataBase() {

        sqLiteHelper = new SQLiteHelper(getContext(), "WORDDB.sqlite", null, 1);
        commonWordsList.clear();
        if(lessonNumber.equals("0")){
            cursor = sqLiteHelper.getData("SELECT * FROM WORD");
        }else {
            cursor = sqLiteHelper.getData("SELECT * FROM WORD WHERE lesson ="+lessonNumber);
        }

        while (cursor.moveToNext()) {

            int id = cursor.getInt(0);
            String arabicWord = cursor.getString(1);
            String englishWord = cursor.getString(2);
            String favourite = cursor.getString(3);
            String lesson = cursor.getString(4);
            commonWordsList.add(new CommonWords(id, arabicWord,englishWord, favourite, lesson));

        }

        commonWordsRecyclerAdapter = new CommonWordsRecyclerAdapter(commonWordsList, getContext(), true);
        commonWordsRecycleView.setAdapter(commonWordsRecyclerAdapter);
    }

    @Override
    public void onPauseFragment() {

    }

    @Override
    public void onResumeFragment() {


        readFromDataBase();
    }
}
