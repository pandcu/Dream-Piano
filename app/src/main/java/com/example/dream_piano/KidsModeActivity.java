package com.example.dream_piano;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class KidsModeActivity extends AppCompatActivity {

    private SoundPool kidmodPool;
    private VideoView videoView;
    private int soundID[] = new int[7];
    protected void hideBottomUIMenu() {
        //        隐藏虚拟键盘，并且全屏
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.hideBottomUIMenu();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_mode);
        videoView = (VideoView)this.findViewById(R.id.kid_mode_video );

        play_mp4();



        Button kid_mode_do_btn=(Button) findViewById(R.id.kid_mode_do);
        Button kid_mode_re_btn=(Button) findViewById(R.id.kid_mode_re);
        Button kid_mode_mi_btn=(Button) findViewById(R.id.kid_mode_mi);
        Button kid_mode_fa_btn=(Button) findViewById(R.id.kid_mode_fa);
        Button kid_mode_so_btn=(Button) findViewById(R.id.kid_mode_so);
        Button kid_mode_la_btn=(Button) findViewById(R.id.kid_mode_la);
        Button kid_mode_si_btn=(Button) findViewById(R.id.kid_mode_si);

        kidmodPool=new SoundPool(10, AudioManager.STREAM_SYSTEM,5);
        soundID[0] = kidmodPool.load(this, R.raw.do4p, 1);
        soundID[1] = kidmodPool.load(this, R.raw.re6p, 1);
        soundID[2] = kidmodPool.load(this, R.raw.mi8p, 1);
        soundID[3] = kidmodPool.load(this, R.raw.fa9p, 1);
        soundID[4] = kidmodPool.load(this, R.raw.so11p, 1);
        soundID[5] = kidmodPool.load(this, R.raw.la13p, 1);
        soundID[6] = kidmodPool.load(this, R.raw.si15p, 1);

        kid_mode_do_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kidmodPool.play(soundID[0], 1, 1, 0, 0, 1);
            }
        });

        kid_mode_re_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kidmodPool.play(soundID[1], 1, 1, 0, 0, 1);
            }
        });

        kid_mode_mi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kidmodPool.play(soundID[2], 1, 1, 0, 0, 1);
            }
        });
        kid_mode_fa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kidmodPool.play(soundID[3], 1, 1, 0, 0, 1);
            }
        });

        kid_mode_so_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kidmodPool.play(soundID[4], 1, 1, 0, 0, 1);
            }
        });

        kid_mode_la_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kidmodPool.play(soundID[5], 1, 1, 0, 0, 1);
            }
        });

        kid_mode_si_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kidmodPool.play(soundID[6], 1, 1, 0, 0, 1);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.kid_mode_menu,menu);
        return  super.onCreateOptionsMenu(menu);
    }

    public  boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.isCheckable()) {
            item.setChecked(true);
        }
        String videoUrl="android.resource://" + getPackageName() + "/" + R.raw.littlestar;
        Uri uri;
        switch (item.getItemId()){
            case R.id.Two_tigers:
                videoUrl= "android.resource://" + getPackageName() + "/" + R.raw.painter;
                break;
            case R.id.Little_stars:
                videoUrl= "android.resource://" + getPackageName() + "/" + R.raw.littlestar;
                break;
        }
        videoView.setMediaController(new MediaController(this));
        uri = Uri.parse( videoUrl);
        videoView.setVideoURI(uri);
        videoView.start();
        return true;
    }
    private void play_mp4(){
        String videoUrl1 = "android.resource://" + getPackageName() + "/" + R.raw.littlestar;
        Uri uri = Uri.parse( videoUrl1 );
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.start();
    }
}