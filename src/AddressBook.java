import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> addressBook = new ArrayList<Contact>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Problem");
        AddressBook addressBookList = new AddressBook();
        addressBookList.addContactDetails();
    }

    public void addContactDetails() {
        Contact details = new Contact();
        System.out.println("Enter a first name:");
        String firstName = scanner.next();
        details.setFirstName(scanner.next());
        System.out.println("Enter a last name:");
        String lastName = scanner.next();
        details.setLastName(scanner.next());
        System.out.println("Enter a Address:");
        String address = scanner.next();
        details.setAddress(scanner.next());
        System.out.println("Enter a City name:");
        String city = scanner.next();
        details.setCity(scanner.next());
        System.out.println("Enter a state:");
        String state = scanner.next();
        details.setState(scanner.next());
        System.out.println("Enter a email:");
        String email = scanner.next();
        details.setEmail(scanner.next());
        System.out.println("Enter a zip code:");
        int zip = scanner.nextInt();
        details.setZip(scanner.nextInt());
        System.out.println("Enter a phone number:");
        long phoneNumber = scanner.nextLong();
        details.setPhoneNumber(scanner.nextLong());

        addressBook.add(details);
        Contact details1 = new Contact(firstName, lastName, address, city, state, email, zip, phoneNumber);
        addressBook.add(details1);
        System.out.print(addressBook);
        System.out.println("succesfully added person new contacts");
    }
}