package com.example.dream_piano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KidListActivity extends AppCompatActivity {
    protected void hideBottomUIMenu() {
        //        隐藏虚拟键盘，并且全屏
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] title = new String[]{"小星星", "粉刷匠"};
        List<Map<String, Object>> listitems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < title.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", title[i]);
            listitems.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, listitems, R.layout.activity_itemshow, new String[]{"name"},
                new int[]{R.id.title});
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Map<String, Object> map = (Map<String, Object>) adapterView.getItemAtPosition(i);
                String name = map.get("name").toString();


                if ("小星星".equals(name)) {
                    Intent intent = new Intent(KidListActivity.this,KidsModeActivity.class);
                    intent.putExtra("date","小星星");
//                    Toast.makeText(ListActivity.this, name, Toast.LENGTH_SHORT).show();
                    startActivity(intent);

                } else if ("粉刷匠".equals(name)) {
                    Intent intent = new Intent(KidListActivity.this, KidsModeActivity.class);
                    intent.putExtra("date", "粉刷匠");
//                    Toast.makeText(ListActivity.this, name, Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }

            }
        });


    }
}