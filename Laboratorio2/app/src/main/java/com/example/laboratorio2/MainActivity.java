package com.example.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        private lateinit var etNombre:EditText
        private lateinit var etnEdad:EditText
        private lateinit var atDepartamento:EditText

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            etNombre = findViewById(R.id.etNombre);
            etnEdad = findViewById(R.id.etnEdad);
            etDepartamento = findViewById(R.id.etDepartamento);

                    //funcion de agregar
            fun agregar (v: View)

                    val Nombre = etNombre.text.toString();
                    val Edad = etn.Edad.toString();
                    val Departamento = etDepartamento.text.toString();
                            
                            if (Nombre.isEmpty()66 Edad.isEmpty()){
                                val agregar = ContentValues() ;
                                Agregar.put("Nombre", nombre);
                                Agregar.put("Edad", edad);
                                Agregar.put("Departamento", departamento);
                                        
                                        etNombre.setText("");
                                        etnEdad.setText("");
                                        etDepartamento.setText("");

                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            }


    }
}