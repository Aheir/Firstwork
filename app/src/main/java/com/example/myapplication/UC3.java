package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class UC3 extends AppCompatActivity 
{

    private Button BtnFlR;
    private int imageIds[] = {R.drawable.uc_img_first, R.drawable.uc_img_second, R.drawable.uc_img_third, R.drawable.uc_img_forth, R.drawable.uc_img_fifth};
    private ArrayList<ImageView> images = new ArrayList<>();
    private ViewPager vp;
    private int oldPosition = 0;//记录上一次点的位置
    private int currentItem; //当前页面
    private ScheduledExecutorService scheduledExecutorService;
    private ArrayList<View> imgs = new ArrayList<View>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        BtnFlR = findViewById(R.id.Fl_R);
        BtnFlR.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //从UC3返回首页
                Intent intent = new Intent(UC3.this,MainActivity.class);
                startActivity(intent);
            }
        });

        for (int i = 0; i < imageIds.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(imageIds[i]);

            images.add(imageView);
        }


        //显示的点 加入集合
        imgs.add(findViewById(R.id.img_1));
        imgs.add(findViewById(R.id.img_2));
        imgs.add(findViewById(R.id.img_3));
        imgs.add(findViewById(R.id.img_4));
        imgs.add(findViewById(R.id.img_5));

        vp = (ViewPager) findViewById(R.id.vp);
        vp.setAdapter(new ViewPagerAdapter());

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
              public void onPageSelected(int position) {
                oldPosition = position;
                currentItem = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    class ViewPagerAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return images.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            //将图片移出图组
            View v =images.get(position);
            container.removeView(v);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            //将图片加进图组
            View v =images.get(position);
            container.addView(v);
            return v;
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //每隔两秒换一张图片
        scheduledExecutorService.scheduleWithFixedDelay(new ViewPagerTask(),2,2, TimeUnit.SECONDS);

    }
    //实现一个碎片的接口
    class ViewPagerTask implements Runnable{

        @Override
        public void run() {
            currentItem = (currentItem+1)%imageIds.length;
            //更新界面
            handler.obtainMessage().sendToTarget();
        }
    }
    //在handler进行碎片跳转
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            vp.setCurrentItem(currentItem);
        }
    };

    
    }