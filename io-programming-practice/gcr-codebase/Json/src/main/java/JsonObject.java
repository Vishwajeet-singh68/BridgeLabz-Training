import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class JsonObject {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode student = mapper.createObjectNode();
        student.put("name", "Vishwajeet");
        student.put("age", 21);

        ArrayNode subjects = mapper.createArrayNode();
        subjects.add("Math");
        subjects.add("DSA");
        subjects.add("Java");

        student.set("subjects", subjects);

        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(student));
    }
}
