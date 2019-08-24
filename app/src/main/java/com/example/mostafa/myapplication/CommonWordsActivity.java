package com.example.mostafa.myapplication;
import android.content.SharedPreferences;
import android.database.Cursor;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import com.example.mostafa.myapplication.adapters.SectionsPagerAdapter;
import com.example.mostafa.myapplication.controllers.AppKeys;
import com.example.mostafa.myapplication.controllers.FragmentLifecycle;
import com.example.mostafa.myapplication.controllers.SQLiteHelper;
import com.example.mostafa.myapplication.model.CommonWords;

import java.util.ArrayList;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class CommonWordsActivity extends AppCompatActivity {


    public static SQLiteHelper sqLiteHelper;
    private TabLayout mTabLayout;
    public ViewPager mViewPager;
    public  Cursor cursor;
    public static ArrayList<CommonWords> commonWordsList = new ArrayList<>();
    public static ArrayList<CommonWords> favouriteWordsList = new ArrayList<>();
    public SectionsPagerAdapter mSectionsPagerAdapter;

    boolean isFirstTime = true;
    SharedPreferences dataSaver;
    int currentPosition = 0;
     private Toolbar mToolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_words);
        mToolbar=findViewById(R.id.main_page_toolbar);
        mToolbar.setTitle("Common words");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTabLayout = findViewById(R.id.tabs);

        mViewPager = findViewById(R.id.viewpager_container);
        dataSaver = getDefaultSharedPreferences(this);

        isFirstTime = dataSaver.getBoolean("FIRST",true);



        sqLiteHelper = new SQLiteHelper(this , "WORDDB.sqlite",null,1);
        sqLiteHelper.quaryData("CREATE TABLE IF NOT EXISTS WORD (Id INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "arabicWord VARCHAR ,englishWord VARCHAR , favourite VARCHAR , lesson VARCHAR)");




        if(isFirstTime){
            initDataBase();
        }




        setupViewPager();




    }


    @Override
    protected void onPostResume() {
        super.onPostResume();

    }






    private void initDataBase(){


        sqLiteHelper.insertData("كتاب" ,"Book" ,"0" , "1");
        sqLiteHelper.insertData("سيارة" ,"Car" ,"0" , "1");
        sqLiteHelper.insertData("قلم" ,"Pen" ,"0" , "1");
        sqLiteHelper.insertData("كتاب" ,"Book" ,"0" , "2");
        sqLiteHelper.insertData("سيارة" ,"Car" ,"0" , "2");
        sqLiteHelper.insertData("قلم" ,"Pen" ,"0" , "2");
        sqLiteHelper.insertData("كتاب" ,"Book" ,"0" , "3");
        sqLiteHelper.insertData("سيارة" ,"Car" ,"0" , "3");
        sqLiteHelper.insertData("قلم" ,"Pen" ,"0" , "3");



        dataSaver.edit()
                .putBoolean("FIRST", false)
                .apply();

    }

    private void setupViewPager(){


        mSectionsPagerAdapter=new SectionsPagerAdapter(getSupportFragmentManager());

        mSectionsPagerAdapter.addFragment(new CommonWordsFragment());
        mSectionsPagerAdapter.addFragment(new FavouriteWordsFragment());

        mViewPager.setAdapter(mSectionsPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText("Common Words");
        mTabLayout.getTabAt(1).setText("Favourite Words");

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            // This method will be invoked when a new page becomes selected.
            @Override
            public void onPageSelected(int position) {

                FragmentLifecycle fragmentToShow = (FragmentLifecycle) mSectionsPagerAdapter.getItem(position);
                fragmentToShow.onResumeFragment();

                FragmentLifecycle fragmentToHide = (FragmentLifecycle)mSectionsPagerAdapter.getItem(currentPosition);
                fragmentToHide.onPauseFragment();

                currentPosition = position;
            }

            // This method will be invoked when the current page is scrolled
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Code goes here
            }

            // Called when the scroll state changes:
            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
            @Override
            public void onPageScrollStateChanged(int state) {
                // Code goes here
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

