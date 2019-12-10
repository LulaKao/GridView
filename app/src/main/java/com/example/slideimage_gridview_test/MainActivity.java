package com.example.slideimage_gridview_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView grid_recycler;
    GridLayoutManager layoutManager;
    GridAdapter gridAdapter;

    private int iconId[]={R.drawable.action,R.drawable.all,R.drawable.all3,R.drawable.art,R.drawable.art2,R.drawable.new2,R.drawable.selfie,R.drawable.selfie2};
    private String nameList[]={"test1","test2","test3","test4","test5","test6","test7","test8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_recycler = findViewById(R.id.GridViewRecycler);
        layoutManager = new GridLayoutManager(MainActivity.this,4); // 每行4個
        grid_recycler.setHasFixedSize(true); // 確保 RecyclerView 在增減 item 時，item 的寬高都不會改變
        grid_recycler.setLayoutManager(layoutManager);

        gridAdapter = new GridAdapter(MainActivity.this,iconId,nameList);
        grid_recycler.setAdapter(gridAdapter);
    }
}