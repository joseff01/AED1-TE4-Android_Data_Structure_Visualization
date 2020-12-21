package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;
    LinearLayout listaView;
    int num = 1;
    ArrayList<TextView> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.But);
        listaView = (LinearLayout) findViewById(R.id.ListaView);
    }

    public void onClick(View v) {
        TextView nodo  = new TextView(this);
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        String string = editText.getText().toString();
        System.out.println(string);
        nodo.setText(string+"\n ----------\n XOR");
        nodo.setGravity(Gravity.CENTER);
        nodo.setBackgroundResource(R.drawable.rectangle);
        nodo.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        lista.add(nodo);
        listaView.addView(nodo);

    }
}