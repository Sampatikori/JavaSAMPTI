package com.Xworkz.Mall.Service;

import com.Xworkz.Mall.MallDTO;

public interface MallService {
	 boolean save(MallDTO dto);
     boolean read(MallDTO dto);
     boolean findbyName(MallDTO dto);
}
