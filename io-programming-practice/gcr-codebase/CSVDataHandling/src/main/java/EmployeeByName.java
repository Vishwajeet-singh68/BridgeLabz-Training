import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Scanner;

public class EmployeeByName {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String filePath = "src/main/java/Employee.csv";

        System.out.print("Enter employee name: ");
        String name = in.nextLine();

        boolean found = false;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            String[] line;
            reader.readNext(); // skip header

            while ((line = reader.readNext()) != null) {

                if (line[1].equalsIgnoreCase(name)) {

                    System.out.println("Employee Found!");
                    System.out.println("ID         : " + line[0]);
                    System.out.println("Name       : " + line[1]);
                    System.out.println("Department : " + line[2]);
                    System.out.println("Salary     : " + line[3]);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
