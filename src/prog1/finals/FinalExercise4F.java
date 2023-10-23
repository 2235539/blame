package prog1.finals;

/*
Name: GARABILES, VANNESS SEAN M.
Course Code and Schedule: 9422  9:00 - 10:30 ThS
Date: NOVEMBER 12, 2022

PROBLEM:
   Develop a program that will allow the computer to accept some names that are not necessarily in
   alphabetical ordering. The names should be stored in a one-dimensional array. The computer will then display
   the names following lexicographic ordering (i.e. alphabetical ordering).
   Apply the Selection Sort algorithm (Filename: FinalExercise4F.java)

*/
import java.util.Scanner;

public class FinalExercise4F {
   public static void main(String[] args) {
       Scanner kbd = new Scanner(System.in);
       String[] namesOfCandidates = new String[5];
       int candNum=1;

       for (int i = 0 ; i < namesOfCandidates.length; i++) {
           System.out.print("Enter the name of candidate number " + candNum + ": ");
           namesOfCandidates[i] = kbd.nextLine();
           candNum++;
       }

       System.out.println("The original array is :");
       for (int i = 0 ; i < namesOfCandidates.length; i++) {
           System.out.println(namesOfCandidates[i]);
       }

       for (int i = 0; i < namesOfCandidates.length - 1; i++)
       {
           int index = i;
           for (int j = i + 1; j < namesOfCandidates.length; j++){
               if (namesOfCandidates[j].compareTo(namesOfCandidates[index])<0){
                   index = j;
               }
           }
           String preName = namesOfCandidates[index];
           namesOfCandidates[index] = namesOfCandidates[i];
           namesOfCandidates[i] = preName;
       }

       System.out.println("\nThe sorted array using Selection sort is :");
       for (int i = 0 ; i < namesOfCandidates.length; i++) {
           System.out.println(namesOfCandidates[i]);
       }
   }
}