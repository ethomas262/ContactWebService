package SELF;

import java.util.UUID;

public class Contact {
    private String id;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String Address;

    Contact[] contacts;

    /**
     * Constructor for creating a contact with specified parameters.
     *
     * This constructor initializes a Contact object with a unique identifier
     * generated using the UUID method,
     * along with the provided first name, last name, phone number, and address.
     *
     * @param firstname The first name of the contact.
     * @param lastname  The last name of the contact.
     * @param phone     The phone number of the contact.
     * @param Address   The address of the contact.
     */
    public Contact(String firstname, String lastname, String phone, String Address) {

        this.id = UUID.randomUUID().toString().substring(0,10); // Create unique identifier using UUID method
        
        this.setFirstName(firstname);
        this.setLastName(lastname);
        this.setPhoneNumber(phone);
        this.setAddress(Address);

    }

    // Methods for changing Contact attributes
    public void setFirstName(String newName) {
    	if(newName.length() < 11 && newName.length() != 0) {
    		this.FirstName = newName;
    	}
    	else {
    		throw new IllegalArgumentException("Invalid Input");
    	}
    }
    /**
     * validates and sets last name
     * @param str, new last name
     */
    public void setLastName(String newLast) {
    	if(newLast.length() < 11 && newLast.length() != 0) {
    		this.LastName = newLast;
    	}
    	else {
    		throw new IllegalArgumentException("Invalid Input");
    	}
    }
    
    /**
     * validates and sets phone number
     * @param str, newPhone 
     */
    public void setPhoneNumber(String newPhone) {
    	if(newPhone.length() < 11 && newPhone.length() != 0) {
    		this.PhoneNumber = newPhone;
    	}
    	else {
    		throw new IllegalArgumentException("Invalid Input");
    	}
    }
    
    /**
     * Validates and sets address
     * @param str, newAddress
     */
    public void setAddress(String newAddress) {
    	if(newAddress.length() < 21 && newAddress.length() != 0) {
    		this.Address = newAddress;
    	}
    	else {
    		throw new IllegalArgumentException("Invalid Input");
    	}
    }
    

    /**
     * Method for getting contact Unique Identifier
     * @return id of contact
     */
    public String getID() {
        return this.id;
    }

    /**
     *  Method to print out contact data for debugging
     */
    public void print() {
        System.out.printf("ID: %s\n First Name: %s\n Last Name: %s\n Phone Number: %s\n Address: %s\n \n", this.id,
                this.FirstName, this.LastName, this.PhoneNumber, this.Address);
    }
    
    
    public String getFirst() {
    	return this.FirstName;
    }
    public String getLast() {
    	return this.LastName;
    }
    public String getPhone() {
    	return this.PhoneNumber;
    }
    public String getAddress() {
    	return this.Address;
    }

}
