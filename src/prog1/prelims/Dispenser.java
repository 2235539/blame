package prog1.prelims;

import java.util.*;

/*
Name: GARABILES, VANNESS SEAN
Programming Date: SEPT 9, 2022
Activity Name and Number: Prelim Exercise Number 7
Problem:
Write a program that will read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
then compute and output the least number of peso bills (P100 peso bills, P500 peso bills, P1000 peso bills) that
will be dispensed by the machine for the requested amount. Determine also the amount of money corresponding
to each peso bill dispensed, the sum total of number of bills dispensed, and sum total of amounts per
denomination as shown below. Assume that enough bills are always available from the machine. Assume
further that the machine can only dispense P100 peso bills, P500 peso bills, and P1000 peso bills.

Analysis:
Input: Amount to be withdrawn

Processes: 
Compute how many peso bills to be released(1000, 500, and 100)
Compute the amount

Output: peso bills
Output: quantity dispensed
Output: amount

Algorithm:
1. Take input for the amount to be withrawn
2. Calculate the quantity dispensed with (amountToBeWithdrawn / pesoBills)
3. Calculate for the amount with (quantityDispensed * pesoBills)
4. Display the result table
END OF CODE
*/

public class Dispenser {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter amount to be withdrawn, whole numbers only: ");
        int amount = Integer.parseInt(kbd.nextLine());

        int qd1 = amount / 1000;
        int amount1 = qd1 * 1000;
        double am1 = (double)amount1 * 1;

        int cashleft = amount - amount1;
        int qd2 = cashleft / 500;
        int amount2 = qd2 * 500;
        double am2 = (double)amount2 * 1;

        int cashleft2 = amount % cashleft;
        int qd3 = cashleft2 / 100;
        int amount3 = qd3 * 100;
        double am3 = (double)amount3 * 1;

        int totalbills = qd1 + qd2 + qd3;
        int totalbills2 = amount1 + amount2 + amount3;
        double tb3 = (double)totalbills2 * 1;

        System.out.printf("%20s%20s%10s\n", "PESO BILLS", "QUANTITY DISPENSED", "AMOUNT");
        System.out.printf("%20s%20s%10s\n", "============", "==================", "========");
        System.out.printf("%20s%20d%10.2f\n", "P1000", qd1, am1);
        System.out.printf("%20s%20d%10.2f\n", "P500", qd2, am2);
        System.out.printf("%20s%20d%10.2f\n", "P100", qd3, am3);
        System.out.printf("%20s%20s%10s\n", "------------", "------------------", "--------");
        System.out.printf("%20s%20d%10.2f\n", "Total No. Of Bills", totalbills, tb3);

    }
}