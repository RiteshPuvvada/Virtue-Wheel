package com.madlab.spinwheel;

import androidx.appcompat.app.AppCompatActivity;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {
    Button button2;
    TextView textView4;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView4 = (TextView) findViewById(R.id.textView4);
        cl = (ConstraintLayout) findViewById(R.id.cl);
        button2 = (Button) findViewById(R.id.button2);

        Intent intent = getIntent();
        String data = intent.getStringExtra("RES");
        int color = intent.getIntExtra("COL",0);
        cl.setBackgroundColor(color);
        textView4.setText(data);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}