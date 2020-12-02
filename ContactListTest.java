import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ContactListTest {
    @Test
    public void addingContactItemsIncreasesSize(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.addContact("Will", "Thew", "1234567890", "will@gmail.com"));
    }

    @Test
    public void editingContactItemChangesValues(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0, "Will", "Thew", "1234567890", "will@gmail.com"));
    }

    @Test
    public void editingContactItemFirstNameChangesValue(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0,"Will", "Thew", "1234567890","will@gmail.com"));
    }

    @Test
    public void editingContactItemFirstNameFailsWithInvalidIndex(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0,"Will", "Thew", "1234567890", "will@gmail.com"));
    }

    @Test
    public void editingContactItemLastNameChangesValue(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0,"Will", "Thew", "1234567890", "will@gmail.com"));
    }

    @Test
    public void editingContactItemLastNameFailsWithInvalidIndex(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0,"First", "Last", "phone", "email"));
    }

    @Test
    public void editingContactItemPhoneChangesValue(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0,"First", "Last", "phone", "email"));
    }

    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0,"First", "Last", "1234567890", "bob@gmail.com"));
    }

    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0,"First", "Last", "1234567890", "bob@gmail.com"));
    }

    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.editContact(0,"First", "Last", "1234567890", "bob@gmail.com"));
    }

    @Test
    public void newContactListIsEmpty(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.viewContact());
    }

    @Test
    public void removingContactItemsDecreasesSize(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.removeContact(0));
    }

    @Test
    public void removingContactItemsFailsWithInvalidIndex(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.removeContact(0));
    }

    @Test
    public void savedContactListCanBeLoaded(){
        ContactList list = new ContactList();
        Assertions.assertEquals(null, list.saveContact("Contact.txt"));
    }
}
