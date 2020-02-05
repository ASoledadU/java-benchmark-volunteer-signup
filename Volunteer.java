import java.io.Serializable;

public class Volunteer implements Serializable {
    private static final long serialVersionUID = 1L;
    String firstName;
    String lastName;
    String phone;
    String email;

    String worship;
    String welcome;
    String production;
    String community;
    String children;
    String student;

    String moreInformation;

    public Volunteer(String firstName, String lastName, String phone, String email, String worship, String welcome,
            String production, String community, String children, String student, String moreInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.worship = worship;
        this.welcome = welcome;
        this.production = production;
        this.community = community;
        this.children = children;
        this.student = student;
        this.moreInformation = moreInformation;
    }
}