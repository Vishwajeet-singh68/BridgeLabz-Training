import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonFormat {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        String json = "{ \"name\": \"Vishwajeet\", \"age\": 21 }";

        try {
            mapper.readValue(json, Student.class);
            System.out.println("JSON structure is valid");
        } catch (Exception e) {
            System.out.println("JSON structure is INVALID");
        }
    }
}
