package com.assign;

public class AreaAndPerimeter {
	public static void main(String[] args) {
		areaAndPerimeterOfCircle(4);
		areaAndPerimeterOfSquare(5);
		areaAndPerimeterOfTriangle(4, 3, 5, 2);
	}
	public static void areaAndPerimeterOfCircle(double radius) {
		System.out.println("area of circle : "+3.14*radius*radius);
		System.out.println("perimeter of circle : "+2*3.14*radius);
	}
	public static void areaAndPerimeterOfSquare(double side) {
		System.out.println("area of square : "+side*side);
		System.out.println("perimeter of square : "+4*side);
	}
	public static void areaAndPerimeterOfTriangle(double height,double base,double side_right, double side_left) {
		System.out.println("area of triangle : "+0.5*height*base);
		System.out.println("perimeter of triangle : "+(base+side_right+side_left));
	}
}
