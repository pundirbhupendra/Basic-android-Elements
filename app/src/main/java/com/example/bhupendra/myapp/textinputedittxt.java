package com.example.bhupendra.myapp;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Formattable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class textinputedittxt extends AppCompatActivity {
TextInputEditText txtusername,txtpassword;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textinputedittxt);

        txtusername=(TextInputEditText)findViewById(R.id.username);
        txtpassword=(TextInputEditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

   private void login()
    {

        if(TextUtils.isEmpty(txtusername.getText().toString().trim())|| TextUtils.isEmpty(txtpassword.getText().toString().trim()))
        {
            txtusername.setError("can'tbe empty Field");
            txtpassword.setError("can't be empty Field");

        }
        else if(!emailValValidator(txtusername.getText().toString()))
        {
        txtusername.setError("Field the Valide email ");

    }
    else
    {
        Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
    }


    }


   public boolean emailValValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher=pattern.matcher(email);
        return  matcher.matches();


    }
    }

