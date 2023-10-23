package prog1.finals;

/*
Name: GARABILES, VANNESS SEAN M.
Course Code and Schedule: 9422  9:00 - 10:30 ThS
Date: NOVEMBER 12, 2022

PROBLEM:
   Develop a program that will allow the computer to accept some names that are not necessarily in
   alphabetical ordering. The names should be stored in a one-dimensional array. The computer will then display
   the names following lexicographic ordering (i.e. alphabetical ordering).
   Apply the Balloon Sort algorithm (Filename: FinalExercise4D.java)

*/
import java.util.Scanner;

public class FinalExercise4D {
   public static void main(String[] args) {
       Scanner kbd = new Scanner(System.in);
       String[] namesOfCandidates = new String[5];
       int candNum=1;

       for (int i = 0 ; i < namesOfCandidates.length; i++) {
           System.out.print("Enter the name of candidate number " + candNum + ": ");
           namesOfCandidates[i] = kbd.nextLine();
           candNum++;
       }

       System.out.println("\nThe original array is :");
       for (int i = 0 ; i < namesOfCandidates.length; i++) {
           System.out.println(namesOfCandidates[i]);
       }

       for(int i = 0; i<namesOfCandidates.length-1; i++) {
           for (int j = i+1; j<namesOfCandidates.length; j++) {
               if(namesOfCandidates[i].compareTo(namesOfCandidates[j])>0) {
                   String temp = namesOfCandidates[i];
                   namesOfCandidates[i] = namesOfCandidates[j];
                   namesOfCandidates[j] = temp;
               }
           }
       }

       System.out.println("\nThe sorted array using Balloon sort is :");
       for (int i = 0 ; i < namesOfCandidates.length; i++) {
           System.out.println(namesOfCandidates[i]);
       }
   }
}