package com.android.ahmed.arabic;


import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.android.ahmed.arabic.controllers.AppKeys;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class SettingActivity extends AppCompatActivity {


    Button normalButton , extraButton , superButton , proButton,arButton , arEnButton , enButton;
    SeekBar arSize , enSize;
    TextView arabicText , englishText;
    Switch repeatSwitch , shadowSwitch;

    int arabicSize=30 , englishSize = 30;

    SharedPreferences dataSaver;
    String languageToShow , textFormat;
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        mToolbar=findViewById(R.id.main_page_toolbar);
       mToolbar.setTitle("Settings");
       setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataSaver = getDefaultSharedPreferences(this);

        normalButton = findViewById(R.id.normal_btn);
        extraButton = findViewById(R.id.extra_btn);
        superButton = findViewById(R.id.super_btn);
        proButton = findViewById(R.id.pro_btn);

        arButton = findViewById(R.id.ar_btn);
        arEnButton = findViewById(R.id.ar_en_btn);
        enButton = findViewById(R.id.en_btn);

        arSize = findViewById(R.id.arabic_size);
        enSize = findViewById(R.id.english_size);
        arabicText = findViewById(R.id.arabic_text);
        englishText = findViewById(R.id.english_text);

        repeatSwitch = findViewById(R.id.repeat_switch);
        shadowSwitch = findViewById(R.id.shadow_switch);

        arabicSize = dataSaver.getInt(AppKeys.ARABIC_TEXT_SIZE,30);
        englishSize = dataSaver.getInt(AppKeys.ENGLISH_TEXT_SIZE , 30);
        languageToShow = dataSaver.getString(AppKeys.LANGUAGE_TO_SHOW,"ar-en");
        textFormat = dataSaver.getString(AppKeys.TEXT_FORMAT,"");

        switch (textFormat){
            case "normal":
                normalTextFormat();
                break;

            case "extra":
                extraTextFormat();
                break;

            case "pro":
                proTextFormat();
                break;

            case "supe":
                superTextFormat();
                break;

            default:
                normalTextFormat();
                break;
        }

        switch (languageToShow) {
            case "ar-en":
                arabicAndEnglishLanguage();
                break;

            case "ar":
                arabicLanguage();
                break;

            default:
                englishLanguage();
                break;
        }

        arSize.setProgress(arabicSize-14);
        enSize.setProgress(englishSize-14);



        arabicText.setTextSize(arabicSize);
        englishText.setTextSize(englishSize);



        intiTextType();
        initLanguage();
        initTextSize();
        repeatSwitch();
        shadowSwitch();
    }

    private void shadowSwitch() {

        shadowSwitch.setChecked(dataSaver.getBoolean(AppKeys.IS_SHADOW,false));
        shadowSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                dataSaver.edit().putBoolean(AppKeys.IS_SHADOW,b).apply();

            }
        });
    }

    private void repeatSwitch() {
        repeatSwitch.setChecked(dataSaver.getBoolean(AppKeys.IS_REPEAT , false));
        repeatSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                dataSaver.edit().putBoolean(AppKeys.IS_REPEAT,b).apply();

            }
        });
    }

    private void initTextSize() {

        arSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                arabicText.setTextSize(progress+14);

                dataSaver.edit().putInt(AppKeys.ARABIC_TEXT_SIZE , progress+14).apply();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        enSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                englishText.setTextSize(progress + 14);
                dataSaver.edit().putInt(AppKeys.ENGLISH_TEXT_SIZE , progress+ 14).apply();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }


    private void initLanguage() {

        arButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arabicLanguage();
            }
        });

        arEnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arabicAndEnglishLanguage();

            }
        });

        enButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                englishLanguage();

            }
        });
    }

    private void intiTextType() {

        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                normalTextFormat();

            }
        });



        extraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                extraTextFormat();

            }
        });



        superButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                superTextFormat();

            }
        });


        proButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                proTextFormat();


            }
        });
    }


    private void proTextFormat(){

        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/pro.ttf");
        arabicText.setTypeface(type);
        englishText.setTypeface(type);

        dataSaver.edit().putString(AppKeys.TEXT_FORMAT,"pro").apply();

        proButton.setBackgroundColor(getResources().getColor(R.color.red));
        proButton.setTextColor(getResources().getColor(R.color.white));

        normalButton.setBackgroundColor(getResources().getColor(R.color.white));
        normalButton.setTextColor(getResources().getColor(R.color.red));


        extraButton.setBackgroundColor(getResources().getColor(R.color.white));
        extraButton.setTextColor(getResources().getColor(R.color.red));


        superButton.setBackgroundColor(getResources().getColor(R.color.white));
        superButton.setTextColor(getResources().getColor(R.color.red));
    }

    private void superTextFormat(){

        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/supe.ttf");
        arabicText.setTypeface(type);
        englishText.setTypeface(type);

        dataSaver.edit().putString(AppKeys.TEXT_FORMAT,"supe").apply();

        superButton.setBackgroundColor(getResources().getColor(R.color.red));
        superButton.setTextColor(getResources().getColor(R.color.white));

        normalButton.setBackgroundColor(getResources().getColor(R.color.white));
        normalButton.setTextColor(getResources().getColor(R.color.red));


        extraButton.setBackgroundColor(getResources().getColor(R.color.white));
        extraButton.setTextColor(getResources().getColor(R.color.red));


        proButton.setBackgroundColor(getResources().getColor(R.color.white));
        proButton.setTextColor(getResources().getColor(R.color.red));
    }
    private void extraTextFormat(){


        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/extra.ttf");
        arabicText.setTypeface(type);
        englishText.setTypeface(type);

        dataSaver.edit().putString(AppKeys.TEXT_FORMAT,"extra").apply();

        extraButton.setBackgroundColor(getResources().getColor(R.color.red));
        extraButton.setTextColor(getResources().getColor(R.color.white));

        normalButton.setBackgroundColor(getResources().getColor(R.color.white));
        normalButton.setTextColor(getResources().getColor(R.color.red));


        superButton.setBackgroundColor(getResources().getColor(R.color.white));
        superButton.setTextColor(getResources().getColor(R.color.red));


        proButton.setBackgroundColor(getResources().getColor(R.color.white));
        proButton.setTextColor(getResources().getColor(R.color.red));
    }
    private void normalTextFormat(){


        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/normal.ttf");
        arabicText.setTypeface(type);
        englishText.setTypeface(type);

        dataSaver.edit().putString(AppKeys.TEXT_FORMAT,"normal").apply();


        normalButton.setBackgroundColor(getResources().getColor(R.color.red));
        normalButton.setTextColor(getResources().getColor(R.color.white));

        extraButton.setBackgroundColor(getResources().getColor(R.color.white));
        extraButton.setTextColor(getResources().getColor(R.color.red));


        superButton.setBackgroundColor(getResources().getColor(R.color.white));
        superButton.setTextColor(getResources().getColor(R.color.red));


        proButton.setBackgroundColor(getResources().getColor(R.color.white));
        proButton.setTextColor(getResources().getColor(R.color.red));
    }


    private void arabicAndEnglishLanguage(){
        arabicText.setVisibility(View.VISIBLE);
        englishText.setVisibility(View.VISIBLE);

        dataSaver.edit().putString(AppKeys.LANGUAGE_TO_SHOW,"ar-en").apply();
        arEnButton.setBackgroundColor(getResources().getColor(R.color.red));
        arEnButton.setTextColor(getResources().getColor(R.color.white));


        arButton.setBackgroundColor(getResources().getColor(R.color.white));
        arButton.setTextColor(getResources().getColor(R.color.red));


        enButton.setBackgroundColor(getResources().getColor(R.color.white));
        enButton.setTextColor(getResources().getColor(R.color.red));
    }

    private void englishLanguage(){

        arabicText.setVisibility(View.GONE);
        englishText.setVisibility(View.VISIBLE);

        dataSaver.edit().putString(AppKeys.LANGUAGE_TO_SHOW,"en").apply();
        enButton.setBackgroundColor(getResources().getColor(R.color.red));
        enButton.setTextColor(getResources().getColor(R.color.white));


        arButton.setBackgroundColor(getResources().getColor(R.color.white));
        arButton.setTextColor(getResources().getColor(R.color.red));


        arEnButton.setBackgroundColor(getResources().getColor(R.color.white));
        arEnButton.setTextColor(getResources().getColor(R.color.red));
    }

    private void arabicLanguage(){

        arabicText.setVisibility(View.VISIBLE);
        englishText.setVisibility(View.GONE);

        dataSaver.edit().putString(AppKeys.LANGUAGE_TO_SHOW,"ar").apply();

        arButton.setBackgroundColor(getResources().getColor(R.color.red));
        arButton.setTextColor(getResources().getColor(R.color.white));


        arEnButton.setBackgroundColor(getResources().getColor(R.color.white));
        arEnButton.setTextColor(getResources().getColor(R.color.red));


        enButton.setBackgroundColor(getResources().getColor(R.color.white));
        enButton.setTextColor(getResources().getColor(R.color.red));
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
