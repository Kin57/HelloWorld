package at.ac.htl.bhitm3;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    Person person;
    @Before
    public void setup() {
        person = new Person("Max", "Mustermann", "01.01.1970", "Musterstraße 1");
    }
    
    @Test
    public void given_person_ensure_has_firstname() {
        assert(person.getFirstName().equals("Max"));
    }

    @Test
    public void given_person_ensure_has_lastname() {
        assert(person.getLastName().equals("Mustermann"));
    }

    @Test
    public void given_person_ensure_has_dateofbirth() {
        assert(person.getDateOfBirth().equals("01.01.1970"));
    }

    @Test
    public void given_person_ensure_has_address() {
        assert(person.getAddress().equals("Musterstraße 1"));
    }


}
