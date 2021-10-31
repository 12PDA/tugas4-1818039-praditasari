package com.example.tugas4_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BarangAdapter adapter;
    private ArrayList<Barang> barangArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter      = new BarangAdapter(barangArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);;
        recyclerView.setAdapter(adapter);
    }

    private void addData(){
        barangArrayList = new ArrayList<>();
        barangArrayList.add(new Barang("Akebonno Grill Pan 36 cm with Potato Masher and Bottle Sauce", "380 x 280 x 90 mm", "Rp 229.000", R.drawable.c_akebono));
        barangArrayList.add(new Barang("Kukuruyuk Soft Lunch Kit", "230 x 223 x 336 mm", "Rp 129.000", R.drawable.c_kukuruyuk));
        barangArrayList.add(new Barang("Technoplast Seasoning Storage", "390 x 230 x 248 mm", "Rp 149.000", R.drawable.c_seasoning));
        barangArrayList.add(new Barang("Technoplast Rice Keeper 12L", "355 x 176 x 417 mm", "Rp 179.000", R.drawable.c_ricekeep));
        barangArrayList.add(new Barang("Master Chef Granit set of 10", "505 x 125 x 355 mm", "Rp 1.199.000", R.drawable.c_masterchef10));


    }
}