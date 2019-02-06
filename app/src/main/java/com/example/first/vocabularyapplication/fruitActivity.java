package com.example.first.vocabularyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class fruitActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    ImageView pics;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        mScoreView = (TextView)findViewById(R.id.txtscore);
        mQuestionView = (TextView)findViewById(R.id.txtquestion);
        mButtonChoice1 = (Button)findViewById(R.id.btna);
        mButtonChoice2 = (Button)findViewById(R.id.btnb);
        mButtonChoice3 = (Button)findViewById(R.id.btnc);
        mButtonChoice4 = (Button)findViewById(R.id.btnd);
        pics = (ImageView)findViewById(R.id.pic);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(fruitActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(fruitActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(fruitActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(fruitActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(fruitActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(fruitActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice4.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(fruitActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(fruitActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


    }

    private void updateQuestion(){
        if(mQuestionNumber >= 5){
            Intent intent = new Intent(fruitActivity.this, Main3Activity.class);
            Intent intents = getIntent();
            String name = intents.getStringExtra("name");
            intent.putExtra("name", name+"");
            intent.putExtra("score", mScore+"" );
            startActivity(intent);
        }
        else{
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            if(mQuestionNumber == 0){
                pics.setImageResource(R.drawable.blue);
            }
            else if(mQuestionNumber == 1){
                pics.setImageResource(R.drawable.coco);
            }
            else if(mQuestionNumber == 2){
                pics.setImageResource(R.drawable.pine);
            }
            else if(mQuestionNumber == 3){
                pics.setImageResource(R.drawable.mango);
            }
            else if(mQuestionNumber == 4){
                pics.setImageResource(R.drawable.can);
            }


            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }

    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}
