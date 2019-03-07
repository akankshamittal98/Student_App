package com.example.hp_user.intiadmin.classes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class dbHandler extends SQLiteOpenHelper implements dbInterface {
    public dbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context,name,null,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            db.execSQL(t1create);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        try{
            db.execSQL(t2create);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
