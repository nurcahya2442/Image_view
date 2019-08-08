package com.example.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout3 extends AppCompatActivity  implements View.OnClickListener{

    Button explicitintent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);

        explicitintent3 = (Button) findViewById(R.id.btnlanjut3);
        explicitintent3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnlanjut3:
                Intent explicit3 = new Intent(this, layout4.class);
                startActivity(explicit3);
                break;
        }
    }
}
