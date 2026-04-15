package com.rafaela.prova;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProductDao {
    //Metodo inserir dados
    @Insert
    void Insert(Product product);

    //Metodo para buscar todos os produtos no BD
    @Query("SELECT * FROM product")
    //Salvar o que foi selecionado em uma lista
    List<Product> getAllProducts();

}
