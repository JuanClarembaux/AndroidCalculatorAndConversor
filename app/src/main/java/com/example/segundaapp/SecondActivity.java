package com.example.segundaapp;

import android.annotation.SuppressLint;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private ImageView activitySecond_gatitoIMG;
    private EditText activitySecond_numparaop_et;
    private Button activitySecond_sumar_bt, activitySecond_restar_bt;
    private Button activitySecond_zoomPositivo_bt, activitySecond_zoomNegativo_bt;
    private Button activitySecond_resetear_bt, activitySecond_ocultar_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        activitySecond_gatitoIMG = findViewById(R.id.activitySecond_gatitoIMG);
        activitySecond_numparaop_et = findViewById(R.id.activitySecond_numparaop_et);
        activitySecond_sumar_bt = findViewById(R.id.activitySecond_sumar_bt);
        activitySecond_restar_bt = findViewById(R.id.activitySecond_restar_bt);
        activitySecond_zoomPositivo_bt = findViewById(R.id.activitySecond_zoomPositivo_bt);
        activitySecond_zoomNegativo_bt = findViewById(R.id.activitySecond_zoomNegativo_bt);
        activitySecond_resetear_bt = findViewById(R.id.activitySecond_resetear_bt);
        activitySecond_ocultar_bt = findViewById(R.id.activitySecond_ocultar_bt);
        this.findViews();
    }

    @SuppressLint("SetTextI18n")
    private void findViews(){
        activitySecond_sumar_bt.setOnClickListener(view -> activitySecond_numparaop_et.setText(sumar(Integer.parseInt(activitySecond_numparaop_et.getText().toString())) + ""));
        activitySecond_restar_bt.setOnClickListener(view -> activitySecond_numparaop_et.setText(restar(Integer.parseInt(activitySecond_numparaop_et.getText().toString())) + ""));
        activitySecond_resetear_bt.setOnClickListener(view -> activitySecond_numparaop_et.setText("0"));
        activitySecond_ocultar_bt.setOnClickListener(view -> {
            activitySecond_gatitoIMG.setVisibility(View.INVISIBLE);
            activitySecond_numparaop_et.setVisibility(View.INVISIBLE);
        });
        activitySecond_zoomNegativo_bt.setOnClickListener(view -> {
            activitySecond_gatitoIMG.setScaleX((activitySecond_gatitoIMG.getScaleX() - 0.1f));
            activitySecond_gatitoIMG.setScaleY((activitySecond_gatitoIMG.getScaleY() - 0.1f));
            activitySecond_numparaop_et.setScaleX((activitySecond_numparaop_et.getScaleX() - 0.1f));
            activitySecond_numparaop_et.setScaleY((activitySecond_numparaop_et.getScaleY() - 0.1f));
            activitySecond_sumar_bt.setScaleX((activitySecond_sumar_bt.getScaleX() - 0.1f));
            activitySecond_sumar_bt.setScaleY((activitySecond_sumar_bt.getScaleY() - 0.1f));
            activitySecond_restar_bt.setScaleX((activitySecond_restar_bt.getScaleX() - 0.1f));
            activitySecond_restar_bt.setScaleY((activitySecond_restar_bt.getScaleY() - 0.1f));
            activitySecond_zoomPositivo_bt.setScaleX((activitySecond_zoomPositivo_bt.getScaleX() - 0.1f));
            activitySecond_zoomPositivo_bt.setScaleY((activitySecond_zoomPositivo_bt.getScaleY() - 0.1f));
            activitySecond_zoomNegativo_bt.setScaleX((activitySecond_zoomNegativo_bt.getScaleX() - 0.1f));
            activitySecond_zoomNegativo_bt.setScaleY((activitySecond_zoomNegativo_bt.getScaleY() - 0.1f));
            activitySecond_resetear_bt.setScaleX((activitySecond_resetear_bt.getScaleX() - 0.1f));
            activitySecond_resetear_bt.setScaleY((activitySecond_resetear_bt.getScaleY() - 0.1f));
            activitySecond_ocultar_bt.setScaleX((activitySecond_ocultar_bt.getScaleX() - 0.1f));
            activitySecond_ocultar_bt.setScaleY((activitySecond_ocultar_bt.getScaleY() - 0.1f));
        });
        activitySecond_zoomPositivo_bt.setOnClickListener(view -> {
            activitySecond_gatitoIMG.setScaleX((activitySecond_gatitoIMG.getScaleX() + 0.1f));
            activitySecond_gatitoIMG.setScaleY((activitySecond_gatitoIMG.getScaleY() + 0.1f));
            activitySecond_numparaop_et.setScaleX((activitySecond_numparaop_et.getScaleX() + 0.1f));
            activitySecond_numparaop_et.setScaleY((activitySecond_numparaop_et.getScaleY() + 0.1f));
            activitySecond_sumar_bt.setScaleX((activitySecond_sumar_bt.getScaleX() + 0.1f));
            activitySecond_sumar_bt.setScaleY((activitySecond_sumar_bt.getScaleY() + 0.1f));
            activitySecond_restar_bt.setScaleX((activitySecond_restar_bt.getScaleX() + 0.1f));
            activitySecond_restar_bt.setScaleY((activitySecond_restar_bt.getScaleY() + 0.1f));
            activitySecond_zoomPositivo_bt.setScaleX((activitySecond_zoomPositivo_bt.getScaleX() + 0.1f));
            activitySecond_zoomPositivo_bt.setScaleY((activitySecond_zoomPositivo_bt.getScaleY() + 0.1f));
            activitySecond_zoomNegativo_bt.setScaleX((activitySecond_zoomNegativo_bt.getScaleX() + 0.1f));
            activitySecond_zoomNegativo_bt.setScaleY((activitySecond_zoomNegativo_bt.getScaleY() + 0.1f));
            activitySecond_resetear_bt.setScaleX((activitySecond_resetear_bt.getScaleX() + 0.1f));
            activitySecond_resetear_bt.setScaleY((activitySecond_resetear_bt.getScaleY() + 0.1f));
            activitySecond_ocultar_bt.setScaleX((activitySecond_ocultar_bt.getScaleX() + 0.1f));
            activitySecond_ocultar_bt.setScaleY((activitySecond_ocultar_bt.getScaleY() + 0.1f));
        });
    }
    public int sumar (int a){
        return a + 1;
    }
    public int restar (int a){ return a - 1; }

}