package prog1.finals;

/*
Name: GARABILES, VANNESS SEAN M.
Course Code and Schedule: 9422  9:00 - 10:30 ThS
Date: NOVEMBER 12, 2022

PROBLEM:
   Develop a program that will allow the computer to accept some numbers that are not sorted. The numbers
   should be stored in a one-dimensional array. The computer will then display the numbers following descending
   order and ascending order.

   Apply the Balloon Sort algorithm (Filename: FinalExercise4A.java)

*/
import java.util.Scanner;

public class FinalExercise4A {
   public static void main(String[] args) {
       Scanner kbd = new Scanner(System.in);
       int[] numberOfStudents = new int[5];
       int classNum = 1;

       for(int i = 0; i < numberOfStudents.length; i++)
           do {
               System.out.print("Enter the number of students in class " + classNum + ":");
               numberOfStudents[i]= Integer.parseInt(kbd.nextLine());
                   if (numberOfStudents[i] < 0){
                       System.out.println("The number of students can't be a negative number!");
                   }
                   classNum++;
           } while(numberOfStudents[i] < 0);

       System.out.println("\nThe original array is :");
       for (int i = 0 ; i < numberOfStudents.length; i++) {
           System.out.println(numberOfStudents[i]);
       }

       for (int j = 1; j < numberOfStudents.length; j++) {
           int key = numberOfStudents[j];
           int i = j-1;
           while ( (i > -1) && ( numberOfStudents [i] > key ) ) {
               numberOfStudents [i+1] = numberOfStudents [i];
               i--;
           }
           numberOfStudents[i+1] = key;
       }

       System.out.println("\nThe sorted array using Balloon sort is :");
       for (int i = 0 ; i < numberOfStudents.length; i++) {
           System.out.println(numberOfStudents[i]);
       }
   }
}