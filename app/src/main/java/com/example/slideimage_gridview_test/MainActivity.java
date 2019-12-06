package com.example.slideimage_gridview_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView grid_recycler;
    GridLayoutManager layoutManager;
    GridAdapter gridAdapter;

    private int iconId[]={R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd,R.drawable.ee,R.drawable.ff,R.drawable.gg,R.drawable.hh,R.drawable.ii,R.drawable.jj,R.drawable.kk,R.drawable.ll};
    private String nameList[]={"十股糖仁文創園區","國家歌劇院","傳統藝術中心","清水斷崖","奇美博物館","六福村","test1","test2","test3","test4","test5","test6"};

    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_recycler = findViewById(R.id.GridViewRecycler);
        layoutManager = new GridLayoutManager(MainActivity.this,4); // 每行兩個
        grid_recycler.setHasFixedSize(true); // 確保 RecyclerView 在增減 item 時，item 的寬高都不會改變
        grid_recycler.setLayoutManager(layoutManager);

        gridAdapter = new GridAdapter(MainActivity.this,iconId,nameList);
        grid_recycler.setAdapter(gridAdapter);
    }
}
