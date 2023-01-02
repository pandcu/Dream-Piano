package com.example.dream_piano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ClassicModeActivity extends AppCompatActivity {
    VideoView videoView;


    protected void hideBottomUIMenu() {
        //        隐藏虚拟键盘，并且全屏
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    private SoundPool classicPool;
    private int soundID[] = new int[22];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.hideBottomUIMenu();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_mode);

        play_mp4();

        //        白键
        Button B1 = findViewById(R.id.classic_mode_b1);
        Button B2 = findViewById(R.id.classic_mode_b2);
        Button B3 = findViewById(R.id.classic_mode_b3);
        Button B4 = findViewById(R.id.classic_mode_b4);
        Button B5 = findViewById(R.id.classic_mode_b5);
        Button B6 = findViewById(R.id.classic_mode_b6);
        Button B7 = findViewById(R.id.classic_mode_b7);
        Button B8 = findViewById(R.id.classic_mode_b8);
        Button B9 = findViewById(R.id.classic_mode_b9);
        Button B10 = findViewById(R.id.classic_mode_b10);
        Button B11 = findViewById(R.id.classic_mode_b11);
        Button B12 = findViewById(R.id.classic_mode_b12);
        Button B13 = findViewById(R.id.classic_mode_b13);
//黑键
        Button Hb1 = findViewById(R.id.classic_mode_hb1);
        Button Hb2 = findViewById(R.id.classic_mode_hb2);
        Button Hb3 = findViewById(R.id.classic_mode_hb3);
        Button Hb4 = findViewById(R.id.classic_mode_hb4);
        Button Hb5 = findViewById(R.id.classic_mode_hb5);
        Button Hb6 = findViewById(R.id.classic_mode_hb6);
        Button Hb7 = findViewById(R.id.classic_mode_hb7);
        Button Hb8 = findViewById(R.id.classic_mode_hb8);

        classicPool=new SoundPool(100, AudioManager.STREAM_SYSTEM,5);
        soundID[0] = classicPool.load(this, R.raw.la1p, 1);
        soundID[1] = classicPool.load(this, R.raw.la2p, 1);
        soundID[2] = classicPool.load(this, R.raw.si3p, 1);
        soundID[3] = classicPool.load(this, R.raw.do4p, 1);
        soundID[4] = classicPool.load(this, R.raw.do5p, 1);
        soundID[5] = classicPool.load(this, R.raw.re6p, 1);
        soundID[6] = classicPool.load(this, R.raw.re7p, 1);
        soundID[7] = classicPool.load(this, R.raw.mi8p, 1);
        soundID[8] = classicPool.load(this, R.raw.fa9p, 1);
        soundID[9] = classicPool.load(this, R.raw.fa10p, 1);
        soundID[10] = classicPool.load(this, R.raw.so11p, 1);
        soundID[11] = classicPool.load(this, R.raw.so12p, 1);
        soundID[12] = classicPool.load(this, R.raw.la13p, 1);
        soundID[13] = classicPool.load(this, R.raw.la14p, 1);
        soundID[14] = classicPool.load(this, R.raw.si15p, 1);
        soundID[15] = classicPool.load(this, R.raw.do16p, 1);
        soundID[16] = classicPool.load(this, R.raw.do17p, 1);
        soundID[17] = classicPool.load(this, R.raw.re18p, 1);
        soundID[18] = classicPool.load(this, R.raw.re19p, 1);
        soundID[19] = classicPool.load(this, R.raw.mi20p, 1);
        soundID[20] = classicPool.load(this, R.raw.fa21p, 1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[0], 1, 1, 0, 0, 1);
            }
        });
        Hb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[1], 1, 1, 0, 0, 1);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[2], 1, 1, 0, 0, 1);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[3], 1, 1, 0, 0, 1);
            }
        });
        Hb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[4], 1, 1, 0, 0, 1);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[5], 1, 1, 0, 0, 1);
            }
        });
        Hb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[6], 1, 1, 0, 0, 1);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[7], 1, 1, 0, 0, 1);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[8], 1, 1, 0, 0, 1);
            }
        });
        Hb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[9], 1, 1, 0, 0, 1);
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[10], 1, 1, 0, 0, 1);
            }
        });
        Hb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[11], 1, 1, 0, 0, 1);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[12], 1, 1, 0, 0, 1);
            }
        });
        Hb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[13], 1, 1, 0, 0, 1);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[14], 1, 1, 0, 0, 1);
            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[15], 1, 1, 0, 0, 1);
            }
        });
        Hb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[16], 1, 1, 0, 0, 1);
            }
        });
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[17], 1, 1, 0, 0, 1);
            }
        });
        Hb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[18], 1, 1, 0, 0, 1);
            }
        });
        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[19], 1, 1, 0, 0, 1);
            }
        });
        B13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicPool.play(soundID[20], 1, 1, 0, 0, 1);
            }
        });



    }
    private void play_mp4(){
        videoView = (VideoView) this.findViewById(R.id.classic_mode_video);
        String videoUrl1="android.resource://" + getPackageName() + "/" +R.raw.waterfall;
        if ("卡农".equals(getIntent().getStringExtra("date"))){
            videoUrl1="android.resource://" + getPackageName() + "/" +R.raw.waterfall;
        }

        Uri uri = Uri.parse( videoUrl1 );
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.start();
    }

}