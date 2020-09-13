package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button TentangSaya;
    Button FotoSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TentangSaya = (Button)findViewById(R.id.TentangSaya);
        TentangSaya.setOnClickListener(this);
        FotoSaya = (Button)findViewById(R.id.FotoSaya);
        FotoSaya.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TentangSaya:
                Intent About = new Intent(MainActivity.this, TentangSaya.class);
                startActivity(About);
                break;
            case R.id.FotoSaya:
                Intent Gal = new Intent(MainActivity.this, FotoSaya.class);
                startActivity(Gal);
                break;
            default:
                break;
        }
    }
}