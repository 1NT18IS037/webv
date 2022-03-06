package com.example.actili;

import static com.example.actili.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        WebView webView = findViewById(R.id.webv);
        webView.loadUrl("https://www.notion.so/27ea0956713343b68c66934ef051c376?v=867e716f28904eae917a94c03d832a1c");
    }
}