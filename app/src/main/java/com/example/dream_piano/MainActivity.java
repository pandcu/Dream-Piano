package com.example.dream_piano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button freeplaybtn;
    Button kidmodebtn;
    Button classicmodebtn;
    Button gamebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        freeplaybtn=(Button) findViewById(R.id.freeplay);
        kidmodebtn=(Button)findViewById(R.id.childmode);
        classicmodebtn=(Button)findViewById(R.id.classicmode);
        gamebtn=(Button)findViewById(R.id.game);


        freeplaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,FreePlayActivity.class);
                startActivity(intent);
            }
        });
        kidmodebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this, KidListActivity.class);
                startActivity(intent);
            }
        });

        classicmodebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ClassicListActivity.class);
                startActivity(intent);
            }
        });
        gamebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

    }


}