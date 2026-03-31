import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class ModifyCSV {
    public static void main(String[] args) {

        String filePath = "src/main/java/Employee.csv";
        List<String[]> allData = new ArrayList<>();

        // 1️⃣ Read file
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            while ((line = reader.readNext()) != null) {

                // Skip header
                if (line[0].equalsIgnoreCase("ID")) {
                    allData.add(line);
                    continue;
                }

                // Update salary for IT department
                if (line[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(line[3]);
                    salary = salary * 1.10; // 10% increment
                    line[3] = String.valueOf((int) salary);
                }

                allData.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2️⃣ Write back to SAME file (overwrite)
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeAll(allData);
            System.out.println("File updated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
