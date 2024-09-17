package src.practicalTest.question1;

import java.util.ArrayList;
import java.util.List;


/* This is a fully concrete class that implements AddressBookInterface
This class contains one private data member i.e., list and one public constructor to initialize the list
This class implements all the abstract methods from the interface and defines its own functionality
This class contains one listAllAddress() to iterate the list and print the list of address */




public class AddressBookImpl implements AddressBook {
    private List<SingleAddress> addresses;

    public AddressBookImpl() {
        addresses = new ArrayList<>();
    }

    // Add a new address to the address book, throw exception if it's a duplicate
    @Override
    public void addAddress(SingleAddress address) throws DuplicateAddressException {
        if (addresses.contains(address)) {
            throw new DuplicateAddressException("Address for " + address.getFirstName() + " " + address.getLastName() + " already exists.");
        }
        addresses.add(address);
    }

    // Remove an address by firstName and lastName, throw exception if not found
    @Override
    public void removeAddress(String firstName, String lastName) throws AddressNotFoundException {
        SingleAddress addressToRemove = findAddress(firstName, lastName);
        if (addressToRemove != null) {
            addresses.remove(addressToRemove);
        } else {
            throw new AddressNotFoundException("Address for " + firstName + " " + lastName + " not found.");
        }
    }

    // Find an address by firstName and lastName
    @Override
    public SingleAddress findAddress(String firstName, String lastName) {
        for (SingleAddress address : addresses) {
            if (address.getFirstName().equals(firstName) && address.getLastName().equals(lastName)) {
                return address;
            }
        }
        return null;
    }

    // List all addresses in the address book
    public void listAllAddresses() {
        System.out.println("Information in our system are as follows :");
        if (addresses.isEmpty()) {
            System.out.println("No addresses available.");
        } else {
            for (SingleAddress address : addresses) {
                System.out.println(address);
            }
        }
    }
}

