package Address;


	// Define the Address class
	public class Address {
	    
	    // Declare the attributes of the Address class
	    private String street;
	    private String city;
	    private String state;
	    private String zipCode;
	    
	    // Constructor to initialize the attributes with default values
	    public Address() {
	        this.street = "";
	        this.city = "";
	        this.state = "";
	        this.zipCode = "";
	    }
	    
	    // Constructor to initialize the attributes with given values
	    public Address(String street, String city, String state, String zipCode) {
	        this.street = street;
	        this.city = city;
	        this.state = state;
	        this.zipCode = zipCode;
	    }
	    
	    // Getter methods to retrieve the values of attributes
	    public String getStreet() {
	        return street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getState() {
	        return state;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }

	    // Setter methods to set the values of attributes
	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }
	    
	    // Method to display the address in a readable format
	    public void displayAddress() {
	        System.out.println("Address: " + street + ", " + city + ", " + state + " " + zipCode);
	    }
	    
	    // Main method to test the Address class
	    public static void main(String[] args) {
	        // Create an Address object using the default constructor
	        Address address1 = new Address();
	        
	        // Set values using setter methods
	        address1.setStreet("123 Main St");
	        address1.setCity("Springfield");
	        address1.setState("IL");
	        address1.setZipCode("62701");
	        
	        // Display the address
	        address1.displayAddress();
	        
	        // Create an Address object using the parameterized constructor
	        Address address2 = new Address("456 Oak Ave", "Chicago", "IL", "60605");
	        
	        // Display the second address
	        address2.displayAddress();
	    }
	}

/* OUTPUT - Address: 123 Main St, Springfield, IL 62701
	Address: 456 Oak Ave, Chicago, IL 60605  */

