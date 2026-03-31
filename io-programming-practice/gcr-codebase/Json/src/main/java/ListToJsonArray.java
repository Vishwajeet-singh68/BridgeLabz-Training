import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vishwajeet", 21));
        students.add(new Student(2, "Aman", 22));
        students.add(new Student(3, "Rahul", 23));

        String jsonArray = mapper.writeValueAsString(students);

        System.out.println(jsonArray);
    }
}

