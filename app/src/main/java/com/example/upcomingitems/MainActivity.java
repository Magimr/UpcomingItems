package com.example.upcomingitems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements Controller.ServerResponse{

    UpcomingItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller controller = new Controller(this);
        controller.start();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        adapter = new UpcomingItemAdapter(this);
        recyclerView.setAdapter(adapter);



        LinearLayoutManager manager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(manager);
    }


    @Override
    public void onResponse(UpcomingItem upcomingItem) {
        adapter.setData(upcomingItem.getItems());
    }
}
