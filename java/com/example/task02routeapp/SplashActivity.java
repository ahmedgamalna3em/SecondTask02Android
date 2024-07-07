package com.example.task02routeapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.logging.Handler;

public class SplashActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //startFirstActivity();
//        new Handler()
//        .postDelayed(new Runnable(){
//                    @Override
//                    public void run(){
//                        startActivity();
//                    }
//
//        },2000);

        ImageView btnAndroid = findViewById(R.id.main_background_image);
        btnAndroid.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(SplashActivity.this, FirstActivity.class);
            startActivity(intent);
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LifeCycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifeCycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifeCycle", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LifeCycle", "onDestroy");
    }

    /*Button android_button = findViewById(R.id.android_button);
    android_button.setonClickListener = new View.onClickListener(){

    @Override
    public void onClick(View v){
        //Intent intent = ;
        startActivity(new Intent(SplashActivity.this,TargetActivity.class));
    }
*/

    // المشكلة ان الكود ده موجود داخل الكلاس لكن مش داخل اي دالة
    // هو مكانه عادة بيكون في ال oncreate






    /*
    public void startFirstActivity() {
        Intent intent = new Intent(this,FirstActivity.class);
        startFirstActivity();
    }*/


}