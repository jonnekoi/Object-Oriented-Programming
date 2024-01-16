package Module1_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of triangle leg (1/2): ");
        int firstLeg = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the length of triangle leg (2/2): ");
        int secondLeg = Integer.parseInt(scanner.nextLine());

        Double hypotenuse  = (Math.hypot(firstLeg, secondLeg));
        System.out.printf("The length of the hypotenuse is %.1f", hypotenuse);
    }
}
