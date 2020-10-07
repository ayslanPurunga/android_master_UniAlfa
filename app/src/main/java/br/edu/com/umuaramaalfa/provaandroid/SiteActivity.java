package br.edu.com.umuaramaalfa.provaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SiteActivity extends AppCompatActivity {

    WebView webSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        webSite = findViewById(R.id.webSite);
        webSite.getSettings().setJavaScriptEnabled(true);
        webSite.getSettings().setSupportZoom(true);
        webSite.loadUrl("https://www.alfaumuarama.edu.br/fau/");
    }
}