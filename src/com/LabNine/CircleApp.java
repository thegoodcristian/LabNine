package com.LabNine;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		//I create a Scanner object to receive user input
		
		Scanner scnr = new Scanner(System.in);

		//I welcome the user

		System.out.println("Step right up, step right up to the Grand Circus circle calculator!");
		
		//I set up a loop which will prompt the user to continue
		
		String cont = "yes";
		while (cont.equalsIgnoreCase("yes")) {

			//I receive user input and call the necessary methods in the Circle class to calculate circumference and area.
			//I then print the results to the console.
			
			Double radius = Validator.getDouble(scnr, "\nPlease enter a radius: ");
			Circle circle = new Circle(radius);
			circle.getCircumference();
			System.out.println("\nThe circumference is: " + circle.getFormattedCircumference());
			circle.getArea();
			System.out.println("The area is: " + circle.getFormattedArea());

			// I ask if the user if they would like to continue, if "yes", while loop will
			// begin again.

			cont = Validator.getString(scnr, "\nWould you like to continue? (yes/no)");
			while (!cont.equalsIgnoreCase("yes") && !cont.equalsIgnoreCase("no")) {
				System.out.println("\nPlease only enter yes/no: ");
				cont = Validator.getString(scnr, "\nWould you like to continue? (yes/no)");
			}
			
			
		}

		// Otherwise, I bid farewell to the user. I close the scanner to avoid resource
		// leak.

		System.out.println("\nGoodbye!");
		scnr.close();

	}
}
