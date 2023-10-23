package prog1.demo;

import java.util.Random;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] scores = new int[10];
        System.out.println("Original elements: ");
        for(int i =0; i<scores.length;i++){
            scores[i] = 65+ rand.nextInt(35);
            System.out.print(scores[i]+" ");
        }
        int sum = 0;
        System.out.println("\nSorted elements in ascending order: ");
        for(int i=0; i<scores.length;i++){
            for(int j = i+1;j<scores.length;j++){
                if(scores[i]>scores[j]){
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
            System.out.print(scores[i]+" ");
            sum = sum + scores[i];
        }
        double average = sum/scores.length;
        System.out.println("\nThe average is  "+average);
        System.out.println("The largest element in the list is "+scores[scores.length-1]);
        System.out.println("The median element in the list is "+scores[scores.length/2]);
        System.out.println("The smallest element in the list is "+scores[0]);
        System.out.println("Sorted elements in descending order: ");
        for(int i=0; i<scores.length;i++){
            for(int j = i+1;j<scores.length;j++){
                if(scores[i]<scores[j]){
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
            System.out.print(scores[i]+" ");
        }

    }
}