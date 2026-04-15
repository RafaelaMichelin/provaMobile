package com.rafaela.prova;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Product.class}, version = 1)
public abstract class ProductDatabase extends RoomDatabase {

    private static ProductDatabase instance;

    //Metodo abstrado implementado pela ROOM para acessar as operações do DAO
    public abstract ProductDao productDao();

    //Retornar instância do BD
    public static synchronized ProductDatabase getInstance(Context context)
    {
        if(instance == null){
            //Então, cria a instância no banco
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    ProductDatabase.class,"product-database").fallbackToDestructiveMigration().allowMainThreadQueries().build();
        }
        return instance;
    }
}
