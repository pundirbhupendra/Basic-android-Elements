package com.example.bhupendra.myapp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
Button bt;
ImageView im;
long AnimationDuration=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt=(Button)findViewById(R.id.bt);
        im=(ImageView)findViewById(R.id.im);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              ObjectAnimator ob=ObjectAnimator.ofFloat(im,"X",420f);
              ob.setDuration(AnimationDuration);
                ObjectAnimator ob1=ObjectAnimator.ofFloat(im,"Y",420f);

                ObjectAnimator ob2=ObjectAnimator.ofFloat(im,View.ALPHA,0f,500f);
                ob2.setDuration(AnimationDuration);

                ObjectAnimator ob3=ObjectAnimator.ofFloat(im,"Rotation",0f,360f);
                ob3.setDuration(AnimationDuration);


                ob1.setDuration(AnimationDuration);
                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(ob,ob1,ob2,ob3);
                animatorSet.start();


            }

        });
    }
}
