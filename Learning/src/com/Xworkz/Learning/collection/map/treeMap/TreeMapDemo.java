package com.Xworkz.Learning.collection.map.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer, String>();
		tm.put(1, "Sunday");
		tm.put(2, "Monday");
		tm.put(3, "Tuesday");
		tm.put(4, "Wednesday");
		tm.put(5, "Thursday");
		tm.put(6, "Friday");
		tm.put(7, "Saturday");
		System.out.println(tm);
		
		for(Map.Entry<Integer, String> entry:tm.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		}
	

}
