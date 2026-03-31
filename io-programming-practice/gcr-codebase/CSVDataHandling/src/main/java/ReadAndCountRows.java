import com.opencsv.CSVReader;

import java.io.*;
import java.util.Arrays;

public class ReadAndCountRows {
    public static void usingOpenCSV(String filePath){
        try(CSVReader reader= new CSVReader(new FileReader(filePath))){

            String[] line;
            while((line=reader.readNext())!=null){
                System.out.println(Arrays.toString(line));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void usingBufferedReader(String filePath){
        try(BufferedReader reader  = new BufferedReader(new FileReader(filePath))){
            String line;
            int count=0;
            while((line = reader.readLine())!=null){
                System.out.println(line);
                count++;
            }
            System.out.println("Total no of rows: "+count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        String filePath = "src/main/java/data.csv";
        usingBufferedReader(filePath);
        usingOpenCSV(filePath);
    }
}
