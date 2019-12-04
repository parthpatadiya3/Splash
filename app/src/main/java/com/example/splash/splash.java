package com.example.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.logging.Handler;

public class splash extends Activity {


    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread thread = new Thread(){
            public void run(){
                    try {
                        sleep(3000);

                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            };
            thread.start();

        }


    }


