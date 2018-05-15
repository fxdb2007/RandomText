package com.example.wah211.randomtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btngen;
    TextView tvresult;
    String options[]={
            "The answer is unclear, try another fortune cookie.",
            "I wouldn't bet on it.",
            "I can't read minds.",
            "You should run now.",
            "I don't snore, I dream I am a harley.",
            "Please watch for motorcycles.",
            "My home button on my phone is broken, when I look around, I'm still at work.",
            "I may look like I am doing nothing, but in my head I'm quite busy.",
            "In my defense, I was left unsupervised."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btngen = (Button) findViewById(R.id.btngen);
        tvresult = (TextView)findViewById(R.id.tvresult);

        btngen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Random randGen = new Random();
                final int rands = randGen.nextInt(options.length);
                tvresult.setText(options[rands]);

            }
        });
    }
}
