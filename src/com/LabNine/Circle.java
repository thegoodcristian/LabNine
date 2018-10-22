package com.LabNine;

public class Circle {

	//I create an instance variable for the radius.
	
	private double radius;

	//I receive the radius from the user
	
	public Circle(double rad) {
		radius = rad;
	}

	//I calculate the circumference
	
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}
	
	//I format the circumference to display only 2 decimal places.

	public String getFormattedCircumference() {
		Double.toString(getCircumference());
		return String.format("%.2f", getCircumference());
	}

	//I calculate the area
	
	public double getArea() {
		return Math.PI * (Math.pow(radius, 2));
	}

	//I format the area to display only 2 decimal places
	
	public String getFormattedArea() {
		Double.toString(getArea());
		return String.format("%.2f", getArea());
	}

}
