package prog1.midterms;

import java.util.Scanner;
import java.util.Random;
import java.lang.*;
/*
Author: Garabiles, Vanness Sean M.
Programming Date : October 21, 2022

Requirement:
Study, debug if needed, test, trace and improve the following program. (Be able to explain some
methods of the String class.)

Algorithm:
1. Make another method(formName2) that returns the reversed string of name1 and name2
2. Declare string holders
3. Extract each character from the name
4. Add each character in front of the existing string holder
5. Return result
6. Make another method(formName4) that returns a string formed by concatenating the combined name1 and name2 and name2 and name1
7. Declare string holders
8. Concatenate name1 and name2 in a string holder
9. Concatenate name2 and name1 in a string holder
10. Combine the string holders
11. Return result
*/
public class MidtermExercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = "", s2 = "";
        System.out.print("Enter your first name: ");
        s1 = scan.nextLine();
        System.out.print("Enter someone's first name: ");
        s2 = scan.nextLine();
        System.out.println("Possible names of your proteges");
        System.out.println("1. " + formName3(s1, s2));
        System.out.println("2. " + formName3(s2, s1));
        System.out.println("3. " + formName1(s2, s1));
        System.out.println("4. " + formName1(s1, s2));
        System.out.println("5. " + formName5(s1, s2, 5));
        System.out.println("6. " + formName5(s2, s1, 5));
        System.out.println("7. " + formName2(s1));
        System.out.println("8. " + formName2(s2));
        System.out.println("9. " + formName4(s1, s2));
        System.out.println("10. " + formName4(s2, s1));
        System.exit(0);
    } // end of main method

    /** Returns the string formed by concatenating the first 2 characters of a String called name1
     *   to and the last two characters of another String called name2.
     */

    public static String formName1(String name1, String name2) {
        String result = "";
        result = name1.substring(0, 2).concat(name2.substring(name2.length() - 2));
        return result;
    } // end of formName1 method

    // Returns the reversed string of name1 and name2
    public static String formName2 (String name1) {
        String result = "";
        String ch = "";
        for (int i=0; i<name1.length(); i++)
        {
            ch= String.valueOf(name1.charAt(i));
            result = ch+result; //adds each character in front of the existing string
        }
        return result;
    } // end of formName2 method

    // Returns the string formed by concatenating the two strings name1 and name2
    public static String formName3(String name1, String name2) {
        String result = "";
        result = name1.concat(name2);
        return result;
    } // end of formName3 method

    // Returns a string formed by concatenating the combined name1 and name2 and name2 and name1
    public static String formName4(String name1, String name2) {
        String holder1 = "";
        String holder2 = "";
        String result = "";

        holder1 = name1.concat(name2);
        holder2 = name2.concat(name1);

        result = holder1.concat(holder2);
        return result;

    }

    /** Returns a string with length n formed by concatenating characters that are alternately
     *  taken from random positions of the two strings name1 and name 2.
     */
    public static String formName5(String name1, String name2, int n) {
        String result = "";
        Random generate = new Random();
        int location = 0;
        for (int x = 0; x < n; x++) {
            if (x % 2 == 0) {
                location = generate.nextInt(name1.length());
                result = result + name1.charAt(location);
            }
            else {
                location = generate.nextInt(name2.length());
                result = result + name2.charAt(location);
            }
        } // end of for return result;
        return result;
    } // end of formName5 method


} // end of class