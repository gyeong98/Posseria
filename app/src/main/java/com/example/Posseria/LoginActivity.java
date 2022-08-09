package com.example.Posseria;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsControllerCompat;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //for changing status bar icon colors
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            Window window = getWindow();
            View decorView = window.getDecorView();

            WindowInsetsControllerCompat wic = new WindowInsetsControllerCompat(window, decorView);
            wic.setAppearanceLightStatusBars(true);
        }
        setContentView(R.layout.activity_login);
    }

    //public void onLoginClick(View view){
    //    startActivity(new Intent(this, RegisterActivity.class));
    //    overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    //}
}
