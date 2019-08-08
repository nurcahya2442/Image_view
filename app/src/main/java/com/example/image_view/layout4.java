package com.example.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout4 extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout4);

        explicitintent4 = (Button) findViewById(R.id.btnlanjut4);
        explicitintent4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlanjut4:
                Intent explicit4 = new Intent(this, layout5.class);
                startActivity(explicit4);
                break;
        }
    }
}
