package com.Xworkz.Mall.Service;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Mall.MallDTO;
import com.Xworkz.Mall.Repository.MallRepo;
import com.Xworkz.Mall.Repository.MallRepoImpl;

public class MallServiceImpl implements MallService {
     
	MallRepo repo=new MallRepoImpl();
	List<MallDTO> list=new ArrayList<MallDTO>();
	
	@Override
	public boolean save(MallDTO dto) {
		if(dto!=null) {
			if(dto.getName().length()>=3) {
				System.out.println("data can be passed to repo");
				repo.save(dto);
				System.out.println("data came to repo and it is adding into the database");
				list.add(dto);
				System.out.println("data has been added to database");
				return true;
				
			}
		}
		else {
		return false;
	}
		return false;

}

	@Override
	public boolean read(MallDTO dto) {
		for (MallDTO mallDTO : list) {
			System.out.println(mallDTO);
		}
		return true;
	}

	@Override
	public boolean findbyName(MallDTO dto) {
		if(dto.getName().equals("Orian")) {
			System.out.println("condition is true");
			System.out.println(dto);
			return true;
		}
		
		return false;
	}
}
