package com.Xworkz.Learning.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add('a');
		ll.add(null);
		ll.add(2);
		ll.add(2);
		ll.add(5);
		System.out.println(ll);
		ArrayList list=new ArrayList(ll);
		System.out.println(list);
		ll.add(6);
		System.out.println(ll);
		System.out.println(list);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.clone());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll.pop());
		System.out.println(ll.remove());
		System.out.println(ll.removeLast());
	}

}
