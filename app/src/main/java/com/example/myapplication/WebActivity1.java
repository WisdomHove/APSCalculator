package com.example.myapplication;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity1 extends AppCompatActivity {
    private WebView webView;  // for displaying web contents

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);

        webView = (WebView) findViewById(R.id.webView);
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.unisa.ac.za/sites/corporate/default/Apply-for-admission/Undergraduate-qualifications/Qualifications/All-qualifications/Advanced-Certificate-in-Accounting-Sciences-(90017)");  // URL hardcoded
    }
}
