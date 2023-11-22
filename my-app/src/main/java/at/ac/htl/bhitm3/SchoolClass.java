package at.ac.htl.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class SchoolClass {

    private List<Student> student_list = new LinkedList<>();

    public List<Student> getStudents() {
        return student_list;
    }

    public void setStudents(List<Student> student_list) {
        this.student_list = student_list;
    }

    
}
