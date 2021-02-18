package com.Selenium.rough;

import java.util.*;


public class LinkedList { 
	  
    static Node head; // head of list 
  
    /* Linked list Node*/
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

    
    void push (int newdata) {
    	
    	Node newnode = new Node(newdata);
    	newnode.next=head;
    	head=newnode;	
    }
	
    
    
    public static void main(String[] args) {
    
    
		
		LinkedList list = new LinkedList();
		list.push(10);
		list.push(12);
		list.push(20);
		list.push(25);
		list.push(30);
		
		LinkedList.head.next.next.next = LinkedList.head;
		
		
		Set<Node> set = new HashSet<Node>();
		boolean flag=false;
		
		while(head!=null) {
		
			if(set.contains(head)) {
			
			head=null;
			flag=true;
			break;
			}
		
			else {
			
			
			set.add(head);
			head=head.next;
			
			}
		
		}
	
		if(flag) {
			System.out.println("Loop Found");
		
		}
		else {
			System.out.println("Loop Not Found");
		}
		

	}

}
