package com.exmple.eventhandling.java;

//import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
//import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Studen_Voting {

	
	JFrame obj;
	JPanel obj2;
	JLabel lage,lmessage;
	JTextField tage;
	JButton submit;	
public Studen_Voting()
{

	obj = new JFrame();	
	obj2 = new JPanel();

	lage = new JLabel("Enter the Student Age");
	tage = new JTextField(10);
	
	lmessage = new JLabel("Student is Eligible for votting");
	
	submit = new JButton("SUBMIT");

	StudentEvent maction = new StudentEvent();
	submit.addFocusListener(maction);
	
	obj2.add(lage);
	obj2.add(tage);


	obj2.add(submit);

	obj.add(obj2);

	obj.setTitle("Student Votting");
	obj.setVisible(true);
	obj.setDefaultCloseOperation(0);	
	obj.setSize(300,300);
	
}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Studen_Voting vote = new Studen_Voting();
		//vote.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class StudentEvent implements FocusListener
	{
	
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==submit)
		{
			
			int age = Integer.parseInt(tage.getText());
			//System.out.println("print age :" + age);
			if(age>=18)
			{	
				
				//lmessage.
				System.out.println("Student is eligible for votting");
			}
		
	}
	
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}
		
	}
}

