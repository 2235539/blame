package prog1.demo;

/*
A java program that determines whether an input number is a Happy number or not.
*/
//import the Scanner Class
import java.util.Scanner;
public class HappyNumber {
 public static void main(String[] args) {
 	//creates a scanner object (named as ram) that scans values from the input stream
 	Scanner ram = new Scanner(System.in);
 	//declare the variables
 	int sum = 0, n, r, num;
 	//an output statement that prompts the user to input an integer
		System.out.print("Input an integer: ");
		//store the integer in variable num
		num = ram.nextInt();
		//temp variable holds the value of num
		int temp = num;
		//set condition while sum is not equal to 1 and 4 (based on problem analysis)
		while(sum!=1 && sum!=4){
			//sum is set initially as 0
			sum = 0;
			//this inner loop will be executed as long as num is greater than 0
		    while(num>0)
			{
				//extract the last digit of num and store it in r
 			r=num%10;
 			//get the sum of variable sum and square of r
 			sum=sum + (r*r);
 			//get the previous digits
 			num=num/10; 
			}
			//store the value of the variable sum in the variable num
			num=sum;
			//display the sum
			System.out.println(sum);
		}
		//if the last value of sum is 1, the temp is a Happy Number, otherwise Unhappy
		if(sum==1)
			System.out.println(temp+" is a Happy Number");
		else
			System.out.println(temp+" is an UnHappy Number");
 }
}