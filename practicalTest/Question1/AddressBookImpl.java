package src.practicalTest.Question1;

public class AddressBookImpl implements AddressBook {

    SingleAddress s = new SingleAddress();

    @Override
    public boolean IllegalAddressException(String address) {

        s.setStreetAddress(address);
        if(address.equals(s.getFirstName()) && address.equals(s.getLastName()))
            throw new IllegalArgumentException("Cannot add address with already existing name !");
        return true;
    }

    @Override
    public boolean PersonNotExistException(String fName, String lName) {
        s.setFirstName(fName);
//        s.getLastName(lName);
//        if(s.getFirstName().equals() )
        return true;
    }


    public void  addAddress(String address){ // access modifier should be stronger, i.e., public

       try {
          if (IllegalAddressException(address)){

          }else {
              s.setStreetAddress(address);
          }
           }catch (IllegalArgumentException e ){
           System.out.println(e.getMessage());
       }

    }
    public void removeAddress(String address){ // access modifier should be stronger, i.e., public

    }



}
