package prog1.demo;

//a simple program to determine whether a number is odd or even
import java.util.Scanner;
public class SampleMethod2 {
  
  public static void main(String[] args) {
  	
  Scanner kbd = new Scanner(System.in);
  //ask the user to input a number
  System.out.print("Enter a number: ");
  int x = kbd.nextInt();
  //call the method oddOrEven()
  oddOrEven(x);
  }
  //define a method to determine if a number is odd or even
  public static void oddOrEven(int a){
  if (a%2==1)
  	System.out.print(a+" is an odd number.");
  else
  	System.out.print(a+" is an even number");
  }
  
}