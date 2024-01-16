package Module1_1;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        float summa =  first + second + third;
        int product = first * second * third;
        float average = summa / 3;

        System.out.println("The sum of the numbers is " + (summa));
        System.out.println("The product of the numbers is: " + (product));
        System.out.println("The average of the numbers is: " + (average));
    }
}
