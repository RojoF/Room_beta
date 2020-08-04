package com.e.my_room.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.e.my_room.Nota;

/**
 * Esta clase contiene un objeto de tipo Nota, con un id y el texto de dicha Nota.
 *
 * @author Raúl Félez Jiménez
 * @version 2020.07
 */

@Database(entities = {Nota.class}, version = 2)
public abstract class NotaDatabase extends RoomDatabase {

    public abstract NotaDao getNotaDao();
}
