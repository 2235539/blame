package prog1.demo;

//a method to determine the sum of any two integers
import java.util.Scanner;
public class SampleMethod3 {
  
  public static void main(String[] args) {
	Scanner kbd = new Scanner(System.in);  
	//ask user to input numbers  	
  System.out.print("Enter a number: ");
  int num1 = kbd.nextInt();
  System.out.print("Enter a number: ");
  int num2 = kbd.nextInt();
  //call the method sumOfTwoNum()then store it in variable z
  int z = sumOfTwoNum(num1,num2);
  //display/output the value of the variable z
  System.out.println("The sum is "+z);
  //can also be written as
  //System.out.println("The sum is "+sumOfTwoNum(num1,num2));
  }
  //define the method to determine the sum of two numbers
  public static int sumOfTwoNum(int a, int b){
  	int sum = a+b;
  	return sum;
  }
}