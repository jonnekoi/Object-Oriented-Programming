package Module1_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fahrenheits: ");
        float input = Integer.parseInt(scanner.nextLine());

        float celsius = (input - 32) * 5/9;

        System.out.printf("Temperature in celcius is: %.1f", celsius);
    }
}
