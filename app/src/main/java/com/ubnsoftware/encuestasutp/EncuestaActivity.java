package com.ubnsoftware.encuestasutp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class EncuestaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        Spinner sedes = (Spinner) findViewById(R.id.spSedes);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,
                R.array.sedes, android.R.layout.simple_spinner_dropdown_item);

        sedes.setAdapter(adapter);

        sedes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
                if (item.equals("ELIGE UNA SEDE:")){
                    return;
                }
                else{
                    Toast.makeText(getApplicationContext(), "SELECCIONASTE LA SEDE: " + item,
                            Toast.LENGTH_SHORT).show();
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner estadoEmpleo = (Spinner) findViewById(R.id.spEstadoEmpleo);
        ArrayAdapter<CharSequence> adapter1= ArrayAdapter.createFromResource(this,
                R.array.estadoEmpleo, android.R.layout.simple_spinner_dropdown_item);

        estadoEmpleo.setAdapter(adapter1);

        estadoEmpleo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
                if (item.equals("ELIGE UNA OPCIÓN:")){
                    return;
                }
                else{
                    Toast.makeText(getApplicationContext(), "SELECCIONASTE LA SEDE: " + item,
                            Toast.LENGTH_SHORT).show();
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Spinner gradoEstudio = (Spinner) findViewById(R.id.spGradoEstudio);
        ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,
                R.array.gradoEstudido, android.R.layout.simple_spinner_dropdown_item);

        gradoEstudio.setAdapter(adapter2);

        gradoEstudio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
                if (item.equals("ELIGE UNA OPCIÓN:")){
                    return;
                }
                else{
                    Toast.makeText(getApplicationContext(), "SELECCIONASTE LA SEDE: " + item,
                            Toast.LENGTH_SHORT).show();
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}