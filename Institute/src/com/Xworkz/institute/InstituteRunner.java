package com.Xworkz.institute;

import java.util.List;

import com.Xworkz.institute.service.InstituteService;
import com.Xworkz.institute.service.InstituteServiceImpl;

public class InstituteRunner {
	public static void main(String[] args) {
		
		InstituteService service=new InstituteServiceImpl();
		
		InstituteDTO xworkz=new InstituteDTO("Xworkz", "BTM", 5, 20, "JavaDeveloping", 4); 
		InstituteDTO jspider=new InstituteDTO("Jspider", "Rajajinagar", 10, 350, "JavaDeveloping", 3); 
		InstituteDTO kodnest=new InstituteDTO("Kodnest", "BTM 2nd Stage", 6, 200, "Java Testing", 3); 
		InstituteDTO ethnus=new InstituteDTO("Ethnus", "Jayanagar", 6, 50, "AWS", 2); 
		
		service.save(ethnus);
		service.save(kodnest);
		service.save(jspider);
		System.out.println(service.save(xworkz));
		
		List<InstituteDTO> list=service.read();
		for(InstituteDTO id:list) {
			System.out.println(id);
		}
		
		InstituteDTO dto=service.updateLocationByIndex("Basavanagudi", 1);
		for(InstituteDTO dt:list) {
			System.out.println(dt);
		}
		InstituteDTO dt1=service.updateCourseByName("JavaDeveloping", "Ethnus");
		for(InstituteDTO id1:list) {
			System.out.println(id1);
		}
	}

}
