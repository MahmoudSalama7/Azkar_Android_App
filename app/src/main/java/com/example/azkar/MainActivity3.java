package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
int counter=0;
    Button bo;
    Button boo;
    TextView te;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        te=(TextView) findViewById(R.id.textView2);
        bo=(Button) findViewById(R.id.button);
        boo=(Button)findViewById(R.id.button3) ;
//        image_button= (ImageButton) findViewById(R.id.imageButton);
//
//
//        image_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                counter++;
//                te.setText(Integer.toString(counter));
//            }
//        });



        boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                te.setText(Integer.toString(counter));
            }
        });
        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter++;
                te.setText(Integer.toString(counter));

            }
        });
    }
}
