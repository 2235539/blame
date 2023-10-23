package prog1.prelims;

/*
Name: GARABILES, VANNESS SEAN M.
Programming Date: SEPTEMBER 3,2022
Activity Name and Number: Prelim Programming Exercise 4
Problem:
Create the file Square3.java into the proper location. Copy and paste the main method of Square.java
into this file. Modify the program so that the measurement of the side of the square will be read from the keyboard
at run time through the Scanner class. (i.e. The value of side will be entered when the program is executed.) An
appropriate prompt message (e.g. “Please enter the measure of a side of the square:”) should
be provided. Provide the content of the comment pertaining to the details of this program at the beginning of the
file (name, program info, problem, analysis, algorithm, etc.).

Analysis:
Input: Side of a square
Processes:
Read the side of the square
Compute the perimeter of the square
Compute the area of the square
Display results
Output: perimeter, area

Algorithm:
1. Read/Accept the side of the square
2. Compute the area: area = side * side
3. Compute the perimeter: perimiter = 4 * side
4. Show the perimeter of the square
5. Show the area of the square
*/

import java.util.*;
public class Square3 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        int side;       // Declares side
        
        // Takes user input for side
        System.out.print("Enter the value for side: ");
        side = Integer.parseInt(kbd.nextLine());
        
        // Computes for area and perimeter
        int area = side * side;
        int perimiter = 4 * side;
        
        // Shows the perimeter and area of square
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *           The perimeter of the square is " + perimiter +"            *");
        System.out.println(" *           The area of the square is " + area + "                *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }       // end of main method
}           // end of class