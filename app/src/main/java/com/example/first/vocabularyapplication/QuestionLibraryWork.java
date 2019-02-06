package com.example.first.vocabularyapplication;

public class QuestionLibraryWork {
    private String mQuestions[] = {
            "1. จงทายภาพจากคำดังต่อไปนี้ Clown คืออาชีพในข้อใด",
            "2. จงทายภาพจากคำดังต่อไปนี้ cook คืออาชีพในข้อใด",
            "3. จงทายภาพจากคำดังต่อไปนี้ singer คืออาชีพในข้อใด",
            "4. จงทายภาพจากคำดังต่อไปนี้ pilot คืออาชีพในข้อใด",
            "5. จงทายภาพจากคำดังต่อไปนี้ fireman คืออาชีพในข้อใด"
    };




    private String mChoices[][] = {
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"}
    };

    private String mCorrectAnswers[] = {"b", "a", "c", "a", "d"};

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
