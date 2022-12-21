package com.Xworkz.Mall;

import com.Xworkz.Mall.Service.MallService;
import com.Xworkz.Mall.Service.MallServiceImpl;

public class MallRunner {

	public static void main(String[] args) {
		
		MallDTO dto=new MallDTO("Orian","Malleshwaram",4,100,true);
		
		MallService service=new MallServiceImpl();
		service.save(dto);

		service.read(dto);
		
		service.findbyName(dto);
		
	}

}
