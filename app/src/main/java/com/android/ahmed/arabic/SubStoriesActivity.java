package com.android.ahmed.arabic;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.android.ahmed.arabic.adapters.SubStoryAdapter;
import com.android.ahmed.arabic.controllers.AppKeys;
import com.android.ahmed.arabic.model.Data;
import com.android.ahmed.arabic.model.SubStory;

import java.util.ArrayList;

public class SubStoriesActivity extends AppCompatActivity {
    RecyclerView subStoriesRecycle;
    SubStoryAdapter subStoryAdapter;
    ArrayList<SubStory> subStories;
    Data data = new Data();

    Button lessonWordsButton;
    private Toolbar mToolbar;
    String storyNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_stories);

        mToolbar=findViewById(R.id.main_page_toolbar);
        mToolbar.setTitle("بسم الله الرحمن الرحيم");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        subStoriesRecycle=findViewById(R.id.sub_story_list);
        subStoriesRecycle.setLayoutManager(new LinearLayoutManager(this));
        subStoriesRecycle.setHasFixedSize(true);


        storyNumber = getIntent().getExtras().getString(AppKeys.STORY_NUMBER);
        data.setStoryNumber(storyNumber);
        subStories = data.getSubStory();

        subStoryAdapter = new SubStoryAdapter(this ,subStories ,subStoriesRecycle);
        subStoriesRecycle.setAdapter(subStoryAdapter);




        lessonWordsButton = findViewById(R.id.lesson_words_btn);
        lessonWordsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Bundle bundle = new Bundle();
//                bundle.putString(AppKeys.LESSON_NUMBER, "1");
//                CommonWordsFragment commonWordsFragment = new CommonWordsFragment();
//                commonWordsFragment.setArguments(bundle);

                Intent i =new Intent(SubStoriesActivity.this,CommonWordsActivity.class);
                i.putExtra(AppKeys.STORY_NUMBER,storyNumber);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                onBackPressed();
                break;

        }
        return super.onOptionsItemSelected(item);

    }
}
