package prog1.midterms;

import java.util.Scanner;

/*
Author: Garabiles, Vanness Sean M.
Programming Date : Oct 16, 2022

Problem:
Create a Simplified Water Bill Computation

Algorithm:
1. Read the name of the water consumer
2. Read the previous water meter reading in cubic meters (reading last month) from the consumer’s meter. The meter reading cannot be less than zero.
3. Read the present water meter reading in cubic meters (reading this month) from the consumer’s meter. The present water meter reading cannot be less than the previous water meter reading.
4. Compute the volume of water consumed (consumption = CMUSed) by subtracting the previous reading from the present reading.
5. Read the classification of the consumer (c for commercial or r for residential)
6. Compute the amount due from the consumer.
7. Show the Amount Due
*/

public class MidtermExercise7 {

    public static void main(String[] args) {
        int presentReading = 0, previousReading = 0;
        Scanner kbd = new Scanner(System.in);
        String consumer = ""; // to hold name of consumer
        char cType = 'x'; // to hold type of consumer
        String bType = "";
        int nCMUsed; // to hold number of cubic meters of water used
        int minCMResidential = 12; // to hold cut-off for minimum Bill for residential consumers
        double minBillResidential = 180.00; // minimum bill for &lt;= 12 Cubic Meters used
        float rateResidential = 30.00F; // cost of 1 Cubic Meter above the min. consumption
        int minCMCommercial = 30; // to hold cut-off for minimum Bill for commercial consumers
        double minBillCommercial = 600.00; // minimum bill for &lt;= 20 Cubic Meters used
        float rateCommercial = 50.00F; // cost of 1 Cubic Meter above the min. consumption for commercial consumers
        double amountDue = 0.0; // to hold the amount due
        
        System.out.println("=================================================================");
        System.out.print("Enter the consumer's name: ");
        consumer = kbd.nextLine();

        do {
            System.out.print("Enter the meter reading last month: ");
            previousReading = Integer.parseInt(kbd.nextLine());
            if (previousReading < 0) {
                System.out.println("The meter reading cannot me negative."); }
        } while (previousReading < 0);

        // insert statements below

        do {
            System.out.print("Enter the present reading: ");
            presentReading = Integer.parseInt(kbd.nextLine());
            if (presentReading < previousReading) {
                System.out.println("The present water reading cannot be less than the previous reading!");
            }
        } while (presentReading < previousReading);

        nCMUsed = (presentReading - previousReading);
        Boolean laLang = true;  
        
        while (laLang) {
        System.out.println("Type of consumer could be R for RESIDENTIAL or C for COMMERCIAL");
        System.out.print("Type of consumer: ");
        cType = kbd.next().charAt(0);        
        if (cType == ('r') || cType == ('R')) {
            bType = "Residential";
            laLang = false;
            if (nCMUsed <= minCMResidential) {
                amountDue = minBillResidential;
            } else if (nCMUsed > minCMResidential) {
                amountDue = minBillResidential + (nCMUsed-minCMResidential) * rateResidential;
            }
            
        } else if (cType == ('c') || cType == ('C')) {
            bType = "Commercial";
            laLang = false;
            if (nCMUsed <= minCMCommercial) {
                amountDue = minBillCommercial;
            } else if (nCMUsed > minCMCommercial) {
                amountDue = minCMCommercial + (nCMUsed-minCMCommercial) * rateCommercial;
            } 
        } else{
            System.out.println("Invalid consumer type!");
        }
    }
        System.out.println("=======================================");
        System.out.printf("| %17s | %-15s | %n", "Subscriber", consumer );
        System.out.printf("| %17s | %-15s | %n", "Consumer Type", bType );
        System.out.printf("| %17s | %-15d | %n", "Prev Reading", previousReading );
        System.out.printf("| %17s | %-15d | %n", "Present Reading", presentReading );
        System.out.printf("| %17s | %-15d | %n", "Cubic Meters Used", nCMUsed );
        System.out.printf("| %17s | %-15.2f | %n", "Amount Due", amountDue );
        System.out.println("=======================================");
    }   // end of main
}   // end of class