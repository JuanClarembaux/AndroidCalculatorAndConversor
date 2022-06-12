package com.example.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button pantallaDeCalculadora;
    private Button pantallaDeConversor;
    private Button pantallaDeContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        pantallaDeCalculadora=findViewById(R.id.sumaActivity_bt);
        pantallaDeConversor=findViewById(R.id.ConversorActivity_bt);
        pantallaDeContacto=findViewById(R.id.ContactActivity_bt);
        this.findViews();
    }

    private void findViews(){
        pantallaDeCalculadora.setOnClickListener(view -> {
            Intent i = new Intent(getBaseContext(), SecondActivity.class);
            startActivity(i);
        });
        pantallaDeConversor.setOnClickListener(view -> {
            Intent i = new Intent(getBaseContext(), ThirdActivity.class);
            startActivity(i);
        });
        pantallaDeContacto.setOnClickListener(view -> {
            Intent i = new Intent(getBaseContext(), ContactActivity.class);
            startActivity(i);
        });
    }

}