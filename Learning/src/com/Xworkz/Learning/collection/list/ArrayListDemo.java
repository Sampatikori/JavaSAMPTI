package com.Xworkz.Learning.collection.list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arl=new ArrayList();
		
		arl.add(null);
		arl.add(1);
		arl.add(2);
		arl.add(2);
		arl.add(5);
		arl.add(3);
		System.out.println(arl);
		ArrayList arl1=new ArrayList(arl);
		
		System.out.println(arl1.isEmpty());
		System.out.println(arl1.addAll(arl));
		System.out.println(arl1.containsAll(arl));
		System.out.println(arl1.add(arl));
		
		System.out.println(arl1.get(0));
		System.out.println(arl1.size());
		System.out.println(arl.set(4, arl1));
		System.out.println(arl1.equals(arl));
		System.out.println(arl1.add(arl));
		System.out.println(arl1.indexOf(5));
		System.out.println(arl1.remove(4));
		
		
	}

}
