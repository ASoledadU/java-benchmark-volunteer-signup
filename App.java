import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Volunteer> volunteers = loadVolunteers();
        Volunteer volunteer = getVolunteers();
        volunteers.add(volunteer);
        saveVolunteers(volunteers);
    }

    public static Volunteer getVolunteers() {
        System.out.println("I AM ONE of 90");
        System.out.println("One does make a difference...");
        System.out.println("Your involvement matters because your service makes a difference.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Phone: ");
        String phone = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Please answer the following with a [yes] or [no]");

        System.out.println("Would you like to volunteer for the Worship Team?");
        String worship = scanner.nextLine();
        System.out.println("Would you like to volunteer for the Welcome Team?");
        String welcome = scanner.nextLine();
        System.out.println("Would you like to volunteer for the Production Team?");
        String production = scanner.nextLine();
        System.out.println("Would you like to volunteer for the Community Groups?");
        String community = scanner.nextLine();
        System.out.println("Would you like to volunteer for the Children's Ministry?");
        String children = scanner.nextLine();
        System.out.println("Would you like to volunteer for the Student Ministry?");
        String student = scanner.nextLine();
        System.out.println("Would you like to recieve more information on other volunteer opportunities?");
        String moreInformation = scanner.nextLine();
        scanner.close();

        Volunteer volunteer = new Volunteer(firstName, lastName, phone, email, worship, welcome, production, community,
                children, student, moreInformation);

        volunteer.firstName = firstName;
        volunteer.lastName = lastName;
        volunteer.phone = phone;
        volunteer.email = email;
        volunteer.worship = worship;
        volunteer.welcome = welcome;
        volunteer.production = production;
        volunteer.community = community;
        volunteer.children = children;
        volunteer.student = student;
        volunteer.moreInformation = moreInformation;
        return volunteer;
    }

    private static void saveVolunteers(ArrayList<Volunteer> volunteers) {
        try {
            FileOutputStream fileStream = new FileOutputStream("churchVolunteers.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(volunteers);
            os.close();
        } catch (IOException ex) {
            System.out.println("Failed to save volunteer.");
        }
    }

    public static ArrayList<Volunteer> loadVolunteers() {
        try {
            FileInputStream fileStream = new FileInputStream("churchVolunteers.ser");
            ObjectInputStream os = new ObjectInputStream(fileStream);
            ArrayList<Volunteer> volunteers = (ArrayList<Volunteer>) os.readObject();
            os.close();
            return volunteers;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<Volunteer>();
        }
    }
}