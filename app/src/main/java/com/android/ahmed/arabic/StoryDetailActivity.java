package com.android.ahmed.arabic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import com.android.ahmed.arabic.adapters.StoryDetailRecycleAdapter;

import com.android.ahmed.arabic.controllers.AppKeys;
import com.android.ahmed.arabic.model.Data;
import com.android.ahmed.arabic.model.LessonDetails;

import java.util.ArrayList;


import imangazaliev.immaplayer.ImmaPlayer;
import imangazaliev.immaplayer.ImmaPlayerView;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class StoryDetailActivity extends AppCompatActivity {
    private RecyclerView mStoryRecycle;
    private StoryDetailRecycleAdapter mAdapter;

    Runnable currentAudioPositionMP;
    private Handler mHandler = new Handler();
    private Runnable pauseAfterRunnable;
    private Handler playHandler;
    private String position;
    private int time;
    private Toolbar mToolbar;
    ArrayList <LessonDetails> bodies=new ArrayList<>();
    SharedPreferences dataSaver;
    LinearLayoutManager layoutManager;
    private ImmaPlayer mAudioPlayer;
    private ImmaPlayerView playerView;
    Data data = new Data();
    String storyNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);

        dataSaver = getDefaultSharedPreferences(this);
        mToolbar=findViewById(R.id.main_page_toolbar);
        mToolbar.setTitle("بسم الله الرحمن الرحيم");
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        storyNumber = getIntent().getExtras().getString(AppKeys.STORY_NUMBER);
        data.setLessonNumber(storyNumber);
        bodies = data.getStoryBody();

        mStoryRecycle=findViewById(R.id.story_detail_rv);
        layoutManager=new LinearLayoutManager(this);
        mStoryRecycle.setLayoutManager(layoutManager);
        mStoryRecycle.setHasFixedSize(true);
        mAdapter=new StoryDetailRecycleAdapter(bodies,mStoryRecycle,this);
        mStoryRecycle.setAdapter(mAdapter);

        StoryDetailRecycleAdapter.audioPosition = 1000;
        this.playHandler = new Handler();


        this.mAudioPlayer = new ImmaPlayer(this);
        this.mAudioPlayer.setAudioFromAssets(data.getAudio());
        this.playerView = findViewById(R.id.ImmaPlayer);
        this.playerView.setController(this.mAudioPlayer);



        this.mAudioPlayer.setStateListener(new ImmaPlayer.StateListener()
        {
            public void onPlayerFinished()
            {

                if (dataSaver.getBoolean(AppKeys.IS_REPEAT,false)){
                    mAudioPlayer.play();
                }else {

                    for (;;)
                    {
                        StoryDetailRecycleAdapter.audioPosition = 1000;
                        mAudioPlayer.setProgress(0L);
                        return;
                    }
                }
            }

            public void onPlayerPaused() {}

            public void onPlayerResumed() {}

            public void onPlayerStarted(long paramAnonymousLong)
            {
                currentAudioPositionMP.run();
            }

            public void onPlayerStopped() {}
        });


        this.currentAudioPositionMP = new Runnable()
        {
            public void run()
            {
                mHandler.postDelayed(this, 300L);
                if (mAudioPlayer.isPlaying() && dataSaver.getBoolean(AppKeys.IS_SHADOW,true))
                {
                    long l = mAudioPlayer.getProgress();

                    for (int i = 0; i < bodies.size(); i++) {

                        if (((bodies.get(i)).getAudioDuration() < l)
                                && (2000+ (bodies.get(i)).getAudioDuration() > l))
                        {

                            if ( (bodies.size() - i > 1)) {

                                RecyclerView.SmoothScroller smoothScroller = new LinearSmoothScroller(StoryDetailActivity.this) {
                                    @Override protected int getVerticalSnapPreference() {
                                        return LinearSmoothScroller.SNAP_TO_START;
                                    }
                                };
                                smoothScroller.setTargetPosition(i);
                                layoutManager.startSmoothScroll(smoothScroller);
                            }
                            StoryDetailRecycleAdapter.audioPosition = i;
                            mAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        };
    }


    protected void onDestroy()
    {

        super.onDestroy();
        this.mAudioPlayer.stop();
        this.playHandler.removeCallbacks(this.pauseAfterRunnable);
        this.mHandler.removeCallbacks(this.currentAudioPositionMP);
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.mAudioPlayer.stop();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.settings) {
            Intent intent=new Intent(this,SettingActivity.class);
            startActivity(intent);

        }else if (id==android.R.id.home){
            finish();
            onBackPressed();

            return true;
        }else if(id==R.id.world){

            String languageToShow = dataSaver.getString(AppKeys.LANGUAGE_TO_SHOW,"ar");
            switch (languageToShow){
                case "ar":
                case "en":
                    dataSaver.edit().putString(AppKeys.LANGUAGE_TO_SHOW,"ar-en").apply();
                    mAdapter.notifyDataSetChanged();
                    Log.e("Language",languageToShow);
                    break;

                case "ar-en":
                    dataSaver.edit().putString(AppKeys.LANGUAGE_TO_SHOW,"ar").apply();
                    mAdapter.notifyDataSetChanged();
                    Log.e("Language",languageToShow);
                    break;

            }
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

}
