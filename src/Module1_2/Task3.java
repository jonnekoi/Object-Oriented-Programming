package Module1_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        final double luotiInGrams = 13.28;
        final int luotiInNaula = 32;
        final int naulaInLeiviska = 20;

        Scanner reader = new Scanner(System.in);
        System.out.print("Weight (g): ");
        double weightInGrams = reader.nextDouble();

        double totalLuoti = weightInGrams / luotiInGrams;

        int leiviska = (int) (totalLuoti / (luotiInNaula * naulaInLeiviska));
        totalLuoti -= leiviska * luotiInNaula * naulaInLeiviska;
        int naula = (int) (totalLuoti / luotiInNaula);
        double remainingLuoti = totalLuoti % luotiInNaula;

        System.out.printf("%,.0f grams is %d leiviskä, %d naula, and %.2f luoti.", weightInGrams, leiviska, naula, remainingLuoti);
    }
}
