package com.Xworkz.Learning.collection.map.linkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Character,String> phonics=new LinkedHashMap<Character,String>();
		phonics.put('A', "Apple");
		phonics.put('B', "Bird");
		phonics.put(null, null);
		phonics.put('C', "Cat");
		phonics.put('D', "Dog");
		System.out.println(phonics);
	}

}
