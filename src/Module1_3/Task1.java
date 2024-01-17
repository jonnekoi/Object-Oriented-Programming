package Module1_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double a, b, c;

        System.out.println("Give a number: ");
        a = Integer.parseInt(reader.nextLine());

        System.out.println("Give a number: ");
        b = Integer.parseInt(reader.nextLine());

        System.out.println("Give a number: ");
        c = Integer.parseInt(reader.nextLine());

        double determinant = b * b - 4 * a * c;

        if (determinant > 0){
            double root1 = (-b + Math.pow(determinant,0.5)) / (2 * a);
            double root2 = (-b - Math.pow(determinant,0.5)) / (2 * a);
            System.out.println("The roots are " + root1 + "and " + root2);
        }

        else if (determinant == 0){
            double root1 = -b / (2 * a);
            System.out.println("The root is" + root1);
        }

        else {
            System.out.print("The roots are not real.");
        }
    }
}
