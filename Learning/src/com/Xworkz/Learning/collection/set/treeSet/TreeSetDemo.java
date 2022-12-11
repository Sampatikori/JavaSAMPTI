package com.Xworkz.Learning.collection.set.treeSet;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new MyComparator());
		ts.add(1);
		ts.add(2);
		ts.add(5);
		ts.add(4);
		ts.add(3);
		System.out.println(ts);
	}

}
