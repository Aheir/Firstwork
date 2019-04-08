package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UC2 extends AppCompatActivity {

    private Button BtnRlR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc2);

        BtnRlR = findViewById(R.id.Rl_R);
        BtnRlR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //从UC2返回首页
                Intent intent = new Intent(UC2.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
