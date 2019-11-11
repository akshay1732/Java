package com.Java.collections;

import java.util.*;
public class QueueInterface {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");
		
		
		System.out.println("Head:"+queue.element());  
		System.out.println("Head:"+queue.peek()); 
		
		
		System.out.println("\nIterating the queue elements:");  
		Iterator<String> itr=queue.iterator();  
		
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		queue.remove();  
		queue.poll();  
		System.out.println("\nAfter removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}
		
		
	}  
}  