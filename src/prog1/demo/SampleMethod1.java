package prog1.demo;

//a simple program to return the lower number
import java.util.Scanner;
public class SampleMethod1 {
  
  public static void main(String[] args) {
  	
  Scanner kbd = new Scanner(System.in);
  //ask user to input two numbers. store them to variables num1 and num2 respectively
  System.out.print("Input number 1: ");
  int num1 = kbd.nextInt();
  System.out.print("Input number 2: ");
  int num2 = kbd.nextInt();	
  //call the method then store it at gmin
	int gmin = getTheMin(num1,num2);
	//display/output the value of gmin (lower number)
	System.out.println("The minimum number is "+gmin);
  }
  //define the method to determine return the lower number
  public static int getTheMin(int a, int b){
 	if (a<b)
  	return a;
  else 
  	return b;   
  }
}