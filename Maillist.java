import java.util.Iterator;
import java.util.LinkedList;

class Address {
    // Data members for the Address class
    public String name;
    public String city;
    public String state;
}

public class Maillist {
    public static void main(String[] args) {
        // Create a LinkedList to store Address objects
        LinkedList<Address> addressList = new LinkedList<>();

        // Create Address objects and set their attributes directly
        Address address1 = new Address();
        address1.name = "John Doe";
        address1.city = "New York";
        address1.state = "NY";

        Address address2 = new Address();
        address2.name = "Jane Smith";
        address2.city = "Los Angeles";
        address2.state = "CA";

        Address address3 = new Address();
        address3.name = "Mike Johnson";
        address3.city = "Chicago";
        address3.state = "IL";

        // Add the Address objects to the list
        addressList.add(address1);
        addressList.add(address2);
        addressList.add(address3);

        // Display the contents of the list using an Iterator
        Iterator<Address> iterator = addressList.iterator();
        while (iterator.hasNext()) {
            Address address = iterator.next();
            System.out.println("Name: " + address.name + ", City: " + address.city + ", State: " + address.state);
        }
    }
}