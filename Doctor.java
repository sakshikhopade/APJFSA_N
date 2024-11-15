// Base class: Doctor
class Doctor {
    // Method to display general information about the doctor
    public void displayInfo() {
        System.out.println("Doctor: Provides medical care and treatment.");
    }
}

// Derived class: Surgeon (Multilevel Inheritance, extends Doctor)
class Surgeon extends Doctor {
    // Overriding the displayInfo method to show more specific information about surgeons
    @Override
    public void displayInfo() {
        System.out.println("Surgeon: Specializes in performing surgeries.");
    }

    // Additional method for the Surgeon class
    public void performSurgery() {
        System.out.println("Surgeon: Performing surgery...");
    }
}

// Derived class: Nurse (Hierarchical Inheritance, extends Doctor)
class Nurse extends Doctor {
    // Overriding the displayInfo method to show more specific information about nurses
    @Override
    public void displayInfo() {
        System.out.println("Nurse: Assists doctors and provides patient care.");
    }

    // Additional method for the Nurse class
    public void administerMedication() {
        System.out.println("Nurse: Administering medication to patients.");
    }
}

public class Hospital {
    public static void main(String[] args) {
        // Creating an object of Doctor class
        Doctor doctor = new Doctor();
        doctor.displayInfo(); // Doctor general method
        
        // Creating an object of Surgeon class (Multilevel Inheritance)
        Surgeon surgeon = new Surgeon();
        surgeon.displayInfo(); // Overridden method from Surgeon class
        surgeon.performSurgery(); // Surgeon-specific method
        
        // Creating an object of Nurse class (Hierarchical Inheritance)
        Nurse nurse = new Nurse();
        nurse.displayInfo(); // Overridden method from Nurse class
        nurse.administerMedication(); // Nurse-specific method
    }
}


/* Output - Doctor: Provides medical care and treatment.
Surgeon: Specializes in performing surgeries.
Surgeon: Performing surgery...
Nurse: Assists doctors and provides patient care.
Nurse: Administering medication to patients.
*/