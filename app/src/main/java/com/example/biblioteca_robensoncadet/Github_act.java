package com.example.biblioteca_robensoncadet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Github_act extends AppCompatActivity {

    private Spinner spin;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spin = (Spinner) findViewById(R.id.spinLibros);
        text = (TextView) findViewById(R.id.tv);

        String[] Libros = {"Farenheit", "Revival", "El Alquimista", "El poder", "Despertar"};

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Libros);
        spin.setAdapter(adapt);

    }
    public void text(View v) {

        String libro = spin.getSelectedItem().toString();

        if (libro.equals("Farenheit")) {
            int operacion = 7000;
            String valor = String.valueOf(operacion);
            text.setText("El valor de " + libro + " es: " + valor);
            return;

        }

        if (libro.equals("Revival")) {
            int operacion = 22000;
            String valor = String.valueOf(operacion);
            text.setText("El valor de " + libro + " es: " + valor);
            return;

        }

        if (libro.equals("El Alquimista")) {
            int operacion = 45000;
            String valor = String.valueOf(operacion);
            text.setText("El valor de " + libro + " es: " + valor);
            return;

        }

        if (libro.equals("El poder")) {
            int operacion = 88000;
            String valor = String.valueOf(operacion);
            text.setText("El valor de " + libro + " es: " + valor);
            return;

        }

        if (libro.equals("Despertar")) {
            int operacion = 156000;
            String valor = String.valueOf(operacion);
            text.setText("El valor de " + libro + " es: " + valor);
            return;

        }
    }
}