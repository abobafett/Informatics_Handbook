package com.example.informaticshandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import java.util.ArrayList;

public class QuizListActivity extends AppCompatActivity {

    private QuizTitlesAdapter quizTitlesAdapter;
    private RecyclerView quizTitleList;
    public ArrayList listOfQuizTitles;
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_list);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        getSupportActionBar().hide();

        quizTitleList = findViewById(R.id.QuizListRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        quizTitleList.setLayoutManager(layoutManager);
        quizTitleList.setHasFixedSize(true);

        listOfQuizTitles = new ArrayList();
        listOfQuizTitles.add("Системы счисления");
        listOfQuizTitles.add("Создание web-сайта");
        listOfQuizTitles.add("Визуализация информации в текстовых документах");
        //listOfQuizTitles.add("Quiz test title 4");
        //listOfQuizTitles.add("Quiz test title 5");
        count = 3;

        quizTitlesAdapter = new QuizTitlesAdapter(count, listOfQuizTitles, this);
        quizTitleList.setAdapter(quizTitlesAdapter);

    }
}