package com.example.toycathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void web(View view)
    {
        openUrl("https://youtu.be/93BqLewm3bA");
    }
    public void openUrl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
    public void web1(View view)
    {
        openUrl1("https://youtu.be/wr2dwbUAq8A");
    }
    public void openUrl1(String url)
    {
        Uri uri=Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
    public void web2(View view)
    {
        openUrl3("https://youtu.be/c-3KCzxEgek");
    }
    public void openUrl3(String url1)
    {
        Uri uri=Uri.parse(url1);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
    public void web3(View view)
    {
        openUrl4("https://youtu.be/Om42Lppkd9w");
    }
    public void openUrl4(String url2)
    {
        Uri uri=Uri.parse(url2);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }


}