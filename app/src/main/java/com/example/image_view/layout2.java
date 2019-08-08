package com.example.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;


public class layout2 extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        explicitintent2 = (Button) findViewById(R.id.btnlanjut2);
        explicitintent2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlanjut2:
                Intent explicit2 = new Intent(layout2.this, layout3.class);
                startActivity(explicit2);
                break;
        }

    }
}
