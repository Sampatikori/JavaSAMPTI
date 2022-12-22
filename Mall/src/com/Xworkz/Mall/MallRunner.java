package com.Xworkz.Mall;

import java.util.Iterator;
import java.util.List;

import com.Xworkz.Mall.Service.MallService;
import com.Xworkz.Mall.Service.MallServiceImpl;

public class MallRunner {

	public static void main(String[] args) {
		
		MallDTO orian=new MallDTO("Orian","Malleshwaram",4,100,true);
		MallDTO asian=new MallDTO("Asian","Jaynagar",4,150,true);
		MallDTO reliance=new MallDTO("Reliance","RRNagar",3,100,true);
	MallDTO shraddha=new MallDTO("Shraddha","Electroniccity",3,85,true);
	
	MallService service=new MallServiceImpl();
	service.save(shraddha);
	service.save(asian);
	service.save(reliance);
	service.save(orian);
	
	
	           List<MallDTO> read =service.read();
	           for (MallDTO mallDTO : read) {
				 System.out.println(mallDTO);
	
	           }
	             =service.findByName("Orian");    
			
		}
	}
	


