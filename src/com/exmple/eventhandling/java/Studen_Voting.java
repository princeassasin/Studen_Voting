	package com.exmple.eventhandling.java;
	
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;	

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
	
	public class Studen_Voting {
	
		
		JFrame obj;
		JPanel obj2;
		JLabel lage,lmessage, lname, lsalary;
		JTextField tage;
		JTextField tname;
		JTextField tsalary;
		JButton submit;	
	public Studen_Voting()
	{
	
		obj = new JFrame();	
		obj2 = new JPanel();
	
		lage = new JLabel("Enter the Student Age");
		tage = new JTextField(10);
		
		lname = new JLabel("Enter the Student name");
		tname = new JTextField(10);
		
		lsalary = new JLabel("Enter the Student salary");
		tsalary = new JTextField(10);
		
		lmessage = new JLabel("Student Details");
		
		submit = new JButton("SUBMIT");
	
		StudentEvent maction = new StudentEvent();
		submit.addFocusListener(maction);
		
		obj2.add(lage);
		obj2.add(tage);
		
		obj2.add(lname);
		obj2.add(tname);
		
		obj2.add(lsalary);
		obj2.add(tsalary);
	
		obj2.add(submit);
	
		obj.add(obj2);
	
		obj.setTitle("Student Details");
		obj.setVisible(true);
		obj.setDefaultCloseOperation(0);	
		obj.setSize(300,300);
		
	}
		
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Studen_Voting vote = new Studen_Voting();
			
		}
		class StudentEvent implements FocusListener
		{
		
		@Override
		public void focusGained(FocusEvent e) {
			if (e.getSource()==submit)
			{
				
				String age = tage.getText();
				String name = tname.getText();
				String salary = tsalary.getText();
				
				
					try{
						
						File file = new File("D:\\New folder\\student.txt");
						FileWriter fw = new FileWriter(file.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(age);
						bw.write(name);
						bw.write(salary); 
						bw.close();
					}catch(IOException msge){
						System.out.println(msge.getMessage());
					}
				
			
		}
		
		}
	
		@Override
		public void focusLost(FocusEvent e) {
	
		}
			
		}
	}
	
