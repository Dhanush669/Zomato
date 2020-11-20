package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView,recyclerView1,off,off1,off2,resnearyou;
    List<Datagetset> res1,res2;
    List<Datagetsetshop> shops;
    List<Integer> offers,offers1,offers2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.ordering);
        recyclerView1=findViewById(R.id.ordering1);
        off=findViewById(R.id.offers);
        off1=findViewById(R.id.offers1);
        resnearyou=findViewById(R.id.resnearyou);
        off2=findViewById(R.id.offers2);
        res1=new ArrayList<>();
        res2=new ArrayList<>();
        Datagetset dgs=new Datagetset("cake",R.drawable.cake);
        Datagetset dgs1=new Datagetset("noodles",R.drawable.noodels);
        Datagetset dgs2=new Datagetset("paneer",R.drawable.panner);
        res1.add(dgs);
        res1.add(dgs1);
        res1.add(dgs2);
        setRecyclerView(res1,recyclerView);
        Datagetset dgs3=new Datagetset("bbq",R.drawable.bbq);
        Datagetset dgs4=new Datagetset("pizza",R.drawable.pizza);
        Datagetset dgs5=new Datagetset("biriyani",R.drawable.biriyani);
        res2.add(dgs3);
        res2.add(dgs4);
        res2.add(dgs5);
        setRecyclerView(res2,recyclerView1);
        offers=new ArrayList<>();
        offers.add(R.drawable.alloffers);
        offers.add(R.drawable.pocket);
        offers.add(R.drawable.nonveg);
        setOfferView(offers,off);
        offers1=new ArrayList<>();
        offers1.add(R.drawable.pureveg);
        offers1.add(R.drawable.trending);
        offers1.add(R.drawable.hygine);
        SetQuickLink(offers1,off1);
        offers2=new ArrayList<>();
        offers2.add(R.drawable.meal);
        offers2.add(R.drawable.offers);
        offers2.add(R.drawable.zomatopro);
        SetQuickLink(offers2,off2);
        shops=new ArrayList<>();
        Datagetsetshop dgss=new Datagetsetshop("Behourz Biriyani","Biriyani, North India, Mughlai","Closes in 45 Mins","Rs.300 For One",R.drawable.biriyani);
        Datagetsetshop dgss1=new Datagetsetshop("Behourz Biriyani","Biriyani, North India, Mughlai","Closes in 45 Mins","Rs.300 For One",R.drawable.biriyani);
        shops.add(dgss);
        shops.add(dgss1);
        RecyclerAdaptershop rass=new RecyclerAdaptershop(shops,this);
        resnearyou.setAdapter(rass);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        resnearyou.setLayoutManager(linearLayoutManager);

    }

    public void setRecyclerView(List<Datagetset> list,RecyclerView rv){
        RecyclerAdapter ra=new RecyclerAdapter(list,MainActivity.this);
        rv.setAdapter(ra);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(linearLayoutManager);
    }
    public void setOfferView(List<Integer> list,RecyclerView rv){
        RecyclerAdapter1 ra=new RecyclerAdapter1(list,MainActivity.this);
        rv.setAdapter(ra);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(linearLayoutManager);
    }
    public void SetQuickLink(List<Integer> list,RecyclerView rv){
        RecyclerAdapterql ra=new RecyclerAdapterql(list,MainActivity.this);
        rv.setAdapter(ra);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(linearLayoutManager);
    }
}