package com.rafaela.prova;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface ProductDao {
    //Método inserir dados

    @Insert
    void Insert(Product product);
}
