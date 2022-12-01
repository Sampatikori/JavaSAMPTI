package com.Xworkz.Learning.collection.list.vector;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.add(null);
		v.add(1);
		v.add('v');
		v.add("hi");
		System.out.println(v);
		
		System.out.println(v.capacity());
		System.out.println(v.contains('v'));
		System.out.println(v.elementAt(4));
		System.out.println(v.set(3, 's'));
		System.out.println(v.clone());
		System.out.println(v.toString());
		System.out.println(v.retainAll(v));
		System.out.println(v.remove(2));
		System.out.println(v);
		
		
	}

}
