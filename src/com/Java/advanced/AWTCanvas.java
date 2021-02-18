package com.Java.advanced;

import java.awt.*;  
public class AWTCanvas  
{  
  public AWTCanvas()  
  {  
    Frame f= new Frame("Canvas Example"); 
    f.add(new MyCanvas());  
    f.setLayout(null);  
    f.setSize(400, 400);  
    f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new AWTCanvas();  
  }  
}  
class MyCanvas extends Canvas  
{  
        public MyCanvas() {  
        setBackground (Color.GRAY);  
        setSize(400, 400);  
     }  
  public void paint(Graphics g)  
  {  
    g.setColor(Color.CYAN);  
    g.fillOval(100, 100, 200, 200);  
  }  
}    