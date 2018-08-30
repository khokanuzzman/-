package com.example.khokan.datagelodataelo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        ImageView slideImg = findViewById(R.id.img_animation);
        TextView slide_title = findViewById(R.id.splash_title);
        LinearLayout credit_section = findViewById(R.id.credit_section);
        TextView letsgo = findViewById(R.id.lets_go);



        slideImg.animate().translationY((20f)).setDuration(2000);
        credit_section.animate().translationX((-20f)).setDuration(3000);
        letsgo.animate().translationY(-15f).alpha(1f).setDuration(4000).scaleY(1f).setDuration(4000).scaleX(1f).setDuration(4000).rotationX(360f).setDuration(4000).rotationYBy(16200f).setDuration(4000);



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WelcomePage.this,MainActivity.class));
                finish();
            }
            },5000);
    }

}
