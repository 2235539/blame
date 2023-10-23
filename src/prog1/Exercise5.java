package prog1;
import java.util.*;
/*
Name: GARABILES, VANNESS SEAN
Programming Date: SEPT 9, 2022
Activity Name and Number: Prelim Exercise Number 5
*/

public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // get keyboard input for three integers
        System.out.print("First Number: ");
        int n1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Second Number: ");
        int n2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Third Number: ");
        int n3 = Integer.parseInt(keyboard.nextLine());

        // display the three numbers
        System.out.println("You entered the numbers " + n1 + ", " + n2 + " and " + n3);

        // add the three numbers and store it in another int variable named sum
        int sum = n1 + n2 + n3;

        // display the sum
        System.out.println("\nThe sum of the three numbers is " + sum);

        // divide the first number by the second and display the value
        int q1 = n1 / n2;
        System.out.println("\nThe expression used computed the integer quotient: " + q1);

        double q2 = (double) n1 / n2;
        System.out.println("\nThe expression used computed the actual quotient: " + q2);

/* #1. Compute the product of the three numbers, store it in another integer variable and display this value. INSERT THE CODES BELOW... */
        int number1 = n1 * n2 * n3;     //computes for the product of the three numbers
        System.out.println("\nThe product of the three numbers is: " + number1);        //displays result

/* #2. Get the sum of the first two numbers and divide it by the third number, compute only for the integer quotient and display the value. INSERT THE CODES BELOW... */
        int number2 = (n1 + n2) / n3;       // computes for the sum of the first two numbers and divide it by the third number as int
        System.out.println("\nThe sum of the first two numbers divided by the third number is(integer): " + number2);       //displays result

/* #3. Get the sum of the first two numbers and divide it by the third number, compute for the exact quotient and display the value. INSERT THE CODES BELOW... */
        double number3 = (double) (n1 + n2) / n3;       //computes for the sum of the first two numbers and divide it by the third number as double
        System.out.println("\nThe sum of the first two numbers divided by the third number is(exact): " + number3);     //displays result

/* #4. Compute the average of the three numbers and display the result with 2 decimal values shown. INSERT CODE BELOW... */
        double number4 = (double) (n1 + n2 + n3)/ 3 ;       // computes the average of the three numbers
        System.out.printf("\nThe average of the three numbers is: %.2f", number4);      // displays the result with 2 decimal values shown

/* #5. Compute the square of each number and display the results. INSERT CODE BELOW... */

        // computes for the square of sq1,sq2,sq3
        double sq1 = Math.pow(n1,2);
        double sq2 = Math.pow(n2,2);
        double sq3 = Math.pow(n3,2);

        // displays the results
        System.out.println("\nThe square of The First Number is: " + sq1);
        System.out.println("\nThe square of The Second Number is: " + sq2);
        System.out.println("\nThe square of The Third Number is: " + sq3);

    }       // end of main method
} // end of class