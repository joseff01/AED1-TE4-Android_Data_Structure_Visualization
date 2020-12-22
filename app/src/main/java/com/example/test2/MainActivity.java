package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;
    LinearLayout listaView;

    ArrayList<TextView> lista = new ArrayList<>();
    ArrayList<ImageView> listaflecha = new ArrayList<>();
    String pasado = "0";
    String pasado2 = "0";
    String futuro = "0";
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.But);
        listaView = (LinearLayout) findViewById(R.id.ListaView);
    }

    public void onClick(View v) {
        ImageView flecha = new ImageView(this);
        flecha.setImageResource(R.drawable.arrowme);
        flecha.setImageAlpha(0);
        TextView nodo  = new TextView(this);

        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        String string = editText.getText().toString();
        System.out.println(string);
        nodo.setText(string+"\n ----------\n"+ pasado+" XOR 0");

        if(pasado.equals("0")){
            pasado = string;
            nodo.setGravity(Gravity.CENTER);
            nodo.setBackgroundResource(R.drawable.rectangle);
            nodo.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            lista.add(nodo);
            listaflecha.add(flecha);
        }
        else{
            nodo.setGravity(Gravity.CENTER);
            nodo.setBackgroundResource(R.drawable.rectangle);
            nodo.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            futuro = string;
            lista.add(nodo);
            listaflecha.add(flecha);
            listaflecha.get(cont).setImageAlpha(255);
            lista.get(cont++).setText(pasado+"\n ----------\n"+ pasado2+" XOR "+futuro);
            pasado2 = pasado;
            pasado = string;
        }
        listaView.addView(nodo);
        listaView.addView(flecha);


    }
}