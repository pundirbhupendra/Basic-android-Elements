package com.example.bhupendra.myapp;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class notifig extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifig);

        Button button=(Button)findViewById(R.id.bt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NotificationCompat.Builder builder= new NotificationCompat.Builder(notifig.this);

                builder.setSmallIcon(R.mipmap.ic_launcher);
                builder.setContentText("hi");
                builder.setContentTitle("hello");
                NotificationManager bm=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);


                bm.notify(1,builder.build());


                }
        });
    }
}
