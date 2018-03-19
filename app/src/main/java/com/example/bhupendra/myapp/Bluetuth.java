package com.example.bhupendra.myapp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class Bluetuth extends AppCompatActivity {
    private BluetoothAdapter AB;
    private Set<BluetoothDevice> pairedevice;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetuth);
        AB = BluetoothAdapter.getDefaultAdapter();
        lv = (ListView) findViewById(R.id.ls);
    }

    public void on(View v)
    {
       if(!AB.isEnabled())
       {
           Intent intent=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
           startActivityForResult(intent, 0);
       }
       else
       {
           Toast.makeText(this, "Enable", Toast.LENGTH_SHORT).show();
       }

    }
    public  void of(View view)
    {
      AB.disable();
      Toast.makeText(this,"off",Toast.LENGTH_LONG).show();
    }
    public void Visable(View view)
    {
        Intent intent=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(intent,0);
        Toast.makeText(this,"bluethooth visable on 20sec",Toast.LENGTH_LONG).show();
    }
    public  void PairDivice(View view)
    {
        pairedevice=AB.getBondedDevices();
        ArrayList arrayList=new ArrayList();
        for(BluetoothDevice bt:pairedevice) {
            arrayList.add(bt.getName());
        }
          final ArrayAdapter arrayAdapter =new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,arrayList);

                  lv.setAdapter(arrayAdapter);
        }


  }



