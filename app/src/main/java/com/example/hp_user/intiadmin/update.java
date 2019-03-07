package com.example.hp_user.intiadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hp_user.intiadmin.classes.dbController;

public class update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
    }
    public void update(View v)
    {
        EditText e1=(EditText)findViewById(R.id.t1);
        EditText e2=(EditText)findViewById(R.id.t2);
        EditText e3=(EditText)findViewById(R.id.t3);
        EditText e4=(EditText)findViewById(R.id.t4);
        EditText e5=(EditText)findViewById(R.id.t5);
        String i=e1.getText().toString();
        String f=e2.getText().toString();
        String c=e3.getText().toString();
        String d=e4.getText().toString();
        String a=e5.getText().toString();
        dbController obj1=new dbController(this);
        obj1.updateData(i,f,c,d,a);
    }
}
