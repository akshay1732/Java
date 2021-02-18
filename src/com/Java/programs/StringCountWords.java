package com.Java.programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class StringCountWords {

	public static void main(String[] args) 
	{
		
		
	String str= "This is a String This is a Word";
	
	
	String[] words = str.split(" ");
	Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	int count=0;
	 
	 	for(int i=0;i<words.length;i++) 
	 	{
		 
	 		if(!map.containsKey(words[i])) 
	 		{ 
			 map.put(words[i], 1);	 
	 		} 
	 		else {
	 			count = map.get(words[i]);
	 			count++;
	 			map.put(words[i], count); 
	 		} 
	 	}
	 	System.out.println(map);
	 	
	 	
	//"******************************************************************************************" 	
	 	
	 	
	 	for(Map.Entry<String, Integer> m:map.entrySet()) {
	 		
	 		System.out.println(m.getKey()+" "+m.getValue());
	
	 	}
	 	
	 	
	//"******************************************************************************************" 	 	
	 	
	 	Iterator<Entry<String, Integer>> itr=map.entrySet().iterator();
	 	
	 	while(itr.hasNext()) {
	 		
	 		 Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>)itr.next();
	 		System.out.println(pair.getKey()+" "+pair.getValue());
	 		
	 	}
	 	
	 	
	 	
	 	
	 	
	 	
	}
	

}


