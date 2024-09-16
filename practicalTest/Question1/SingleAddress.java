package src.practicalTest.Question1;

import java.util.Objects;

public class SingleAddress {
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String city;
    private String country;
    private String postalCode;

    // Constructor
    public SingleAddress(String firstName, String lastName, String streetAddress, String city, String country, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    // Getters and setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

//     Override equals and hashCode to compare objects based on firstName and lastName
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingleAddress that = (SingleAddress) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    // Optional: Override toString to provide better print format
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + streetAddress + ", " + city + ", " + country + " - " + postalCode;
    }
}
