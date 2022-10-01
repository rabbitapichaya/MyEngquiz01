package com.example.myengquiz01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView score;
    private Button done;
    private  TextView wooHoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


        score = findViewById(R.id.sa_score);
        done = findViewById(R.id.sa_done);
        wooHoo = findViewById(R.id.wooHoo);

        Typeface typeface = ResourcesCompat.getFont(this,R.font.blacklist);
        wooHoo.setTypeface(typeface);

        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanim);
        wooHoo.setAnimation(anim);

        String score_str = getIntent().getStringExtra("SCORE");

        score.setText(score_str);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ScoreActivity.this,CategoryActivity.class);
                ScoreActivity.this.startActivity(intent);
                ScoreActivity.this.finish();


            }
        });

    }
}
