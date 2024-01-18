package Module1_3;

import java.util.Scanner;
import java.util.Random;

public class controlStructures {
    /*public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.parseInt(reader.nextLine());

        for (int i = number; i <= 50; i++) {
            System.out.println(i);
        }
    }
}
*/

    public static void main(String[] args){
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            int n = rand.nextInt(50);
            System.out.println(n);
        }
    }
}
