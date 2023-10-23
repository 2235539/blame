package prog1.midterms;

/*
Author: Garabiles, Vanness Sean M.
Programming Date : Oct 24, 2022

Problem:
Rewrite the following program such that the program has only the main method. The re-written program should have the same result/output as the

Algorithm:
1. Place the printHeading method in the main method.
2. Place the computeFirstRoot method in the main method.
3. Place thecomputeSecondRoot method in the main method.
4. Place the showRealRoots method in the main method.
5. Place the representFirstImaginaryRoot method in the main method.
6. Place the representSecondImaginaryRoot method in the main method.
7. Place the showImaginaryRoots method in the main method.
8. Place the determineAndShowTheRealRoots method in the main method.
9. Place the determineAndShowTheImaginaryRoots method in the main method.
*/
import java.util.Scanner; 
import java.lang.*; 
public class MidtermExercise8 { 
    public static void main(String[] args) { 
        Scanner kbd = new Scanner(System.in); 
        double a, b, c, root1, root2; 
    
        System.out.println("This program helps you solve for the roots of a Quadratic Equation."); 
        System.out.println("You should enter the coefficients of the quadratic equation");
        
        System.out.print("Enter a: "); 
        a = Double.parseDouble(kbd.nextLine()); 
        System.out.print("Enter b: "); 
        b = Double.parseDouble(kbd.nextLine()); 
        System.out.print("Enter c: "); 
        c = Double.parseDouble(kbd.nextLine()); 
    
        if (b * b - 4 * a * c >= 0) {
            double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); // invoke computeFirstRoot method 
            double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);  // invoke computeSecondRoot method 
            System.out.println("The roots are: " + r1 + " and " + r2 + "."); // Invoke showRoots method return; 
        }
        else {
            String r1 = -b / (2 * a) + " + (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
            String r2 = -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
            System.out.println("The imaginary roots are: " + r1 + " and " + r2 + "."); 
        }
		System.exit(0); 
    }
}