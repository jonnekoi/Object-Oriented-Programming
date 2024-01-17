package Module1_3;

import java.util.Scanner;

public class controlStructures {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.parseInt(reader.nextLine());

        for (int i = number; i <= 50; i++) {
            System.out.println(i);
        }
    }
}
