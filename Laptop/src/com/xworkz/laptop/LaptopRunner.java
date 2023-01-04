package com.xworkz.laptop;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImpl;

public class LaptopRunner {

	public static void main(String[] args) {

		LaptopService service = new LaptopServiceImpl();

		LaptopDTO dell = new LaptopDTO("Dell", 35000, "24inch", "8GB", "i3", "22H2", "dh2239018dell", "64bit",
				"windows10", "dell023");
		LaptopDTO lenovo = new LaptopDTO("Lenovo", 45000, "32inch", "16GB", "i4", "23H2", "dh2239018lenovo", "32bit",
				"windows07", "lenovo021");
		LaptopDTO hp = new LaptopDTO("Hp", 48000, "28inch", "8GB", "i2", "22H2", "dh2239018hp", "64bit", "windows08",
				"hp024");
		LaptopDTO accer = new LaptopDTO("Accer", 55000, "26inch", "32GB", "i5", "26H2", "dh2239018accer", "32bit",
				"windows09", "accer025");
		LaptopDTO apple = new LaptopDTO("Apple", 90000, "29inch", "48GB", "i4", "27H2", "dh2239018apple", "64bit",
				"windows11", "apple028");
		LaptopDTO toshiba = new LaptopDTO("Toshiba", 40000, "25inch", "32GB", "i3", "28H2", "dh2239018toshiba", "32bit",
				"windows10", "toshiba026");
		LaptopDTO asus = new LaptopDTO("Asus", 43000, "28inch", "8GB", "i5", "29H2", "dh2239018asus", "64bit",
				"windows07", "asus027");
		LaptopDTO dezenbook = new LaptopDTO("Dezenbook", 45000, "32inch", "16GB", "i3", "28H2", "dh2239018dezenbook",
				"32bit", "windows08", "dezenbook029");
		LaptopDTO samsung = new LaptopDTO("Samsung", 65000, "15inch", "32GB", "i5", "27H2", "dh2239018samsung", "64bit",
				"windows09", "samsung031");
		LaptopDTO ig = new LaptopDTO("Lg", 30000, "20inch", "16GB", "i4", "25H2", "dh2239018lg", "64bit", "windows11",
				"lg034");
		LaptopDTO nokia = new LaptopDTO("Nokia", 28000, "22inch", "24GB", "i5", "28H2", "dh2239018nokia", "64bit",
				"windows10", "nokia098");

		service.save(toshiba);
		service.save(nokia);
		service.save(ig);
		service.save(samsung);
		service.save(dezenbook);
		service.save(asus);
		service.save(apple);
		service.save(accer);
		service.save(hp);
		service.save(lenovo);
		service.save(dell);

		List<LaptopDTO> list = service.read();
		for (LaptopDTO laptopDTO : list) {
			System.out.println(laptopDTO);
		}

		service.findByName("Lenovo");

		 LaptopDTO dt=service.deleteByIndex(3);
		 for (LaptopDTO laptopDTO1 : list) {
			 System.out.println(laptopDTO1);
			
		}
  
//           boolean lap = service.updateNameByIndex("Samsung", 3);
//		  System.out.println(lap);
		boolean laptodto =service.updateNameByIndex("Samsung", 3);
          for(LaptopDTO lp:list) {
        	  System.out.println(lp);
          }
			   
		   }
		 
		   
	}


