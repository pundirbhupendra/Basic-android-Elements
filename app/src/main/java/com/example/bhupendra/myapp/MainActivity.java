package com.example.bhupendra.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
  @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        String[] sr = {"java", "Android", "c"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, sr);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select the Action");
        menu.add(0, v.getId(), 0, "Delete");
        menu.add(0, v.getId(), 0, "UpperCase");
        menu.add(0, v.getId(), 0, "LowerCase");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Delete") {
            Toast.makeText(this, "Delete was pressed", Toast.LENGTH_LONG).show();

        } else if (item.getTitle() == "UpperCase") {
            Toast.makeText(this, "UpperCase was pressed", Toast.LENGTH_LONG).show();

        } else if (item.getTitle() == "LowerCase") {
            Toast.makeText(this, "lowerCase was pressed", Toast.LENGTH_LONG).show();


        }
        return true;
    }
}





