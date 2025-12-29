public class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // Constructor to initialize Person object
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.address = address;
    }
    public static void main(String[] args) {
        Person person1 = new Person("Vishwajeet", 20, "123 Main St" );

        Person person2 = new Person(person1);

        System.out.println("Person 1: " + person1.name + ", Age: " + person1.age + ", Address: " + person1.address);
        System.out.println("Person 2: " + person2.name + ", Age: " + person2.age + ", Address: " + person2.address);
    }
}
