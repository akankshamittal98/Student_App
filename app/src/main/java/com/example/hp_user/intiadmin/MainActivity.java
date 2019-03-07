package com.example.hp_user.intiadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void student(View v)
    {
        Intent i=new Intent(this,tbStudent.class);
        startActivity(i);
    }
    public void course(View v)
    {
        Intent i=new Intent(this,tbCourse.class);
        startActivity(i);
    }
}
