package com.example.mostafa.myapplication.model;

public class CommonWords {


    private String arabicWord;
    private String englishWord;
    private String favourite;
    private String lesson;
    private  int id;

    public CommonWords(int id, String arabicWord , String englishWord ,String favourite ,String lesson) {
        this.arabicWord = arabicWord;
        this.englishWord = englishWord;
        this.id = id;
        this.favourite = favourite;
        this.lesson = lesson;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getArabicWord() {
        return arabicWord;
    }

    public void setArabicWord(String arabicWord) {
        this.arabicWord = arabicWord;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
