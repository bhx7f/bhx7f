package com.example.umpirebuddyv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Button ButtonReset;
    Button ButtonEnd;
    Button ButtonBalls;
    Button ButtonStrikes;

    TextView CountBalls;  
    TextView CountStrikes;
    



    int balls = 0;
    int strikes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountBalls = findViewById((R.id.CountBalls));
        ButtonBalls = findViewById((R.id.ButtonBalls));

        CountStrikes = findViewById((R.id.CountStrikes));
        ButtonStrikes = findViewById((R.id.ButtonStrikes));

        ButtonReset = findViewById((R.id.ButtonReset));
        ButtonEnd = findViewById((R.id.ButtonEnd));

        CountBalls.setText("0");
        CountStrikes.setText("0");

        ButtonBalls.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                balls = balls + 1;
                CountBalls.setText(String.valueOf((balls)));
            }
        });

        ButtonStrikes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strikes = strikes + 1;
                CountStrikes.setText(String.valueOf(strikes));
            }
        });

        ButtonReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                balls = 0;
                strikes = 0;
                CountStrikes.setText(String.valueOf(strikes));
                CountBalls.setText(String.valueOf(balls));
            }
        });

        ButtonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });




    }
}
