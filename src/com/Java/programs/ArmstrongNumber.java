package com.Java.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		isArmstrong(153);
	}

	
	public static void isArmstrong(int input) {
		
		int num =input,arm=0,d=0;
		int temp=num,count=0;
		
			while(temp>0) {	
				temp=temp/10;
				count++;	
			}	
			
			while(num>0) {	
				d=num%10;
				num=num/10;
				arm= (int) (arm+(Math.pow(d, count)));		
			}		
		
		System.out.println("Number of Digits: "+count);
		
		if (arm==input) {	
			System.out.println("Armstrong");
		}
		
	}
	

}
