package com.introtoandroid.button_counter_mansell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private int mCounter = 0;
    Button btn;
    Button btn2;
    Button btn3;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.bt);
        txv = (TextView) findViewById(R.id.tx);
        btn2 = (Button) findViewById(R.id.bt2);
        btn3 = (Button) findViewById(R.id.bt3);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mCounter++;
                txv.setText(Integer.toString(mCounter));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mCounter--;
                txv.setText(Integer.toString(mCounter));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mCounter = 0;
                txv.setText(Integer.toString(mCounter));
            }
        });
    }
}
