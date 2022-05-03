package com.ubnsoftware.encuestasutp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.Console;

public class AppActivity extends AppCompatActivity {

    private Button btnEncuesta, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        btnEncuesta = findViewById(R.id.btnEncuesta);
        btnSalir = findViewById(R.id.btnSalir);

        btnEncuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent iEncuesta = new Intent(AppActivity.this, EncuestaActivity.class);
                    startActivity(iEncuesta);
                }catch (Exception e){
                    Log.e("error", "Error al cambiar activity");
                }
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    finish();
            }
        });
    }
}