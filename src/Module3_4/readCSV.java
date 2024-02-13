package Module3_4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class readCSV {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
            BufferedReader reader =  new BufferedReader(new InputStreamReader(url.openStream()));
            double sum = 0;
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(";");
                if (parts.length > 2 && parts[0].startsWith("01.01.2023")){
                    String tempStr = parts[1].replace(",", ".");
                    double temp = Double.parseDouble(tempStr);
                    sum += temp;
                    count++;
                }
            }
            reader.close();
            double average = sum / count;
            System.out.printf("Average temperature January 1, 2023: %.2f\n ", average);
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
