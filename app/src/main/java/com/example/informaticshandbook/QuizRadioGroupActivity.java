package com.example.informaticshandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizRadioGroupActivity extends AppCompatActivity {

    int buttonCheckedId;
    int numberOfQuestion = 0;
    int rightAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_radio_group);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        getSupportActionBar().hide();

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView quesView = findViewById(R.id.quesView);
        TextView quesTextView = findViewById(R.id.quesTextView);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        RadioButton answer1Button = findViewById(R.id.answer_1_Button);
        RadioButton answer2Button = findViewById(R.id.answer_2_Button);
        RadioButton answer3Button = findViewById(R.id.answer_3_Button);
        RadioButton answer4Button = findViewById(R.id.answer_4_Button);

        Button answerButton = findViewById(R.id.answerButton);

        Intent intent = getIntent();

        int numberOfQuizTitle = (intent.getIntExtra("quizTitle", 0));

        switch (numberOfQuizTitle) {
            case 1:
                nameTextView.setText("Создание web-сайта");

                quesView.setText("Вопрос 1");

                quesTextView.setText("Услуга размещения сайта на сервере, постоянно находящемся в сети Интернет:");

                answer1Button.setText("хостинг");
                answer2Button.setText("моделинг");
                answer3Button.setText("адаптация");
                answer4Button.setText("проектирование");

                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        buttonCheckedId = checkedId;
                    }
                });

                answerButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switch (numberOfQuestion) {
                            case 0:
                                quesView.setText("Вопрос 2");

                                quesTextView.setText("Недостаток бесплатного хостинга:");

                                answer1Button.setText("авторское право");
                                answer2Button.setText("отсутствие вариантов размещения");
                                answer3Button.setText("комерческая реклама  от поставщиков услуг");
                                answer4Button.setText("доменное имя");
                                break;
                            case 1:
                                quesView.setText("Вопрос 3");

                                quesTextView.setText("Проектированием структуры web-сайта занимаются:");

                                answer1Button.setText("системные администраторы");
                                answer2Button.setText("web-дизайнер");
                                answer3Button.setText("web-программист");
                                answer4Button.setText("провайдер");
                                break;
                            case 2:
                                quesView.setText("Вопрос 4");

                                quesTextView.setText("Как называются переходы с одной страницы на другую?");

                                answer1Button.setText("страница");
                                answer2Button.setText("структура");
                                answer3Button.setText("обзор");
                                answer4Button.setText("навигация");
                                break;
                            case 3:
                                quesView.setText("Вопрос 5");

                                quesTextView.setText("Сайт можно создать, воспользовавшись:");

                                answer1Button.setText("языком разметки гипертекста HTML");
                                answer2Button.setText("языком программирования Паскаль");
                                answer3Button.setText("электронными таблицами");
                                answer4Button.setText("языком программирования Си");

                                answerButton.setText("Сдать тест");
                        }
                        switch (numberOfQuestion) {
                            case 0:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        radioGroup.clearCheck();
                                        break;
                                }
                                break;
                            case 1:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        radioGroup.clearCheck();
                                        break;
                                }
                                break;
                            case 2:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:

                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        radioGroup.clearCheck();
                                        break;
                                }
                                break;
                            case 3:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:

                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                }
                                break;
                            case 4:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        radioGroup.clearCheck();
                                        break;
                                }
                                Toast toast = Toast.makeText(getApplicationContext(), "Правильных ответов " + rightAnswers + "/5", Toast.LENGTH_LONG);
                                toast.show();
                                Intent intent = new Intent(QuizRadioGroupActivity.this, QuizListActivity.class);
                                startActivity(intent);
                                break;
                        }
                        numberOfQuestion++;
                    }
                });
                break;
            case 2:
                nameTextView.setText("Визуализация информации в текстовых документах");

                quesView.setText("Вопрос 1");

                quesTextView.setText("Нумерованный список следует использовать при:");

                answer1Button.setText("составлении алгоритма действий");
                answer2Button.setText("перечислении видов цветов на клумбе");
                answer3Button.setText("описании объектов в комнате");
                answer4Button.setText("перечислении оборудования в классе");

                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        buttonCheckedId = checkedId;
                    }
                });

                answerButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switch (numberOfQuestion) {
                            case 0:
                                quesView.setText("Вопрос 2");

                                quesTextView.setText("Маркированный список следует использовать при:");

                                answer1Button.setText("составлении алгоритма действий");
                                answer2Button.setText("перечислении видов цветов на клумбе");
                                answer3Button.setText("описании последовательности действий работы с прибором");
                                answer4Button.setText("описании любой последовательности");
                                break;
                            case 1:
                                quesView.setText("Вопрос 3");

                                quesTextView.setText("Какие символы используются для нумерации элементов списка?");

                                answer1Button.setText("Арабские и римские цифры");
                                answer2Button.setText("Русские буквы");
                                answer3Button.setText("Латинские буквы");
                                answer4Button.setText("Все перечисленные символы");
                                break;
                            case 2:
                                quesView.setText("Вопрос 4");

                                quesTextView.setText("Как называется список, элемент которого сам является списком?");

                                answer1Button.setText("составным");
                                answer2Button.setText("многоуровневым");
                                answer3Button.setText("многоступенчатым");
                                answer4Button.setText("одноуровневым");
                                break;
                            case 3:
                                quesView.setText("Вопрос 5");

                                quesTextView.setText("Что относится к графическим изображениям, применяемым в тексте?");

                                answer1Button.setText("Картинки и фотографии");
                                answer2Button.setText("Схемы");
                                answer3Button.setText("Диаграммы");
                                answer4Button.setText("Всё перечисленное");
                        }
                        switch (numberOfQuestion) {
                            case 0:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        radioGroup.clearCheck();
                                        break;
                                }
                                break;
                            case 1:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        radioGroup.clearCheck();
                                        break;
                                }
                                break;
                            case 2:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                }
                                break;
                            case 3:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        radioGroup.clearCheck();
                                        break;
                                }
                                break;
                            case 4:
                                switch (buttonCheckedId) {
                                    case R.id.answer_1_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_2_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_3_Button:
                                        radioGroup.clearCheck();
                                        break;
                                    case R.id.answer_4_Button:
                                        rightAnswers++;
                                        radioGroup.clearCheck();
                                        break;
                                }
                                Toast toast = Toast.makeText(getApplicationContext(), "Правильных ответов " + rightAnswers + "/5", Toast.LENGTH_LONG);
                                toast.show();
                                Intent intent = new Intent(QuizRadioGroupActivity.this, QuizListActivity.class);
                                startActivity(intent);
                                break;
                        }
                        numberOfQuestion++;
                    }
                });
                break;
        }


    }
}