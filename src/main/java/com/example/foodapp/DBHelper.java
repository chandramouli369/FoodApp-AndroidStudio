package com.example.foodapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    final static int DBVERSION = 1;
    final static String DBNAME = "mydatabase.db";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table orders" + "(id int primary key autoincrement," + "name text," +
                "phone text," + "price int," +
                "image int," + "description text," + "foodname text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(("DROP table if exists orders"));
        onCreate(sqLiteDatabase);
    }

    public boolean insertOrders(String name, String phone, int price, int image, String desc, String foodname) {
        SQLiteDatabase database = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("phone", phone);
        values.put("price", price);
        values.put("image", image);
        values.put("description", desc);
        values.put("foodname", name);
        long id = database.insert("orders", null, values);
        if (id <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
