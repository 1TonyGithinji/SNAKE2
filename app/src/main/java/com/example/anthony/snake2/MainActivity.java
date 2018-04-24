package com.example.anthony.snake2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview=(WebView)findViewById(R.id.webview);
        WebSettings settings=webview.getSettings();
        settings.setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/snake2game.html");

    }
}