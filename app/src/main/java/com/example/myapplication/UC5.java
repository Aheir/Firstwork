package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UC5 extends AppCompatActivity {

    private Button BtnGlR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc5);

        BtnGlR = findViewById(R.id.Gl_R);
        BtnGlR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //从UC5返回首页
                Intent intent = new Intent(UC5.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
