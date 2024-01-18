package Module1_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int startNum = reader.nextInt();
        System.out.print("Enter end number: ");
        int endNum = reader.nextInt();

        for (int i = startNum + 1; i < endNum; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
