class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Override {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}