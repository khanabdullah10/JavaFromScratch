package src.practicalTest.question1;


/* This interface contains 3 abstract method
a)addAddress() if not found throws exception
b)removeAddress() if not found throws exception
c)findAddress() on the basis of firstName and LastName */

/**
 *
 */

public interface AddressBook {
    void addAddress(SingleAddress address) throws DuplicateAddressException;
    void removeAddress(String firstName, String lastName) throws AddressNotFoundException;
    SingleAddress findAddress(String firstName, String lastName);
}