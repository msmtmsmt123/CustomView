package com.huangyu.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.huangyu.customview.banner.BannerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> dataList = new ArrayList<>();
        dataList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490263950073&di=c245e6da88195cd1df4b414edab5dcde&imgtype=0&src=http%3A%2F%2Fimg.sootuu.com%2Fvector%2F2007-07-01%2F066%2F1%2F664.gif");
        dataList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490263893185&di=98a25c57a2c7a6270453133c41317fc2&imgtype=0&src=http%3A%2F%2Fimg.sootuu.com%2Fvector%2F200801%2F097%2F655.jpg");
        dataList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490263897676&di=20d6f9a3c5e82190259c5e53bacf290c&imgtype=0&src=http%3A%2F%2Fimg.sootuu.com%2Fvector%2F200801%2F097%2F656.jpg");
        dataList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490263901894&di=2da0e48167e07e093d04ff840dcde11a&imgtype=0&src=http%3A%2F%2Fimg.sootuu.com%2Fvector%2F200801%2F097%2F657.jpg");
        dataList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490263960022&di=303777ced56f439c568073b05da064a6&imgtype=0&src=http%3A%2F%2Fimg.sootuu.com%2Fvector%2F200801%2F097%2F658.jpg");
        BannerView<String> bannerView = (BannerView<String>) findViewById(R.id.banner_view);
        bannerView.setView(dataList);
    }

}
