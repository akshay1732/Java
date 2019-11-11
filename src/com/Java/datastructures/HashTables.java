package com.Java.datastructures;

import java.util.*;

public class HashTables {

	public static void main(String args[]) {
	      // Create a hash map
	      Hashtable <String, Double>balance = new Hashtable<String, Double>();
	      Enumeration<String> names;
	      String str;
	      Double bal;

	      balance.put("Zara", 3434.34);
	      balance.put("Mahnaz", 123.22);
	      balance.put("Ayan", 1378.00);
	      balance.put("Daisy", 99.22);
	      balance.put("Qadir", -19.08);

	      // Show all balances in hash table.
	      names = balance.keys();
	      
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " + balance.get(str));
	      }        
	      System.out.println();
	      
	      // Deposit 1,000 into Zara's account
	      bal = balance.get("Zara");
	      balance.put("Zara", bal + 1000);
	      System.out.println("Zara's new balance: " + balance.get("Zara"));
	   }

}
