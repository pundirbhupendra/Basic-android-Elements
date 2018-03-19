package com.example.bhupendra.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class Scrollvw extends AppCompatActivity {
GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollvw);
    }
}
