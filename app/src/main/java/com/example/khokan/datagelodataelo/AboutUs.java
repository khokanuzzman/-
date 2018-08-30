package com.example.khokan.datagelodataelo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        ImageView about_us_ico=findViewById(R.id.about_us_icon);
        about_us_ico.animate().setDuration(1000).alpha(1f).setDuration(2000).scaleY(1f).setDuration(3000).scaleX(1f).setDuration(4000).rotationX(360f).setDuration(5000).rotationYBy(16200f).setDuration(80000);
    }
}
