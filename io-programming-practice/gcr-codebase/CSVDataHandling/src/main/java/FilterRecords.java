import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;
public class FilterRecords {
    public static void main(String[] args) {
        String filePath = "src/main/java/data.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String line[]=reader.readNext();
            while((line = reader.readNext())!=null){
                int marks=Integer.parseInt(line[2]);
                if(marks>=80)
                    System.out.println("ID: "+line[0]+" Name: "+line[1]+" Marks: "+line[2]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
