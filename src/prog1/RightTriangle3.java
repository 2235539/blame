package prog1;

/*
Name: GARABILES, VANNESS SEAN M.
Programming Date: SEPTEMBER 3,2022
Activity Name and Number: Prelim Programming Exercise 4
Problem:
Create the file RightTriangle3.java into the proper location. Copy and paste the main method of
RightTriangle.java into this file. Modify the program so that the values for the base and the height will be
read from the keyboard at run time through the Scanner class. (i.e. The value of base and height will be entered
when the program is executed.) Appropriate prompt messages (e.g. “Enter the base of the triangle:
” and “Enter the height of the triangle: ”) should be provided . Save the class as
RightTriangle3.java. Provide the content of the comment pertaining to the details of this program at the
beginning of the file (name, program info, problem, analysis, algorithm, etc.).

Analysis:
Input: Base, height, and hypotenuse of a RightTriangle
Processes:
Read the base of the RightTriangle
Read the height of the RightTriangle
Read the hypotenuse of the RightTriangle
Compute the perimeter of the RightTriangle
Compute the area of the RightTriangle
Display results
Output: perimeter, area

Algorithm:
1. Read/Accept the base, height, and hypotenuse of the RightTriangle
2. Compute the perimeter: perimiter = base + height + hypotenuse
3. Compute the area: area = base * height / 2;
4. Show the perimeter of the RightTriangle
5. Show the area of the RightTriangle
*/

import java.util.*;
public class RightTriangle3 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        // Declares the base, height, hypotenuse, perimiter, and area
        int base;
        int height;
        int hypotenuse;
        int perimiter;
        int area;
        
        // Takes user inputs for the base, height and hypotenuse
        System.out.print("Enter the value for base: ");
        base = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the value for height: ");
        height = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the value for hypotenuse: ");
        hypotenuse = Integer.parseInt(kbd.nextLine());
        
        // Computes for the perimeter and area of the RightTriangle
        perimiter = base + height + hypotenuse;
        area = base * height / 2;
        
        // Prints the perimeter and area of the RightTriangle
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *           The perimeter of the RightTriangle is " + perimiter +"     *");
        System.out.println(" *           The area of the RightTriangle is " + area + "           *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }       // end of main method
}           // end of class