package com.encapsulation;

public class Student {
	String name="Harsha";
	private double percentage=90.7;
	private int rollno=21;
	
	//getter
	public String getPercentage(int rollno)
	{
		if(this.rollno==rollno)
			return "percentage :"+percentage;
		else
			return "invalid rollno, cant disclose percentage";
	}
	//setter
	public void setPercentage(int rollno, double percentage) {
		if(this.rollno==rollno) {
			this.percentage=percentage;
			System.out.println("percentage updated");
		}
		else
			System.out.println("invalid rollno, percentage not updated");
	}
}
