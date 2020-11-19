package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView,recyclerView1;
    List<Datagetset> datagetsetList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.ordering);
        recyclerView1=findViewById(R.id.ordering1);
        datagetsetList=new ArrayList<>();
       // Datagetset dgs=new Datagetset("cake",R.drawable.)
    }
}