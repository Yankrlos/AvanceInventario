package com.example.inventario;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import Adaptadores.AdaptadorProducto;
import Entidades.Producto;
import static com.example.inventario.MainActivity.lstProducto;

public class Producto_Main extends AppCompatActivity {
    AdaptadorProducto AdaptadorProduct;
    RecyclerView rvProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto__main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AddProductos();
        rvProductos=findViewById(R.id.rvProductos);
        RecyclerView.LayoutManager ly = new  LinearLayoutManager(getApplicationContext());
        rvProductos.setLayoutManager(ly);
        AdaptadorProduct = new AdaptadorProducto(lstProducto);

        rvProductos.setAdapter(AdaptadorProduct);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    public void AddProductos(){
        Producto p1 = new Producto("1", "Shampoo", "1", "12-10-2019", "8.50");
        Producto p2=  new Producto("2", "Acrilico", "3", "11-10-2019", "5.00");
        Producto p3 = new Producto("3", "Acondicionador", "4", "05-10-2019", "15.60");
        Producto p4 = new Producto("4", "Mascarilla", "1", "01-09-2019", "4.76");
        Producto p5 = new Producto("5", "Maquillaje", "2", "12-03-2019", "23.50");
        Producto p6 = new Producto("6", "Unas", "4", "05-10-2019", "15.60");
        Producto p7 = new Producto("7", "Labial", "1", "01-09-2019", "4.76");
        Producto p8 = new Producto("8", "Sombas", "2", "12-03-2019", "23.50");
        lstProducto.add(p1);
        lstProducto.add(p2);
        lstProducto.add(p3);
        lstProducto.add(p4);
        lstProducto.add(p5);
        lstProducto.add(p6);
        lstProducto.add(p7);
        lstProducto.add(p8);
    }

}
