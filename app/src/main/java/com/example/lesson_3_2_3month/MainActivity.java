package com.example.lesson_3_2_3month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_btn;
    private ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_btn = findViewById(R.id.rv_button);
        loadData();
        BtnAdapter adapter = new BtnAdapter(names);
        rv_btn.setAdapter(adapter);


    }

    private void loadData() {
        names.add("Edu");
        names.add("Tima");
        names.add("Akti");
        names.add("Bitu");
        names.add("Niyaz");
        names.add("Ars");
        names.add("Erbolot");
        names.add("Isko");
        names.add("Rabota");
        names.add("Boss");
        names.add("Эта верная");
        names.add("Тыкни сюда");
        names.add("Просто есть");
    }

}