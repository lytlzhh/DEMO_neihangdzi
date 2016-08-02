package com.example.llw.demo_neihangdzi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.com.Listviewadapter;
import myactivity.com.OneActivity;
import myactivity.com.ThreeActivity;
import myactivity.com.TwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private DrawerLayout drawerlayoutId;
    private FrameLayout framelayoutId;
    private ListView listviewId;
    private ImageButton imageButton;
    private Button button;

    Listviewadapter listviewadapter;
    List<Ben> list = null;

    String[] srt = {"签到/任务", "今日免费", "活动中心", "快速充值", "消息中心", "设置"};
    int[] imag = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    private void assignViews() {
        drawerlayoutId = (DrawerLayout) findViewById(R.id.drawerlayout_id);
        framelayoutId = (FrameLayout) findViewById(R.id.framelayout_id);
        listviewId = (ListView) findViewById(R.id.listview_id);
        button = (Button) findViewById(R.id.zhangyueishuch_id);
        imageButton = (ImageButton) findViewById(R.id.sercher_id);

        button.setOnClickListener(this);
        imageButton.setOnClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();

        fun();
    }

    public void fun() {
        list = new ArrayList<>();
        for (int i = 0; i < srt.length; i++) {
            list.add(new Ben(imag[i], srt[i]));
        }

        listviewId.setAdapter(new Listviewadapter(this, list));

        listviewId.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e(TAG, "onItemClick: " + i + "::::" + l);
                ddd(i);
            }
        });
    }


    public void ddd(int index) {
        switch (index) {
            case 0:
                startActivity(new Intent(this, OneActivity.class));

                break;
            case 1:
                startActivity(new Intent(this, TwoActivity.class));

                break;
            case 2:
                startActivity(new Intent(this, ThreeActivity.class));

                break;
            case 3:

                break;
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zhangyueishuch_id:

                break;

            case R.id.sercher_id:
                startActivity(new Intent(this, SercherActivity.class));
                break;
        }
    }
}
