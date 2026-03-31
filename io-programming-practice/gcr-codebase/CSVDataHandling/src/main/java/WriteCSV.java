import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class WriteCSV {
    public static void main(String[] args) {

        String filePath = "src/main/java/Employee.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {

            // Header
            String[] header = {"ID", "Name", "Department", "Salary"};
            writer.writeNext(header);

            // 10 employee entries
            writer.writeNext(new String[]{"1", "Rahul", "IT", "60000"});
            writer.writeNext(new String[]{"2", "Amit", "HR", "45000"});
            writer.writeNext(new String[]{"3", "Neha", "Finance", "70000"});
            writer.writeNext(new String[]{"4", "Pooja", "Marketing", "50000"});
            writer.writeNext(new String[]{"5", "Rohit", "IT", "65000"});
            writer.writeNext(new String[]{"6", "Anjali", "HR", "48000"});
            writer.writeNext(new String[]{"7", "Vikash", "Sales", "52000"});
            writer.writeNext(new String[]{"8", "Priya", "Finance", "72000"});
            writer.writeNext(new String[]{"9", "Suman", "Support", "40000"});
            writer.writeNext(new String[]{"10", "Karan", "IT", "80000"});

            System.out.println("Employee.csv created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
