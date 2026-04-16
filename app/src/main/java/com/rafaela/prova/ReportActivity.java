package com.rafaela.prova;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.List;

public class ReportActivity extends AppCompatActivity {
    //Campo de texto onde os dados do banco serão exibidos
    private TextView textViewReport;

    //Metodo create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Define o layout XML da tela relatório
        setContentView(R.layout.activity_report);
        textViewReport = findViewById(R.id.textViewReport);

        //Encontrar o Botão de voltar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        //Retorna usando LAMBDA
        btnVoltar.setOnClickListener(v -> voltarParaCadastro());

        //Conexão como Banco de dados
        ProductDatabase db = Room.databaseBuilder(getApplicationContext(), ProductDatabase.class, "product-database")
                .allowMainThreadQueries()
                .build();

        ProductDao productDao = db.productDao();

        //Recuperar todos os produtos cadastrados no banco e salvar em uma lista

        List<Product> productList = productDao.getAllProducts();
        //Construir uma String dentro do laço de repetição
        StringBuilder report = new StringBuilder();

        for (Product product : productList) {
            report.append("Nome: ").append(product.getName()).append("\n")
                    .append("Código: ").append(product.getCode()).append("\n")
                    .append("Preço: R$ ").append(product.getPrice()).append("\n").append("------------------").append("\n") ;
        }
        //Exibe o relatório final montado na TextView da tela
        textViewReport.setText(report.toString());

    }

    //Metodo para navegação entre telas
    private void voltarParaCadastro() {
        Intent intent = new Intent(ReportActivity.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}


