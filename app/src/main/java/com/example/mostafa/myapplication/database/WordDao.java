package com.example.mostafa.myapplication.database;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Query("SELECT * FROM Word")
    List<Word> getAllWords();


    @Insert
    public void insertIntoWord(Word...word);
}
