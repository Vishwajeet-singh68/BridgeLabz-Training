import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJson {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper=new ObjectMapper();
        Student s=new Student(1,"vishwajeet", 21);

        String json = mapper.writeValueAsString(s);

        System.out.println(json);
    }
}
