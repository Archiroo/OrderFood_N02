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
        sqLiteDatabase.execSQL("CREATE TABLE tb_users(phoneNumber TEXT PRIMARY KEY, passWord TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS tb_users");
    }

    public Boolean insertData(String phoneNumber, String passWord){
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("phoneNumber",phoneNumber);
        contentValues.put("passWord",passWord);
        long result = myDB.insert("tb_users", null, contentValues);
        if(result==-1){
            return false;
        }else{
            return true;
        }
    }

    public Boolean checkUsername(String phoneNumber){
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cs = myDB.rawQuery("SELECT * From tb_users WHERE phoneNumber = ? ", new String[]{phoneNumber});
        if(cs.getCount()>0){
            return true;

        }else {
            return false;
        }
    }
    public Boolean checkUserNamePassword(String phoneNumber, String passWord){
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cs = myDB.rawQuery("SELECT * From tb_users WHERE phoneNumber = ? AND passWord = ? ", new String[]{phoneNumber,passWord});
        if(cs.getCount()>0){
            return true;

        }else {
            return false;
        }
    }
}
