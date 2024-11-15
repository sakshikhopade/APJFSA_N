// Parent class Animal
class Animal {
    String name;

    // Constructor of the parent class (Animal)
    Animal(String name) {
        this.name = name;  // Initializing the name of the animal
        System.out.println("Animal class constructor called.");
    }

    // Method to display animal's name
    void display() {
        System.out.println("Animal name: " + name);
    }
}

// Child class Dog extends Animal
class Dog extends Animal {
    String breed;

    // Constructor of the child class (Dog)
    Dog(String name, String breed) {
        // Calling the constructor of the parent class (Animal)
        super(name);  // This invokes the constructor of the Animal class
        this.breed = breed;  // Initializing the breed of the dog
        System.out.println("Dog class constructor called.");
    }

    // Method to display dog's name and breed
    void displayDetails() {
        display();  // Calling the display method from Animal class
        System.out.println("Dog breed: " + breed);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog class, which will invoke both Animal and Dog constructors
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Displaying the details of the dog
        dog.displayDetails();
    }
}

/* O/p - Animal class constructor called.
Dog class constructor called.
Animal name: Buddy
Dog breed: Golden Retriever
*/