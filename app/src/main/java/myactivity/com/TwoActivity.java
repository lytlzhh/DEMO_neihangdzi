package myactivity.com;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.llw.demo_neihangdzi.Drawer_two;
import com.example.llw.demo_neihangdzi.R;

import java.util.ArrayList;
import java.util.List;

import adapter.com.Drawer_two_adapter;

public class TwoActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {
    private Button drawerTwoBtn;
    private ListView drawerOtwoListview;
    private SwipeRefreshLayout swipeRefreshLayout;
    Drawer_two_adapter drawer_two_adapter = null;
    private List<Drawer_two> list = null;

    public android.os.Handler handler = new Handler();

    int[] ima = {R.mipmap.zhyuqi, R.mipmap.zhyuqi, R.mipmap.zhyuqi, R.mipmap.zhyuqi, R.mipmap.zhyuqi};
    String[] srt0 = {"焦点对谈 2016-08-01 酷暑伤身!!高温炎热下如何保健! [百度网盘下载]",
            "新闻追追追 2016-08-01 蔡英文政府不满意度爆升,行政院政策大转弯,蔡英文里外不是人!",
            "PM10点灵 2016-08-01 韩国政府金英兰法打贪,4百万人受影响! [百度网盘下载]",
            "前进新台湾 2016-08-01 军购武器研发单位,公关费买服饰、化妆品,滥支不查?",
            "数字台湾 2016-07-31 扭曲租税台湾崩坏!所得税全球最高, 台湾房地产报酬率全球最低!"};

    String[] srt1 = {"忧中国情报刺探国安",
            ".中国投资...中",
            ".英黄金时代结束?,",
            "所得税全球最高",
            "台湾房地产报酬率全球最低"};

    String[] srt2 = {"忧fdfdf中国情报刺探国安", "中国投fdf资...中", "英黄金fdf时代结束", "所得税全球hgh最高", "台湾房地产报hgh酬率全球最低"};

    String[] srt3 = {"A2aaaaaaaaaaaaa", "B2aaaaaaa", "C2aaaaaaaaaaaa", "D2aaaaaaaa", "E2aaaaaaaaaaaaaa"};

    private void assignViews() {
        drawerTwoBtn = (Button) findViewById(R.id.drawer_two_btn);
        drawerTwoBtn.setOnClickListener(this);
        drawerOtwoListview = (ListView) findViewById(R.id.drawer_otwo_listview);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swiperefreshlayout_id);
        swipeRefreshLayout.setOnRefreshListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        assignViews();
        list = new ArrayList<>();

    }

    @Override
    public void onRefresh() {
        swipeRefreshLayout.setRefreshing(true);
        /*为何在线程中延时时快速刷新时出现：
        * The content of the adapter has changed but ListView did not receive a notification. Make sure the content of your adapte*/
        new Thread() {
            @Override
            public void run() {
                super.run();

                for (int i = 0; i < 5; i++) {
                    list.add(new Drawer_two(srt0[i], srt1[i], srt2[i], srt3[i], ima[i]));
                }

            }
        }.start();
/*快速滑动刷新没问题*/
     /*   for (int i = 0; i < 5; i++) {
            list.add(new Drawer_two(srt0[i], srt1[i], srt2[i], srt3[i], ima[i]));
        }*/

        swipeRefreshLayout.setRefreshing(false);
        if (drawer_two_adapter == null) {
            drawer_two_adapter = new Drawer_two_adapter(TwoActivity.this, list);
            drawerOtwoListview.setAdapter(drawer_two_adapter);
        } else {
            drawerOtwoListview.requestLayout();
            drawer_two_adapter.notifyDataSetChanged();
            //drawer_two_adapter.adapterchanaged(TwoActivity.this, list);
        }



/*
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    list.add(new Drawer_two(srt0[i], srt1[i], srt2[i], srt3[i], ima[i]));
                }

              *//*  if (drawer_two_adapter == null) {
                    drawer_two_adapter = new Drawer_two_adapter(TwoActivity.this, list);
                    drawerOtwoListview.setAdapter(drawer_two_adapter);
                } else {
                    drawer_two_adapter.adapterchanaged(TwoActivity.this, list);
                }*//*
            }
        }, 4000);

        if (drawer_two_adapter == null) {
            drawer_two_adapter = new Drawer_two_adapter(TwoActivity.this, list);
            drawerOtwoListview.setAdapter(drawer_two_adapter);
        } else {
            drawer_two_adapter.adapterchanaged(TwoActivity.this, list);
        }

        swipeRefreshLayout.setRefreshing(false);*/
    }

    @Override
    public void onClick(View view) {

    }
}
