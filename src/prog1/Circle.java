package prog1;

/**
 * Name: Garabiles, Vanness Sean M.
 * Programming Date: Aug 27, 2022
 * Activity Name and Number: Prelim Exercise Number 2
 */

public class Circle {
    public static void main(String[] args) {
        /* Every variable must be declared with a data type with reference to the kind of
        value that is to be assigned to it. If the value for a radius is constrained to a
        whole number and circumference and area may be floating point numbers (A floating
        point number is a number with the decimal point), the variables radius,
        circumference and areaOfCircle must be respectively declared with the int, double
        and double data types as shown in the following lines
         */

        int radius;
        double circumference;
        double areaOfCircle;

        // Assignment statement that stores a value to a variable.
        radius = 10;            //Assigns the integer value 10 to radius.

        // A mathematical expression represents a value that may be assigned to a variable
        circumference = 2 * 3.1416 * radius;
        // Instead of typing 3.1.416, you may type Math.PI
        areaOfCircle = 3.1416 * radius * radius;

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *           Radius of circle is " + radius +"                       *");
        System.out.println(" *           Circumference of circle is " + circumference + "                *");
        System.out.println(" *           Area of circle is " + areaOfCircle +"                     *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }       // end of main method
}           // end of class