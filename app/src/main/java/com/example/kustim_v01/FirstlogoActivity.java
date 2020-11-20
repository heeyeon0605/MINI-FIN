package com.example.kustim_v01;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class FirstlogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlogo_activity);


        final Handler mHandler = new Handler();


        mHandler.postDelayed(new Runnable() {
            public void run() {
                // 시간 지난 후 실행할 코딩
                Intent intent = new Intent(FirstlogoActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        }, 1500);
    }
}