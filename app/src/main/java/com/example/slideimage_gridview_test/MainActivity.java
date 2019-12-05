package com.example.slideimage_gridview_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Integer> list = new ArrayList<>(4); // 4 張 banner
    RecyclerView grid_recycler;
    GridLayoutManager layoutManager;
    GridAdapter gridAdapter;

    private int iconId[]={R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd,R.drawable.ee,R.drawable.ff};
    private String nameList[]={"十股糖仁文創園區","國家歌劇院","傳統藝術中心","清水斷崖","奇美博物館","六福村"};

    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_recycler = findViewById(R.id.GridViewRecycler);
        layoutManager = new GridLayoutManager(MainActivity.this,2); // 每行兩個
        grid_recycler.setHasFixedSize(true); // 確保 RecyclerView 在增減 item 時，item 的寬高都不會改變
        grid_recycler.setLayoutManager(layoutManager);

        gridAdapter = new GridAdapter(MainActivity.this,iconId,nameList);
        grid_recycler.setAdapter(gridAdapter);
    }
}
