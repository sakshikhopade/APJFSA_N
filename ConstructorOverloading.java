package core_java;

public class ConstructorOverloading {


	// Member variables (fields)
	private int acno;
	private String atype;
	private double amt;

	// Constructor with all parameters (acno, atype, amt)
	public ConstructorOverloading(int acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// Constructor with only account number (acno) and account type (atype)
	public ConstructorOverloading(int acno, String atype) {
		this.acno = acno;
		this.atype = atype;
		this.amt = 0.0; // Default balance amount
	}

	// Constructor with only account number (acno)
	public ConstructorOverloading(int acno) {
		this.acno = acno;
		this.atype = "Saving"; // Default account type
		this.amt = 0.0; // Default balance amount
	}

	// Getters and Setters
	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	// Method to display the customer details
	public void displayCustomerDetails() {
		System.out.println("Account Number: " + acno);
		System.out.println("Account Type: " + atype);
		System.out.println("Account Balance: " + amt);
	}

	// Main method to test constructor overloading
	public static void main(String[] args) {
		// Creating objects using different constructors
		ConstructorOverloading customer1 = new ConstructorOverloading(101, "Savings", 5000.0);
		ConstructorOverloading customer2 = new ConstructorOverloading(102, "Current");
		ConstructorOverloading customer3 = new ConstructorOverloading(103);

		// Displaying details of each custome
		System.out.println("Customer 1 Details:");
		customer1.displayCustomerDetails();

		System.out.println("\nCustomer 2 Details:");
		customer2.displayCustomerDetails();

		System.out.println("\nCustomer 3 Details:");
		customer3.displayCustomerDetails();
	}
}



/* OUTPUT 
 Customer 1 Details:
Account Number: 101
Account Type: Savings
Account Balance: 5000.0

Customer 2 Details:
Account Number: 102
Account Type: Current
Account Balance: 0.0

Customer 3 Details:
Account Number: 103
Account Type: Saving
Account Balance: 0.0 */



