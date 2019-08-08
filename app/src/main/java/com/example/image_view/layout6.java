package com.example.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout6 extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout6);

        explicitintent6 = (Button) findViewById(R.id.btnlanjut6);
        explicitintent6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlanjut6:
                Intent explicit6 = new Intent(this, MainActivity.class);
                startActivity(explicit6);
                break;
        }

    }
}
