
package com.example.informaticshandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class QuizActivity extends AppCompatActivity {

    String answer;
    int numberOfQuestion = 1;
    int rightAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        getSupportActionBar().hide();

        TextView themeTextView = findViewById(R.id.themeTextView);
        TextView quizTagView = findViewById(R.id.quizTagView);
        TextView questionTextView = findViewById(R.id.questionTextView);

        TextInputEditText answerEditText = findViewById(R.id.answerEditText);
        TextInputLayout filledTextField = findViewById(R.id.filledTextField);

        Button nextQuesButton = findViewById(R.id.nextQuesButton);

        Intent intent = getIntent();

        int numberOfQuizTitle = (intent.getIntExtra("quizTitle", 0));

        switch (numberOfQuizTitle) {
            case 0:
                themeTextView.setText("Системы счисления");
                filledTextField.setHint("Введите ответ");
                quizTagView.setText("Вопрос 1");
                questionTextView.setText("Сколько цифр 1 в двоичном представлении десятичного числа 15?");
                nextQuesButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        switch (numberOfQuestion) {
                            case 1:
                                answer = String.valueOf(answerEditText.getText());
                                switch (answer) {
                                    case "4":
                                        rightAnswers++;
                                        break;
                                    case "четыре":
                                        rightAnswers++;
                                        break;
                                    case "Четыре":
                                        rightAnswers++;
                                        break;
                                }
                                answerEditText.setText("");
                                quizTagView.setText("Вопрос 2");
                                questionTextView.setText("В классе 1100102% девочек и 10102 мальчиков. Сколько учеников в классе?");
                                break;
                            case 2:
                                answer = String.valueOf(answerEditText.getText());
                                if (answer.equals("20")) {
                                    rightAnswers++;
                                }
                                answerEditText.setText("");
                                quizTagView.setText("Вопрос 3");
                                questionTextView.setText("Как записывается двоичное число 100110 в десятичной системе счисления");
                                break;
                            case 3:
                                answer = String.valueOf(answerEditText.getText());
                                if (answer.equals("38")) {
                                    rightAnswers++;
                                }
                                answerEditText.setText("");
                                quizTagView.setText("Вопрос 4");
                                questionTextView.setText("В каких системах счисения число 301011 может существовать? " +
                                        "В ответ написать основания по возрастанию без разделительных знаков.");
                                break;
                            case 4:
                                answer = String.valueOf(answerEditText.getText());
                                if (answer.equals("48")) {
                                    rightAnswers++;
                                }
                                nextQuesButton.setText("Сдать тест");
                                answerEditText.setText("");
                                quizTagView.setText("Вопрос 5");
                                questionTextView.setText("Как число CDXIV будет записано в десятичной системе счисления?");
                                break;
                            case 5:
                                answer = String.valueOf(answerEditText.getText());
                                if (answer.equals("414")) {
                                    rightAnswers++;
                                }
                                Toast toast = Toast.makeText(getApplicationContext(), "Правильных ответов " + rightAnswers + "/5", Toast.LENGTH_LONG);
                                toast.show();
                                Intent intent = new Intent(QuizActivity.this, QuizListActivity.class);
                                startActivity(intent);
                        }
                        numberOfQuestion++;
                    }
                });
                break;
        }
    }
}
