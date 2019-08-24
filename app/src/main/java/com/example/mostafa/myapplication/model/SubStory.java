package com.example.mostafa.myapplication.model;

import java.io.Serializable;
import java.util.ArrayList;

public class SubStory {
    private String subStoryTitle;
    private String SubStoryNumber;

    public SubStory(String subStoryNumber ,String subStoryTitle) {
        this.subStoryTitle = subStoryTitle;
        SubStoryNumber = subStoryNumber;
    }

    public String getSubStoryTitle() {
        return subStoryTitle;
    }

    public void setSubStoryTitle(String subStoryTitle) {
        this.subStoryTitle = subStoryTitle;
    }

    public String getSubStoryNumber() {
        return SubStoryNumber;
    }

    public void setSubStoryNumber(String subStoryNumber) {
        SubStoryNumber = subStoryNumber;
    }
}
