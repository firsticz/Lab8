package com.example.first.vocabularyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class workActivity extends AppCompatActivity {

    private QuestionLibraryWork mQuestionLibraryWork = new QuestionLibraryWork();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);


        mScoreView = (TextView)findViewById(R.id.txtscore2);
        mQuestionView = (TextView)findViewById(R.id.txtquest);
        mButtonChoice1 = (Button)findViewById(R.id.pic1);
        mButtonChoice2 = (Button)findViewById(R.id.pic2);
        mButtonChoice3 = (Button)findViewById(R.id.pic3);
        mButtonChoice4 = (Button)findViewById(R.id.pic4);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(workActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(workActivity.this, "wrong", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(workActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(workActivity.this, "wrong", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(workActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(workActivity.this, "wrong", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(workActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(workActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


    }

    private void updateQuestion(){
        if(mQuestionNumber >= 5){
            Intent intent = new Intent(workActivity.this, Main3Activity.class);
            Intent intents = getIntent();
            String name = intents.getStringExtra("name");
            intent.putExtra("name", name+"");
            intent.putExtra("score", mScore+"" );
            startActivity(intent);
        }
        else{
            mQuestionView.setText(mQuestionLibraryWork.getQuestion(mQuestionNumber));
            if(mQuestionNumber == 0){
                mButtonChoice1.setBackgroundResource(R.drawable.pone);
                mButtonChoice2.setBackgroundResource(R.drawable.ptwo);
                mButtonChoice3.setBackgroundResource(R.drawable.pthee);
                mButtonChoice4.setBackgroundResource(R.drawable.pfour);
            }
            else if(mQuestionNumber == 1){
                mButtonChoice1.setBackgroundResource(R.drawable.pfive);
                mButtonChoice2.setBackgroundResource(R.drawable.pone);
                mButtonChoice3.setBackgroundResource(R.drawable.pthee);
                mButtonChoice4.setBackgroundResource(R.drawable.pfour);
            }
            else if(mQuestionNumber == 2){
                mButtonChoice1.setBackgroundResource(R.drawable.pone);
                mButtonChoice2.setBackgroundResource(R.drawable.ptwo);
                mButtonChoice3.setBackgroundResource(R.drawable.pthee);
                mButtonChoice4.setBackgroundResource(R.drawable.pfour);
            }
            else if(mQuestionNumber == 3){
                mButtonChoice1.setBackgroundResource(R.drawable.pilot);
                mButtonChoice2.setBackgroundResource(R.drawable.ptwo);
                mButtonChoice3.setBackgroundResource(R.drawable.pfive);
                mButtonChoice4.setBackgroundResource(R.drawable.pfour);
            }
            else if(mQuestionNumber == 4){
                mButtonChoice1.setBackgroundResource(R.drawable.pone);
                mButtonChoice2.setBackgroundResource(R.drawable.ptwo);
                mButtonChoice3.setBackgroundResource(R.drawable.pthee);
                mButtonChoice4.setBackgroundResource(R.drawable.fire);
            }


            mButtonChoice1.setText(mQuestionLibraryWork.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibraryWork.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibraryWork.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibraryWork.getChoice4(mQuestionNumber));

            mAnswer = mQuestionLibraryWork.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }

    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}
