package com.Xworkz.television.repository;

import java.util.List;

import com.Xworkz.television.TelevisionDTO;

public interface TelevisionRepo {
	public boolean save(TelevisionDTO dto);
	public List<TelevisionDTO> read();
	public TelevisionDTO updateSizeByType(String size,String type);
    public TelevisionDTO deleteByNameAndColour(String brandname,String colour);
    public TelevisionDTO findBYNameAndSize(String brandname,String size );
    public TelevisionDTO findTypeAndColourByIndex(String type,String colour,int index);
}
