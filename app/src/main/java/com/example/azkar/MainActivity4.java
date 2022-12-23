package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
Button om;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        om=(Button) findViewById(R.id.button8);
        om.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mmm();
            }
        });
    }
    public void mmm(){
        Intent omarr=new Intent(this,MainActivity.class);
        startActivity(omarr);
    }
}