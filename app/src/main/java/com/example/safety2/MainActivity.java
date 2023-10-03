package com.example.safety2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        int arrImage[]={R.drawable.rear_bear_hug,R.drawable.shoulder_grab,R.drawable.waist_grab,R.drawable.wrist_hold,R.drawable.pinned_ground};

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new listAdapter(this,arrImage));




    }
}