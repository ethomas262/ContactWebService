package SELF;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

public class ContactTest {
	@Test
	public void testContact() {
		Contact contact = new Contact("Elijah", "Thomas", "1828374342","4851 Blueberry ave");
		
		assertTrue(contact.getFirst().equals("Elijah"));
		assertTrue(contact.getLast().equals("Thomas"));
		assertTrue(contact.getPhone().equals("1828374342"));
		assertTrue(contact.getAddress().equals("4851 Blueberry ave"));
	}
	
	@Test
	public void testInputValidation() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("Elijah","Thomassssssss", "17283743","Blueberry ave");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("Elijahhhhhhhhhhhhh","Thomas", "17283743","Blueberry ave");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("Elijah","Thomas", "17283743000000000","Blueberry ave");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("Elijah","Thomas", "17283743","Blueberry aveeeeeeeeeeeeeeeeeeeeeeeeeeee");
		});
		
	}
	@Test
	public void testEditContact() {
		Contact contact = new Contact("Elijah", "Thomas", "1828374342","4851 Blueberry ave");
		
		contact.setFirstName("Johny");
		contact.setLastName("Jenkins");
		contact.setAddress("Hello World!");
		contact.setPhoneNumber("1212121212");
		
		assertTrue(contact.getFirst().equals("Johny"));
		assertTrue(contact.getLast().equals("Jenkins"));
		assertTrue(contact.getAddress().equals("Hello World!"));
		assertTrue(contact.getPhone().equals("1212121212"));
	}

}
