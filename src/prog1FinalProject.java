
import java.util.Scanner;
import java.util.Random;

public class prog1FinalProject {
    // main method
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int myChoice = 0;
        showIntroduction();
        keyboard.nextLine();
        do {
            showMainMenu();
            myChoice = enterChoice(1, 4);
            switch (myChoice) {
                case 1:
                    mathSolver();
                    break;
                case 2:
                    recordKeeping();
                    break;
                case 3:
                    miscellaneousProcesses();
                    break;
                case 4:
                    System.out.println("Thank you for using my program.");
                    System.out.println("Enjoy the rest of your day.");
            } //end switch
        } while (myChoice != 4);
    } //end main method
    public static void showIntroduction() {
        System.out.println("\n\n\n");
        System.out.println(" School of Accountancy, Management, Computing, and Information Studies ");
        System.out.println(" Saint Louis University ");
        System.out.println(" Baguio City ");
        System.out.println("---------------------------------------------");
        System.out.println("\n");
        System.out.println(" Vanness Sean Garabiles ");
        System.out.println(" BSIT 1 - Computer Programming 1 ");
        System.out.println("\n");
        System.out.print("Please enter a key to see the Main Menu...");
    }
    public static void showMainMenu() {
        System.out.println("\nMain Menu ");
        System.out.println("----------------------------");
        System.out.println("1. Math Routines");
        System.out.println("2. Recording Routines");
        System.out.println("3. Miscellaneous Routines");
        System.out.println("4. Exit");
        System.out.println("------------------------------");
    }
    public static void showMenu1() {
        System.out.println("\nMath Routine Submenu ");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Determine whether an integer is odd or even");
        System.out.println("2. Determine sum of a series");
        System.out.println("3. Determine the factors of a number");
        System.out.println("4. Determine if a number is prime");
        System.out.println("5. Determine the area of a circle");
        System.out.println("6. Determine the area of a square");
        System.out.println("7. Determine the area of a triangle");
        System.out.println("8. Determine the area of a rectangle");
        System.out.println("9. Determine the area of a trapezoid");
        System.out.println("10. Determine the area of a parallelogram");
        System.out.println("11. Determine if an integer is a perfect number");
        System.out.println("12. Generate a multiplication table");
        System.out.println("13. Determine the roots of a quadratic equation");
        System.out.println("14. Generate a Fibonacci Sequence");
        System.out.println("15. Generate a Pascal's Triangle");
        System.out.println("16. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }
    public static void showMenu2() {
        System.out.println("\nRecording Routine Submenu ");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Accept and sort list of students");
        System.out.println("2. Accept and sort list of Salesmen");
        System.out.println("3. Accept pairs of names and grades and sort list according to name");
        System.out.println("4. Accept pairs of names and grades and sort list according to grade");
        System.out.println("5. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }
    public static void showMenu3() {
        System.out.println("\nMiscellaneous Routine Submenu ");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Number Guessing Game");
        System.out.println("2. Covid19 Self-Assessment Procedure ");
        System.out.println("3. Bills distribution of an amount of Money");
        System.out.println("4. Interest of Money Invested ");
        System.out.println("5. Income Tax Computation");
        System.out.println("6. Insect Population Growth Rate");
        System.out.println("7. Water Bill computaion.");
        System.out.println("8. Electric Bill computation.");
        System.out.println("9. Mobile Phone Load Balance Computation.");
        System.out.println("10. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }
    public static int enterChoice(int min, int max) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.print("Input the number corresponding to your choice: ");
            choice = keyboard.nextInt();
            if (choice < min || choice > max)
                System.out.println("Invalid choice. Please ensure that you enter a number from " +
                        min + " to " + max + ".");
        } while (choice < min || choice > max);
        return (choice);
    }
    public static void mathSolver() {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            showMenu1();
            choice = enterChoice(1, 16);
            switch (choice) {
                case 1:
                    int y;

                    System.out.print("Enter an integer :");

                    y = keyboard.nextInt();
                    System.out.println(detOddEven(y));

                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 2:
                    int z;

                    System.out.print("Enter an integer :");
                    z = keyboard.nextInt();
                    System.out.println("The sum of the series is " + getSumOfSeries(z));
                    System.out.println();

                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 3:
                    // Vanness Garabiles - Nov 21 - Determine the factors

                    System.out.print("Enter an integer :");
                    z = keyboard.nextInt();

                    System.out.print("The factors of " + z + " are as follows: ");
                    for (int i = 1; i <= z; ++i) {
                        if (z % i == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 4:
                    // Vanness Garabiles - Nov 21 - Determine if Prime
                    boolean isPrime = true;

                    System.out.print("Enter an integer: ");
                    z = keyboard.nextInt();

                    for (int i = 2; i <= z / 2; ++i) {
                        if (z % i == 0) {
                            isPrime = false;
                            System.out.println();
                            System.out.print("Press enter to continue...");
                            keyboard.nextLine();
                            break;
                        }
                    }

                    if (isPrime) {
                        System.out.println("The number " + z + " is a prime number.");
                    } else {
                        System.out.println("The number " + z + " is not a prime number.");
                    }
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 5:
                    // Vanness Garabiles -  Aug 27 but modified on Nov 21 - Determine the Circumference
                    int radius;
                    double circumference;
                    double areaOfCircle;

                    System.out.print("Enter the radius: ");
                    radius = keyboard.nextInt();
                    circumference = 2 * 3.1416 * radius;
                    areaOfCircle = 3.1416 * radius * radius;

                    System.out.println();
                    System.out.println();
                    System.out.println(" **********************************************************");
                    System.out.println(" *                                                        *");
                    System.out.println(" *                                                        *");
                    System.out.println(" *           Radius of circle is " + radius + "                       *");
                    System.out.println(" *           Circumference of circle is " + circumference + "                *");
                    System.out.println(" *           Area of circle is " + areaOfCircle + "                     *");
                    System.out.println(" *                                                        *");
                    System.out.println(" *                                                        *");
                    System.out.println(" **********************************************************");
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 6:
                    // Vanness Garabiles -  Aug 27 but modified on Nov 21 - Determine the area of the square
                    int side;
                    System.out.print("Enter the side: ");
                    side = keyboard.nextInt();

                    // A mathematical expression represents a value that may be assigned to a variable
                    int area = side * side;
                    int perimiter = 4 * side;

                    System.out.println();
                    System.out.println();
                    System.out.println(" **********************************************************");
                    System.out.println(" *                                                        *");
                    System.out.println(" *                                                        *");
                    System.out.println(" *           The perimeter of the square is " + perimiter + "            *");
                    System.out.println(" *           The area of the square is " + area + "                *");
                    System.out.println(" *                                                        *");
                    System.out.println(" *                                                        *");
                    System.out.println(" *                                                        *");
                    System.out.println(" **********************************************************");
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 7:
                    math7();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 8:
                    math8();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 9:
                    math9();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 10:
                    math10();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 11:
                    math11();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 12:
                    // Vanness Garabiles - Nov 25 - Display the multiplication table
                    for (int row = 1; row <= 10; row++) {
                        for (int col = 1; col <= 10; col++) {
                            System.out.printf("%4d", (row * col));
                        }
                        System.out.println();
                    }
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 13:
                    math13();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 14:
                    int t;

                    System.out.print("\nHow many terms do you want? ");

                    t = keyboard.nextInt();
                    generateFibonacciSequence(t);
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    keyboard.nextLine();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 15:
                    math15();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 16:
                    showMainMenu();
                    break;
            } // end of cases
        } while (choice != 16);
    } // end of mathSolver method
    public static void recordKeeping() {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            showMenu2();
            choice = enterChoice(1, 5);
            switch (choice) {
                case 1:
                    acceptAndSortNames();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 2:
                    acceptAndSortNames2();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 3:
                    rk1();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 4:
                    rk2();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 5:
                    showMainMenu();
                    break;
            } // end of cases
        } while (choice != 5);
    } // end of recordKeeping method
    public static void acceptAndSortNames() {
        Scanner keyboard = new Scanner(System.in);
        String[] names;
        int n = 0;
        System.out.print("How many names will be sorted? ");
        n = Integer.parseInt(keyboard.nextLine());
        names = new String[n];
        // Populate array names
        for (int z = 0; z < names.length; z++) {
            System.out.print("Enter name of student " + (z + 1) + ": ");
            names[z] = keyboard.nextLine();
        }
        // Sort the names array
        balloonSortArrayString(names);
        //Show elements of names array
        showElements(names);
    }
    public static void acceptAndSortNames2() {
        Scanner keyboard = new Scanner(System.in);
        String[] names;
        int n = 0;
        System.out.print("How many names will be sorted? ");
        n = Integer.parseInt(keyboard.nextLine());
        names = new String[n];
        // Populate array names
        for (int z = 0; z < names.length; z++) {
            System.out.print("Enter name of salesman " + (z + 1) + ": ");
            names[z] = keyboard.nextLine();
        }
        // Sort the names array
        balloonSortArrayString(names);
        //Show elements of names array
        showElements(names);
    }
    public static void miscellaneousProcesses() {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            showMenu3();
            choice = enterChoice(1, 10);
            switch (choice) {
                case 1:
                    higherOrLower();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 2:
                    selfEvaluation();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 3:
                    billDistributor();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 4:
                    invest();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 5:
                    tax();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 6:
                    insectPopulationGrowthRate();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 7:
                    waterBill();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 8:
                    electricBill();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 9:
                    goSurf();
                    System.out.println();
                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;
                case 10:
                    showMainMenu();
                    break;
            } // end of cases
        } while (choice != 10);
    } // end of miscellaneousProcesses method
    public static String detOddEven(int number) {
        if (number % 2 != 0)
            return (" The number is odd ");
        else
            return (" The number is even ");
    }
    public static double getSumOfSeries(int n) {
        double sum = 0;
        if (n > 1 && n % 2 == 0) {
            for (int ctr = n; ctr > 1; ctr -= 2)
                sum += (1.0 / ctr);
        }
        return (sum);
    } // end of method
    public static void higherOrLower() {
        Scanner keyboard = new Scanner(System.in);
        Random rndNoGen = new Random(); // Random class is a facility for
        // generating random numbers
        int secretNo = rndNoGen.nextInt(100) + 1; // generate a random number
        // that is in the range from 1 to 100.
        System.out.println("I have an integer from 1 to 100.");
        System.out.println("You have 10 chances to guess it.");
        int guessNo = 0;
        int guess;
        boolean gotIt = false;
        do {
            System.out.print("\nGuess #" + (guessNo + 1) + ": ");
            guess = keyboard.nextInt();
            if (guess == secretNo) {
                gotIt = true;
                break; // terminate the loop immediately
            } else {
                if (guessNo == 10) {
                    break; // terminate the loop immediately
                } else {
                    if (guess > secretNo) {
                        System.out.println("Try something lower.");
                    } else {
                        System.out.println("Try something higher.");
                    }
                    guessNo++;
                }
            }
        } while (guessNo < 10);
        if (gotIt) {
            System.out.println("\nCongratulations!!!");
            System.out.println("Got it in " + guessNo + " trial(s)!");
        } else {
            System.out.println("\nSorry. No more guesses left.");
            System.out.println("The number is " + secretNo + ".");
            System.out.println("Better luck next time.");
        }
        System.out.println("\nThanks for playing!!!");
        System.out.println("Have a nice day :)!");
    } // end of higherOrLower method
    public static void generateFibonacciSequence(int nTerms) {
        int first = 1, second = 1;
        int temp;
        int count = nTerms;
        System.out.print("Terms: ");
        if (nTerms == 1)
            System.out.println(first);
        if (nTerms == 2)
            System.out.println(first + " , " + second);
        if (nTerms > 2) {
            System.out.print(first + " , " + second);
            count = count - 2; // remaining terms to print
            while (count > 0) {
                temp = first;
                first = second;
                second = temp + second;
                System.out.print(" , " + second);
                count--;
            }
            System.out.println();
        }
    }
    public static void insectPopulationGrowthRate() {
        Scanner keyboard = new Scanner(System.in);
        int fSize, iSize;
        double rateOfGrowth;
        System.out.println("Kindly enter the following:");
        System.out.print(" Initial population ... ");
        iSize = keyboard.nextInt();
        System.out.print(" Current population..... ");
        fSize = keyboard.nextInt();
        rateOfGrowth = (fSize - iSize) * 100.0 / iSize;
        System.out.print("\nThe rate of growth is " + rateOfGrowth + "%");
        System.out.println(" because (" + fSize + " - " + iSize + ") * 100 / " + iSize + " is " +
                rateOfGrowth + "%");
    } // end of insectPopulationGrowthRate method
    /**
     * Displays the elements of an array
     **/
    public static void showElements(String[] array) {
        for (int x = 0; x < array.length; x++)
            System.out.println(array[x]);
    }

    public static int[] copyIntegerArray(int[] array1) {
        int[] copied = new int[array1.length];
        for (int index = 0; index < array1.length; index++) {
            copied[index] = array1[index];
        }
        return copied;
    } // end of copyIntegerArray method
    public static String[] copyStringArray(String[] array1) {
        String[] copied = new String[array1.length];
        for (int index = 0; index < array1.length; index++) {
            copied[index] = new String(array1[index]);
        }
        return copied;
    } // copy of copyStringArray method
    //The following methods apply the Selection Sort algorithm.
    /**
     * Returns a sorted version of a given array of int following the ascending order
     */
    public static int[] sortIntegerArray(int[] given) {
        int minIndex = 0;
        int[] sorted = copyIntegerArray(given);
        int temp = 0;
        for (int x = 0; x < sorted.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < sorted.length; y++)
                if (sorted[minIndex] > sorted[y])
                    minIndex = y;
            if (minIndex != x) {
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }
        return sorted;
    } // end of sortIntegerArray
    /**
     * Returns a sorted version of a given array of Strings following lexicographic ordering
     */
    public static String[] sortStringArray(String[] given) {
        int minIndex = 0;
        String[] sorted = copyStringArray(given);
        String temp = "";
        for (int x = 0; x < sorted.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < sorted.length; y++)
                if (sorted[y].compareToIgnoreCase(sorted[minIndex]) < 0)
                    minIndex = y;
            if (minIndex != x) {
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }
        return sorted;
    } // end of sortStringArray
    /**
     * This method implements the Binary Search algorithm.
     * Assuming that grades is a sorted array following an increasing order, this methods
     * returns true if key is in the array.
     */
    public static boolean binarySearch(int[] grades, int key) {
        boolean r = false;
        int lowLimit = 0;
        int upLimit = grades.length - 1;
        int mid = (lowLimit + upLimit) / 2;
        while (lowLimit < upLimit && !r) {
            mid = (lowLimit + upLimit) / 2;
            if (grades[mid] == key)
                r = true;
            else if (grades[mid] < key)
                lowLimit = mid + 1;
            else
                upLimit = mid - 1;
        }
        return r;
    }
    /**
     Let’s the user answer series of yes/no questions. Try to search for a health declaration form
     that is being used during this pandemic days. A message ‘It is best for you to see a
     doctor’ should be printed if the user gives at one yes answer
     */
    public static void selfEvaluation() {
        // Vanness Garabiles - December 5 - HDF
        Scanner keyboard = new Scanner(System.in);
        hdfIntro();

        String response;
        System.out.print("Have you had any known history of exposure to a confirmed or suspected COVID-19 case in the past 14 days?");
        response = keyboard.nextLine();
        checker(response);
        System.out.print("Do you manifest a symptom of Fever");
        response = keyboard.nextLine();
        checker(response);
        System.out.print("Do you manifest a symptom of Headache");
        response = keyboard.nextLine();
        checker(response);
        System.out.print("Do you manifest a symptom of Cough");
        response = keyboard.nextLine();
        checker(response);
        System.out.print("Do you manifest a symptom of Colds");
        response = keyboard.nextLine();
        checker(response);
        System.out.print("Do you manifest a symptom of Sore throat");
        response = keyboard.nextLine();
        checker(response);
        System.out.print("Do you manifest a symptom of Loss of smell/taste");
        response = keyboard.nextLine();
        checker(response);
        System.out.print("Do you manifest a symptom of Diarrhea");
        response = keyboard.nextLine();
        checker(response);
    }

    public static void checker(String response) {
        if (response.compareToIgnoreCase("no") == 0) {} else if (response.compareToIgnoreCase("yes") == 0) {
            System.out.println("It is best for you to see a doctor.");
        } else {
            System.out.println("Please only reply with yes/no.");
        }
    }

    public static void hdfIntro() {
        System.out.printf("%-50s%n", "------------------------------------------------------");
        System.out.printf("| %-50s | %n", "NOTICE");
        System.out.printf("| %-50s | %n", "This electronic health declaration form must");
        System.out.printf("| %-50s | %n", "contain accurate and complete information.");
        System.out.printf("| %-50s | %n", "Do keep in mind that any false or deceptive");
        System.out.printf("| %-50s | %n", "information could result in disciplinary");
        System.out.printf("| %-50s | %n", "action or other legal penalties.");
        System.out.printf("%-50s%n", "------------------------------------------------------");
        System.out.println("\nPlease respond with yes/no to the following questions.");
    }
    public static void balloonSortArrayString(String[] z) {
        for (int x = 0; x < z.length - 1; x++) {
            for (int y = x + 1; y < z.length; y++) {
                if (z[x].compareTo(z[y]) > 0) {
                    String temp = z[x];
                    z[x] = z[y];
                    z[y] = temp;
                }
            }
        }
    }
    public static void math7() {
        // Vanness Garabiles - Nov 21 - Determine the area of triangle
        Scanner keyboard = new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter the base: ");
        base = keyboard.nextInt();

        System.out.print("Enter the height: ");
        height = keyboard.nextInt();

        area = (base * height) / 2;

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *          Area of Triangle is: " + area + "                *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }

    public static void math8() {
        // Vanness Garabiles -  Aug 27 but modified on Nov 21 - Determine the area of the rectangle
        Scanner keyboard = new Scanner(System.in);
        int length;
        int width;

        System.out.print("Enter the length: ");
        length = keyboard.nextInt();

        System.out.print("Enter the width: ");
        width = keyboard.nextInt();

        // A mathematical expression represents a value that may be assigned to a variable
        int perimiter = 2 * length + 2 * width;
        int area = length * width;

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *           The perimeter of the rectangle is " + perimiter + "         *");
        System.out.println(" *           The area of the rectangle is " + area + "              *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }

    public static void math9() {
        // Vanness Garabiles - Nov 21 - Determine the area of Trapezoid
        Scanner keyboard = new Scanner(System.in);
        double base1, base2, height, area;
        System.out.print("Enter Base 1: ");
        base1 = keyboard.nextDouble();

        System.out.print("Enter Base 2: ");
        base2 = keyboard.nextDouble();

        System.out.print("Enter Height: ");
        height = keyboard.nextDouble();

        area = 0.5 * (base1 + base2) * height;
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *           The area of the Trapezoid is " + area + "              *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }

    public static void math10() {
        // Vanness Garabiles - Nov 21 - Determine the area of Parallelogram
        Scanner keyboard = new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter the base: ");
        base = keyboard.nextInt();

        System.out.print("Enter the height: ");
        height = keyboard.nextInt();

        area = base * height;

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *          Area of Parallelogram  is: " + area + "                *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }

    public static void math11() {
        // Vanness Garabiles - Nov 21 - Determine if its a Perfect number
        Scanner keyboard = new Scanner(System.in);
        double z, sum = 0;
        int i = 1;
        System.out.print("Enter the number: ");
        z = keyboard.nextLong();

        while (i <= z / 2) {
            if (z % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (sum == z) {
            System.out.println("The number " + z + " is a perfect number.");
        } else {
            System.out.println("The number " + z + " is not a perfect number.");
        }
    }

    public static void math13() {
        // Vanness Garabiles - Sept 15  but modified on Nov 25 - Display the multiplication table
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nEnter the coefficient of x^2 (a): ");
        double a = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter the coefficient of x (b): ");
        double b = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter the constant (c): ");
        double c = Double.parseDouble(keyboard.nextLine());

        //calculates for the root1 and root2
        double root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.printf("%c%.2f%s%.2f%s%.2f%s%.2f%s%.2f%c%n", '(', a, ") + (", b, ") + (", c, ") = 0 are ", root1, " and ", root2, '.');
    }
    public static void math15() {
        // Vanness Garabiles - Nov 27 - Pascal Triangle
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = keyboard.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }

            int C = 1;
            for (int i = 1; i <= line; i++) {

                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    public static void rk1() {
        // Vanness Garabiles - Nov 27 - Sorrting names and grades
        Scanner keyboard = new Scanner(System.in);
        String[] names;
        int[] grades;
        int n = 0;
        System.out.print("How many students will be sorted? ");
        n = Integer.parseInt(keyboard.nextLine());
        names = new String[n];
        grades = new int[n];

        for (int z = 0; z < names.length; z++) {
            System.out.print("Enter name of student " + (z + 1) + ": ");
            names[z] = keyboard.nextLine();

            System.out.print("Enter grade of student " + (z + 1) + ": ");
            grades[z] = Integer.parseInt(keyboard.nextLine());
        }
        // Sort the names array
        balloonSortArrayStringInt(names, grades);
        //Show elements of names array
        showElements2(names, grades);
    }
    public static void rk2() {
        // Vanness Garabiles - Nov 27 - Sorrting names and grades
        Scanner keyboard = new Scanner(System.in);
        String[] names;
        int[] grades;
        int n = 0;
        System.out.print("How many students will be sorted? ");
        n = Integer.parseInt(keyboard.nextLine());
        names = new String[n];
        grades = new int[n];

        for (int z = 0; z < names.length; z++) {
            System.out.print("Enter name of student " + (z + 1) + ": ");
            names[z] = keyboard.nextLine();

            System.out.print("Enter grade of student " + (z + 1) + ": ");
            grades[z] = Integer.parseInt(keyboard.nextLine());
        }
        // Sort the names array
        balloonSortArrayIntString(grades, names);
        //Show elements of names array
        showElements2(names, grades);
    }
    public static void balloonSortArrayStringInt(String[] z, int[] w) {
        // Vanness Garabiles - Nov 27
        for (int x = 0; x < z.length - 1; x++) {
            for (int y = x + 1; y < z.length; y++) {
                if (z[x].compareTo(z[y]) > 0) {
                    String temp = z[x];
                    z[x] = z[y];
                    z[y] = temp;
                    int temp2 = w[x];
                    w[x] = w[y];
                    w[y] = temp2;
                }
            }
        }
    }
    public static void balloonSortArrayIntString(int[] w, String[] z) {
        // Vanness Garabiles - Nov 27
        for (int x = 0; x < z.length - 1; x++) {
            for (int y = x + 1; y < z.length; y++) {
                if (w[x] > w[y]) {
                    int temp = w[x];
                    w[x] = w[y];
                    w[y] = temp;
                    String temp2 = z[x];
                    z[x] = z[y];
                    z[y] = temp2;

                }
            }
        }
    }
    public static void showElements2(String[] array, int[] array2) {
        // Vanness Garabiles - Nov 27
        for (int x = 0; x < array.length; x++)
            System.out.println(array[x] + " " + array2[x]);
    }

    public static void tax() {
        // Vanness Garabiles - Nov 12 Modified Dec 1
        double taxableIncome;
        double taxDue;

        taxableIncome = readTaxableIncome();
        taxDue = computeTaxDue(determineBracket(taxableIncome), taxableIncome);

        System.out.println();
        System.out.printf("%-20s%15.2f%n", "Taxable Income: ", taxableIncome);
        System.out.printf("%-20s%15.2f%n", "Tax Due = ", taxDue);
    }
    public static double readTaxableIncome() {
        // Vanness Garabiles - Nov 12 Modified Dec 1
        Scanner input = new Scanner(System.in);
        double income = 0.0;
        do {
            System.out.print("Enter the taxable income: ");
            income = Double.parseDouble(input.nextLine());
        } while (income < 0);
        return income;
    }
    public static double computeTaxDue(int bracket, double taxableIncome) {
        // Vanness Garabiles - Nov 12 Modified Dec 1
        double taxDue = 0.0;
        switch (bracket) {
            case 1:
                taxDue = 4000.00;
                break;
            case 2:
                taxDue = 4000.00 + (taxableIncome - 25000.00) * 0.08;
                break;
            case 3:
                taxDue = 12000.00 + (taxableIncome - 125000.00) * 0.10;
                break;
            case 4:
                taxDue = 52000.00 + (taxableIncome - 525000.00) * 0.12;
                break;
            default:
                taxDue = 0.00;
        }
        return taxDue;
    }
    public static int determineBracket(double taxableIncome) {
        // Vanness Garabiles - Nov 12 Modified Dec 3
        int bracket = 0;
        if (taxableIncome <= 25000.00)
            bracket = 1;
        else
        if (taxableIncome <= 125000.00)
            bracket = 2;
        else
        if (taxableIncome <= 525000.00)
            bracket = 3;
        else
            bracket = 4;
        return bracket;
    }

    public static void waterBill() {
        // Vanness Garabiles - Oct 16 Modified Dec 3
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
                System.out.println("The meter reading cannot me negative.");
            }
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
                    amountDue = minBillResidential + (nCMUsed - minCMResidential) * rateResidential;
                }

            } else if (cType == ('c') || cType == ('C')) {
                bType = "Commercial";
                laLang = false;
                if (nCMUsed <= minCMCommercial) {
                    amountDue = minBillCommercial;
                } else if (nCMUsed > minCMCommercial) {
                    amountDue = minCMCommercial + (nCMUsed - minCMCommercial) * rateCommercial;
                }
            } else {
                System.out.println("Invalid consumer type!");
            }
        }
        System.out.println("=======================================");
        System.out.printf("| %17s | %-15s | %n", "Subscriber", consumer);
        System.out.printf("| %17s | %-15s | %n", "Consumer Type", bType);
        System.out.printf("| %17s | %-15d | %n", "Prev Reading", previousReading);
        System.out.printf("| %17s | %-15d | %n", "Present Reading", presentReading);
        System.out.printf("| %17s | %-15d | %n", "Cubic Meters Used", nCMUsed);
        System.out.printf("| %17s | %-15.2f | %n", "Amount Due", amountDue);
        System.out.println("=======================================");
    }

    public static void invest() {
        // Vanness Garabiles - Oct 13 Modified Dec 3
        Scanner keyboard = new Scanner(System.in);
        float annualRate;
        float quarterlyRate;
        double principal;
        double interest;
        double finalAmount;
        byte quarter;
        int year;

        annualRate = 0.05F; // set annual interest to 5%
        System.out.print("Enter the year: ");
        year = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter the initial principal: ");
        principal = Double.parseDouble(keyboard.nextLine());;
        System.out.printf("%s%.2f%n", "Principal = ", principal);
        System.out.printf("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%');
        System.out.printf("%6s%8s%16s%30s%n", "Year", "Quarter", "Interest Earned", "Amount at end of quarter");
        quarterlyRate = annualRate / 4;

        for (quarter = 1; quarter < 5; quarter++) {
            interest = principal * quarterlyRate;
            finalAmount = principal + interest;
            System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
            principal = finalAmount;
        }
    }

    public static void electricBill() {
        // Vanness Garabiles - Oct 13 Modified Dec 3
        int presentReading = 0, previousReading = 0;
        Scanner kbd = new Scanner(System.in);
        String consumer = ""; // to hold name of consumer
        char cType = 'x'; // to hold type of consumer
        int kWhUsed; // to hold number of Kilowatt hours of electicity used
        double rateResidential = 10.4277f;
        double rateLCommercial = 9.7523f;
        double rateHCommercial = 8.2397f;
        double rateIndustrial = 9.6754f;
        double rateLPublicBuilding = 9.6790;
        double rateHPublicBuilding = 8.1303;
        double amountDue = 0.0; // to hold the amount due

        showIntroduction();

        System.out.print("Enter the name of the electricity consumer: ");
        consumer = kbd.nextLine();

        previousReading = readPreviousReading();
        presentReading = readPresentReading(previousReading);
        kWhUsed = presentReading - previousReading;

        cType = readTypeOfConsumer();

        amountDue = computeAmountDue(kWhUsed, cType, rateResidential, rateLCommercial, rateHCommercial, rateIndustrial, rateLPublicBuilding, rateHPublicBuilding);

        showBill(consumer, previousReading, presentReading, kWhUsed, amountDue);
    }
    public static void showBill(String consumer, int previous, int present, int kWhUsed, double amount) {
        // Vanness Garabiles - Oct 13 Modified Dec 3
        System.out.println();
        System.out.println("Electricity Billing Statement");
        System.out.println("=======================================");
        System.out.printf("| %17s | %-15s | %n", "Subscriber", consumer);
        System.out.printf("| %17s | %-15d | %n", "Previous Reading", previous);
        System.out.printf("| %17s | %-15d | %n", "Present Reading", present);
        System.out.printf("| %17s | %-15d | %n", "kWh Used", kWhUsed);
        System.out.printf("| %17s | %-15.2f | %n", "Amount Due", amount);
        System.out.println("=======================================");
        return;
    } // end of method
    public static char readTypeOfConsumer() {
        // Vanness Garabiles - Oct 13 Modified Dec 3
        char t = 'x';
        Boolean y = true;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.println("\nYou may type r for Residential, i for Industrial");
            System.out.println("w for Low Voltage Commercial, x for High Voltage Commercial");
            System.out.println("y for Low Voltage Public Building, z for High Voltage Public Building");
            System.out.print("Enter the type of the consumer: ");
            t = kbd.next().charAt(0);

            if (t == 'R' || t == 'I' || t == 'W' || t == 'X' || t == 'Y' || t == 'Z') {
                y = false;
            } else if (t == 'r' || t == 'i' || t == 'w' || t == 'x' || t == 'y' || t == 'z') {
                y = false;
            } else {
                System.out.println("Invalid consumer type! Read the instructions and try again!");
            }
        } while (y);
        return t;
    } // end of method
    public static double computeAmountDue(int k, char t, double rate1, double rate2, double rate3, double rate4, double rate5, double rate6) {
        // Vanness Garabiles - Oct 13 Modified Dec 3
        double amount = 0;
        switch (t) {
            case 'r':
            case 'R':
                amount = k * rate1;
                break;
            case 'w':
            case 'W':
                amount = k * rate2;
                break;
            case 'x':
            case 'X':
                amount = k * rate3;
                break;
            case 'i':
            case 'I':
                amount = k * rate4;
                break;
            case 'Y':
            case 'y':
                amount = k * rate5;
                break;
            case 'Z':
            case 'z':
                amount = k * rate6;
                break;
        }
        return amount;
    } // end of method
    public static int readPreviousReading() {
        // Vanness Garabiles - Oct 13 Modified Dec 3
        int reading = 0;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.print("Enter the meter reading last month: ");
            reading = Integer.parseInt(kbd.nextLine());

            if (reading < 0) {
                System.out.println("The meter reading cannot be negative.");
            }
        } while (reading < 0);
        return reading;
    } // end of method
    public static int readPresentReading(int previous) {
        // Vanness Garabiles - Oct 13 Modified Dec 3
        int reading = 0;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.print("Enter the meter reading for this month: ");
            reading = Integer.parseInt(kbd.nextLine());

            if (reading < previous) {
                System.out.println("The present reading must be greater than the previous reading!");
            }
        } while (reading < previous);
        return reading;
    } // end of method.

    public static void billDistributor() {
        // Vanness Garabiles - Dec 5
        Scanner kbd = new Scanner(System.in);
        double money;
        double b1, b2, b3, b4, b5, b6, b7;
        System.out.print("\nEnter the amount of money to be distributed: ");
        money = kbd.nextDouble();
        do {
            System.out.print("Enter your bill for Rent: ");
            b1 = kbd.nextDouble();
            if (b1 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (b1 < 0);
        do {
            System.out.print("Enter your bill for Electricity: ");
            b2 = kbd.nextDouble();
            if (b2 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (b2 < 0);
        do {
            System.out.print("Enter your bill for Water: ");
            b3 = kbd.nextDouble();
            if (b3 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (b3 < 0);
        do {
            System.out.print("Enter your bill for Transportation: ");
            b4 = kbd.nextDouble();
            if (b4 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (b4 < 0);
        do {
            System.out.print("Enter your bill for Food and Groceries: ");
            b5 = kbd.nextDouble();
            if (b5 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (b5 < 0);
        do {
            System.out.print("Enter your bill for School Fees: ");
            b6 = kbd.nextDouble();
            if (b6 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (b6 < 0);
        do {
            System.out.print("Enter your bill for Memberships and Subscriptions: ");
            b7 = kbd.nextDouble();
            if (b7 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (b7 < 0);

        System.out.println("Your total bill is " + billCalc(money, b1, b2, b3, b4, b5, b6, b7) + " And you still have " + (money - billCalc(money, b1, b2, b3, b4, b5, b6, b7)));
    }

    public static double billCalc(double money, double b1, double b2, double b3, double b4, double b5, double b6, double b7) {
        // Vanness Garabiles - Dec 5
        double totalGastos;
        totalGastos = b1 + b2 + b3 + b4 + b5 + b6 + b7;
        return totalGastos;
    }

    public static void goSurf() {
        // Vanness Garabiles - Dec 5
        Scanner kbd = new Scanner(System.in);
        int prep, callMins, txtRate, txtSent, callRate;

        do {
            System.out.print("Enter your Prepaid Load Amount: ");
            prep = kbd.nextInt();
            if (prep < 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (prep < 0);
        do {
            System.out.print("Enter your Total Number of Minutes Used for Calls: ");
            callMins = kbd.nextInt();
            if (callMins < 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (callMins < 0);
        do {
            System.out.print("Enter your Total Number of Text Messages Sent: ");
            txtSent = kbd.nextInt();
            if (txtSent < 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (txtSent < 0);
        do {
            System.out.print("Enter the rate per minute of call: ");
            callRate = kbd.nextInt();
            if (callRate < 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (callRate < 0);
        do {
            System.out.print("Enter the rate per text message : ");
            txtRate = kbd.nextInt();
            if (txtRate < 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (txtRate < 0);

        bal(prep, callMins, callRate, txtRate, txtSent);
    }

    public static int bal(int prep, int callMins, int callRate, int txtRate, int txtSent) {
        // Vanness Garabiles - Dec 5
        int balance;
        balance = prep - ((callMins * callRate) + (txtSent * txtRate));
        return balance;
    }
} // End of Final Project for Programming 1 - Dec 5