package com.example.khokan.datagelodataelo;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.Manifest.permission_group.SMS;

public class SmsAction extends AppCompatActivity {
private EditText sending_to,sms_body;
Button sending_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sending_mail_sms_layout);
        sending_to = findViewById(R.id.sending_to);
        sms_body = findViewById(R.id.msg_body);
        sending_btn = findViewById(R.id.send_action);
        sending_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSMS();
            }
        });
    }

    private void sendSMS() {

        String number1 = sending_to.getText().toString();
        String sms_ = sms_body.getText().toString();

        if (number1.trim().length()>0){
            if (ContextCompat.checkSelfPermission(SmsAction.this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(SmsAction.this,new String[]{Manifest.permission.SEND_SMS},1);
            }else {
                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    //smsManager.sendTextMessage(number1,null,sms_,null,null);

                smsManager.sendTextMessage(number1,null,sms_,null,null);
                Toast.makeText(SmsAction.this,"Sent",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(SmsAction.this,"Failed",Toast.LENGTH_LONG).show();
                }
            }
        }else{
            Toast.makeText(SmsAction.this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == 1){
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                sendSMS();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
