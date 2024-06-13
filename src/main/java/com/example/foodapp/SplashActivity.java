package com.example.foodapp;
import android.content.Intent;
import android.os.Handler;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

        private static int SPLASH_SCREEN_TIME_OUT=2000;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //This method is used so that your splash activity
            //can cover the entire screen.

            setContentView(R.layout.activity_splash);
            //this will bind your MainActivity.class file with activity_main.

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(SplashActivity.this, MainActivity.class);
                    //Intent is used to switch from one activity to another.

                    startActivity(intent);
                    //invoke the SecondActivity.

                    finish();
                    //the current activity will get finished.
                }
            }, SPLASH_SCREEN_TIME_OUT);
        }
    }


