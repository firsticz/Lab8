package com.example.first.vocabularyapplication;

public class QuestionLibrary {
    private String mQuestions[] = {
            "1. รูปนี้ตรงกับคำตอบในข้อใด",
            "2. รูปนี้ตรงกับคำตอบในข้อใด",
            "3. รูปนี้ตรงกับคำตอบในข้อใด",
            "4. รูปนี้ตรงกับคำตอบในข้อใด",
            "5. รูปนี้ตรงกับคำตอบในข้อใด"
    };



    private String mChoices[][] = {
            {"blueberry","coconut","Pineapple","banana"},
            {"blueberry","Coconut","Pineapple","mangos teen"},
            {"guava","Cantaloupe","mangos teen","Pineapple"},
            {"bluebarry","mangos teen","Pineapple","Cantaloupe"},
            {"bluebarry","Cantaloupe","apple","guava"}
    };

    private String mCorrectAnswers[] = {"blueberry", "Coconut", "Pineapple", "mangos teen", "Cantaloupe"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
