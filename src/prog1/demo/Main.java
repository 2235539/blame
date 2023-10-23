package prog1.demo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    Random rand = new Random();
    //int size = rand.nextInt(5);
    //System.out.println("The size of the array is "+size);
    //System.out.print("Enter the size of the array: ");
    //int size = kbd.nextInt();
    //declare the array
    int [] arrayKo = new int[5];
    //input the array elements
    System.out.println("The array elements: ");
    int sum = 0;
    for(int i=0; i< arrayKo.length;i++){
        //System.out.print("Enter the element at index "+i+": ");
        arrayKo[i] = rand.nextInt(10);
        System.out.print(arrayKo[i]+" ");
        sum = sum + arrayKo[i];
    }
    System.out.println();
    System.out.println("The sum of the elements is "+sum);
    //display the odd elements in the array
    System.out.println("\nOdd elements: ");
    for(int i=0; i< arrayKo.length;i++){
        if(arrayKo[i]%2==1)
            System.out.print(arrayKo[i]+" ");
        }
    System.out.println("\nEven elements: ");
    for(int i=0; i< arrayKo.length;i++){
        if(arrayKo[i]%2==0)
            System.out.print(arrayKo[i]+" ");
        }
    }
}