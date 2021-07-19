package com.example.toycathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int  SPLASH_SCREEN=5000;
    Animation topanim,bottanim;
    ImageView image;
    TextView logo,slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        image=findViewById(R.id.ImageView);
        logo=findViewById(R.id.textView);
        slogan=findViewById(R.id.textView2);
        image.setAnimation(topanim);
        logo.setAnimation(bottanim);
        slogan.setAnimation(bottanim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,loginpage.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);




    }
}