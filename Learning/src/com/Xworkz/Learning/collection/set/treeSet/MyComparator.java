package com.Xworkz.Learning.collection.set.treeSet;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		
//		if(o1<o2)
//			return 1;
//		else if(o1>o2)
//			return -1;
//		else
//			return 0;
		return o1.compareTo(o2);
	}

}
