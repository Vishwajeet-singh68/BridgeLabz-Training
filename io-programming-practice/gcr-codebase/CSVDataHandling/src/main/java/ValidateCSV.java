import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCSV {
    static Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    static Pattern contactPattern = Pattern.compile("^[6-9]\\d{9}$");

    public static void writeData() {

        String filePath = "src/main/java/Validate.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {

            // Header
            String[] header = {"ID", "Name", "Email", "Contact"};
            writer.writeNext(header);

            // 10 entries (some invalid)
            writer.writeNext(new String[]{"1", "Rahul", "rahul@gmail.com", "9876543210"}); // valid
            writer.writeNext(new String[]{"2", "Amit", "amitgmail.com", "9876543210"});   // ❌ invalid email
            writer.writeNext(new String[]{"3", "Neha", "neha@outlook.com", "98765"});     // ❌ invalid contact
            writer.writeNext(new String[]{"4", "Pooja", "pooja@yahoo.com", "1234567890"}); // valid
            writer.writeNext(new String[]{"5", "Rohit", "rohit@.com", "9999999999"});     // ❌ invalid email
            writer.writeNext(new String[]{"6", "Anjali", "anjali@gmail.com", "abcdefghij"}); // ❌ invalid contact
            writer.writeNext(new String[]{"7", "Vikash", "vikash@gmail.com", "8888888888"}); // valid
            writer.writeNext(new String[]{"8", "Priya", "priya@gmail", "7777777777"});    // ❌ invalid email
            writer.writeNext(new String[]{"9", "Suman", "suman@gmail.com", "6666666666"}); // valid
            writer.writeNext(new String[]{"10", "Karan", "karan@gmail.com", "12345abcde"}); // ❌ invalid contact

            System.out.println("Validate.csv created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        writeData();
        String filePath = "src/main/java/Validate.csv";
        try (CSVReader reader = new CSVReader(new FileReader(filePath))){
            String line[]=reader.readNext();
            while((line = reader.readNext())!=null){
                String email = line[2];
                String contact = line[3];

                boolean isEmailValid = emailPattern.matcher(email).matches();
                boolean isPhoneValid = contactPattern.matcher(contact).matches();
                if( isPhoneValid && isEmailValid){
                    System.out.println(line[1]+" is valid!!");
                } else {
                    System.out.println("INVALID → " + line[1]);
                    if (!isEmailValid) System.out.println("   ❌Email: " + email);
                    if (!isPhoneValid) System.out.println("   ❌ Phone: " + contact);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
