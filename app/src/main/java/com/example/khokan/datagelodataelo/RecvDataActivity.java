package com.example.khokan.datagelodataelo;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class RecvDataActivity extends AppCompatActivity {
    Button btn_done, call_me, smsme,upload_image,mail,edit_profile;
    TextView uname, ufather, umother, uage, ugender, userName, uphoneNumber;
    ImageView uimage,profile_pic;
    private static final int REQUEST_CALL = 1;
    private static int RESULT_LOAD_IMAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recv_data);

//        button id find
        btn_done = findViewById(R.id.done);
        call_me = findViewById(R.id.callme);
        smsme = findViewById(R.id.sendmeSms);
        mail=findViewById(R.id.senMail);
        edit_profile=findViewById(R.id.edit_profile);


        uname = findViewById(R.id.rname);
        ufather = findViewById(R.id.rfather);
        umother = findViewById(R.id.rmother);
        uage = findViewById(R.id.rage);
        ugender = findViewById(R.id.rgender);
        uimage = findViewById(R.id.profile_image);
        userName = findViewById(R.id.userName);
        uphoneNumber = findViewById(R.id.rphone);
        profile_pic=findViewById(R.id.profile_image);


        userName.setText(getIntent().getStringExtra("name"));
        uname.setText(getIntent().getStringExtra("name"));
        ufather.setText(getIntent().getStringExtra("father"));
        umother.setText(getIntent().getStringExtra("mother"));
        uage.setText(getIntent().getStringExtra("age"));
        ugender.setText(getIntent().getStringExtra("gender"));
        uphoneNumber.setText(getIntent().getStringExtra("phone"));
        final String myimage = getIntent().getStringExtra("gender");

        if (myimage.toLowerCase().equals("male")) {
            uimage.setImageResource(R.drawable.malepic);
        } else {
            uimage.setImageResource(R.drawable.female);
        }


        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RecvDataActivity.this, "Registration completed", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RecvDataActivity.this, AllProjectEmplimentation.class);
                startActivity(intent);
            }
        });

// call function

        call_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        smsme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RecvDataActivity.this, "sending sms", Toast.LENGTH_SHORT).show();
            }
        });


    /*================================================================================================================================================
            For profile Button
            1.Upload Button
            2.Delete Button
            3.Edit Button
    * ================================================================================================================================================*/

        Button delete,edit;
        upload_image=findViewById(R.id.upload);
        delete=findViewById(R.id.delete_image);


        upload_image.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent i = new Intent(Intent.ACTION_GET_CONTENT, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                                          startActivityForResult(i, RESULT_LOAD_IMAGE);
                                      }
       });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myimage.toLowerCase().equals("male")) {
                    uimage.setImageResource(R.drawable.malepic);
                } else {
                    uimage.setImageResource(R.drawable.female);
                }
                upload_image.setText("Upload");
                upload_image.setBackgroundResource(R.drawable.button_selected);
            }
        });

        smsme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(RecvDataActivity.this, SmsAction.class);
                Toast.makeText(RecvDataActivity.this, "Please Enter a phone number,sms body to send sms!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(RecvDataActivity.this,SendingMailAction.class);
                Toast.makeText(RecvDataActivity.this, "Do Mail Here!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(RecvDataActivity.this,FormActivity.class);
                Toast.makeText(RecvDataActivity.this, "Edit me!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }



    /*================================================================================================================================================
        For profile Button
        1.Call Action
        2.Send Message
        3.Send Mail Button
    * ================================================================================================================================================*/
    private void makecall() {
        if (ContextCompat.checkSelfPermission(RecvDataActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // ActivityCompat.requestPermissions(MainActivity.this, //
            //new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            ActivityCompat.requestPermissions(RecvDataActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL); }
            else {
            Intent o = new Intent(Intent.ACTION_CALL);
            String mynumber=uphoneNumber.getText().toString();
            o.setData(Uri.parse("tel:"+mynumber));
            startActivity(o);             // startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:123")));         }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            makecall();
        }
            else {
            Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
        }
    }



/*================================================================================================================================================
    For profile Button Action
    1.Upload Button Acttion
    2.Delete Button Action
    3.Edit Button   Action
* ================================================================================================================================================*/
//    for profile Picture;
    private static final int PICK_IMAGE_REQUEST=1;

    Bitmap bitmap;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri filePath;
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            filePath = data.getData();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                uimage.setImageBitmap(bitmap);

                if (filePath!=null){
                    upload_image.setText("Update");
                    upload_image.setBackgroundResource(R.drawable.clicked);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }






}

