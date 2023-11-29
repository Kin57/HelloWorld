package at.ac.htl.bhitm3;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student student;
    @Before
    public void setup() {
        student = new Student("Max","Mustermann", "dd.mm.YYYY", "Salzergasse 7");
    }
    @Test
    public void given_student_ensure_student_is_person() {
        assertTrue(student instanceof Person);
    }
}
