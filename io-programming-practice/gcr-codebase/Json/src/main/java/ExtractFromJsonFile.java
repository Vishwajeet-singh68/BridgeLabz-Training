import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ExtractFromJsonFile {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            Student s = mapper.readValue(
                    new File("D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\json\\src\\main\\java\\Student.json"),
                    Student.class
            );

            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
