package Module1_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("How many integers you want to array: ");
        int arraySize = reader.nextInt();
        int [] numbers = new int[arraySize];

        int enteredNum = 1;

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter " + enteredNum +"." + " integer: ");
            enteredNum++;
            numbers[i] = reader.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0, endIndex = 0;
        for (int i = 0; i < arraySize; i++) {
            int currentSum = 0;
            for (int j = i; j < arraySize; j++) {
                currentSum += numbers[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));


    }
}


