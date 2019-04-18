package com.example.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.bt1);
        button2 = (Button)findViewById(R.id.bt2);
        textView = (TextView)findViewById(R.id.text);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == button2){
            nw k = new nw();
            k.Settxt(textView);
        }
    }
}
