package prog1.midterms;

/*
Author: Garabiles, Vanness Sean M.
Programming Date : Oct 14, 2022

Problem:
Write an improved version of the program that will provide validation processes for the input
values. The following should be imposed: (Filename: MidtermExercise4.java)
The quantity cannot be a negative number.
The unit price must be greater than zero
The discount rate cannot be negative and it cannot be more than 100 percent.
The amount tendered cannot be lower than the amount to be paid.

Algorithm:
1. Filter out the quantity so it cannot be a negative number.
2. Filter out the unit price so it must be greater than zero
2. Filter out the discount rate so it cannot be negative and it cannot be more than 100 percent.
2. Filter out the amount tendered so it cannot be lower than the amount to be paid.
*/

import java.util.Scanner;
import java.lang.*;
public class MidtermExercise4 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        String pName = "";
        double uPrice, totalCost, discount, discountedCost, amountTendered, change;
        int qty, dRate;

        System.out.print("Product: ");
        pName = kbd.nextLine();

        do {
            System.out.print("Quantity: ");
            qty = Integer.parseInt(kbd.nextLine());
            if (qty < 0) {
                System.out.println("Invalid number! The quantity must be higher than 0! ");
            }
        } while (qty < 0);

        do {
            System.out.print("Unit Price: ");
            uPrice = Double.parseDouble(kbd.nextLine());
            if (uPrice < 0) {
                System.out.println("Invalid number! The Unit Price must be higher than 0! ");
            }
        } while (uPrice < 0);

        do {
            System.out.print("Discount: ");
            dRate = Integer.parseInt(kbd.nextLine());
            if (dRate < 0) {
                System.out.println("Invalid number! The Discount must be higher than 0! ");
            } else if (dRate > 100) {
                System.out.println("Invalid number! The Discount must be lower than 100! ");
            }
        } while (dRate < 0 || dRate > 100);

        totalCost = uPrice * qty;
        discount = totalCost * (dRate / 100.0);
        discountedCost = totalCost - discount;

        do {
            System.out.print("Cash Tendered: ");
            amountTendered = Double.parseDouble(kbd.nextLine());
            if (amountTendered < totalCost);
        } while (amountTendered < totalCost);

        change = amountTendered - discountedCost;
        System.out.printf("%-25s%12s%n", "---------------", "--------------");
        System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
        System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
        System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
        System.out.printf("%-25s%12.2f%n", "change: ", change);
        System.exit(0);
    } // end of main method
} // end of class