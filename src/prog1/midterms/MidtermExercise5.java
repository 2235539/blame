package prog1.midterms;

/*
Author: Garabiles, Vanness Sean M.
Programming Date : Oct 15, 2022

Problem:
Write another version of the program so that the following specifications are satisfied:
The number of pairs of grades and units is an input value at run time. Hence, the
program may be used to compute the average of 5 grades, 8 grades, 10 grades, etc.
There are validation processes for the input values. Grades must be integers from 65
to 99. The number of units must be at least 1 but not more than 12. If an input value
is invalid, the user should be given a directive to enter another value and that
processing will continue after the user enters a valid value.
The repetitive computation process is handled using an iteration construct. (while, do-while or for construct)
The computer will display a running average after every pair of grades and units is
entered. The running average is the average of the grades entered so far. package Midterm.Exercises;

Algorithm:
1. Take user input for the number of Subjects to be graded.
2. Filter out the Grades so the Grades must be integers from 65 to 99.
3. Filter out the Units so the Units must be integers from 1 to 12.
4. Compute for the Average Grade.
5. Display the Running average.
6. Repeat the grade computation until the number of subjects is met.
7. Display the Total Average.
*/

import java.lang.*;
import java.util.Scanner;
public class MidtermExercise5 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int grade = 0;
        int units = 0;
        int totalGrade = 0;
        int totalUnits = 0;
        double average = 0.0;
        int numOfGrades = 0;

        System.out.print("Enter the number of subjects to be graded: ");
        numOfGrades = Integer.parseInt(kbd.nextLine());

        for (int counter=1 ; counter <= numOfGrades ; counter++) {

            do {
                System.out.print("\nEnter the grade of the student for the subject " + counter + ": ");
                grade = Integer.parseInt(kbd.nextLine());
                if (grade < 65) {
                    System.out.println("Grade must be higher than 65!");
                } else if (grade > 99) {
                    System.out.println("Grade must be lower than 100!");
                }
            } while (grade < 65 || grade > 99);

            do {
                System.out.print("\nEnter the number of units for the subject " + counter + ": ");
                units = Integer.parseInt(kbd.nextLine());
                if (units < 1) {
                    System.out.println("Units must be higher than 0!");
                } else if (units > 12) {
                    System.out.println("Units must be lower than 12!");
                }
            } while (units < 1 || units > 12);

            totalGrade += grade * units;
            totalUnits += units;

            average = (double) totalGrade / totalUnits;
            System.out.printf("%s%.2f%n", "The Average Grade so far is ", average);
        }

        average = (double) totalGrade / totalUnits;
        System.out.printf("%s%.2f%n", "The Final Average Grade = ", average);
        System.exit(0);

    }
}