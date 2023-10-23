package prog1.midterms;

/*
Author: Garabiles, Vanness Sean M.
Programming Date : Oct 16, 2022

Problem:
Write a program for the computation of the tax due corresponding to a given taxable income.

Algorithm:
1. Declare the taxableIncome and taxDue as double
2. Let user input the income
3. Filter out the negative income for taxable income
4. Calculate the tax according to the BIR tax table
5. Show tax due
*/

import java.lang.*;
import java.util.Scanner;
public class MidtermExercise6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double taxableIncome;
        double taxDue = 0.0;
        byte bracket = 0;

        // Takes the user input for income and filters out the negative values.
        do {
            System.out.println("Income Tax Computation");
            System.out.print("Enter the taxable income: ");
            taxableIncome = keyboard.nextDouble();

            // Filters out negaative numbers
            if (taxableIncome < 0) {
                System.out.println("The income must be a positive number!");
            }
        } while (taxableIncome < 0);

        // Identifies how to tax a certain income according to the BIR tax table
        if (taxableIncome <= 20833.00) {
            System.out.println("The number is too low! Income cannot be taxed!");;
        }
        if (taxableIncome >= 20833.00 && taxableIncome <= 33332.00) {
            bracket = 1;
        }
        if (taxableIncome >= 33333.00 && taxableIncome <= 66666.00) {
            bracket = 2;
        }
        if (taxableIncome >= 66667.00 && taxableIncome <= 166666.00) {
            bracket = 3;
        }
        if (taxableIncome >= 166667.00 && taxableIncome <= 666666.00) {
            bracket = 4;
        }
        if (taxableIncome >= 666667.00) {
            bracket = 5;
        }

        // Calculates the appropriate tax based on the income
        switch (bracket) {
            case 1:
                taxDue = (taxableIncome - 20833.00) * 0.20;
                break;
            case 2:
                taxDue = (taxableIncome - 33333.00) * 0.25;
                break;
            case 3:
                taxDue = (taxableIncome - 66667.00) * 0.30;
                break;
            case 4:
                taxDue = (taxableIncome - 166667.00) * 0.32;
                break;
            case 5:
                taxDue = (taxableIncome - 666667.00) * 0.35;
                break;
            default:
                taxDue = 0.00;
        } // end of switch-case

        System.out.printf("%s %.2f%n", "Tax Due = ", taxDue);
        System.exit(0);
    } // end of main method
} // end of Taxation class