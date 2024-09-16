package src.practicalTest.Question1;

// Exception for handling cases when an address is not found
public class AddressNotFoundException extends Exception {
    public AddressNotFoundException(String message) {
        super(message);
    }
}