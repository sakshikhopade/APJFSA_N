// Define a class named "Person"
class Person {
    String name;
    int age;

    // Constructor to initialize the name and age of the person
    Person(String name, int age) {
        this.name = name;  // Assigning name to the current object
        this.age = age;    // Assigning age to the current object
    }

    // Constructor to display the details of a person
    Person(Person person) {
        // Passing the current object as a parameter to the constructor
        this.name = person.name;
        this.age = person.age;
    }

    // Method to display the person's details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Person
        Person p1 = new Person("Alice", 30);

        // Passing the current object (p1) to another constructor
        Person p2 = new Person(p1);

        // Displaying the details of p2
        System.out.println("Person 2 details:");
        p2.display();
    }
}


/* OUTPUT - Person 2 details:
Name: Alice
Age: 30
*/