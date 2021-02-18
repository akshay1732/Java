package com.Java.Swing;

import java.awt.Color;

import javax.swing.*;

public class SwingFrame {

	
	SwingFrame () {
	JFrame f = new JFrame();
	JButton b =new JButton("Click Me");
	b.setBounds(150, 100, 100, 30);
	b.setBackground(Color.CYAN);

	
	
	f.add(b);
	f.setSize(400, 400);
	f.setLayout(null);
	f.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {

		
		new SwingFrame();
		

	}

}
