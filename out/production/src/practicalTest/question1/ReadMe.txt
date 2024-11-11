Practical Test
Question:

-> Total 5 Modules

→ 3 Modules(3 Major class and 1 interface)

 i)SingleAddressClass

 This class has 6 private Data Members, 12 Members Function (Public Setters & Public getters)
 1 Parameterized constructor to initialize value for instance variable and
 3 Override method for equal(),hashcode() and toString()


 ii)AddressBookInterface

 This interface contains three abstract method
 a)addAddress() if not found throws exception
 b)removeAddress() if not found throws exception
 c)findAddress() on the basis of firstName and LastName

iii)AddressBookImpl

This is a fully concrete class that implements AddressBookInterface
This class contains one private data member i.e., list and one public constructor to initialize the list
This class implements all the abstract methods from the interface and defines its own functionality
This class contains one listAllAddress() to iterate the list and print the list of addresses


iV)TestAddressClass

This is a Driver's code class that contains the main method
where the test cases are put into the class to perform action as instructed


-> 2 Modules(Minor classes)

Customized Exception class

i) AddressNotFoundException
ii) DuplicateAddressException
