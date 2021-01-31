package com.ugb.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view){
        TextView tempVal = (TextView)findViewById(R.id.txtnum1);
        double num1 = Double.parseDouble(tempVal.getText().toString());

        tempVal = (TextView)findViewById(R.id.txtnum2);
        double num2 = Double.parseDouble(tempVal.getText().toString());

        double respuesta = 1;
        RadioButton optOperacionesBasicas = findViewById(R.id.optSuma);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 + num2;
        }
        optOperacionesBasicas = findViewById(R.id.optResta);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 - num2;
        }
        optOperacionesBasicas = findViewById(R.id.optMultiplicacion);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 * num2;
        }
        optOperacionesBasicas = findViewById(R.id.optDivision);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 / num2;
        }
        optOperacionesBasicas = findViewById(R.id.optFactorial);
        // i++ -> i=i+1 -> i+=1
        if( optOperacionesBasicas.isChecked() ) {
            for(int i=2; i<=num1; i++){
                respuesta *=i;
            }
        }
        optOperacionesBasicas = findViewById(R.id.optExponente);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = Math.pow(num1, num2);
            }
        optOperacionesBasicas = findViewById(R.id.optRaiz);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = Math.pow(num1, 1/num2);
        }
        optOperacionesBasicas = findViewById(R.id.optPorcentaje);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 % num2;
        }
        optOperacionesBasicas = findViewById(R.id.optExponente);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = Math.pow(num1>num2);
        }

        Spinner cboOperacionesBasicas = findViewById(R.id.cboOperacionesBasicas);
        switch (cboOperacionesBasicas.getSelectedItemPosition()) {
            case 0://suma
                respuesta = num1 + num2;
                break;

            case 1://Resta
                respuesta = num1 - num2;
                break;

            case 2://Multiplicacion
                respuesta = num1 * num2;
                break;

            case 3://Division
                respuesta = num1 / num2;
                break;

            case 4://Factorial
                if (i=2){
                }
                respuesta = *=i
                break;

            case 5: //Exponente
                respuesta = Math.pow(num1, num2);
                break;

            case 6: //Raiz
                respuesta = Math.pow(num1, 1/num2);
                break;

            case 7: //Mod
                respuesta = num1 % num2;
                break;

            case 8: //Num mayor
                if (num1 > num2) {
                    respuesta = num1;
                } else  {
                    respuesta = num2;
                }
                break;
        }
        tempVal = findViewById(R.id.lblRespuesta);
        tempVal.setText("Respuesta: "+ respuesta );
    }
}