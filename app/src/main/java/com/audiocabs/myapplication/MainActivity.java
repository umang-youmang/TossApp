package com.audiocabs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button toss;
    TextView myTextView;
    ImageView myImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toss=findViewById(R.id.toss);
        myTextView=findViewById(R.id.result);
        myImageView=findViewById(R.id.coin);


        toss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int res=random.nextInt(2);
                if(res==1)
                {
                    myTextView.setText("HEAD");
                    myImageView.setImageResource(R.drawable.heads);
                }

                else {
                    myTextView.setText("TAIL");
                    myImageView.setImageResource(R.drawable.tails);
                }

            }
        });
    }
}
