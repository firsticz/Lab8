package com.example.first.vocabularyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button btnfruit,btnjob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnfruit = (Button)findViewById(R.id.btnfruit);

        btnjob = (Button)findViewById(R.id.btnjob);

        btnfruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, fruitActivity.class);
                Intent intents = getIntent();
                String name = intents.getStringExtra("name");
                intent.putExtra("name", name+"");
                startActivity(intent);
            }
        });

        btnjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, workActivity.class);
                Intent intents = getIntent();
                String name = intents.getStringExtra("name");
                intent.putExtra("name", name+"");
                startActivity(intent);
            }
        });
    }

}
