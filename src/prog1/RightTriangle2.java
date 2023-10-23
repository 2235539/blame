package prog1;
/**
 * Name: GARABILES, VANNESS SEAN
 * Programming Date: SEPT 3, 2022
 * Activity Name and Number: Prelim Exercise Number 3
 * 
 * Algorithm:
 * 1. Declare base, height, and hypotenuse
 * 2. Assign a value for the base and height
 * 3. Compute for the hypotenuse
 * 4. Print out the computed hypotenuse
 */

public class RightTriangle2 {
    public static void main(String args[]) {
        
        //declares base, height, and hypotenuse
        double base;
        double height;
        double hypotenuse;
        
        //assigns a value for the base and height
        base = 20;
        height = 15;
        
        //computation of hypotenuse
        hypotenuse = Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
        
        //prints out the computed hypotenuse
        System.out.println( );
        System.out.println( );
        System.out.println(" ********************************************************");
        System.out.println(" * Computed hypotenuse of circle = " + hypotenuse + "                 *");
        System.out.println(" ********************************************************");
        
    }       // end of main method
}           // end of class