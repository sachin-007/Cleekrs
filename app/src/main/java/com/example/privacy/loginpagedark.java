package com.example.privacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginpagedark extends AppCompatActivity {
    private boolean isDarkTheme = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpagedark);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Dark1));

    }
}