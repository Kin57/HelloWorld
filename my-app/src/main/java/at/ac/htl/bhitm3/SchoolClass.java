package at.ac.htl.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class SchoolClass {

    private List<Student> student_list = new LinkedList<>();

    private List<Teacher> teacher_list = new LinkedList<>();

    public List<Student> getStudents() {
        return student_list;
    }

    public void addStudent(Student student) {
        this.student_list.add(student);
    }

    public List<Teacher> getTeachers() {
        return teacher_list;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher_list.add(teacher);
    }
}
