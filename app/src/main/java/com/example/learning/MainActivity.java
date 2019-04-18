package com.example.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        button1 = (Button)findViewById(R.id.bt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast .makeText(getApplicationContext(), "" + (int)(0 +  Math.random() * 100), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
