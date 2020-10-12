package br.senai.sc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";
    private String resultado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.tv_display);
    }

    public void onClickBotao1(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "1";
        } else {
            segundoNumero = segundoNumero + "1";
        }
        atualizaDisplay("1");
    }

    public void onClickBotao2(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "2";
        } else {
            segundoNumero = segundoNumero + "2";
        }
        atualizaDisplay("2");
    }

    public void onClickBotao3(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "3";
        } else {
            segundoNumero = segundoNumero + "3";
        }
        atualizaDisplay("3");
    }

    public void onClickBotao4(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "4";
        } else {
            segundoNumero = segundoNumero + "4";
        }
        atualizaDisplay("4");
    }

    public void onClickBotao5(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "5";
        } else {
            segundoNumero = segundoNumero + "5";
        }
        atualizaDisplay("5");
    }

    public void onClickBotao6(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "6";
        } else {
            segundoNumero = segundoNumero + "6";
        }
        atualizaDisplay("6");
    }

    public void onClickBotao7(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "7";
        } else {
            segundoNumero = segundoNumero + "7";
        }
        atualizaDisplay("7");
    }

    public void onClickBotao8(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "8";
        } else {
            segundoNumero = segundoNumero + "8";
        }
        atualizaDisplay("8");
    }

    public void onClickBotao9(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "9";
        } else {
            segundoNumero = segundoNumero + "9";
        }
        atualizaDisplay("9");
    }

    public void onClickBotao0(View v){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + "0";
        } else {
            segundoNumero = segundoNumero + "0";
        }
        atualizaDisplay("0");
    }

    public void onClickLimpar(View v){
        resultado = "";
        primeiroNumero = "";
        segundoNumero = "";
        operacao = "";
        display.setText(String.valueOf(resultado));
    }

    public void onClickDivisao(View v){
        if (!primeiroNumero.isEmpty()) {
            operacao = "/";
            atualizaDisplay("/");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickMultiplicacao(View v){
        if (!primeiroNumero.isEmpty()) {
            operacao = "x";
            atualizaDisplay("x");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickAdicao(View v){
        if (!primeiroNumero.isEmpty()) {
            operacao = "+";
            atualizaDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickSubtracao(View v){
        if (!primeiroNumero.isEmpty()) {
            operacao = "-";
            atualizaDisplay("-");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_LONG).show();
        }
    }





    public void onClickIgual(View v){
        if (!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()){
            int numero1 = Integer.parseInt(primeiroNumero);
            int numero2 = Integer.parseInt(segundoNumero);

            if (operacao.equals("x")) {
                int resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("/")) {
                if (numero1==0){
                    Toast.makeText(MainActivity.this, "Não é possivel dividir por 0", Toast.LENGTH_LONG).show();
                } else {
                    int resultado = numero1 / numero2;
                    display.setText(String.valueOf(resultado));
                }
            }
            if (operacao.equals("+")) {
                int resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("-")) {
                int resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }
        } else {
            Toast.makeText(MainActivity.this, "Nenhuma operação foi solicitada", Toast.LENGTH_LONG).show();
        }
    }


    public void atualizaDisplay(String texto){
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }
}