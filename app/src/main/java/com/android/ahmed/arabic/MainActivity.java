package com.android.ahmed.arabic;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.android.ahmed.arabic.adapters.StoryRecycleAdapter;
import com.android.ahmed.arabic.controllers.AppKeys;
import com.android.ahmed.arabic.model.Story;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List <Story> mStoryList=new ArrayList<>();
    private RecyclerView mStoryRecycle;
    private StoryRecycleAdapter mAdapter;
//    private ArrayList<SubStory>subStories1=new ArrayList<>();
//    private ArrayList<SubStory>subStories2=new ArrayList<>();
//    private ArrayList<SubStory>subStories3=new ArrayList<>();
//    private ArrayList<SubStory>subStories4=new ArrayList<>();
//    private ArrayList<SubStory>subStories5=new ArrayList<>();
//    private ArrayList<SubStory>subStories6=new ArrayList<>();
//    private ArrayList<SubStory>subStories7=new ArrayList<>();
//    private ArrayList<SubStory>subStories8=new ArrayList<>();
//    private ArrayList<SubStory>subStories9=new ArrayList<>();
//    private ArrayList<SubStory>subStories10=new ArrayList<>();
//    private ArrayList<SubStory>subStories11=new ArrayList<>();
//    private ArrayList<SubStory>subStories12=new ArrayList<>();
//    private ArrayList<SubStory>subStories13=new ArrayList<>();
//    private ArrayList<SubStory>subStories14=new ArrayList<>();
//    private ArrayList<SubStory>subStories15=new ArrayList<>();
//    private ArrayList<SubStory>subStories16=new ArrayList<>();


    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView mNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mToolbar=findViewById(R.id.main_page_toolbar);
        mToolbar.setTitle("تعلم العربية");
        setSupportActionBar(mToolbar);
        mDrawerLayout=findViewById(R.id.main_navigation);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mNavigationView=findViewById(R.id.navigation);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.settings:
                        startActivity(new Intent(MainActivity.this,SettingActivity.class));
                        break;
                    case R.id.question:
                        startActivity(new Intent(MainActivity.this,QuestionActivity.class));
                        break;
                    case R.id.common_words:
                        Intent intent=new Intent(MainActivity.this,CommonWordsActivity.class);
                        intent.putExtra(AppKeys.STORY_NUMBER,"0");
                        startActivity(intent);
                        break;

                    case R.id.about_us:
                        startActivity(new Intent(MainActivity.this,AboutActivity.class));
                }
                return false;
            }
        });











        mStoryList.add(new Story("التحية والتعارف","Greetings and acquaintance",R.drawable.number1
                ,R.drawable.number1));
        mStoryList.add(new Story("الأسرة","Family",R.drawable.number1,
                R.drawable.number2));
        mStoryList.add(new Story("السكن","Living",R.drawable.number1
                ,R.drawable.number3));
        mStoryList.add(new Story("الحياة اليومية","Daily life"
                ,R.drawable.number1,R.drawable.number4));
        mStoryList.add(new Story("الطعام والشراب","Food and drinks",R.drawable.number1
                ,R.drawable.number5));
        mStoryList.add(new Story("الصلاة","Praying",R.drawable.number1,
                R.drawable.number6));
        mStoryList.add(new Story("الدراسة","Studying",R.drawable.number1
                ,R.drawable.number7));
        mStoryList.add(new Story("العمل","work",R.drawable.number1
                ,R.drawable.number8));
        mStoryList.add(new Story("التسوق","Shopping",R.drawable.number1,
                R.drawable.number9));
        mStoryList.add(new Story("الجو","Weather",R.drawable.number1
                ,R.drawable.number1));
        mStoryList.add(new Story("الناس والأماكن","People and places"
                ,R.drawable.number1,R.drawable.number1));
        mStoryList.add(new Story("الهوايات","Hobbies",R.drawable.number1
                ,R.drawable.number1));
        mStoryList.add(new Story("السفر","traveling",R.drawable.number1,
                R.drawable.number1));
        mStoryList.add(new Story("الحج والعمرة","Hajj and Umrah",R.drawable.number1
                ,R.drawable.number1));
       mStoryList.add(new Story("الصحة","Health"
               ,R.drawable.number1,R.drawable.number1));
        mStoryList.add(new Story("العطلة","Vacation"
                ,R.drawable.number1,R.drawable.number1));



        mStoryRecycle=findViewById(R.id.story_rv);
        mStoryRecycle.setLayoutManager(new LinearLayoutManager(this));
        mStoryRecycle.setHasFixedSize(true);
        mAdapter=new StoryRecycleAdapter(mStoryList,mStoryRecycle,this);
        mStoryRecycle.setAdapter(mAdapter);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
