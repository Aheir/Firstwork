package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class UC1 extends AppCompatActivity {

    private Button BtnLlHl,BtnLlVl,BtnLlAl;
    private Button BtnLlR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1);

        BtnLlHl = findViewById(R.id.Ll_Hl);
        BtnLlHl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout HL = findViewById(R.id.Ll_ll);
                if(HL.getOrientation() == LinearLayout.VERTICAL){
                    HL.setOrientation(LinearLayout.HORIZONTAL);
                }
            }
        });

        BtnLlVl = findViewById(R.id.Ll_Vl);
        BtnLlVl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout Vl = findViewById(R.id.Ll_ll);
                if(Vl.getOrientation() == LinearLayout.HORIZONTAL){
                    Vl.setOrientation(LinearLayout.VERTICAL);
                }
            }
        });

        BtnLlAl = findViewById(R.id.Ll_Al);
        BtnLlAl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout Al = findViewById(R.id.Ll_Ll);
                Al.setGravity(Gravity.LEFT);
            }
        });

        BtnLlR = findViewById(R.id.Ll_R);
        BtnLlR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //从UC1返回首页
                Intent intent = new Intent(UC1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}