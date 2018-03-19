package com.example.bhupendra.myapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class alert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);


    }

    public void exit(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("confirm exit.");
        builder.setMessage("Are you sure you exit..");
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                Toast.makeText(alert.this, "YOu click no...", Toast.LENGTH_LONG).show();

            }
        });

        builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(alert.this, "cancel", Toast.LENGTH_LONG).show();

            }
        });


    AlertDialog alertDialog = builder.create();
        alertDialog.show();
}
}
