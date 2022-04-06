package com.example.orderfood.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
    public static final String DBNAME = "OrderFoodN02.sqlite";
    public DBhelper(Context context){
        super(context, "OrderFoodN02.sqlite", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE users (username TEXT primary key, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop Table if exists users");
    }

    public Boolean insertData(String username, String password){
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        long result = myDB.insert("users", null, contentValues);
        if(result==-1){
            return false;
        }else{
            return true;
        }
    }

    public Boolean checkUsername(String username){
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cs = myDB.rawQuery("SELECT * From users WHERE username=? ", new String[]{username});
        if(cs.getCount()>0){
            return true;

        }else {
            return false;
        }
    }
    public Boolean checkUserNamePassword(String username, String password){
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cs = myDB.rawQuery("SELECT * From users WHERE username=? AND password = ? ", new String[]{username,password});
        if(cs.getCount()>0){
            return true;

        }else {
            return false;
        }
    }
}
