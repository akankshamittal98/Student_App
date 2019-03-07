package com.example.hp_user.intiadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp_user.intiadmin.classes.dbController;

public class tbCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tb_course);
        Intent i=getIntent();
    }
    public void test(View v)
    {
        EditText e1=(EditText)findViewById(R.id.t1);
        EditText e2=(EditText)findViewById(R.id.t2);
        EditText e3=(EditText)findViewById(R.id.t3);
        EditText e4=(EditText)findViewById(R.id.t4);
        EditText e5=(EditText)findViewById(R.id.t5);
        int i;
        String f,l,e,c,a;
        i=Integer.parseInt(e1.getText().toString());
        f=e2.getText().toString();
        l=e3.getText().toString();
        e=e4.getText().toString();
        c=e5.getText().toString();
        dbController obj1=new dbController(this);
        long r;
        r=obj1.insertData1(i,f,l,e,c);
        if(r==-1)
        {
            TextView t=(TextView)findViewById(R.id.s1);
            t.setText("not done");
        }
        else
        {
            TextView t=(TextView)findViewById(R.id.s1);
            t.setText("done");
        }


    }
}
