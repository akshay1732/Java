package com.Java.basics;

import java.io.*;


public class FilesandIO {

	public static void main(String[] args) throws IOException 
	{
		
		// Byte Streams

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(".\\src\\com\\Java\\Basics\\Input.txt");
			out = new FileOutputStream(".\\src\\com\\Java\\Basics\\Output.txt");
			int c;
			while ((c = in.read()) != -1) 
			{ 
				out.write(c); 
			}
			
			} 
		finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}

		}
		
		
		
		//Character Streams
		
		FileReader in1 = null;
	    FileWriter out1 = null;

	    try {
	         in1 = new FileReader(".\\src\\com\\Java\\Basics\\Input.txt");
	         out1 = new FileWriter(".\\src\\com\\Java\\Basics\\Output.txt");
	         int c;
	         while ((c = in1.read()) != -1)
	         {
	            out1.write(c);
	         }
	      	}
	    finally {
	         if (in1 != null) {
	            in1.close();
	         }
	         if (out1 != null) {
	            out1.close();
	         }

	    }
	    
	    
	    //Standard Streams
	    
	     InputStreamReader cin = null;

	          try {
	             cin = new InputStreamReader(System.in);
	             System.out.println("Enter characters, 'q' to quit.");
	             char c;
	           
	             do {
	                 c = (char) cin.read();
	                 System.out.print(c);
	              } while(c != 'q');
	          	}finally {
	             if (cin != null) {
	                cin.close();
	             }
	          }
	       }
	    
	    
	    

}


