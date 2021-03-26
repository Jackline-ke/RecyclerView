package com.example.recyclerviewdiy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //create an arrayList and recyclerView and initialize them
    private ArrayList<items>listItems;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the recyclerView by id
        recyclerView = findViewById(R.id.recyclerView);
        //initialize the arrayList
        listItems = new ArrayList<>();

        //create a method that will randomly fetch data
        setInformation();
        //create a method that sets the adapter to the recyclerView
        setAdapter();
    }

    private void setAdapter() {
        //we first create an instance of our adapter
        adapter RecyclerAdapter = new adapter(listItems);
        //we need to set the layout manager, itemAnimator and adapter
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(RecyclerAdapter);
    }

    private void setInformation() {
        listItems.add(new items(R.drawable.ic_launcher_background, "Hey its my first time creating a RecyclerView yeah!!!"));
        listItems.add(new items(R.drawable.ic_launcher_background, "I guess one has to try!!!"));
        listItems.add(new items(R.drawable.ic_launcher_background, "Just do it!!!"));
        listItems.add(new items(R.drawable.ic_launcher_background, "Lets get started!!!"));
        listItems.add(new items(R.drawable.ic_launcher_background, "Hey its my first time creating a RecyclerView yeah!!!"));
        listItems.add(new items(R.drawable.ic_launcher_background, "I guess one has to try!!!"));
        listItems.add(new items(R.drawable.ic_launcher_background, "Just do it!!!"));
        listItems.add(new items(R.drawable.ic_launcher_background, "Lets get started!!!"));

    }
}