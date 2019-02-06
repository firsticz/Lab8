package com.example.first.vocabularyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtname;
    Button enter;
    int sums=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname = (EditText)findViewById(R.id.txtname);
        enter = (Button) findViewById(R.id.btnenter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtname.length() == 0 || txtname.equals("") || txtname == null){
                    Toast.makeText(MainActivity.this,"กรุณากรอกข้อมูล",Toast.LENGTH_LONG).show();
                }
                else {
                    openpagetwo();
                }
            }
        });


    }

    public void openpagetwo(){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("name", txtname.getText().toString()+"");
        startActivity(intent);
    }
}
