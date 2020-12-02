import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ContactItemTest {
    @Test
    public void creatingConatctItemFailsWithInvalidFirstName(){
        ContactItem item = new ContactItem("First", "Last", "1234567890", "bob@gmail.com");
        Assertions.assertEquals("Will", item.getFirstname());
    }

    @Test
    public void creatingConatctItemFailsWithInvalidLastName(){
        ContactItem item = new ContactItem("First", "Last", "1234567890", "bob@gmail.com");
        Assertions.assertEquals("Smith", item.getLastname());
    }

    @Test
    public void creatingConatctItemFailsWithInvalidPhoneNumber(){
        ContactItem item = new ContactItem("First", "Last", "1234567890", "bob@gmail.com");
        Assertions.assertEquals("0246802468", item.getPhone());
    }

    @Test
    public void creatingConatctItemFailsWithInvalidEmail(){
        ContactItem item = new ContactItem("First", "Last", "1234567890", "bob@gmail.com");
        Assertions.assertEquals("BOB@gmail.com", item.getEmail());
    }

    @Test
    public void creatingContactItemSucceedsWithValidFirstName(){
        ContactItem item = new ContactItem("Will", "Last", "1234567890", "will@gmail.com");
        Assertions.assertEquals("Will", item.getFirstname());
    }

    @Test
    public void creatingContactItemSucceedsWithValidLastName(){
        ContactItem item = new ContactItem("First", "Thew", "1234567890", "will@gmail.com");
        Assertions.assertEquals("Thew", item.getLastname());
    }

    @Test
    public void creatingContactItemSucceedsWithValidPhoneNumber(){
        ContactItem item = new ContactItem("First", "Last", "1234567890", "will@gmail.com");
        Assertions.assertEquals("1234567890", item.getPhone());
    }

    @Test
    public void creatingContactItemDueDateSucceedsWithValidEmail(){
        ContactItem item = new ContactItem("First", "Last", "1234567890", "will@gmail.com");
        Assertions.assertEquals("Date", item.getEmail());
    }
}
