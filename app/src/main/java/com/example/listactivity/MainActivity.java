package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    ArrayList<String> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos = new ArrayList<>();
        datos.add("Aprobado");
        datos.add("Bien");
        datos.add("Notable");
        datos.add("Sobresaliente");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, datos);

        setListAdapter(adapter);
    }

    @Override
    protected  void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l,v,position,id);
        Toast.makeText(MainActivity.this, "Has pulsado " + datos.get(position), Toast.LENGTH_SHORT).show();
    }
}
