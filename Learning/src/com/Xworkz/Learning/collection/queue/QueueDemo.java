package com.Xworkz.Learning.collection.queue;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue(); 
		pq.offer('A');
		pq.offer('B');
		pq.offer('c');
		pq.offer('D');
		pq.offer('B');
		pq.poll();
		pq.peek();
		pq.element();
		pq.remove();
		System.out.println(pq);
		
		
	}

}
