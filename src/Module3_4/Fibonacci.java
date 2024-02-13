package Module3_4;

import java.io.FileWriter;
import java.io.IOException;

public class Fibonacci {
    public static void main(String[] args){
     String fileName = "Fibonacci.csv";
     long [] fibonacci = generateFibonacci(100);
     writeToFile(fileName, fibonacci);
    }
    public static long [] generateFibonacci(int n){
        long [] fibonacci = new long[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci;
    }

    public static void writeToFile(String fileName, long [] fibonacci){
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < fibonacci.length; i++) {
                writer.append(String.valueOf(fibonacci[i]));
                writer.append(",");
            }
            System.out.println("Fibonacci numbers written to file " + fileName);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
