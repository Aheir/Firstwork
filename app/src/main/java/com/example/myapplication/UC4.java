package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UC4 extends AppCompatActivity {

    private Button BtnTlR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc4);

        BtnTlR = findViewById(R.id.Tl_R);
        BtnTlR.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //从UC4返回首页
                Intent intent = new Intent(UC4.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
