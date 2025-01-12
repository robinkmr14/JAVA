
class Dog {

    // Fields (attributes)
    String breed;
    int age;

    // Methods (behaviors)
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class ClassesObjectsMethods {
    public static void main(String[] args) {

        Dog myDog = new Dog(); // Creating an object
        myDog.breed = "Labrador"; // Accessing attributes
        myDog.age = 3;
        myDog.bark(); // Calling a method
    }
}
