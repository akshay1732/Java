package com.Java.basics;

public class PrimitiveDataTypes {
	
	static byte one; //8-bit signed two's complement integer
	static short s; //16-bit signed two's complement integer
	static int a;  //32-bit signed two's complement integer
	static long b; //64-bit signed two's complement integer
	static float f; //double-precision 64-bit IEEE 754 floating point
	static double d; //double-precision 64-bit IEEE 754 floating point
	static boolean flag; //single bit true/false
	static char chara; //single 16-bit Unicode character
	
	
	

	public static void main(String[] args) {
		
		one = 120;
		s=255;
		a=500;
		b=50000L;
		f=0.2f;
		d=0.02d;
		flag=true;
		chara='A';
		
		System.out.printf("%d %d %d %d %f %f %b %c",one,s,a,b,f,d,flag,chara);



	}

}
