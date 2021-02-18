package com.Java.advanced;

import java.awt.*;  
class ScrollbarExample{  
ScrollbarExample(){  
            Frame f= new Frame("Scrollbar Example");  
            Scrollbar s=new Scrollbar();  
            List l1 = new List(5);
            
            l1.add("One");
            l1.add("One");
            l1.add("One");
            l1.add("One");
            l1.add("One");
            
            
            l1.setBounds(50, 50, 50, 100);
            s.setBounds(150,50, 20,100);  
            f.add(s);  
            f.add(l1);
            f.setSize(400,400);  
            f.setLayout(null);  
            f.setVisible(true);  
}  
public static void main(String args[]){  
       new ScrollbarExample();  
}  
}  