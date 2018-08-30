package com.example.khokan.datagelodataelo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Button course_outlines,java_book_eng,sdmgap,all_project_code,code_emplimentation,bangla_java_book,about_us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course_outlines=findViewById(R.id.outlines);
        java_book_eng=findViewById(R.id.java_eng);
        bangla_java_book=findViewById(R.id.basic_Javabangla_Id);
        sdmgap=findViewById(R.id.sdmgapId);
        code_emplimentation=findViewById(R.id.emplimentationId);
        all_project_code=findViewById(R.id.all_proj_code_Id);
        about_us=findViewById(R.id.about_usId);
        /*
        *   Button action create
        * ==================================
        * ==================================
        * */

        course_outlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,OutLines.class);
                Toast.makeText(MainActivity.this, "Welcome to Course OutLine!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        java_book_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,JavaBasicBook.class);
                Toast.makeText(MainActivity.this, "Welcome to Java Basic English Book!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        bangla_java_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,JavaBasicBookBangla.class);
                Toast.makeText(MainActivity.this, "Welcome to Basic Java Bangla Book!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


        sdmgap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,SdmgapMain.class);
                Toast.makeText(MainActivity.this, "Welcome to SDMGAP Member List!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


        code_emplimentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AllProjectEmplimentation.class);
                Toast.makeText(MainActivity.this, "Welcome to Code Emplimentation!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        all_project_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AllProjectCode.class);
                startActivity(intent);
            }
        });

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AboutUs.class);
                Toast.makeText(MainActivity.this, "Learn About Us", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.my_abb_bar,menu);
        return true;
    }
    
//    action for menu item 

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        
        switch (item.getItemId()){
            
            case R.id.share:
                Toast.makeText(this, "Go to Share Method to do share!", Toast.LENGTH_SHORT).show();
            case R.id.setting:
                Toast.makeText(this, "Go to Setting....", Toast.LENGTH_SHORT).show();
                break;
            case R.id.aboutUs:

                startActivity(new Intent(MainActivity.this,AboutUs.class));
                Toast.makeText(this, "Go to About us", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
