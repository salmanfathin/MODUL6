package com.pab.modul6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setButton1(View v){
        final Button button1 = (Button) findViewById(R.id.button1);
        Intent i = new Intent(MainActivity.this, Biodataku.class);
        String biodata =
                "Nama : Salman Fathin Ahmad Syafiq\n" + "NIM  : 20210810093\n" + "Alamat : Kuningan\n" + "Prodi : Teknik Informatika";
        i.putExtra("data", biodata);
        startActivity(i);
    }

    public void setButton2(View v){
        final Button button2 = (Button) findViewById(R.id.button2);
        Intent i = new Intent(MainActivity.this, MainDetail.class);
        i.putExtra("data", button2.getText().toString());
        startActivity(i);
    }

    public void setButton3(View v){
        final Button button3 = (Button) findViewById(R.id.button3);
        Intent i = new Intent(MainActivity.this, MainDetail.class);
        i.putExtra("data", button3.getText().toString());
        startActivity(i);
    }
}