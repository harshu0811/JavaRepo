package com.encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.getPercentage(21));
		s.setPercentage(21, 90.68);
		System.out.println("after updating, "+s.getPercentage(21));
	}
}
