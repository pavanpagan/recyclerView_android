package com.example.pavan.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<holder> list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();

        list.add(new holder("ReactJs",R.drawable.re));
        list.add(new holder("Node.js",R.drawable.node));
        list.add(new holder("AngularJS",R.drawable.angular));
        list.add(new holder("ReactJs",R.drawable.re));
        list.add(new holder("Node.js",R.drawable.node));
        list.add(new holder("AngularJS",R.drawable.angular));
        list.add(new holder("ReactJs",R.drawable.re));
        list.add(new holder("Node.js",R.drawable.node));
        list.add(new holder("0",R.drawable.angular));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);

        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,list);

        myrv.setLayoutManager(new LinearLayoutManager(this));
        myrv.setAdapter(myAdapter);

    }
}
