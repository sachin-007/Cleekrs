package com.example.privacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class viewYT extends AppCompatActivity {




    //    @SuppressLint("MissingInflatedId")
//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_yt);

        getWindow().setStatusBarColor(getResources().getColor(R.color.Dark1));


        VideoView videoView = findViewById(R.id.vidsomething);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.thisnew);

    }
}
