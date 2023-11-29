package at.ac.htl.bhitm3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TeacherTest {
    Teacher teacher;

    @Before
    public void setup() {
        teacher = new Teacher();
    }

    @Test
    public void given_teacher_ensure_teacher_is_person() {
        assertTrue(teacher instanceof Person);
    }

    @Test
    public void given_teacher_when_creating_techer_has_salary_greater_than_zero() {
        assertTrue(teacher.getSalary() > 0);
    }

    @Test
    public void given_teacher_when_creating_teacher_has_MatrNumber_greater_than_zero() {
        assertTrue(teacher.getMatrNumb() > 0);
    }

    @Test
    public void given_teacher_when_setting_salary_then_result_is_set_salary() {
        teacher.setSalary(2000);
        assertEquals(2000, teacher.getSalary());
    }    
}
