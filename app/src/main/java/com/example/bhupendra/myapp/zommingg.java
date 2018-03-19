package com.example.bhupendra.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class zommingg extends AppCompatActivity {
 ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zommingg);

       // im=(ImageView)findViewById(R.id.im);
        im=findViewById(R.id.im);

        Animation ob= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        im.startAnimation(ob);
    }
}
