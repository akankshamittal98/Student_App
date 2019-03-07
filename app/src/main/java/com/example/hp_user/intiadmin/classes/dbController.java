package com.example.hp_user.intiadmin.classes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class dbController implements dbInterface {
    SQLiteDatabase db;
    dbHandler handler;

    public dbController(Context c) {
        handler = new dbHandler(c, Dname, null, dversion);
    }

    public void open() {
        db = handler.getWritableDatabase();
    }

    public void close() {
        db.close();
    }

    public long insertData1(int id, String cname, String fees, String duration, String about) {
        open();
        ContentValues obj = new ContentValues();
        obj.put(c1, id);
        obj.put(c2, cname);
        obj.put(c3, fees);
        obj.put(c4, duration);
        obj.put(c5, about);
        long r = db.insert(t1Name, null, obj);
        close();
        return r;
    }

    public long insertData2(int rno, String fname, String lname, String email, String contact, String add) {
        open();
        ContentValues obj = new ContentValues();
        obj.put(ca, rno);
        obj.put(cb, fname);
        obj.put(cc, lname);
        obj.put(cd, email);
        obj.put(ce, contact);
        obj.put(cf, add);
        long r = db.insert(t2Name, null, obj);
        close();
        return r;
    }

    public ArrayList<csCourse> getData(String x) {
        ArrayList<csCourse> al = new ArrayList<>();
        String q = "select * from " + t1Name+" where  _id='"+x+"'";
        open();
        Cursor c = db.rawQuery(q, null);
        if (c.moveToFirst()) {
            do {
                csCourse obj1 = new csCourse();
                obj1.set_id(c.getString(0));
                obj1.setFee(c.getString(2));
                obj1.setCname(c.getString(1));
                obj1.setDuration(c.getString(3));
                obj1.setAbout(c.getString(4));
                al.add(obj1);
            }
            while (c.moveToNext());
        }
        return al;
    }
    public void updateData(String i,String f,String c,String d,String a)
    {
       open();
       String q="update " +t1Name+ " set " +c2+ "= ' "+f+ "'," +c3+ "= ' " +c+ "'," +c4+ "= ' " +d+ "' where _id='"+i+"'";
       db.execSQL(q);
    }
}
