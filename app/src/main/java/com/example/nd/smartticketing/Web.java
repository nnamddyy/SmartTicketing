package com.example.nd.smartticketing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView wv=(WebView)findViewById(R.id.webview1);

        WebSettings ws=wv.getSettings();
        ws.setBuiltInZoomControls(true);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new Callback());
        wv.loadUrl("http://www.arikair.com/ng");
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return(false);
        }
    }
}

