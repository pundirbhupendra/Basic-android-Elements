package com.example.bhupendra.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Custmlistvw extends AppCompatActivity {

    String name[] ={"Ankit", "Bhupender", " Chandan", " Deepak"};

    String Age[]={"17","18","19","19"};

  int photo[]={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

ListView listView;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custmlistvw);

    listView=findViewById(R.id.lw);
    CustomAdapter customAdapter =new CustomAdapter(this,name,Age,photo);
    listView.setAdapter(customAdapter);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Toast.makeText(getApplicationContext(),"clicked"+name[position],Toast.LENGTH_LONG).show();
        }
    });

    }
}
