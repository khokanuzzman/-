package com.example.khokan.datagelodataelo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class FormActivity extends AppCompatActivity{
Button submit, cancel,image_btn;
EditText name,father,mother,age,phone;
RadioGroup rdgrp;
TextView name_title,father_name,mother_name,age_title;
private static final int REQUEST_CODE=1;
ImageView proImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        name_title=findViewById(R.id.name_title);
        father_name=findViewById(R.id.father_title);
        mother_name=findViewById(R.id.mother_title);
        age_title=findViewById(R.id.age_title);

        submit = findViewById(R.id.submit);
        cancel = findViewById(R.id.cancel);
        name = findViewById(R.id.edttxt1);
        father = findViewById(R.id.edttxt2);
        mother = findViewById(R.id.edttxt3);
        age= findViewById(R.id.edttxt4);
        rdgrp = findViewById(R.id.rdgroup);
        phone = findViewById(R.id.edttxt5);


//        if (name.isCursorVisible()){
//            name_title.setTextColor(0xFFF06D2F);
//        } if (father.isCursorVisible()){
//            father_name.setTextColor(0xFFF06D2F);
//        } if (mother.isSelected()){
//            mother_name.setTextColor(0xFFF06D2F);
//        } if (age.isSelected()){
//            age_title.setTextColor(0xFFF06D2F);
//        }

        // For Image upload

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(FormActivity.this,AllProjectEmplimentation.class);
                Toast.makeText(FormActivity.this, "Resgistration Canceled !..", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

//        for image upload
//        image_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent =new Intent();
//                intent.setType("image/*");
//                intent.setAction(Intent.ACTION_GET_CONTENT);
//                startActivityForResult(Intent.createChooser(intent, "Select Picture"),REQUEST_CODE);
//
//            }
//        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getname = name.getText().toString();
                String getfather = father.getText().toString();
                String getmother = mother.getText().toString();
                String getage = age.getText().toString();
                String getphone= phone.getText().toString();
                int genderId = rdgrp.getCheckedRadioButtonId();


//                input fields validation
                if (getname.isEmpty()||getfather.isEmpty()||getmother.isEmpty()|| getage.isEmpty()|| getphone.isEmpty()|| genderId==-1 ){
                    if (getname.isEmpty()) {
                        name.setError("Plese insert a Name!!");
                    }
                    if(getfather.isEmpty()){
                        father.setError("Please insert Father Name!!");
                    }
                    if(getmother.isEmpty()){
                        mother.setError("Please insert Mother Name!!");
                    }
                    if(getage.isEmpty()){
                        if (getage.trim().isEmpty()){
                            age.setError("Please set a integer value!");
                        }
                    }
                    if(getphone.isEmpty()){
                        age.setError("Enter Valid phone Number!");
                    }
                    if(genderId == -1){
                        Toast.makeText(FormActivity.this, "Select a Gender Please!!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Intent i= new Intent(FormActivity.this,RecvDataActivity.class);
                    i.putExtra("name",getname);
                    i.putExtra("father",getfather);
                    i.putExtra("mother",getmother);
                    i.putExtra("age",getage);
                    i.putExtra("phone",getphone);

                    switch (genderId){
                        case R.id.male:
                            i.putExtra("gender","Male");
                            break;
                        case R.id.female:
                            i.putExtra("gender","Female");
                            break;
                        case R.id.other:
                            i.putExtra("gender","Other");
                    }
                    startActivity(i);
                }

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_CODE && resultCode == REQUEST_CODE && data!=null && data.getData() !=null) {
            Uri uri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                 Log.d("bitmap: ", String.valueOf(bitmap));
                  proImage.setImageBitmap(bitmap);
                Intent intent = new Intent(FormActivity.this,RecvDataActivity.class);
//                Uri selectedImageUri = data.getData();
//                proImage.setImageURI(selectedImageUri);


            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }




}
