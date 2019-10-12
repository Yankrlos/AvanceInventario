package com.example.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import Entidades.Producto;

public class MainActivity extends AppCompatActivity {
    public static List<Producto> lstProducto;
    private Button btniniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstProducto = new ArrayList<>();

        btniniciar = findViewById(R.id.iniciar);

        btniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MostrarMenu();
            }
        });
    }

    private void MostrarMenu() {
        Intent in = new Intent (this, Menu.class);
        startActivity(in);
    }
}
