package com.Xworkz.Mall.Repository;

import com.Xworkz.Mall.MallDTO;

public interface MallRepo {
     boolean save(MallDTO dto);
     boolean read(MallDTO dto);
     boolean findbyName(MallDTO dto);
}
