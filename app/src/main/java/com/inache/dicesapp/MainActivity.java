package com.inache.dicesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = findViewById(R.id.rollButton);
        ImageView image_left_dice = findViewById(R.id.image_left_dice);
        ImageView image_right_dice = findViewById(R.id.image_right_dice);


    }
}
