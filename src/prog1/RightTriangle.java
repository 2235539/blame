package prog1;
/**
 * Name: Garabiles, Vanness Sean M.
 * Programming Date: Aug 27, 2022
 * Activity Name and Number: Prelim Exercise Number 2
 */

public class RightTriangle {
    public static void main(String args[]) {
        
        /* Every variable must be declared with a data type with reference to the kind of
        value that is to be assigned to it. If the value for a radius is constrained to a
        whole number and circumference and area may be floating point numbers (A floating
        point number is a number with the decimal point), the variables radius,
        circumference and areaOfCircle must be respectively declared with the int, double
        and double data types as shown in the following lines
         */
        int base;
        int height;
        int hypotenuse;
        int perimiter;
        int area;
        
        // Assignment statement that stores a value to a variable.
        base = 20;
        height = 15;
        hypotenuse = 25;
        
        // A mathematical expression represents a value that may be assigned to a variable
        perimiter = base + height + hypotenuse;
        area = base * height / 2;
        
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