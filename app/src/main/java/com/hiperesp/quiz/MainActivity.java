package com.hiperesp.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgOpcao1 ,rgOpcao2, rgOpcao3, rgOpcao4, rgOpcao5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnResultadoOnClick(View v) {

        RadioGroup[] perguntas = new RadioGroup[5];
        int[] respostas = new int[5];
        int acertos = 0, erros = 0;

        perguntas[0] = (RadioGroup) findViewById(R.id.rgOpcao1);
        perguntas[1] = (RadioGroup) findViewById(R.id.rgOpcao2);
        perguntas[2] = (RadioGroup) findViewById(R.id.rgOpcao3);
        perguntas[3] = (RadioGroup) findViewById(R.id.rgOpcao4);
        perguntas[4] = (RadioGroup) findViewById(R.id.rgOpcao5);

        respostas[0] = perguntas[0].getCheckedRadioButtonId();
        respostas[1] = perguntas[1].getCheckedRadioButtonId();
        respostas[2] = perguntas[2].getCheckedRadioButtonId();
        respostas[3] = perguntas[3].getCheckedRadioButtonId();
        respostas[4] = perguntas[4].getCheckedRadioButtonId();

        if (respostas[0] == R.id.radioButton3) {
            acertos++;
        } else {
            erros++;
        }

        if (respostas[1] == R.id.radioButton5) {
            acertos++;
        } else {
            erros++;
        }

        if (respostas[2] == R.id.radioButton10) {
            acertos++;
        } else {
            erros++;
        }

        if (respostas[3] == R.id.radioButton13) {
            acertos++;
        } else {
            erros++;
        }

        if (respostas[4] == R.id.radioButton20) {
            acertos++;
        } else {
            erros++;
        }

        AlertDialog.Builder resultado = new AlertDialog.Builder(MainActivity.this);
        resultado.setMessage("O novo salário é: "+(acertos));
        resultado.setNeutralButton("Ok",null);
        resultado.show();

    }
}
