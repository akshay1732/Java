package com.Java.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		
		String str = "das64d5a4d65a6d";
		Pattern pattern = Pattern.compile("\\d+");
		
		Matcher match = pattern.matcher(str);
		
		
		while(match.find()) {
			
			
			System.out.println(match.group());
		}
		
		
		

	}

}
