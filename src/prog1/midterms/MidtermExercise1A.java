package prog1.midterms;

import java.util.Scanner;
/*
Author: Garabiles, Vanness Sean M.
Programming Date : Sept 24, 2022

Problem:

Suppose the prelim grade for a student is computed as follows:
Given a student’s Total Quiz Score, the student’s Examination Score, the Perfect Quiz score, and the
Perfect Examination Score, the Prelim Grade is computed by using the following formulas:
Quiz Grade = (Total Quiz Score) / (Perfect Quiz Score) * 50 + 50. Exam Grade = (Examination Score) / (Perfect Examination Score) * 50 + 50. Prelim Grade = (Quiz Grade + Exam Grade)/2 and if the computed Prelim Grade is more than 99, the
Prelim Grade is set to 99 but if the computed Prelim Grade is less than 65, the Prelim Grade is set
to 65. Develop a computer program for the computation of a Prelim Grade based on the above formulas. The program will allow the computer to accept a student’s Total Quiz Score, a student’s Examination
Score, the Perfect Total Quiz Score and the Perfect Examination Score. The computer will then show
the corresponding grade. In addition, the remark “PASSED” will be given if the grade is at least 75
and the remark “FAILED” will be given if the grade is less than 75. Sample run1
Enter the Perfect Quiz Score: 100
Enter the Perfect Examination Score: 100
Enter a student’s quiz score: 100
Enter a student’s examination score: 100
Grade = 99 Remark: PASSED
Sample run 2
Enter the Perfect Quiz Score: 200
Enter the Perfect Examination Score: 10
Enter a student’s quiz score: 10
Enter a student’s examination score: 1
Grade = 65 Remark: FAILED

Analysis of the Programming Problem
Inputs: Total Quiz Score, Examination Score, Perfect Quiz Score, Perfect Exam Score
Processes:
1. Read the scores
2. Compute the grade for the quiz
3. Compute the grade for the exam
4. Compute the Prelim Grade
5. Display the grades and a remark
Outputs: Prelim Grade, Remark
Algorithm for the program. a. Let quizScore be a variable to hold the Total Quiz Score
b. Let examScore be a variable to hold the Examination Score
c. Let perfectQuizScore be a variable to hold the Perfect Quiz Score
d. Let perfectExamScore a variable to hold the Perfect Exam Score
e. Let quizGrade be a variable to hold the Quiz Grade. f. Let examGrade be a variable to hold the Exam Grade
g. Let prelimGrade be a variable to hold the Prelim Grade
h. Read the value of perfectQuizScore
i. Read the value of perfectExamScore
j. Read the value of quizScore
k. Read the score for the examScore
l. quizGrade = quizScore / perfectQuizScore * 50 + 50
m. examGrade = examScore / perfectExamScore * 50 +50
n. prelimGrade = (quizGrade + examGrade)/2
o. If prelimGrade is greater than 99 then set prelimGrade to 99
p. If prelimGrade is less than 65 then set prelimGrade to 65
q. If prelimGrade is greater than or equal to 75 then display the grade together with the
remark “PASSED”. r. If prelimGrade is less than 75 then display the grade together with the remark “FAILED” Required:
Complete the following Java program for the programming problem by replacing each blank line by
the appropriate keyword, expression or statement
*/

public class MidtermExercise1A {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        // declares the scores as integer and double
        int quizScore;
        int examScore;
        int perfectQuizScore;
        int perfectExamScore;
        double quizGrade;
        double examGrade;
        double prelimGrade;

        // reads the perfect score from the user
        do {
            System.out.print("Enter the Perfect Total Quiz Score: ");
            perfectQuizScore = Integer.parseInt(kbd.nextLine()); // 4
            if (perfectQuizScore <= 0) {
                System.out.println("Invalid value! Value must be greater than 0.");
            }
        } while (perfectQuizScore <= 0);

        // reads the perfect score from the user
        do {
            System.out.print("Enter the Perfect Examination Score: ");
            perfectExamScore = Integer.parseInt(kbd.nextLine()); // 5
            if (perfectExamScore <= 0) {
                System.out.println("Invalid value! Value must be greater than 0.");
            }
        } while (perfectExamScore <= 0);

        // reads the score from the user
        do {
            System.out.print("Enter a student's total quiz score : ");
            quizScore = Integer.parseInt(kbd.nextLine()); // 6
            if (quizScore > perfectQuizScore) {
                System.out.println("Invalid value! Score must not be greater than perfect score.");
            }
        } while (quizScore > perfectQuizScore);

        // reads the score from the user
        do {
            System.out.print("Enter a student's examination score : ");
            examScore = Integer.parseInt(kbd.nextLine()); // 7
            if (examScore > perfectExamScore) {
                System.out.println("Invalid value! Score must not be greater than perfect score.");
            }
        } while (examScore > perfectExamScore);

        quizGrade = quizScore / perfectQuizScore * 50 + 50;     // calculates the quiz grade with quizScore / perfectQuizScore * 50 + 50
        examGrade = examScore / perfectExamScore * 50 +50;      // calculates the examGrade with examScore / perfectExamScore * 50 +50
        prelimGrade = (quizGrade + examGrade)/2;                // calculates the prelimGrade with (quizGrade + examGrade)/2

        if (prelimGrade > 99){
            prelimGrade = 99;       // sets the prelim grade to 99 if the prelim grade is over 99
        } else if ( prelimGrade < 65){
            prelimGrade = 65;       // sets the prelim grade to 65 if the prelim grade is under 65
        }

        System.out.print("Grade = " + prelimGrade + " ");       // shows the prelim grade

        if (prelimGrade >= 75) {
            System.out.println("Remark: PASSED");       // shows FAILED as the remark if the grade is equal or greater than 75
        } else if (prelimGrade < 75) {
            System.out.println("Remark: FAILED");       // shows PASSED as the remark if the grade is lower than 75
        }
    }   // end of main method
}       // end of class