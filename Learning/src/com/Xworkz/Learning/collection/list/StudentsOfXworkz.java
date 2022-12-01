package com.Xworkz.Learning.collection.list;

public class StudentsOfXworkz {
	String name;
	String id;
	String trainername;
	
	public StudentsOfXworkz(String name,String id,String trainername) {
		this.name=name;
		this.id=id;
		this.trainername=trainername;
	}

	@Override
	public String toString() {
		return "StudentsOfXworkz [name=" + name + ", id=" + id + ", trainername=" + trainername + "]";
	}

}
