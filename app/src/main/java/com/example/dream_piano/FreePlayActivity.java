package com.example.dream_piano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioGroup;

public class FreePlayActivity extends AppCompatActivity {
    protected void hideBottomUiMenu(){
//        隐藏虚拟键盘，并且全屏
        View decorView=getWindow().getDecorView();
        int uiOptions=View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

    }
    private SoundPool freePool;
    private int soundID[] = new int[22];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.hideBottomUiMenu();
        //设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_play);

        RadioGroup radioGroup=(RadioGroup) findViewById(R.id.timbre_type);

        Button mTitle = findViewById(R.id.free_play_title);

//        白键
        Button mB1 = findViewById(R.id.b1);
        Button mB2 = findViewById(R.id.b2);
        Button mB3 = findViewById(R.id.b3);
        Button mB4 = findViewById(R.id.b4);
        Button mB5 = findViewById(R.id.b5);
        Button mB6 = findViewById(R.id.b6);
        Button mB7 = findViewById(R.id.b7);
        Button mB8 = findViewById(R.id.b8);
        Button mB9 = findViewById(R.id.b9);
        Button mB10 = findViewById(R.id.b10);
        Button mB11 = findViewById(R.id.b11);
        Button mB12 = findViewById(R.id.b12);
        Button mB13 = findViewById(R.id.b13);
//黑键
        Button mHb1 = findViewById(R.id.hb1);
        Button mHb2 = findViewById(R.id.hb2);
        Button mHb3 = findViewById(R.id.hb3);
        Button mHb4 = findViewById(R.id.hb4);
        Button mHb5 = findViewById(R.id.hb5);
        Button mHb6 = findViewById(R.id.hb6);
        Button mHb7 = findViewById(R.id.hb7);
        Button mHb8 = findViewById(R.id.hb8);

        freePool=new SoundPool(100, AudioManager.STREAM_SYSTEM,5);
//        soundID[0] = freePool.load(FreePlayActivity.this, R.raw.la1, 1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.timbre_piano:
                        soundID[0] = freePool.load(FreePlayActivity.this, R.raw.la1p, 1);
                        soundID[1] = freePool.load(FreePlayActivity.this, R.raw.la2p, 1);
                        soundID[2] = freePool.load(FreePlayActivity.this, R.raw.si3p, 1);
                        soundID[3] = freePool.load(FreePlayActivity.this, R.raw.do4p, 1);
                        soundID[4] = freePool.load(FreePlayActivity.this, R.raw.do5p, 1);
                        soundID[5] = freePool.load(FreePlayActivity.this, R.raw.re6p, 1);
                        soundID[6] = freePool.load(FreePlayActivity.this, R.raw.re7p, 1);
                        soundID[7] = freePool.load(FreePlayActivity.this, R.raw.mi8p, 1);
                        soundID[8] = freePool.load(FreePlayActivity.this, R.raw.fa9p, 1);
                        soundID[9] = freePool.load(FreePlayActivity.this, R.raw.fa10p, 1);
                        soundID[10] = freePool.load(FreePlayActivity.this, R.raw.so11p, 1);
                        soundID[11] = freePool.load(FreePlayActivity.this, R.raw.so12p, 1);
                        soundID[12] = freePool.load(FreePlayActivity.this, R.raw.la13p, 1);
                        soundID[13] = freePool.load(FreePlayActivity.this, R.raw.la14p, 1);
                        soundID[14] = freePool.load(FreePlayActivity.this, R.raw.si15p, 1);
                        soundID[15] = freePool.load(FreePlayActivity.this, R.raw.do16p, 1);
                        soundID[16] = freePool.load(FreePlayActivity.this, R.raw.do17p, 1);
                        soundID[17] = freePool.load(FreePlayActivity.this, R.raw.re18p, 1);
                        soundID[18] = freePool.load(FreePlayActivity.this, R.raw.re19p, 1);
                        soundID[19] = freePool.load(FreePlayActivity.this, R.raw.mi20p, 1);
                        soundID[20] = freePool.load(FreePlayActivity.this, R.raw.fa21p, 1);
                        break;
                    case R.id.timbre_Kalimbaqin:
                        soundID[0] = freePool.load(FreePlayActivity.this, R.raw.la1k, 1);
                        soundID[1] = freePool.load(FreePlayActivity.this, R.raw.la2k, 1);
                        soundID[2] = freePool.load(FreePlayActivity.this, R.raw.si3k, 1);
                        soundID[3] = freePool.load(FreePlayActivity.this, R.raw.do4k, 1);
                        soundID[4] = freePool.load(FreePlayActivity.this, R.raw.do5k, 1);
                        soundID[5] = freePool.load(FreePlayActivity.this, R.raw.re6k, 1);
                        soundID[6] = freePool.load(FreePlayActivity.this, R.raw.re7k, 1);
                        soundID[7] = freePool.load(FreePlayActivity.this, R.raw.mi8k, 1);
                        soundID[8] = freePool.load(FreePlayActivity.this, R.raw.fa9k, 1);
                        soundID[9] = freePool.load(FreePlayActivity.this, R.raw.fa10k, 1);
                        soundID[10] = freePool.load(FreePlayActivity.this, R.raw.so11k, 1);
                        soundID[11] = freePool.load(FreePlayActivity.this, R.raw.so12k, 1);
                        soundID[12] = freePool.load(FreePlayActivity.this, R.raw.la13k, 1);
                        soundID[13] = freePool.load(FreePlayActivity.this, R.raw.la14k, 1);
                        soundID[14] = freePool.load(FreePlayActivity.this, R.raw.si15k, 1);
                        soundID[15] = freePool.load(FreePlayActivity.this, R.raw.do16k, 1);
                        soundID[16] = freePool.load(FreePlayActivity.this, R.raw.do17k, 1);
                        soundID[17] = freePool.load(FreePlayActivity.this, R.raw.re18k, 1);
                        soundID[18] = freePool.load(FreePlayActivity.this, R.raw.mi19k, 1);
                        soundID[19] = freePool.load(FreePlayActivity.this, R.raw.mi20k, 1);
                        soundID[20] = freePool.load(FreePlayActivity.this, R.raw.fa21k, 1);
                        break;
                    case R.id.timbre_trumpet:
                        soundID[0] = freePool.load(FreePlayActivity.this, R.raw.la1h, 1);
                        soundID[1] = freePool.load(FreePlayActivity.this, R.raw.la2h, 1);
                        soundID[2] = freePool.load(FreePlayActivity.this, R.raw.si3h, 1);
                        soundID[3] = freePool.load(FreePlayActivity.this, R.raw.do4h, 1);
                        soundID[4] = freePool.load(FreePlayActivity.this, R.raw.do5h, 1);
                        soundID[5] = freePool.load(FreePlayActivity.this, R.raw.re6h, 1);
                        soundID[6] = freePool.load(FreePlayActivity.this, R.raw.re7h, 1);
                        soundID[7] = freePool.load(FreePlayActivity.this, R.raw.mi8h, 1);
                        soundID[8] = freePool.load(FreePlayActivity.this, R.raw.fa9h, 1);
                        soundID[9] = freePool.load(FreePlayActivity.this, R.raw.fa10h, 1);
                        soundID[10] = freePool.load(FreePlayActivity.this, R.raw.so11h, 1);
                        soundID[11] = freePool.load(FreePlayActivity.this, R.raw.so12h, 1);
                        soundID[12] = freePool.load(FreePlayActivity.this, R.raw.la13h, 1);
                        soundID[13] = freePool.load(FreePlayActivity.this, R.raw.la14h, 1);
                        soundID[14] = freePool.load(FreePlayActivity.this, R.raw.si15h, 1);
                        soundID[15] = freePool.load(FreePlayActivity.this, R.raw.do16h, 1);
                        soundID[16] = freePool.load(FreePlayActivity.this, R.raw.do17h, 1);
                        soundID[17] = freePool.load(FreePlayActivity.this, R.raw.re18h, 1);
                        soundID[18] = freePool.load(FreePlayActivity.this, R.raw.mi19h, 1);
                        soundID[19] = freePool.load(FreePlayActivity.this, R.raw.mi20h, 1);
                        soundID[20] = freePool.load(FreePlayActivity.this, R.raw.fa21h, 1);
                        break;
                }
            }
        });
        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[0], 1, 1, 0, 0, 1);
            }
        });
        mHb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[1], 1, 1, 0, 0, 1);
            }
        });
        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[2], 1, 1, 0, 0, 1);
            }
        });
        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[3], 1, 1, 0, 0, 1);
            }
        });
        mHb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[4], 1, 1, 0, 0, 1);
            }
        });
        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[5], 1, 1, 0, 0, 1);
            }
        });
        mHb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[6], 1, 1, 0, 0, 1);
            }
        });
        mB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[7], 1, 1, 0, 0, 1);
            }
        });
        mB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[8], 1, 1, 0, 0, 1);
            }
        });
        mHb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[9], 1, 1, 0, 0, 1);
            }
        });
        mB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[10], 1, 1, 0, 0, 1);
            }
        });
        mHb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[11], 1, 1, 0, 0, 1);
            }
        });
        mB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[12], 1, 1, 0, 0, 1);
            }
        });
        mHb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[13], 1, 1, 0, 0, 1);
            }
        });
        mB9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[14], 1, 1, 0, 0, 1);
            }
        });
        mB10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[15], 1, 1, 0, 0, 1);
            }
        });
        mHb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[16], 1, 1, 0, 0, 1);
            }
        });
        mB11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[17], 1, 1, 0, 0, 1);
            }
        });
        mHb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[18], 1, 1, 0, 0, 1);
            }
        });
        mB12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[19], 1, 1, 0, 0, 1);
            }
        });
        mB13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePool.play(soundID[20], 1, 1, 0, 0, 1);
            }
        });

        mTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(FreePlayActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}