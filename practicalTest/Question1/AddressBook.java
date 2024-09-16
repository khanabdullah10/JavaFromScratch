package src.practicalTest.Question1;

public interface AddressBook {
    void addAddress(SingleAddress address) throws DuplicateAddressException;
    void removeAddress(String firstName, String lastName) throws AddressNotFoundException;
    SingleAddress findAddress(String firstName, String lastName);
}