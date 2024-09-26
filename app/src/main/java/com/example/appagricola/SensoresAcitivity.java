package com.example.appagricola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class SensoresAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_sensores);

        Button agregarNuevoSensorButton = findViewById(R.id.agregarNuevoSensorButton);
        Button modificarSensorButton = findViewById(R.id.modificarSensorButton);

        agregarNuevoSensorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SensoresAcitivity.this, CrearSensor.class);
                startActivity(intent);
            }
        });

        modificarSensorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SensoresAcitivity.this, ModificarSensorActivity.class);
                startActivity(intent);
            }
        });

        }


}
