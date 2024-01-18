package Module1_4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String[] firstNames = {
                "James", "Mary", "John", "Patricia",
                "Robert", "Jennifer", "Michael", "Linda",
                "William", "Elizabeth", "David", "Barbara",
                "Richard", "Susan", "Joseph"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Brown",
                "Jones", "Garcia", "Miller", "Davis",
                "Rodriguez", "Martinez", "Hernandez", "Lopez",
                "Gonzalez", "Wilson", "Anderson"
        };

        System.out.print("How many names you want to generate? ");
        int size = reader.nextInt();

        Random random = new Random();

        System.out.println("Here are " + size + " random names:");
        System.out.println(" ");

        for (int i = 0; i < size; i++){
            int randomFirstNameIndex = random.nextInt(firstNames.length);
            int randomLastNameIndex = random.nextInt(lastNames.length);

            String randomFirstName = firstNames[randomFirstNameIndex];
            String randomLastName = lastNames[randomLastNameIndex];
            System.out.println(randomFirstName + " " + randomLastName);
        }
    }
}
