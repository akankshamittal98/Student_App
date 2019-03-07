package com.example.hp_user.intiadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }
    public void inp(View v)
    {
        EditText e1=(EditText)findViewById(R.id.i1);
        String d=e1.getText().toString();
        Intent i=new Intent(this,listView.class);
        i.putExtra("data",d);
        startActivity(i);
    }
}
