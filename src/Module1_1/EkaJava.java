package Module1_1;

import java.util.Scanner;
public class EkaJava {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("What's your name: ");
        String name = reader.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
