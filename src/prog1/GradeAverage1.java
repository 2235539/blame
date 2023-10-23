package prog1;

/*
Author: Garabiles, Vanness Sean M.
Programming Date : Sept 17, 2022

Analysis:
Input: 10 pairs of grades and units
Processes:
Read the grades and units
Compute the sum of the products of grades and units
Compute the total of the units
Compute the average : (sum of products of grades and units)/total_units
Show the average
Give an appropriate message
Output: Average, Message
Algorithm:
1. Let grade represent a grade for a subject
2. Let units represent number of units for a subject
3. Let totalGrade = 0 where totalGrade represents the sum of the products of grades and
corresponding units
4. Let totalUnits = 0 where totalUnits represents the total number of units
5. Let average represent the average grade of the student
6. Read the first grade
7. Read the number of units for the first grade
8. Add the product of first grade and the corresponding units to totalGrade
9. Add the units for the first grade to totalUnits
10. Repeat steps 6, 7, 8 and 9 for the 2nd to the 10th grade
11. Compute the average where average = totalGrades/totalUnits
12. Display the average
13. If (average >= 85) print “Congratulations! You belong to the dean's list."
14. If (average < 85) print “Sorry! You did not make it to the dean's list. Do better
next term."
*/

import java.util.Scanner;

public class GradeAverage1 {
    public static void main(String[] args) {

        //declares grade, units, totalGrade, totalUnits, and average
        int grade = 50;
        int units = 0;
        int totalGrade = 0;
        int totalUnits = 0;
        double average = 0.0;


        //the following lines of code takes user input for the subjects
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the grade of the student for CFE 101: ");
        int cfe101Grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for CFE 101: ");
        int cfe101Units = Integer.parseInt(kbd.nextLine());

        totalGrade = totalGrade + cfe101Grade * cfe101Units; // totalGrade += grade* units;
        totalUnits = totalUnits + cfe101Units;

        System.out.print("Enter the grade of the student for FIT HW: ");
        int fitGrade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for FIT HW: ");
        int fitUnits = Integer.parseInt(kbd.nextLine());

        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;

        System.out.print("Enter the grade of the student for GART: ");
        int artGrade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for GART: ");
        int artUnits = Integer.parseInt(kbd.nextLine());

        totalGrade = totalGrade + artGrade * artUnits; // totalGrade += grade* units;
        totalUnits = totalUnits + artUnits;

        System.out.print("Enter the grade of the student for GHIST: ");
        int histGrade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for GHIST: ");
        int histUnits = Integer.parseInt(kbd.nextLine());

        totalGrade = totalGrade + histGrade * histUnits; // totalGrade += grade* units;
        totalUnits = totalUnits + histUnits;

        System.out.print("Enter the grade of the student for GSELF: ");
        int selfGrade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for GSELF: ");
        int selfUnits = Integer.parseInt(kbd.nextLine());

        totalGrade = totalGrade + selfGrade * selfUnits; // totalGrade += grade* units;
        totalUnits = totalUnits + selfUnits;

        System.out.print("Enter the grade of the student for IT 111: ");
        int it111Grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for IT 111: ");
        int it111Units = Integer.parseInt(kbd.nextLine());

        totalGrade = totalGrade + it111Grade * it111Units; // totalGrade += grade* units;
        totalUnits = totalUnits + it111Units;

        System.out.print("Enter the grade of the student for IT 112: ");
        int it112Grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for IT 112: ");
        int it112Units = Integer.parseInt(kbd.nextLine());

        totalGrade = totalGrade + it112Grade * it112Units; // totalGrade += grade* units;
        totalUnits = totalUnits + it112Units;

        System.out.print("Enter the grade of the student for IT 113: ");
        int it113Grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for IT 113: ");
        int it113Units = Integer.parseInt(kbd.nextLine());

        totalGrade = totalGrade + it113Grade * it113Units; // totalGrade += grade* units;
        totalUnits = totalUnits + it113Units;

        average = totalGrade/totalUnits;
        System.out.println("\nThe total average is: " + average);

        if (average >= 85) {
            System.out.println("\nCongratulations! You belong to the dean's list.");        //dispays if the average is higher than 85
        }
        else {
            System.out.println("\nSorry! You did not make it to the dean's list. Do better next term.");        //displays if the average is below 85
        }
    }       // end of main method
}           // end of class