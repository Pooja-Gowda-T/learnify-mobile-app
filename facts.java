package com.example.toycathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class facts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView teext=(TextView) findViewById(R.id.text);
        String[] strs = new String[] {"str1", "str2", "str3","str4", "str5", "str6", "str7"};
        int randomIndex = new Random().nextInt(7);

        int resId = getResources().getIdentifier(strs[randomIndex ], "string",this.getPackageName());
        String randomString = getString(resId);

        teext.setText(randomString);
    }
}



