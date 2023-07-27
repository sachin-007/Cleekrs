package com.example.privacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SearchView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Dark1));

    }
}