package com.example.privacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginpage extends AppCompatActivity {

    private boolean isDarkTheme = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage); // Set the initial layout to the light theme
        getWindow().setStatusBarColor(getResources().getColor(R.color.Dark1));

    }
}