package com.example.nd.smartticketing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Azman extends AppCompatActivity {
    WebView wvazman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azman);

        WebView wvazman=(WebView)findViewById(R.id.webview2);

        WebSettings ws=wvazman.getSettings();
        ws.setBuiltInZoomControls(true);

        wvazman.getSettings().setJavaScriptEnabled(true);
        wvazman.setWebViewClient(new Callback());
        wvazman.loadUrl("https://www.airazman.com/");
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return(false);
        }
    }
}

