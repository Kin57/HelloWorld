package at.ac.htl.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class SchoolClass {

    private List<Student> student_list = new LinkedList<>();

    private List<Teacher> teacher_list = new LinkedList<>();

    public List<Student> getStudents() {
        return student_list;
    }

    public void setStudents(List<Student> student_list) {
        this.student_list = student_list;
    }

    public List<Teacher> getTeachers() {
        return teacher_list;
    }

    public void setTeachers(List<Teacher> teacher_list) {
        this.teacher_list = teacher_list;
    }
}
