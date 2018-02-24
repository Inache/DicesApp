package com.inache.dicesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = findViewById(R.id.rollButton);
        final ImageView image_left_dice = findViewById(R.id.image_left_dice);
        ImageView image_right_dice = findViewById(R.id.image_right_dice);

        //array final dice array cant change if its final.
        final int[] diceArray = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DiceApp", "The button has been pressed");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("DiceApp","The random number is "+ number);

                // connecting array with random

                image_left_dice.setImageResource(diceArray[number]);

            }
        });


    }
}
