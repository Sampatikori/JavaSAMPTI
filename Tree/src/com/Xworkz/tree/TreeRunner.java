package com.Xworkz.tree;

import com.Xworkz.treeDto.TreeDto;
import com.Xworkz.treeRepo.TreeRepo;
import com.Xworkz.treeRepo.TreeRepoImpl;

public class TreeRunner {

	public static void main(String[] args) {
		TreeRepo repo=new TreeRepoImpl();
		TreeDto dto=new TreeDto(1,"Beech" ,"Green","300m", "30m");
		
		repo.save(dto);

	}

}
