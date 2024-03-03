package SELF;

import java.util.ArrayList;

public class ContactService {q
    // ArrayList to store contacts
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    /**
     * Lists all contacts by calling the print method on each contact in the list.
     */
    public void listAll() {
        for (Contact contact : this.contacts) {
            contact.print();
        }
    }

    /**
     * Searches for a contact with the specified ID in the list of contacts.
     *
     * @param targetId The ID of the contact to search for.
     * @return The found contact, or null if not found.
     */
    public Contact search(String targetId) {
        Contact conFound = null;

        for (Contact contact : this.contacts) {
            if (contact.getID() == targetId) {
                conFound = contact;
                break;
            }
        }
        return conFound;
    }

    /**
     * Adds a new contact with the specified details to the list of contacts.
     *
     * @param firstname The first name of the contact.
     * @param lastname  The last name of the contact.
     * @param phone     The phone number of the contact.
     * @param Address   The address of the contact.
     */
    public void addContact(String firstname, String lastname, String phone, String Address) {
        // Check if input lengths are within valid limits
        if (firstname.length() <= 10 && lastname.length() <= 10 && phone.length() <= 10 && Address.length() <= 30) {
            // Add a new Contact to the list
            this.contacts.add(new Contact(firstname, lastname, phone, Address));
        } else {
            // Print an error message for invalid input
            System.out.print("Error: Invalid Input\n");
        }
    }

    /**
     * Deletes a contact with the specified ID from the list of contacts.
     *
     * @param targetId The ID of the contact to be deleted.
     */
    public void deleteContact(String targetId) {

        for (Contact contact : this.contacts) {
            if (contact.getID().equals(targetId)) {

                // Remove the contact and print a message
                contacts.remove(contacts.indexOf(contact));
                System.out.print("Removing Contact...");
                break;

            }
        }
    }

    /**
     * Changes the first name of a contact with the specified ID.
     *
     * @param targetId The ID of the contact to be modified.
     * @param newName  The new first name for the contact.
     */
    public void changeFirst(String targetId, String newName) {
        Contact targetContact = this.search(targetId);

        if (targetContact != null) {

            // Set the new first name
            targetContact.setFirstName(newName);

        } else {

            // Print an error message if the contact is not found
            System.out.print("Error: Contact not found");

        }
    }

    /**
     * Changes the last name of a contact with the specified ID.
     *
     * @param targetId The ID of the contact to be modified.
     * @param newName  The new last name for the contact.
     */
    public void changeLast(String targetId, String newName) {

        Contact targetContact = this.search(targetId);

        if (targetContact != null) {
            // Set the new last name
            targetContact.setLastName(newName);
        } else {
            // Print an error message if the contact is not found
            System.out.print("Error: Contact not found");
        }
    }

    /**
     * Changes the phone number of a contact with the specified ID.
     *
     * @param targetId The ID of the contact to be modified.
     * @param newPhone The new phone number for the contact.
     */
    public void changePhone(String targetId, String newPhone) {
        Contact targetContact = this.search(targetId);

        if (targetContact != null) {
            // Set the new phone number
            targetContact.setPhoneNumber(newPhone);
        } else {
            // Print an error message if the contact is not found
            System.out.print("Error: Contact not found");
        }
    }

    /**
     * Changes the address of a contact with the specified ID.
     *
     * @param targetId   The ID of the contact to be modified.
     * @param newAddress The new address for the contact.
     */
    public void changeAddress(String targetId, String newAddress) {
        Contact targetContact = this.search(targetId);

        if (targetContact != null) {
            // Set the new address
            targetContact.setAddress(newAddress);
        } else {
            // Print an error message if the contact is not found
            System.out.print("Error: Contact not found");
        }
    }

    // method returns an ID of a contact object in memory for testing
    public String getFirstID() {
        String returnVal = null;
        for (Contact contact : this.contacts) {
            returnVal = contact.getID();
            return returnVal;
        }
        return returnVal;

    }

   
    
    /**
     * Testing method to get a specific id via name
     * @param name
     * @return
     */
    public String getSpecificID(String name) {
    	String ID = null;
    	for(Contact contact : this.contacts) {
    		if(contact.getFirst() == name) {
    			ID = contact.getID();
    			return ID;
    		}
    	}
    	return ID;
    }
}

