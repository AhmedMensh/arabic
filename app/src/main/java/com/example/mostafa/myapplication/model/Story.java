package com.example.mostafa.myapplication.model;

import java.util.ArrayList;

public class Story {
    private String storyArabicTitle;
    private String storyEnglishTitle;
    private int storyImage;
    private int storyNumber;
    private ArrayList<SubStory>subStories;

    public ArrayList<SubStory> getSubStories() {
        return subStories;
    }

    public void setSubStories(ArrayList<SubStory> subStories) {
        this.subStories = subStories;
    }

    public Story(String storyArabicTitle, String storyEnglishTitle, int storyImage, int storyNumber, ArrayList<SubStory> subStories) {
        this.storyArabicTitle = storyArabicTitle;
        this.storyEnglishTitle = storyEnglishTitle;
        this.storyImage = storyImage;
        this.storyNumber = storyNumber;
        this.subStories = subStories;
    }

    public int getStoryNumber() {
        return storyNumber;
    }

    public void setStoryNumber(int storyNumber) {
        this.storyNumber = storyNumber;
    }

    public Story(String storyAreabicTitle, String storyEnglishTitle, int storyImage, int storyNumber) {
        this.storyArabicTitle = storyAreabicTitle;
        this.storyEnglishTitle = storyEnglishTitle;
        this.storyImage = storyImage;
        this.storyNumber=storyNumber;
    }

    public String getStoryArabicTitle() {
        return storyArabicTitle;
    }

    public void setStoryArabicTitle(String storyArabicTitle) {
        this.storyArabicTitle = storyArabicTitle;
    }

    public String getStoryEnglishTitle() {
        return storyEnglishTitle;
    }

    public void setStoryEnglishTitle(String storyEnglishTitle) {
        this.storyEnglishTitle = storyEnglishTitle;
    }

    public int getStoryImage() {
        return storyImage;
    }

    public void setStoryImage(int storyImage) {
        this.storyImage = storyImage;
    }
}
