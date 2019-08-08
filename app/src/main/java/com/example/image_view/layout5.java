package com.example.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout5 extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout5);

        explicitintent5 = (Button) findViewById(R.id.btnlanjut5);
        explicitintent5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlanjut5:
                Intent explicit5 = new Intent(this, layout6.class);
                startActivity(explicit5);
                break;
        }
    }
}
