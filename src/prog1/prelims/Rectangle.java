package prog1.prelims;
/**
 * Name: Garabiles, Vanness Sean M.
 * Programming Date: Aug 27, 2022
 * Activity Name and Number: Prelim Exercise Number 2
 */

public class Rectangle {
    public static void main(String[] args) {
        /* Every variable must be declared with a data type with reference to the kind of
        value that is to be assigned to it. If the value for a radius is constrained to a
        whole number and circumference and area may be floating point numbers (A floating
        point number is a number with the decimal point), the variables radius,
        circumference and areaOfCircle must be respectively declared with the int, double
        and double data types as shown in the following lines
         */
        int length;
        int width;
        
        // Assignment statement that stores a value to a variable.
        length = 10;        //Assigns the integer value 10 to length.
        width = 5;          //Assigns the integer value 5 to width.
        
        // A mathematical expression represents a value that may be assigned to a variable
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