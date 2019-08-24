package com.example.mostafa.myapplication.controllers;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

public class SQLiteHelper extends SQLiteOpenHelper {


    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    public void quaryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    public void insertData(String arabicWord ,String englishWord , String favourite , String lesson){
        SQLiteDatabase database = getWritableDatabase();
        String sql ="INSERT INTO WORD VALUES (NULL,?,?,?,?)";

        SQLiteStatement statement = database.compileStatement(sql);

        statement.clearBindings();
        statement.bindString(1,arabicWord);
        statement.bindString(2,englishWord);
        statement.bindString(3,favourite);
        statement.bindString(4,lesson);
        statement.executeInsert();
    }






    public Cursor getData(String sql){
        SQLiteDatabase database = getReadableDatabase();

        return database.rawQuery(sql,null);
    }

    public void updateData(String arabicWord ,String englishWord , String favourite , String lesson , int id){
        SQLiteDatabase database = getWritableDatabase();

        String sql = "UPDATE WORD SET arabicWord =? ,englishWord =? , favourite =? , lesson=? WHERE id=?";

        SQLiteStatement statement = database.compileStatement(sql);

        statement.bindString(1,arabicWord);
        statement.bindString(2,englishWord);
        statement.bindString(3,favourite);
        statement.bindString(4,lesson);
        statement.bindDouble(5 , id);
        statement.execute();
        database.close();
    }
}
