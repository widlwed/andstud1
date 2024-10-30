package com.example.andstud1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Получаем переданный параметр
        String surname = getIntent().getStringExtra("SURNAME");

        // Находим TextView и устанавливаем текст
        TextView surnameTextView = findViewById(R.id.textView);
        surnameTextView.setText("Переданный параметр: " + surname);
    }
}
