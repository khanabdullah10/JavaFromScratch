package src.practicalTest.Question1;

public interface AddressBook {

    void  addAddress(String address);
    void removeAddress(String address);
    boolean IllegalAddressException(String s);
    boolean PersonNotExistException(String f , String l);
//    void IllegalAddress()throws Exception
}
