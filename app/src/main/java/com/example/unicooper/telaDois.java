package com.example.unicooper;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class telaDois extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);
    }

    public void internetClick(View internet) {
        Intent link = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("https://unicooperbh.wixsite.com/unicooperbh");
        link.setData(uri);
        startActivity(link);
    }

    public void discarClick(View discar) {

        Intent numero = new Intent(Intent.ACTION_DIAL);
        Uri uri = Uri.parse("tel://32913200");
        numero.setData(uri);
        startActivity(numero);
    }

    public void compartilharClick(View v) {

        Intent whats = new Intent(Intent.ACTION_SEND);
        whats.putExtra(Intent.EXTRA_TEXT, "https://unicooperbh.wixsite.com/unicooperbh");
        whats.setType("text/plain");
        startActivity(whats);
    }
}