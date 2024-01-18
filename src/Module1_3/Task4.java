package Module1_3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();

        int firstNum, secondNum;
        int points = 0;

        while (points != 10) {
            firstNum = random.nextInt(10);
            secondNum = random.nextInt(10);
            System.out.print(firstNum + "*" + secondNum + "= ");
            int answer = reader.nextInt();
            if (answer == firstNum * secondNum) {
                points++;
                System.out.println("Correct answer!");
            } else{
                System.out.println("Wrong answer! Try again.");
            }
        }
        System.out.println("Congratulations! You scored 10/10 points!");
    }
}
