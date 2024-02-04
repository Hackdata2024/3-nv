package com.example.nammavivasayi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;


public class Splash extends AppCompatActivity {

        ProgressBar splashProgress;
        int SPLASH_TIME = 3000;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashProgress = findViewById(R.id.splashProgress);
        playProgress();

        //Code to start timer and take action after the timer ends
        new Handler(getMainLooper()).postDelayed(new Runnable() {
@Override
public void run() {

        Intent i = new Intent(Splash.this, LoginActivity.class);
        startActivity(i);

        //This 'finish()' is for exiting the app when back button pressed from Home page which is ActivityHome
        finish();

        }
        }, SPLASH_TIME);
        }


private void playProgress() {
        ObjectAnimator.ofInt(splashProgress, "progress", 100)
        .setDuration(3000)
        .start();
        }
        }