import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ContactList {
    public ArrayList<ContactItem> Clist = new ArrayList<>();

    public String viewContact(){
        System.out.println("Current Contacts");
        System.out.println("-------------");

        for(int i=0; i<Clist.size(); i++){
            System.out.println("First Name: "+Clist.get(i).firstname+"\nLast Name: "+Clist.get(i).lastname
                    +"\nPhone Number: "+Clist.get(i).phone+"\nEmail: "+Clist.get(i).email+"\n");
        }
        return null;
    }

    public String addContact(String firstname, String lastname, String phone, String email){
        Clist.add(new ContactItem(firstname, lastname, phone, email));
        return null;
    }

    public String editContact(int index, String newFirstName, String newLastName, String newPhoneNumber, String newEmailAddress){
        Clist.get(index).firstname = newFirstName;
        Clist.get(index).lastname = newLastName;
        Clist.get(index).phone = newPhoneNumber;
        Clist.get(index).email = newEmailAddress;
        return null;
    }

    public String removeContact(int index){

        Clist.remove(index);
        return null;
    }

    public String saveContact(String filename){
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(filename));
            // actually write to the filename
            bw.write(Integer.toString(Clist.size()) + "\n");
            for(int i=0; i<Clist.size(); i++){
                bw.write(Clist.get(i).firstname+"\n"+Clist.get(i).lastname+"\n"+Clist.get(i).phone+"\n"
                        +Clist.get(i).email+"\n");
            }
            //  Boolean.toString(variableName)
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
