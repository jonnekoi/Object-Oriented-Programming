package Module1_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a binary to convert: ");
        String inputNumber = reader.nextLine();

        int convertDecimal = Integer.parseInt(inputNumber,2);

        System.out.println("Decimal value is: " + convertDecimal);
    }
}
