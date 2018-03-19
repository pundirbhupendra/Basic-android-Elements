package com.example.bhupendra.myapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends ArrayAdapter<String> {

    private  String [] name;
    private  String [] Age;
    private  int[] photo;
  private Activity context;


    public CustomAdapter(Activity context,String []name  ,String []Age ,int []photo ) {
        super(context,R.layout.mylist,name);
        this.context= context;
        this.name=name;
        this.Age=Age;
        this.photo=photo;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
     //   super.getView(position, convertView, parent);
        LayoutInflater inflater = context.getLayoutInflater();
       // View view= inflater.inflate(R.layout.mylist, null);
       View view = inflater.inflate(R.layout.mylist, null, true);
        TextView textView =(TextView)  view.findViewById(R.id.text);
        TextView textView1 = (TextView) view.findViewById(R.id.text1);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView2);
        textView.setText(name[position]);
        textView1.setText(Age[position]);
        imageView.setImageResource(photo[position]);
        return view;
    }

}

