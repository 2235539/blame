package prog1.midterms.demo;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        menuSelection();
        System.out.print("Enter the number of your choice: ");
        int choice = Integer.parseInt(kbd.nextLine());

        switch(choice){
            case 1:
                System.out.print("Enter a number: ");
                int num1 = Integer.parseInt(kbd.nextLine());
                System.out.print("Enter another number: ");
                int num2 = Integer.parseInt(kbd.nextLine());
                compareTwoNumbers(num1,num2);
                break;
            case 2:
                System.out.print("Enter a number: ");
                int n1= Integer.parseInt(kbd.nextLine());
                System.out.print("Enter another number: ");
                int n2 = Integer.parseInt(kbd.nextLine());
                int sum = addTwoNumbers(n1,n2);
                System.out.println("The sum is "+sum);
                break;
            case 3:
                System.out.print("Enter another number: ");
                int n = Integer.parseInt(kbd.nextLine());
                perfectNumber(n);
                break;
            default:
                System.out.println("Invalid Choice!!!");
        }
    }
    public static void menuSelection(){
        System.out.println("Choose from the following:");
        System.out.println("1. Compare two numbers.");
        System.out.println("2. Add two numbers.");
        System.out.println("3. Determine if a number is a perfect number.");
    }

    public static void compareTwoNumbers(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else
            if(a<b){
                System.out.println(a+" is lesser than "+b);
            }
            else{
                System.out.println(a+" is equal to "+b);
            }
    }
    public static int addTwoNumbers(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    public static void perfectNumber(int n){
        int sum = 0;
        for(int x=1; x<n; x++){
            if(n%x==0){
                sum = sum + x;
            }
        }
        if(n==sum){
            System.out.println(n+" is a perfect number.");
        }
        else{
            System.out.println(n+" is not a perfect number since the sum equal to "+sum+" which is not equal to n = "+n);
        }
    }

}