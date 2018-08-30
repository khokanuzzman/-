package com.example.khokan.datagelodataelo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AllProjectCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_project_layout);

        Button btn_calculator = findViewById(R.id.calculator_project);
        Button btn_listview = findViewById(R.id.list_view_project);
        Button btn_sms = findViewById(R.id.sms_project);
        Button btn_call = findViewById(R.id.phone_project);
        Button btn_mail = findViewById(R.id.mail_project);
        Button btn_music = findViewById(R.id.music_project);
        Button btn_passing = findViewById(R.id.passing_project);
        Button btn_splash = findViewById(R.id.splash_project);
        Button btn_webview = findViewById(R.id.web_project);


        btn_listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Search List View Code", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Search Call Action Code", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_passing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Search Passing Data Code!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Search Sending  Code", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Search  Mail Example Code", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Search Web View Code", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btn_splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Search Splash Screen Screen Code", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Sear Music play Code", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AllProjectCode.this,ShowProjectCode.class);
                Toast.makeText(AllProjectCode.this, "Search Calculator Code", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


    }
}
