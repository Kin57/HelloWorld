package at.ac.htl.bhitm3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SchoolTest {
    School school;
    @Before
    public void setup() {
           school = new School();
    }
    @Test
    public void given_nothing_ensure_school_exists() {
        assertNotNull(school);
    }
    @Test
    public void given_new_school_when_counting_classes_then_result_is_zero() {
        assertEquals(0, school.getSchoolClasses().size());
    }
    @Test
    public void given_new_school_when_adding_class_then_result_is_added_class() {
        SchoolClass schoolClass = School.createSchoolClass();
        school.addSchoolClass(schoolClass);
        assertEquals(1, school.getSchoolClasses().size());
        assertEquals(schoolClass, school.getSchoolClasses().get(0));
    }

    @Test
    public void given_new_school_when_adding_teacher_then_result_is_teachers() {
        Teacher teacher = new Teacher();
        school.setTeacher(teacher);
        assertEquals(1, school.getTeachers().size());
        assertEquals(teacher, school.getTeachers().get(0));
    }
}
