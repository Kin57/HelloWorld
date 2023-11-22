package at.ac.htl.bhitm3;

public class Person {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;

    public Person(String firstName, String lastName, String dateOfBirth, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }
}
