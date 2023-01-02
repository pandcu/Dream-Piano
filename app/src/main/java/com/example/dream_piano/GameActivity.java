package com.example.dream_piano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private View_Game mView_game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        WindowManager manager=getWindowManager();
        DisplayMetrics metrics=new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(metrics);//获取屏幕高宽
        int width = metrics.widthPixels;  //以像素为单位
        int height = metrics.heightPixels;

        mView_game=findViewById(R.id.mView_game);
        mView_game.setScreenNum(height,width);
        mView_game.init();
        mView_game.setOnClickListener(mView_game);




    }

}