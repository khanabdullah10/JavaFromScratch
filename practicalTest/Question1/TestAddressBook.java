package src.practicalTest.Question1;

import java.util.Scanner;

public class TestAddressBook {
    public static void main(String[] args) {
        AddressBookImpl addressBook = new AddressBookImpl();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n------------------------------------------- : Welcome User : -------------------------------");
            System.out.println("Press (1) -> Add Address");
            System.out.println("Press (2) -> Delete Address");
            System.out.println("Press (3) -> List All Addresses");
            System.out.println("Press (4) -> Exit");
            System.out.println();
            System.out.print("------------------------------------------- : Now Choose an option : ------------------------------- \n");
            System.out.print("Enter Here ! :");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add Address
                    System.out.println();
                    System.out.println(" *** Fill the details *** ");
                    System.out.print("First Name : ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name : ");
                    String lastName = scanner.nextLine();
                    System.out.print("Street Address : ");
                    String street = scanner.nextLine();
                    System.out.print("City : ");
                    String city = scanner.nextLine();
                    System.out.print("Country : ");
                    String country = scanner.nextLine();
                    System.out.print("Postal Code : ");
                    String postalCode = scanner.nextLine();

                    SingleAddress newAddress = new SingleAddress(firstName, lastName, street, city, country, postalCode);
                    try {
                        addressBook.addAddress(newAddress);
                        System.out.println();
                        System.out.println("Address added successfully.");
                    } catch (DuplicateAddressException e) {
                        System.out.println();
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;

                case 2:
                    // Delete Address
                    System.out.print("Enter First Name : ");
                    String first = scanner.nextLine();
                    System.out.print("Enter Last Name : ");
                    String last = scanner.nextLine();
                    try {
                        addressBook.removeAddress(first, last);
                        System.out.println();
                        System.out.println("Address removed successfully.");
                    } catch (AddressNotFoundException e) {
                        System.out.println();
                        System.out.println(" Error : " + e.getMessage());
                    }
                    break;

                case 3:
                    // List All Addresses
                    addressBook.listAllAddresses();
                    break;

                case 4:
                    // Exit
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
