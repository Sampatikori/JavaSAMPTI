package com.Xworkz.Learning.collection.map.hash_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ManagerEmployeeDemo {
	public static void main(String[] args) {
		
		Manager sharan=new Manager();
		sharan.setName("Sharan");
		sharan.setId("s01");
		
		Manager shree=new Manager();
		shree.setName("Shree");
		shree.setId("s02");
		
		Employee rahul=new Employee();
		rahul.setName("Rahul");
		rahul.setId("e01");
		
		Employee vijay=new Employee();
		vijay.setName("Vijay");
		vijay.setId("e02");
		
		Employee dileep=new Employee();
		dileep.setName("Dileep");
		dileep.setId("e03");
		
		Employee prajwal=new Employee();
		prajwal.setName("Prajwal");
		prajwal.setId("e04");
		
		ArrayList<Employee> employeeList1=new ArrayList<Employee>();
		employeeList1.add(dileep);
		employeeList1.add(prajwal);
		
		ArrayList<Employee> employeeList2=new ArrayList<Employee>();
		employeeList2.add(vijay);
		employeeList2.add(rahul);
		
		HashMap<Manager,ArrayList<Employee>> mapManagerAndEmployees=
				new HashMap<Manager, ArrayList<Employee>>();
		mapManagerAndEmployees.put(shree, employeeList1);
		mapManagerAndEmployees.put(sharan, employeeList2);
		
//		System.out.println(mapManagerAndEmployees);
		
		for(Map.Entry<Manager, ArrayList<Employee>> entry:mapManagerAndEmployees.entrySet()) {
//			System.out.println(entry.getKey()+ " : "+ entry.getValue());
			System.out.print(entry.getKey().getName()+ " : ");
		Iterator<Employee> itr=entry.getValue().iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next().getName()+",");
		}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
