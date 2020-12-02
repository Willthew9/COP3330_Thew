public class ContactItem {
    String firstname = "";
    String lastname = "";
    String phone = "";
    String email = "";

    public ContactItem(String fn, String ln, String pn, String ea){
        firstname = fn;
        lastname = ln;
        phone = pn;
        email = ea;
    }

    public String getFirstname() { return firstname; }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail(){
        return email;
    }
}
