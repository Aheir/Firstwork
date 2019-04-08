package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private Button BtnLl,BtnRl,BtnFl,BtnTl,BtnGl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnLl = findViewById(R.id.Ll);
        BtnLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到UC1界面
                Intent intent = new Intent(MainActivity.this,UC1.class);
                startActivity(intent);
            }
        });

        BtnRl = findViewById(R.id.Rl);
        BtnRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到UC2界面
                Intent intent = new Intent(MainActivity.this,UC2.class);
                startActivity(intent);
            }
        });

        BtnFl = findViewById(R.id.Fl);
        BtnFl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到UC3界面
                Intent intent = new Intent(MainActivity.this,UC3.class);
                startActivity(intent);
            }
        });

        BtnTl = findViewById(R.id.Tl);
        BtnTl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到UC4界面
                Intent intent = new Intent(MainActivity.this,UC4.class);
                startActivity(intent);
            }
        });

        BtnGl = findViewById(R.id.Gl);
        BtnGl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到UC5界面
                Intent intent = new Intent(MainActivity.this,UC5.class);
                startActivity(intent);
            }
        });

    }
}
