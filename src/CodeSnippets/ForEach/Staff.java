package CodeSnippets.ForEach;

public class Staff extends Person{

    private String role;

    public Staff(Staff staff) {
        super(staff);
        this.role = staff.role;
    }

    public Staff(String firstname, String lastname, String passportID, String role) {
        super(firstname, lastname, passportID);
        this.role = new String(role);
    }

    public Staff(Person p, String role) {
        super(p);
        this.role = new String(role);
    }


}
