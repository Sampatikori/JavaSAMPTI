package com.Xowrkz.Car.Service;

import java.util.List;

import com.Xworkz.Cars.CarDTO;

public interface CarService {
  public boolean save(CarDTO dto);
  public List<CarDTO> read();
  public CarDTO findByName(String name);
  public CarDTO deleteByIndex(int index);
  public boolean updateNameByIndex(String name, int index);
  public boolean updateColourByIndex(String colour, int index);
  public boolean updateSpeedByBrand(int speed,String brand);
}
