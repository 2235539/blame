package prog1.demo;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        int size = 5;
        String [] colors = {"red","blue","beige","red","cyan","green","brown","pink"};
        System.out.println("Array size: "+colors.length);

        System.out.print("Enter a color to be found: ");
        String kulay = kbd.nextLine();

        for(int i =0; i<colors.length;i++) {
            if(kulay.equals(colors[i])){
                System.out.println(kulay+ " is found at index "+i);
            }
        }System.out.println("End of the array!");
        /*
        System.out.print("Array elements: ");
        for(int i =0; i<colors.length;i++){
            if(i<colors.length-1) {
                System.out.print(colors[i] + ", ");
            }
            else{
                System.out.print(colors[i] + ". ");
            }

        }
        */
    }
}