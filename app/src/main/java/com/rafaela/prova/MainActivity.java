package com.rafaela.prova;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Declaração dos campos de entrada de dados
    private EditText editTextName, editTextCode, editTextAmount, editTextprice;

    //Objeto para interagir com o banco de dados(DAO)
    private ProductDao productDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Iniciar os campos de entrada de dados do Layout
        editTextName = findViewById(R.id.editTextName);
        editTextCode = findViewById(R.id.editTextCode);
        editTextprice = findViewById(R.id.editTextPrice);
        editTextAmount = findViewById(R.id.editTextAmount);

        //Iniciar botões do Layout
        Button buttonSave = findViewById(R.id.buttonSave);
        Button buttonReport = findViewById(R.id.buttonReport);

    }
}