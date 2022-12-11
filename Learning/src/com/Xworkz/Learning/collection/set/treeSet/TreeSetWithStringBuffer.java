package com.Xworkz.Learning.collection.set.treeSet;

import java.util.TreeSet;

public class TreeSetWithStringBuffer {
	public static void main(String[] args) {
		TreeSet<StringBuffer> birds=
				new TreeSet<StringBuffer>(new StringBufferComparator());
		birds.add(new StringBuffer("parrot"));
		birds.add(new StringBuffer("peacock"));
		birds.add(new StringBuffer("pigeon"));
		birds.add(new StringBuffer("butterfly"));
		birds.add(new StringBuffer("sparrow"));
		System.out.println(birds);
	}

}
