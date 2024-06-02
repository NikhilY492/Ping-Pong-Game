package dev.mayank.main;

import java.awt.event.*;
import java.io.IOException;

import javax.swing.*; 


public class Main {
	
	
	public static void main(String[] args) {
		 GameThreads th = new GameThreads("Ball Game", 640, 480);
		
		 class Play extends JFrame implements ActionListener //adds a button play GameButton
		 { 
		     
			 private static final long serialVersionUID = 1L;
			// Declaration of object of JButton class. 
		     JButton b1; 
		     JButton b2;
		       
		     // Constructor of Play class 
		     Play() 
		     { 
		         // Setting layout as null of JFrame. 
		         this.setLayout(null); 
		           
		         // Initialization of object of "JButton" class. 
		         b1 = new JButton("Play Game!"); 
		         b2 = new JButton("Exit");
		         
		           
		         // Setting Bounds of a JButton. 
		         b1.setBounds(150, 50, 100, 50); 
		         b2.setBounds(150, 100, 100, 50); 
		         
		           
		         //"this" keyword in java refers to current object. 
		         // Adding JButton on JFrame. 
		         this.add(b1); 
		         this.add(b2);
		           
		         // Adding Listener toJButton. 
		         b1.addActionListener(this); 
		         b2.addActionListener(this);
		     } 
		   
		     // Override Method 
		     public void actionPerformed(ActionEvent evt) { 
		         if (evt.getSource() == b1)  
		         { 
		           th.start();
	              }
		         
		         if (evt.getSource() == b2)  
		         { 
		          System.exit(0);
		         } 
		         
		     } 
		 } 
		        
		         Play f = new Play(); 
		        
		         f.setBounds(200, 200, 400, 300); 
		           
		        
		         f.setResizable(false);  
		        
		         f.setVisible(true); 
		         
		         f.setLocationRelativeTo(null);
 } 
		  

}


