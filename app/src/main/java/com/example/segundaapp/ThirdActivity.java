package com.example.segundaapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private EditText activityThird_ingreseMonto_et;
    private RadioButton activityThird_dolar_rbt, activityThird_real_rbt, activityThird_euro_rbt;
    private TextView activityThird_resultadoMonto_tv;
    private Button activityThird_convertir_bt, activityThird_reiniciar_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        activityThird_ingreseMonto_et = findViewById(R.id.activityThird_ingreseMonto_et);
        activityThird_dolar_rbt = findViewById(R.id.activityThird_dolar_rbt);
        activityThird_real_rbt = findViewById(R.id.activityThird_real_rbt);
        activityThird_euro_rbt = findViewById(R.id.activityThird_euro_rbt);
        activityThird_resultadoMonto_tv = findViewById(R.id.activityThird_resultadoMonto_tv);
        activityThird_convertir_bt = findViewById(R.id.activityThird_convertir_bt);
        activityThird_reiniciar_bt = findViewById(R.id.activityThird_reiniciar_bt);
        this.findViews();
    }

    @SuppressLint("SetTextI18n")
    private void findViews(){
        activityThird_convertir_bt.setOnClickListener(view -> {
            if (activityThird_dolar_rbt.isChecked()){
                activityThird_resultadoMonto_tv.setText(convertirEnDolar(Double.parseDouble(activityThird_ingreseMonto_et.getText().toString())) + "");
            }
            if (activityThird_real_rbt.isChecked()){
                activityThird_resultadoMonto_tv.setText(convertirEnReal(Double.parseDouble(activityThird_ingreseMonto_et.getText().toString())) + "");
            }
            if (activityThird_euro_rbt.isChecked()){
                activityThird_resultadoMonto_tv.setText(convertirEnEuro(Double.parseDouble(activityThird_ingreseMonto_et.getText().toString())) + "");
            }
        });
        activityThird_reiniciar_bt.setOnClickListener(view -> {
            activityThird_ingreseMonto_et.setText("");
            activityThird_resultadoMonto_tv.setText("");
        });
    }
    public double convertirEnDolar(double a){
        return a * 208;
    }
    public double convertirEnReal(double a){
        return a * 51;
    }
    public double convertirEnEuro(double a){
        return a * 231;
    }
}