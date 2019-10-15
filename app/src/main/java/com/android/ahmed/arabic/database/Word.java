package com.android.ahmed.arabic.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Word {


    public Word(String arabic, String english, int lesson, boolean favourite) {
        this.arabic = arabic;
        this.english = english;
        this.lesson = lesson;
        this.favourite = favourite;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "arabic")
    private String arabic;


    @ColumnInfo(name = "english")
    private String english;

    @ColumnInfo(name = "lesson")
    private int lesson;

    @ColumnInfo(name = "favourite")
    private boolean favourite;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
