package com.aliismayilov.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView creatorView = findViewById(R.id.imageView1);
        ImageView languageView= findViewById(R.id.imageView2);
        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);

        Singleton singleton = Singleton.getInstance();

        creatorView.setImageBitmap(singleton.getImage1());
        languageView.setImageBitmap(singleton.getImage2());

    }
}