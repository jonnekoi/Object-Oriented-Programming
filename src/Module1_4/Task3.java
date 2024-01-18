package Module1_4;

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
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

        Set<Integer> removeDuplicates = new LinkedHashSet<>();

        for (Integer number : numbers) {
            removeDuplicates.add(number);
        }

        Integer[] finalArray = new Integer[removeDuplicates.size()];
        removeDuplicates.toArray(finalArray);

        System.out.println("The array without duplicates:");

        for (int number : finalArray) {
            System.out.print(number + " ");
        }
    }
}
