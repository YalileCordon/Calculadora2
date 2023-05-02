package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    float num1 = 0.0f;
    float num2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        //txtResultado.setText("Hola mundo");
    }

    public void EscribirNum7(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("7");
        } else {
            txtResultado.setText(txtResultado.getText() + "7");
        }
    }

    public void EscribirNum8(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("8");
        } else {
            txtResultado.setText(txtResultado.getText() + "8");
        }
    }

    public void EscribirNum9(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("9");
        } else {
            txtResultado.setText(txtResultado.getText() + "9");
        }
    }

    public void EscribirNum4(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("4");
        } else {
            txtResultado.setText(txtResultado.getText() + "4");
        }
    }

    public void EscribirNum5(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("5");
        } else {
            txtResultado.setText(txtResultado.getText() + "5");
        }
    }

    public void EscribirNum6(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("6");
        } else {
            txtResultado.setText(txtResultado.getText() + "6");
        }
    }

    public void EscribirNum1(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("1");
        } else {
            txtResultado.setText(txtResultado.getText() + "1");
        }
    }

    public void EscribirNum2(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("2");
        } else {
            txtResultado.setText(txtResultado.getText() + "2");
        }
    }

    public void EscribirNum3(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("3");
        } else {
            txtResultado.setText(txtResultado.getText() + "3");
        }
    }

    public void EscribirNum0(View view) {
        float num1 = Float.parseFloat(txtResultado.getText().toString());
        if (num1 == 0.0f) {
            txtResultado.setText("0");
        } else {
            txtResultado.setText(txtResultado.getText() + "0");
        }
    }

    public void LimpiarResultado(View view) {
            txtResultado.setText("0");
            num1=0;
            num2= 0;
            operacion = "";

    }
    public void Borrar(View view) {
        String text = txtResultado.getText().toString(); txtResultado.setText(text.substring(0,text.length() - 1));
    }
    public void OperacionPorcentaje(View view) {
        num1 = Float.parseFloat(txtResultado.getText().toString());
        operacion="%";
        txtResultado.setText("0");
    }
    public void OperacionDivir(View view) {
        num1 = Float.parseFloat(txtResultado.getText().toString());
        operacion="/";
        txtResultado.setText("0");
    }
    public void OperacionMultiplicar(View view) {
        num1 = Float.parseFloat(txtResultado.getText().toString());
        operacion="*";
        txtResultado.setText("0");
    }
    public void OperacionRestar(View view) {
        num1 = Float.parseFloat(txtResultado.getText().toString());
        operacion="-";
        txtResultado.setText("0");
    }
    public void OperacionSumar(View view) {
        num1 = Float.parseFloat(txtResultado.getText().toString());
        operacion="+";
        txtResultado.setText("0");
    }

    public void Igual(View view) {
        num2 = Float.parseFloat(txtResultado.getText().toString());
        if (operacion.equals("/")){
            if (num2 == 0.0f){
                txtResultado.setText("0");
                Toast.makeText(this, "Operación no válida", Toast.LENGTH_LONG).show();
            }else {
                float resultado = num1 / num2;
                txtResultado.setText(resultado + "");
            }
        } else if (operacion.equals("%")){
            float resultado = num1*(num2/100);
            txtResultado.setText(resultado + "");
        }else if (operacion.equals("*")){

                float resultado = num1 * num2;
                txtResultado.setText(resultado + "");
        }else if (operacion.equals("-")){
            float resultado = num1 - num2;
            txtResultado.setText(resultado + "");
        }else if (operacion.equals("+")){
            float resultado = num1 + num2;
            txtResultado.setText(resultado + "");
        }
    }


}