package com.Xworkz.Car.Repository;

import java.util.List;

import com.Xworkz.Cars.CarDTO;

public interface CarRepo {
    public boolean save(CarDTO dto);
    public List<CarDTO> read();
    public List<CarDTO> findByName(String name); 
    public boolean deleteByIndex(int index);
    public List<CarDTO> updateNameByIndex(String name , int index);
    public List<CarDTO> updateColourByIndex(String colour, int index);
    public List<CarDTO> updateSpeedByBrand(int speed, String brand);
}
