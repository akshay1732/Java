package com.Java.Swing;

import java.util.*;

public class Center {
	
    private static int idIncrement = 1;
    private int Center_id=0;
    protected String Center_name=null;
    private String Center_address=null;
    private ArrayList<Book> Book_Center=null;

    	//Store the center name strings in key values instead of integers
    	protected static Map<String, Center> myCenters = new HashMap<String,Center>();
    
    
    	//constructor to create new center with ID, Name and Address
    	public Center(int id, String Center_name,String address)
    	{
    		this.Center_id=id;
    		this.Center_name=Center_name;
    		this.Center_address=address;
    		Book_Center = new ArrayList<Book>();
    	}
    
    
    	protected static void listbooksincenter(String name_Center) {
    			//get Center using name from Hashmap
    			Center found_center = myCenters.get(name_Center);
    	
            	//use an iterator to iterate arraylist of books
            	Iterator <Book> book_iterator = found_center.Book_Center.iterator();
            	
            		while(book_iterator.hasNext()) {
            			 System.out.println(book_iterator.next().getName());       
            		}
            		
    	}

    	protected static boolean centerexist(String name_Center) {
    		boolean flag=false;	
    		for (Map.Entry<String, Center> entry : myCenters.entrySet()) 
    		{
    			if(entry.getKey().equals(name_Center)) {
    				flag= true;
    			}
    		} 
    		return flag;	
    	}
    
    
    	public void add_book_to_center(String book_name) {
    		
    		Book book = new Book(book_name);
    		Book_Center.add(book);
    	
    	}
    	
    	public void add_book_to_center(Book book) {
    		
    		Book_Center.add(book);
    	
    	}
    	
    	
    	public static void main(String[] args) {
    		
    		//Creating Multiple Centers
    		Center center1 = new Center (101,"BookCenter1","New York");
    		Center center2 = new Center (201,"BookCenter2","Delhi");
    		Center center3 = new Center (301,"BookCenter3","Paris");
    	
    		//Adding books to centers
    		center1.add_book_to_center("The Kite Runner");
    		center1.add_book_to_center("The Maze Runner");
    		center1.add_book_to_center("The Hunger Games");
    		
    		center2.add_book_to_center("Harry Potter");
    		center2.add_book_to_center("Game of Thrones");
    		center2.add_book_to_center("Lord of the Rings");
    		
    		center3.add_book_to_center("Physics");
    		center3.add_book_to_center("Chemistry");
    		center3.add_book_to_center("Astronomy");
    		
    		//Creating and adding new books to Existing center
    		Book newbook = new Book("Shadow of the wind");
    		center2.add_book_to_center(newbook);
    		
    		
    		//Adding Centers to Hashmap
    		myCenters.put("center1", center1);
    		myCenters.put("center2", center2);
    		myCenters.put("center3", center3);
    		
    		
    		//Passing bookname to method
    		if(centerexist("center2")) 
    		{
    		System.out.println("\nYour Center: "+center2);
    		listbooksincenter("center2");
    		}
    		else {
    			System.out.println("Center doesnt Exist");
    		}
    		
    		
    	}
}