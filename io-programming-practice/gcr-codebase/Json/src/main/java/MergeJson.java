import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = (ObjectNode) mapper.readTree(
                "{ \"name\": \"Vishwajeet\", \"age\": 21 }"
        );

        ObjectNode json2 = (ObjectNode) mapper.readTree(
                "{ \"city\": \"Mathura\", \"course\": \"CSE\" }"
        );

        // Merge
        json1.setAll(json2);

        System.out.println(
                mapper.writerWithDefaultPrettyPrinter()
                        .writeValueAsString(json1)
        );
    }
}

