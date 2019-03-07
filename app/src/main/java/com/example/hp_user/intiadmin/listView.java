package com.example.hp_user.intiadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.hp_user.intiadmin.classes.csAdapter;
import com.example.hp_user.intiadmin.classes.csCourse;
import com.example.hp_user.intiadmin.classes.dbController;

import java.util.ArrayList;

public class listView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        String x= getIntent().getStringExtra("data");
        ListView l1=(ListView)findViewById(R.id.l1);
        dbController obj=new dbController(this);
        ArrayList<csCourse> al=new ArrayList<>();
        al=obj.getData(x);
        csAdapter adp=new csAdapter(this,R.layout.rowlayout,al);
        l1.setAdapter(adp);
    }
}
