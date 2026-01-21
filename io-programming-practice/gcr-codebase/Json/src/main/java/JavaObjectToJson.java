import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
    String name;
    String brand;
    Car(){ }
    Car(String name, String brand){
        this.name=name;
        this.brand=brand;
    }
}
public class JavaObjectToJson {
    public static void main(String[] args) {
        Car car=new Car("Velar","Range Rover");
        try {
            ObjectMapper objMapper = new ObjectMapper();
            String json = objMapper.writeValueAsString(car);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
