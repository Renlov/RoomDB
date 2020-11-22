package com.example.roomdb.Data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomdb.Model.Car;
import com.example.roomdb.Utils.Util;

@Database(entities = {Car.class}, version = 1)
public abstract class CarsAppDatabase extends RoomDatabase {

    public abstract CarDAO getCarDAO();


}
