package com.rafaela.prova;

import android.os.Bundle;
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
}