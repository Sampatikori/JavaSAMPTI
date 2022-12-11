package com.Xworkz.Learning.collection.set.hashset;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(1);
		set.add('a');
		set.add("sam");
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(null);
		set.add(null);
		set.addAll(set);
		set.remove(1);
		System.out.println(set);
		set.retainAll(set);
		HashSet set1=new HashSet();
		set1.addAll(set);
		System.out.println(set1);
		set.add(8);
		System.out.println(set1);
		set1.removeAll(set);
		System.out.println(set1);
		set1.getClass();
		set1.add(set);
		System.out.println(set1);
		
		
	}

}
