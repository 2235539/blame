package prog1.prelims;

import java.util.*;

/*
Name: GARABILES, VANNESS SEAN
Programming Date: SEPT 9, 2022
Activity Name and Number: Prelim Exercise Number 6
Problem:
Write a Java program that will be used at the check-out counter of Aling Nena's Sari-Sari Store.
Analysis:
Input: Product
Input: Quantity
Input: Unit Price
Input: Discount
Input: Cash Tendered
Processes: 
Compute the total purchase amount
Compute the total discount
Compute the amount to be paid
Compute the change
Output: total purchase amount
Output: total discount
Output: amount to be paid
Output:  change
Algorithm:
1. Take input for the Product
2. Take input for the Quantity
3. Take input for the Unit Price
4. Take input for the Discount
5. Take input for the Cash Tendered
6. Calculate for the total purchase amount with quantity * price
7. Calculate for the total discount with (double) discount / 100
8. Calculate for the amount to be paid with ttpurchase * ttdiscount
9. Calculate for the change with cash - ttamount
10. Display the total purchase amount
11. Display the total discount
12. Display the amount to be paid
13. Display the change
END OF CODE
*/


public class AlingNenaStore {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);

    // Takes input for the product
    System.out.print("Product: ");
    String product = kbd.nextLine();

    // Takes input for the quantity 
    System.out.print("Quantity: ");
    int quantity = Integer.parseInt(kbd.nextLine());

    // Takes input for the unit price
    System.out.print("Unit Price: ");
    double price = Double.parseDouble(kbd.nextLine());

    // Takes input for the discount 
    System.out.print("Discount: ");
    double discount = Double.parseDouble(kbd.nextLine());

    // Takes input for the cash tendered 
    System.out.print("Cash Tendered: ");
    double cash = Double.parseDouble(kbd.nextLine());

    // The set of codes bellow calculates the total purchase amount, Total discount, Amount to be paid, and Change respectively
    double ttpurchase = quantity * price;
    double ttdiscount = (ttpurchase * discount) / 100;
    double ttamount = ttpurchase - ttdiscount;
    double sukli = cash - ttamount;

    System.out.println("\nTotal Purchase Amount: " + ttpurchase); // Outputs the  total amount 
    System.out.println("Total Discount: " + ttdiscount); // Outputs the total discount 
    System.out.println("Amount to be paid: " + ttamount); // Outputs the amount to be paid
    System.out.println("Change: " + sukli); // Outputs the change

  }
}