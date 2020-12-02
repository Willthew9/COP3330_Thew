import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContactApp {
    private static Scanner input = new Scanner(System.in);

    public static void contactprogram(){
        String ans = ContactMenu();
        ContactList Clist = new ContactList();
        while(!ans.equals("3")){
            if(ans.equals("1")){
                contactlist(Clist);
            }
            else if (ans.equals("2")){
                System.out.println("Enter the filename to load: ");
                String filename = input.nextLine();
                Clist = loadcontactList(filename);
                contactlist(Clist);
            }
            else{
                System.out.println("WARNING: INVALID INPUT");
            }
            ans = ContactMenu();
        }
    }

    public static ContactList loadcontactList(String filename) {
        BufferedReader reader;
        ContactList Clist = new ContactList();
        try {
            reader = new BufferedReader(new FileReader(filename));
            int size = Integer.parseInt(reader.readLine());
            for(int i=0; i<size; i++) {
                String firstname = reader.readLine();
                String lastname = reader.readLine();
                String phone = reader.readLine();
                String email = reader.readLine();
                Clist.addContact(firstname, lastname, phone, email);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Clist;
    }

    public static void contactlist(ContactList Clist){
        String ans = contactlistmenu();
        while(!ans.equals("6")){
            if(ans.equals("1")){
                Clist.viewContact();
            }
            else if(ans.equals("2")){
                String firstname = getFirstname();
                String lastname = getLastname();
                String phone = getPhone();
                String email = getEmail();
                Clist.addContact(firstname, lastname, phone, email);
            }
            else if(ans.equals("3")){
                Clist.viewContact();
                System.out.println("Which contact would you like to edit: ");
                int index = input.nextInt();
                String firstname = getFirstname();
                String lastname = getLastname();
                String phone = getPhone();
                String email = getEmail();
                Clist.editContact(index, firstname, lastname, phone, email);
            }
            else if(ans.equals("4")){
                Clist.viewContact();
                System.out.println("Which contact would you like to remove? ");
                int index = input.nextInt();
                Clist.removeContact(index);
            }
            else if(ans.equals("5")){
                System.out.println("Please enter a file name : ");
                String filename = input.nextLine();

                Clist.saveContact(filename);
            }
            else{
                System.out.println("WARNING: INVALID INPUT");
            }
            ans = contactlistmenu();
        }
    }

    public static String getFirstname() {
        String firstname = "";
        while(true) {
            System.out.println("First Name: ");
            firstname = input.nextLine();

            if(firstname.length() != 0)
            {
                return firstname;
            }
        }
    }

    public static String getLastname() {
        String lastname = "";
        while(true) {
            System.out.println("Last Name: ");
            lastname = input.nextLine();

            if(lastname.length() != 0)
            {
                return lastname;
            }
        }
    }

    public static String getPhone() {
        String phone = "";
        while(true) {
            System.out.println("Phone Number: ");
            phone = input.nextLine();

            if(phone.length() == 10)
            {
                return phone;
            }
        }
    }

    public static String getEmail() {
        String Email = "";
        while(true) {
            System.out.println("Email Address (x@y.z): ");
            Email = input.nextLine();

            if(Email.length() != 0)
            {
                return Email;
            }
        }
    }

    public static String ContactMenu() {
        System.out.println("Main Menu");
        System.out.println(" 1) create new contact list\n 2) load contact list\n 3) quit");
        return input.nextLine();
    }

    public static String contactlistmenu() {
        System.out.println("List Operation Menu");
        System.out.println(" 1) view the contact list\n 2) add a contact\n 3) edit a contact\n 4) remove a contact\n" +
                " 7) save the current contact list\n " + "8) quit to the main menu");
        return input.nextLine();
    }
}
