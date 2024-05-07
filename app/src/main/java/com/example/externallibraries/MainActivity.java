package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView URLView = (ImageView) findViewById(R.id.URLPicture);

        Glide.with(this).load("https://i.pinimg.com/736x/e5/5e/0a/e55e0a30fe66a81b6d7adc1cd9df252e.jpg").into(URLView);

    }
}
