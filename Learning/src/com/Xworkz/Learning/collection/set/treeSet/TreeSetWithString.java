package com.Xworkz.Learning.collection.set.treeSet;

import java.util.TreeSet;

public class TreeSetWithString {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new StringComparator());
		ts.add("dog");
		ts.add("cat");
		ts.add("sam");
		ts.add("vish");
		ts.add("tae");
		System.out.println(ts);
	}

}
