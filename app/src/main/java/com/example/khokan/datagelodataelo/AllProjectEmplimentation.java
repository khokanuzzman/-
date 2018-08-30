package com.example.khokan.datagelodataelo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AllProjectEmplimentation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_project_layout);
        /*
        *
        * button define
        * */

        Button btn_calculator = findViewById(R.id.calculator_project);
        Button btn_listview = findViewById(R.id.list_view_project);
        Button btn_sms = findViewById(R.id.sms_project);
        Button btn_call = findViewById(R.id.phone_project);
        Button btn_mail = findViewById(R.id.mail_project);
        Button btn_music = findViewById(R.id.music_project);
        Button btn_passing = findViewById(R.id.passing_project);
        Button btn_splash = findViewById(R.id.splash_project);
        Button btn_webview = findViewById(R.id.web_project);

        /*
        * Button Action
        *
        *
        * */

        btn_listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectEmplimentation.this,SdmgapMain.class);
                Toast.makeText(AllProjectEmplimentation.this, "Welcome to example of List View", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectEmplimentation.this,CallAction.class);
                Toast.makeText(AllProjectEmplimentation.this, "Welcome to example of Call Action", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        
        btn_passing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectEmplimentation.this,FormActivity.class);
                Toast.makeText(AllProjectEmplimentation.this, "Welcome to Passing Data example to activity!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectEmplimentation.this,SmsAction.class);
                Toast.makeText(AllProjectEmplimentation.this, "Welcome to Sending  Sms Example", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectEmplimentation.this,SendingMailAction.class);
                Toast.makeText(AllProjectEmplimentation.this, "Welcome to Sending  Mail Example", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectEmplimentation.this,JavaBasicBook.class);
                Toast.makeText(AllProjectEmplimentation.this, "Welcome to Web View Example", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btn_splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AllProjectEmplimentation.this,WelcomePage.class);
                Toast.makeText(AllProjectEmplimentation.this, "Welcome to Splash Screen Screen Example", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AllProjectEmplimentation.this,PlayMusic.class);
                Toast.makeText(AllProjectEmplimentation.this, "Lets Play Music !", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AllProjectEmplimentation.this,CalculatorAction.class);
                Toast.makeText(AllProjectEmplimentation.this, "Welcome to Calculator", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}
