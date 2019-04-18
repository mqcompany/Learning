package com.example.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button1 = (Button)findViewById(R.id.bt1);
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
