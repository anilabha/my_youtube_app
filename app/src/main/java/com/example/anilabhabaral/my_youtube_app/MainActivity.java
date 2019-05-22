package com.example.anilabhabaral.my_youtube_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView=(WebView) findViewById(R.id.webview);
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://www.youtube.com/playlist?list=UUiK__Kv2-W6LgDIg2poM4EA");
    }
    public void onBackpressd() {
        if (mywebView.canGoBack()) {
            mywebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
