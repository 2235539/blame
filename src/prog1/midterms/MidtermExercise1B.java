package prog1.midterms;

import java.util.*;
/*
Author: Garabiles, Vanness Sean M.
Programming Date : Sept 24, 2022

Problem:
Modify your completed program such that the following are enforced. Save your final program in an
electronic folder that you will eventually submit. (Filename: MidtermExercise1B.java)
a) “while” statements are used instead of “do-while” statements
b) Aside from being no greater than the perfect quiz score, the quiz score to be entered should not
be a negative value. An appropriate message should be displayed in case the user enters a
negative quiz score and the user should be allowed to enter a new value. c) Aside from being no greater than the perfect exam score, the exam score to be entered should
not be a negative value. An appropriate message should be displayed in case the user enters a
negative exam score and the user should be allowed to enter

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


public class MidtermExercise1B {
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
        System.out.print("Enter the Perfect Total Quiz Score: ");
        perfectQuizScore = Integer.parseInt(kbd.nextLine()); // 4
        while (perfectQuizScore <= 0) {
            System.out.println("Invalid value! Value must be greater than 0.");
            System.out.print("Enter the Perfect Total Quiz Score: ");
            perfectQuizScore = Integer.parseInt(kbd.nextLine()); // 4
        }

        // reads the perfect score from the user
        System.out.print("Enter the Perfect Examination Score: ");
        perfectExamScore = Integer.parseInt(kbd.nextLine()); // 5
        while (perfectExamScore <= 0) {
            System.out.println("Invalid value! Value must be greater than 0.");
            System.out.print("Enter the Perfect Examination Score: ");
            perfectExamScore = Integer.parseInt(kbd.nextLine()); // 5
        }

        // reads the score from the user
        System.out.print("Enter a student's total quiz score : ");
        quizScore = Integer.parseInt(kbd.nextLine()); // 6
        while (quizScore > perfectQuizScore) {
            System.out.println("Invalid value! Score must not be greater than perfect score.");
            System.out.print("Enter a student's total quiz score : ");
            quizScore = Integer.parseInt(kbd.nextLine()); // 6
        }
        while (quizScore < 0) {
            System.out.println("Invalid value! Score must not be a negative number.");
            System.out.print("Enter a student's total quiz score : ");
            quizScore = Integer.parseInt(kbd.nextLine());
        }

        // reads the score from the user
        System.out.print("Enter a student's examination score : ");
        examScore = Integer.parseInt(kbd.nextLine()); // 7
        while (examScore > perfectExamScore) {
            System.out.println("Invalid value! Score must not be greater than perfect score.");
            System.out.print("Enter a student's examination score : ");
            examScore = Integer.parseInt(kbd.nextLine()); // 7
        }

        while (examScore < 0){
            System.out.println("Invalid value! Score must not be a negative number.");
            System.out.print("Enter a student's examination score : ");
            examScore = Integer.parseInt(kbd.nextLine()); // 7
        }


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