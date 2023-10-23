package prog1.prelims;

//The filename for the following source code must be Circle3.java
/*
Name: GARABILES, VANNESS SEAN M.
Programming Date: SEPTEMBER 3,2022
Activity Name and Number: Prelim Programming Exercise 4
Problem:
Write a program that computes and shows the area and the circumference of a circle with
a given radius. Let the radius be entered through the keyboard at program runtime.

Analysis:
Input: Radius of a circle (radius)
Processes:
Read the radius of the circle
Compute the circumference of the circle
Compute the area of the circle
Display results
Output: circumference, area

Algorithm:
1. Read/Accept the radius of the circle
2. Compute the circumference: circumference = 2 * PI * radius
3. Compute the area: area = PI * radius * radius
4. Show the radius of the circle
5. Show the circumference of the circle
6. Show the area of the circle
*/

import java.lang.*;
import java.util.Scanner;
public class Circle3 {
public static void main (String [] args) {
 
//Make an object of Scanner that represents the keyboard
Scanner kbd = new Scanner(System.in);

//Declares the variables radius, circumference, and areaOfCircle
int radius;
double circumference; 
double areaOfCircle; 

//Print a prompt message
System.out.print("Type the value of radius then press the enter key: ");

//Takes user input then uses it in the radius
radius = Integer.parseInt(kbd.nextLine());


//Computes for the circumference
circumference = 2 * Math.PI * radius;

//Computes for the areaOfCircle
areaOfCircle = Math.PI * radius *radius;

//The succeeding statements prints strings on the output screen
System.out.println();
System.out.println();
System.out.println(" ***********************************************************");
System.out.println(" * Radius of circle is " + radius +" *");
System.out.println(" * Circumference of circle is " + circumference + " *");
System.out.println(" * Area of circle is " + areaOfCircle + " *");
System.out.println(" **********************************************************");
} // end of main method
} // end of class