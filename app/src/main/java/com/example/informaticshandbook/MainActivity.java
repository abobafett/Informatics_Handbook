package com.example.informaticshandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList listOfTitles;
    private RecyclerView titlesList;
    private TitlesAdapter titlesAdapter;
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        titlesList = findViewById(R.id.MainRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        titlesList.setLayoutManager(layoutManager);

        titlesList.setHasFixedSize(true);

        listOfTitles = new ArrayList();
        listOfTitles.add("Двоичная система счисления");
        listOfTitles.add("Восьмеричная система счисления");
        listOfTitles.add("Шестнадцатиричная система счисления");
        listOfTitles.add("Оформление сайта");
        listOfTitles.add("Содержание и структура сайта");
        listOfTitles.add("Размещение сайта в Интернете");
        listOfTitles.add("Графические изображения");
        listOfTitles.add("Таблицы");
        listOfTitles.add("Списки");
        listOfTitles.add("Тесты по темам");
        count = 10;

        titlesAdapter = new TitlesAdapter(count, listOfTitles, this);
        titlesList.setAdapter(titlesAdapter);
    }

}