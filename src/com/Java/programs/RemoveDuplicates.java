package com.Java.programs;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("ONE");
		list.add("TWO");
		list.add("ONE");
		list.add("THREE");
		list.add("ONE");
		list.add("FOUR");
		list.add("FIVE");
		
		
		Set<String> set = new LinkedHashSet<String>(list);
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.println(itr.next());
			
		}
		
		
		
		
		
	}

}
