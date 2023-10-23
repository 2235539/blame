package prog1.prelims;

/*
Name: GARABILES, VANNESS SEAN M.
Programming Date: SEPTEMBER 3,2022
Activity Name and Number: Prelim Programming Exercise 4
Problem:
Create the file Rectangle3.java into the proper location. Copy and paste the main method of
Rectangle.java into this file. Modify the program so that the values for the length and the width will be read
from the keyboard at run time through the Scanner class (i.e. The values of length and width will be entered
when the program is executed). Appropriate prompt messages (e.g. “Enter the length of the
rectangle: ” and “Enter the width of the rectangle: ”) should be provided. Provide the content
of the comment pertaining to the details of this program at the beginning of the file (name, program info, problem,
analysis, algorithm, etc.).

Analysis:
Input: length and width of the rectange
Processes:
Read the length and width of the rectange
Compute the perimeter and area of the rectange
Display results
Output: perimeter, area

Algorithm:
1. Read/Accept the length and width of the rectange
2. Compute the perimeter:  perimeter = 2*length + 2*width
3. Compute the area: area = length * width
4. Show the perimeter of the rectange
5. Show the area of the rectange
*/ 
import java.util.*;
public class Rectangle3 {
    public static void main(String[] args) {
        // Declares length and width
        int length;
        int width;

        // Takes user input for the length and width
        Scanner kbd = new Scanner(System.in);
        System.out.print("Type the value of length then press the enter key: ");
        length = Integer.parseInt(kbd.nextLine());
        System.out.print("Type the value of width then press the enter key: ");
        width = Integer.parseInt(kbd.nextLine());
        
        // Computes for the perimeter and area
        int perimiter = 2*length + 2*width;
        int area = length * width;

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *           The perimeter of the rectangle is " + perimiter +"         *");
        System.out.println(" *           The area of the rectangle is " + area + "              *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }       // end of main method
}           // end of class