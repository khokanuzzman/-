package com.example.khokan.datagelodataelo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CallAction extends AppCompatActivity {
    private EditText get_phone_number;
    private static final int REQUEST_CALL=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_action);

        Button call_action = findViewById(R.id.call_action);
        Button dial_call_action=findViewById(R.id.dial_call);
        get_phone_number=findViewById(R.id.phone_number);
        call_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });


        dial_call_action.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:01"));
                startActivity(i);

        }
        });
    }


    /*================================================================================================================================================
    1.Call Action
* ================================================================================================================================================*/
    private void makecall() {
        if (ContextCompat.checkSelfPermission(CallAction.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // ActivityCompat.requestPermissions(MainActivity.this, //
            //new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            ActivityCompat.requestPermissions(CallAction.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL); }
        else {
            Intent o = new Intent(Intent.ACTION_CALL);
            String mynumber=get_phone_number.getText().toString();
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
}
