package at.ac.htl.bhitm3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SchoolClassTest {
    SchoolClass schoolClass;
    @Before
    public void setup() {
        schoolClass = new SchoolClass();
    }
    @Test
    public void given_nothing_ensure_school_exists() {
        assertNotNull(schoolClass);
    }
    @Test
    public void given_school_class_when_counting_students_then_result_is_zero() {
        assertEquals(0, schoolClass.getStudents().size());
    }

    @Test
    public void given_school_class_when_counting_teachers_then_result_is_zero() {
        assertEquals(0, schoolClass.getTeachers().size());
    }

    // test for setStudents and setTeachers

    @Test
    public void given_school_class_when_adding_student_then_result_is_added_student() {
        Student student = new Student("Max", "Mustermann", "01.02.2000", "Welserstraße 1");
        schoolClass.addStudent(student);
        assertEquals(1, schoolClass.getStudents().size());
        assertEquals(student, schoolClass.getStudents().get(0));
    }

    @Test
    public void given_school_class_when_adding_teacher_then_result_is_added_teacher() {
        Teacher teacher = new Teacher();
        schoolClass.addTeacher(teacher);
        assertEquals(1, schoolClass.getTeachers().size());
        assertEquals(teacher, schoolClass.getTeachers().get(0));
    }

}
