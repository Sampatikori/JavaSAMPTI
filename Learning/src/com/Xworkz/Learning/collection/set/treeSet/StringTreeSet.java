package com.Xworkz.Learning.collection.set.treeSet;

import java.util.TreeSet;

public class StringTreeSet {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new ComparatorforString());
		ts.add("samanvi");
		ts.add("tanu");
		ts.add("lavanya");
		ts.add("manasa");
		ts.add("teju");
		System.out.println(ts);
	}

}
