package com.pab.modul6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Biodataku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodataku);
        final TextView hasil = (TextView)findViewById(R.id.hasildata);
        String data = getIntent().getExtras().getString("data");
        hasil.setText(data);
        Toast.makeText(this, "YOUR BUTTON CLICK BIODATA", Toast.LENGTH_SHORT).show();
    }
}