package com.example.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2, button4; // КНОПКА
    Button button3;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.bt1);
        button2 = (Button) findViewById(R.id.bt2);
        button3 = (Button) findViewById(R.id.bt3);
        textView = (TextView) findViewById(R.id.text);
        button4 = (Button) findViewById(R.id.bt4);
        button4.setOnClickListener(this);
        button2.setOnClickListener(this);
        //djdjdjdjadhwaduahcjzchkjhcsudhfsdhdkjvkj
        //dfgnfdkjghdffgdyugsf
    }

    @Override
    public void onClick(View v) {
        if (v == button2) {
            nw k = new nw();
            k.Settxt(textView);
        }
        if (v == button4) {
            textView.setText("Костя сосет жопу");
            if (v == button3) {
                nw k = new nw();
                k.Settxt("Костян просто офигенный", textView);
            }
        }
    }
}
