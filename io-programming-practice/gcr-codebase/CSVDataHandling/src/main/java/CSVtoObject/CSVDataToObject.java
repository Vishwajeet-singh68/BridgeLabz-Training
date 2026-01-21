package CSVtoObject;

import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVDataToObject {
    public static void main(String[] args) {

        String filePath = "CSVDataHandling\\src\\main\\java\\Employee.csv";

        try (FileReader reader = new FileReader(filePath)) {

            CsvToBean<Employee> csvToBean =
                    new CsvToBeanBuilder<Employee>(reader)
                            .withType(Employee.class)
                            .withIgnoreLeadingWhiteSpace(true)
                            .build();

            List<Employee> employees = csvToBean.parse();

            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
