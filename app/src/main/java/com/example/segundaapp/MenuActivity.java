package com.example.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button pantallaDeCalculadora;
    Button pantallaDeConversor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        pantallaDeCalculadora=(Button)findViewById(R.id.sumaActivity_bt);
        pantallaDeConversor=(Button)findViewById(R.id.ConversorActivity_bt);

        pantallaDeCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
        pantallaDeConversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, ThirdActivity.class);
                startActivity(i);
            }
        });
    }
}