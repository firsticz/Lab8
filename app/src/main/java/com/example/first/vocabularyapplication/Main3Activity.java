package com.example.first.vocabularyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView txtname;
    Button btnscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        txtname = (TextView) findViewById(R.id.txtfinalname);
        btnscore = (Button)findViewById(R.id.btnf);
        Intent intents = getIntent();
        String name = intents.getStringExtra("name");
        String score = intents.getStringExtra("score");
        txtname.setText(name+"");
        btnscore.setText(score+"");
    }
}
