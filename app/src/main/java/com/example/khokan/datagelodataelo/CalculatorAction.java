package com.example.khokan.datagelodataelo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorAction extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnadd,btnmin,btnmul,btndiv,btresult;
    TextView textView;
    double var1,var2;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_action);

        textView=findViewById(R.id.text);
        btn0=findViewById(R.id.bt0);
        btn1=findViewById(R.id.bt1);
        btn2=findViewById(R.id.bt2);
        btn3=findViewById(R.id.bt3);
        btn4=findViewById(R.id.bt4);
        btn5=findViewById(R.id.bt5);
        btn6=findViewById(R.id.bt6);
        btn7=findViewById(R.id.bt7);
        btn8=findViewById(R.id.bt8);
        btn9=findViewById(R.id.bt9);
        btndot=findViewById(R.id.btdot);
        btnadd=findViewById(R.id.btadd);
        btnmin=findViewById(R.id.btmin);
        btnmul=findViewById(R.id.btmul);
        btndiv=findViewById(R.id.btdiv);
        btresult=findViewById(R.id.bteqal);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            textView.setText(textView.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+".");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(textView.getText()+"");
                add=true;
                textView.setText(null);
            }
        });

        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(textView.getText()+"");
                sub=true;
                textView.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(textView.getText()+"");
                mul=true;
                textView.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(textView.getText()+"");
                div=true;
                textView.setText(null);
            }
        });

        btresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 =  Double.parseDouble(textView.getText()+"");
                if(add==true)
                {
                    textView.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true)
                {
                    textView.setText(var1-var2+"");
            sub=false;
                }
                if(mul==true)
                {
                    textView.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true)
                {
                    textView.setText(var1/var2+"");
                    div=false;
                }
            }
        });

    }
}

