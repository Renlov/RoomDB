package com.example.roomdb.Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdb.Model.Car;
import com.example.roomdb.Utils.Util;

import java.util.List;

@Dao
public interface CarDAO {

    @Insert
    public long addCar(Car car);

    @Update
    public void updateCar(Car car);

    @Delete
    public void deleteCar(Car car);

    @Query("select * from cars")
    public List<Car> getAllCars();

    @Query("select * from cars where car_id ==:carId ")
    public Car getCar(long carId);
}
