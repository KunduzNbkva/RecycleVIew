package com.example.recycleview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {
 private    RecyclerView recyclerView;
 private    MainAdapter mainAdapter;
 private    ArrayList<String> list2 = new ArrayList<>();
 private    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);
        setupRecycler();

    }

    private void setupRecycler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainAdapter=new MainAdapter();
        recyclerView.setAdapter(mainAdapter);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 2 && resultCode == RESULT_OK && intent != null){
            text = intent.getStringExtra("text");
            list2.add(text);
            mainAdapter.updateList(list2);

        }
    }

    public void onClickADD(View view) {
        Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
        startActivityForResult(intent,2);
    }
}
