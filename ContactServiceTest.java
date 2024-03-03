package SELF;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class ContactServiceTest {
	
	@Test
	public void testSeachMethod() {
		ContactService contacts = new ContactService();
		contacts.addContact("Jimmy", "John", "1111111111", "2313 NewBerry AV");
		
		String testID = contacts.getFirstID();
		assertTrue(contacts.search(testID).getFirst().equals("Jimmy"));
	}
	
	@Test
	public void testAddContact() {
		ContactService contacts = new ContactService();
		
		contacts.addContact("Elijah", "Thomas", "1828374342","4851 Blueberry ave");
		String testID = contacts.getSpecificID("Elijah");

		
		assertTrue(contacts.search(testID).getFirst().equals("Elijah"));
		assertTrue(contacts.search(testID).getLast().equals("Thomas"));
		assertTrue(contacts.search(testID).getPhone().equals("1828374342"));
		assertTrue(contacts.search(testID).getAddress().equals("4851 Blueberry ave"));
		
		
	}
	@Test
	public void testEditContacts() {
		ContactService contacts = new ContactService();
		
		contacts.addContact("Chris", "Cummings", "2222222222", "4626 OldRoad Drive");
		String testID = contacts.getSpecificID("Chris");
		
		contacts.changeFirst(testID, "Stephen");
		contacts.changeLast(testID, "Jhons");
		contacts.changePhone(testID, "4444444444");
		contacts.changeAddress(testID, "2332 YumYum Drive");
		
		
		assertTrue(contacts.search(testID).getFirst().equals("Stephen"));
		assertTrue(contacts.search(testID).getLast().equals("Jhons"));
		assertTrue(contacts.search(testID).getPhone().equals("4444444444"));
		assertTrue(contacts.search(testID).getAddress().equals("2332 YumYum Drive"));
		
		
		
	}
	@Test
	public void testDeleteContacts() {
		ContactService contacts = new ContactService();
		
		
		contacts.addContact("John", "Jenkins", "3333333333", "3647 ShadyLane Ave");
        contacts.addContact("Sam", "Stephens", "4444444444", "9283 Jordan BVD");
        
        
        String testID = contacts.getSpecificID("Sam");
        String testID2 = contacts.getSpecificID("John");
        
        
        contacts.deleteContact(testID);
        contacts.deleteContact(testID2);
        
        Contact test1 = contacts.search(testID);
        Contact test2 = contacts.search(testID2);
        
        assertNull(test1);
        assertNull(test2);
        
	}

}
