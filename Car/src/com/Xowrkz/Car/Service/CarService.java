package com.Xowrkz.Car.Service;

import java.util.List;

import com.Xworkz.Cars.CarDTO;

public interface CarService {
  public boolean save(CarDTO dto);
  public List<CarDTO> read();
  public CarDTO findByName(String name);
  public CarDTO deleteByIndex(int index);
  public CarDTO updateNameByIndex(String name, int index);
  public CarDTO updateColourByIndex(String colour, int index);
  public CarDTO updateSpeedByBrand(int speed,String brand);
  public CarDTO updatePriceByType(int price, String type);
  public CarDTO deleteBrandByColour(String brand,String colour);
}
