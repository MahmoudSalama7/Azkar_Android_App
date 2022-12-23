package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bu;
    Button bu2;
    Button bu3;
    Button bu4;
    Button bu5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu3=(Button) findViewById(R.id.but4);
        bu2=(Button)findViewById(R.id.button2);
        bu =(Button)findViewById(R.id.b);
        bu4=(Button)findViewById(R.id.butttonn);
        bu5=(Button) findViewById(R.id.exp);
        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            methood();
            }
        });
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://timesprayer.com/prayer-times-in-alexandria.html";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://quran.ksa.edu.sa/tafseer/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            nevgat2();
            }
        });
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nevgat();
            }
        });
    }



    public void nevgat() {
        Intent obj=new Intent(this,MainActivity2.class);
        startActivity(obj);
    }
    public void nevgat2() {
        Intent obj2=new Intent(this,MainActivity3.class);
        startActivity(obj2);
    }
    public void methood() {
        Intent obj9=new Intent(this,sonn.class);
        startActivity(obj9);
    }
}

