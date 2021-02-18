package com.Java.programs;

public class FindSubstring {

	public static void main(String[] args) {
		
		
		FindSubstring obj = new FindSubstring();
		
		System.out.println(obj.search("AKSHAYKKK", "SHAY"));
		
	}
	
	public boolean search(String main, String sub) {
		
		for(int i=0;i<main.length();i++) {
			
			for(int j=0;j<sub.length()&& i+j<main.length();j++) {
				
				if(sub.charAt(j)!=main.charAt(i+j)) {
					
					break;
					
				}else if(j==sub.length()-1) {
					
					System.out.println("Found at Position: "+i);
					return true;
					
				}
				
				
			}
			
			
		}
		
		return false;}

}
