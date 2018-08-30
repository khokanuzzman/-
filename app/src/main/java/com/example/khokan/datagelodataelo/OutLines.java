package com.example.khokan.datagelodataelo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OutLines extends AppCompatActivity {
    Activity activity;
    private ProgressDialog progDailog;

    @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_java_layout);

        activity = this;

        progDailog = ProgressDialog.show(activity, "অপেক্ষা করুন!", "বাজে  নেট...কি নেট ব্যবহার করেন?", true);
        progDailog.setCancelable(false);


        WebView webView = (WebView) findViewById(R.id.wv);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                progDailog.show();
                view.loadUrl(url);

                return true;
            }

            @Override
            public void onPageFinished(WebView view, final String url) {
                progDailog.dismiss();
            }
        });

        webView.loadUrl("https://learn.risingdevelopers.com/2018/08/08/sdmgap-course-outlines/");

    }
}