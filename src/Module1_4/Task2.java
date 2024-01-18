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

                for (int number : numbers) {
                    System.out.println(number);
                }
            }
}


