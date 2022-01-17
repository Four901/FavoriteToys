package com.example.android.favoritetoys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView=(TextView) findViewById(R.id.txtid);
        String [] arr=ToyBox.getToyNames();
        txtView.append("\r\n");
        for(String toyname:arr)
        {
          txtView.append(toyname+"\r\n");
        }
    }
}