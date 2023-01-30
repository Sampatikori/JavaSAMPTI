package com.Xworkz.specs.repo;

import java.util.List;

import com.Xworkz.specs.dto.SpecsDto;

public interface SpecsRepo {
	public boolean create(SpecsDto dto);
	public List<SpecsDto> read();
	public SpecsDto findByShapeAndPrice(String shape,int price);
    public boolean updatePriceByName(int price,String name);
    public boolean updateColorByPriceAndShape(String colour,int price,String shape);
    public boolean deleteByPriceAndColor(int price,String colour);
    public boolean deleteByNameAndId(String name,int id);
}
