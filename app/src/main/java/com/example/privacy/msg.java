package com.example.privacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;

public class msg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Dark1));

        ImageView avatarImage = findViewById(R.id.avatar_image);
        Bitmap originalImage = BitmapFactory.decodeResource(getResources(), R.drawable.original_image1);
        setCircularImage(avatarImage, originalImage);

        ImageView avatarImagess = findViewById(R.id.avatar_imagess);
        Bitmap originalImagess = BitmapFactory.decodeResource(getResources(), R.drawable.original_image1);
        setCircularImage(avatarImagess, originalImagess);

    }
    private void setCircularImage(ImageView imageView, Bitmap bitmap) {
        Bitmap circleBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(shader);

        Canvas canvas = new Canvas(circleBitmap);
        canvas.drawOval(0, 0, bitmap.getWidth(), bitmap.getHeight(), paint);

        imageView.setImageBitmap(circleBitmap);
    }
}