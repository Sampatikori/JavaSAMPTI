package com.Xworkz.Learning.collection.list.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack st=new Stack();
		st.add('s');
		st.add('v');
		st.add('s');
		st.add(null);
		st.add(5);
		st.add(4);
		Stack st1=new Stack();
		System.out.println(st);
		System.out.println(st.capacity());
		System.out.println(st.lastElement());
		System.out.println(st.contains(5));
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.push(st1));
		System.out.println(st.elementAt(1));
		System.err.println(st.get(2));
	}

}
