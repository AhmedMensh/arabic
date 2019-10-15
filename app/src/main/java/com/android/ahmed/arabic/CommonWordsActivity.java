package com.android.ahmed.arabic;
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


import com.android.ahmed.arabic.adapters.SectionsPagerAdapter;
import com.android.ahmed.arabic.controllers.FragmentLifecycle;
import com.android.ahmed.arabic.controllers.SQLiteHelper;
import com.android.ahmed.arabic.model.CommonWords;

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


        sqLiteHelper.insertData("كيف حالك؟" ,"How are you?" ,"0" , "1");
        sqLiteHelper.insertData("باكستان" ,"Pakistan" ,"0" , "1");
        sqLiteHelper.insertData("باكستاني" ,"Pakistani" ,"0" , "1");
        sqLiteHelper.insertData("تركيا" ,"Turkey" ,"0" , "1");
        sqLiteHelper.insertData("تركي" ,"Turkish" ,"0" , "1");
        sqLiteHelper.insertData("مصر" ,"Egypt" ,"0" , "1");
        sqLiteHelper.insertData("مصرية" ,"Egyptian" ,"0" , "1");
        sqLiteHelper.insertData("سوريا" ,"Syria" ,"0" , "1");
        sqLiteHelper.insertData("سورية" ,"Syrian" ,"0" , "1");
        sqLiteHelper.insertData("أخ" ,"brother" ,"0" , "1");
        sqLiteHelper.insertData("طالبة" ,"student" ,"0" , "1");

        sqLiteHelper.insertData("أسره" ,"family" ,"0" , "2");
        sqLiteHelper.insertData("مهندس" ,"engineer" ,"0" , "2");
        sqLiteHelper.insertData("طبيبة" ,"doctor" ,"0" , "2");
        sqLiteHelper.insertData("جدي" ,"my grandfather" ,"0" , "2");
        sqLiteHelper.insertData("شجرة" ,"tree" ,"0" , "2");
        sqLiteHelper.insertData("الأم" ,"Mother" ,"0" , "2");
        sqLiteHelper.insertData("النظارة" ,"glasses" ,"0" , "2");
        sqLiteHelper.insertData("المسجد" ,"mosque" ,"0" , "2");



        sqLiteHelper.insertData("الجامعة" ,"University" ,"0" , "3");
        sqLiteHelper.insertData("حي" ,"District" ,"0" , "3");
        sqLiteHelper.insertData("بيت" ,"House" ,"0" , "3");
        sqLiteHelper.insertData("شقة" ,"apartment" ,"0" , "3");
        sqLiteHelper.insertData("رقم" ,"number" ,"0" , "3");
        sqLiteHelper.insertData("المستأجر" ,"The renter" ,"0" , "3");
        sqLiteHelper.insertData("المؤجر" ,"The lessor" ,"0" , "3");
        sqLiteHelper.insertData("لأثاث" ,"furniture" ,"0" , "3");
        sqLiteHelper.insertData("غرفة النوم" ,"bedroom" ,"0" , "3");
        sqLiteHelper.insertData("سريراً" ,"bed" ,"0" , "3");
        sqLiteHelper.insertData("غرفة الجلوس" ,"living room" ,"0" , "3");
        sqLiteHelper.insertData("المطبخ" ,"kitchen" ,"0" , "3");
        sqLiteHelper.insertData("الحمام" ,"bathroom" ,"0" , "3");


        sqLiteHelper.insertData("الصلاة" ,"pray" ,"0" , "4");
        sqLiteHelper.insertData("القرآن" ,"Quran" ,"0" , "4");
        sqLiteHelper.insertData("المدرسة" ,"school" ,"0" , "4");
        sqLiteHelper.insertData("السيارة" ,"car" ,"0" , "4");
        sqLiteHelper.insertData("الحافلة" ,"bus" ,"0" , "4");
        sqLiteHelper.insertData("العطلة" ,"holiday" ,"0" , "4");
        sqLiteHelper.insertData("الملابس" ,"clothes" ,"0" , "4");
        sqLiteHelper.insertData("الأطباق" ,"dishes" ,"0" , "4");
        sqLiteHelper.insertData("التلفاز" ,"TV" ,"0" , "4");

        sqLiteHelper.insertData("المطعم" ,"the restaurant" ,"0" , "5");
        sqLiteHelper.insertData("وجبة" ,"meal" ,"0" , "5");
        sqLiteHelper.insertData("الغداء" ,"lunch" ,"0" , "5");
        sqLiteHelper.insertData("السمك" ,"fish" ,"0" , "5");
        sqLiteHelper.insertData("سمين" ,"fat" ,"0" , "5");
        sqLiteHelper.insertData("نحيف" ,"skinny" ,"0" , "5");
        sqLiteHelper.insertData("الشراب" ,"drink" ,"0" , "5");
        sqLiteHelper.insertData("الفاكهة" ,"fruits" ,"0" , "5");
        sqLiteHelper.insertData("القهوة" ,"coffee" ,"0" , "5");
        sqLiteHelper.insertData("الشاي" ,"tea" ,"0" , "5");
        sqLiteHelper.insertData("الحليب" ,"milk" ,"0" , "5");


        sqLiteHelper.insertData("الصلوات الخمس" ,"five prayers" ,"0" , "6");
        sqLiteHelper.insertData("مسجد" ,"Mosque" ,"0" , "6");
        sqLiteHelper.insertData("المسجد الحرام" ,"Holy Mosque" ,"0" , "6");
        sqLiteHelper.insertData("المسجد النبوي" ,"Prophet's Mosque" ,"0" , "6");
        sqLiteHelper.insertData("الطائرة" ,"plane" ,"0" , "6");

        sqLiteHelper.insertData("اللوحة" ,"painting" ,"0" , "7");
        sqLiteHelper.insertData("يوم" ,"Day" ,"0" , "7");
        sqLiteHelper.insertData("اسبوع" ,"week" ,"0" , "7");
        sqLiteHelper.insertData("العطلة" ,"Holiday" ,"0" , "7");
        sqLiteHelper.insertData("المواد" ,"materials" ,"0" , "7");
        sqLiteHelper.insertData("الاختبارات" ,"Exams" ,"0" , "7");
        sqLiteHelper.insertData("المكتبة" ,"library" ,"0" , "7");
        sqLiteHelper.insertData("المختبر" ,"lab" ,"0" , "7");
        sqLiteHelper.insertData("التلفاز" ,"TV" ,"0" , "7");

        sqLiteHelper.insertData("طبيب" ,"doctor" ,"0" , "8");
        sqLiteHelper.insertData("مهندس" ,"engineer" ,"0" , "8");
        sqLiteHelper.insertData("شركة" ,"company" ,"0" , "8");
        sqLiteHelper.insertData("مستشفي" ,"hospital" ,"0" , "8");
        sqLiteHelper.insertData("صيدليً" ,"pharmacist" ,"0" , "8");
        sqLiteHelper.insertData("ممرض" ,"nurse" ,"0" , "8");
        sqLiteHelper.insertData("طيار" ,"pilot" ,"0" , "8");
        sqLiteHelper.insertData("مدرس" ,"teacher" ,"0" , "8");


        sqLiteHelper.insertData("الجو" ,"weather" ,"0" , "10");
        sqLiteHelper.insertData("الخريف" ,"autumn" ,"0" , "10");
        sqLiteHelper.insertData("المعطف" ,"coat" ,"0" , "10");
        sqLiteHelper.insertData("المظلة" ,"parachute" ,"0" , "10");
        sqLiteHelper.insertData("السوق" ,"market" ,"0" , "10");
        sqLiteHelper.insertData("الشتاء" ,"winter" ,"0" , "10");
        sqLiteHelper.insertData("الصيف" ,"summer" ,"0" , "10");
        sqLiteHelper.insertData("الصيف" ,"summer" ,"0" , "10");


        sqLiteHelper.insertData("العراق" ,"Iraq" ,"0" , "11");
        sqLiteHelper.insertData("جدة" ,"Jeddah" ,"0" , "11");
        sqLiteHelper.insertData("مدير" ,"Director" ,"0" , "11");
        sqLiteHelper.insertData("اليمن" ,"Yemen" ,"0" , "11");
        sqLiteHelper.insertData("القرية" ,"village" ,"0" , "11");
        sqLiteHelper.insertData("تلوث" ,"pollution" ,"0" , "11");
        sqLiteHelper.insertData("ضوضاء" ,"noise" ,"0" , "11");


        sqLiteHelper.insertData("هوايات" ,"hobbies" ,"0" , "12");
        sqLiteHelper.insertData("القراءة" ,"reading" ,"0" , "12");
        sqLiteHelper.insertData("السفر" ,"travel" ,"0" , "12");
        sqLiteHelper.insertData("الرياضة" ,"sports" ,"0" , "12");
        sqLiteHelper.insertData("معرض" ,"Gallery" ,"0" , "12");
        sqLiteHelper.insertData("جناح" ,"suite" ,"0" , "12");
        sqLiteHelper.insertData("جمعية" ,"association" ,"0" , "12");

        sqLiteHelper.insertData("موظف" ,"Employee" ,"0" , "13");
        sqLiteHelper.insertData("حجز" ,"reservation" ,"0" , "13");
        sqLiteHelper.insertData("الخطوط" ,"Airlines" ,"0" , "13");
        sqLiteHelper.insertData("التذاكر" ,"tickets" ,"0" , "13");
        sqLiteHelper.insertData("جوازات السفر" ,"passports" ,"0" , "13");
        sqLiteHelper.insertData("حقيبه" ,"bag" ,"0" , "13");



        sqLiteHelper.insertData("العطلة" ,"holiday " ,"0" , "14");
        sqLiteHelper.insertData("الفندق" ,"hotel" ,"0" , "14");
        sqLiteHelper.insertData("عرفة" ,"Arafah" ,"0" , "14");


        sqLiteHelper.insertData("طبيب الأسنان" ,"dentist" ,"0" , "15");
        sqLiteHelper.insertData("أسناني" ,"my teeth" ,"0" , "15");
        sqLiteHelper.insertData("الأنف" ,"nose" ,"0" , "15");
        sqLiteHelper.insertData("والأذن" ,"ear" ,"0" , "15");
        sqLiteHelper.insertData("الحنجرة" ,"throat" ,"0" , "15");
        sqLiteHelper.insertData("حقيبه" ,"bag" ,"0" , "15");
        sqLiteHelper.insertData("حقيبه" ,"bag" ,"0" , "15");





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

