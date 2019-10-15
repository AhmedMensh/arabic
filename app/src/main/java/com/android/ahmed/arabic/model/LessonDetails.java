package com.android.ahmed.arabic.model;

import java.io.Serializable;

public class LessonDetails implements Serializable{

    private String arabicText;
    private String englishText;
    int audioDuration;


    public LessonDetails(String arbicText, String englishText) {

        this.arabicText = arbicText;
        this.englishText = englishText;
    }

    public String getArabicText() {
        return arabicText;
    }

    public void setArabicText(String arabicText) {
        this.arabicText = arabicText;
    }

    public String getEnglishText() {
        return englishText;
    }

    public void setEnglishText(String englishText) {
        this.englishText = englishText;
    }



    public int getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(int audioDuration) {
        this.audioDuration = audioDuration;
    }

    public LessonDetails(String arabicText, String englishText, int audioDuration) {
        this.arabicText = arabicText;
        this.englishText = englishText;
        this.audioDuration = audioDuration;
    }
}
