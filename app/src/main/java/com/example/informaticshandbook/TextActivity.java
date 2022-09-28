package com.example.informaticshandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TextActivity extends AppCompatActivity {

    InputStream inputStream;
    int text;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        getSupportActionBar().hide();

        Intent intent = getIntent();

        TextView textView = findViewById(R.id.textView);

        int materialOfTitle = (intent.getIntExtra("title", 0));

        switch (materialOfTitle) {
            case 0:
                inputStream = (getResources().openRawResource(R.raw.dvoichnaya_sistema));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());
                break;
            case 1:
                inputStream = (getResources().openRawResource(R.raw.vosmirichnaya_sistema));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());
                break;
            case 2:
                inputStream = (getResources().openRawResource(R.raw.shestnadcatirichnaya_sistema));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());
                break;
            case 3:
                inputStream = (getResources().openRawResource(R.raw.oformlenie_saita));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());
                break;
            case 4:
                inputStream = (getResources().openRawResource(R.raw.soderzhanie_i_structura_saita));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());
                break;
            case 5:
                inputStream = (getResources().openRawResource(R.raw.razhmeshenie_saita_v_internete));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());
                break;
            case 6:
                inputStream = (getResources().openRawResource(R.raw.graficheskie_izobrazheniya));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());
                break;
            case 7:
                inputStream = (getResources().openRawResource(R.raw.tablici));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());

                break;
            case 8:
                inputStream = (getResources().openRawResource(R.raw.spiski));
                try {
                    while (text != -1) {
                        byteArrayOutputStream.write(text);
                        text = inputStream.read();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText(byteArrayOutputStream.toString());
                break;
        }

    }

    public String readDate(String fileName) {

        try {
            FileInputStream fin = openFileInput(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fin));

            String line = "";

            while ((line = reader.readLine()) != null) {
                return line;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}