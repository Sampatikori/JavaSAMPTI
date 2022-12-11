package com.Xworkz.Learning.collection.map.hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(560078, "Minhaj Nagar");
		map.put(560098, "RR Nagar");
		map.put(563201, "Hasan");
		map.put(562109, "RamaNagar");
		map.put(560076, "Kothnur");
		map.put(571433, "Maddur");
		
//		System.out.println(map);
		
		for( Map.Entry<Integer,String> entry :map.entrySet()){
			System.out.println(entry.getKey() + " : "+entry.getValue());
	}
		for( Map.Entry<Integer,String> entry :map.entrySet()){
			if(entry.getValue().equals("RamaNagar")) {
				System.out.println(entry.getKey());
			}
		}
}
}