import org.json.JSONObject;

class User{
    String name;
    int age;
    String email;
    User(String name, int age, String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }
}
public class JsonObject {
    public static void main(String[] args) {
        JSONObject jsonObject=new JSONObject();

        jsonObject.put("name", "Vishwajeet");
        jsonObject.put("age", 20);
        jsonObject.put("email", "vishwajeet@gmail.com");

        System.out.println(jsonObject.toString());
    }
}
