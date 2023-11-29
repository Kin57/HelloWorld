package at.ac.htl.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class School {
    private LinkedList<SchoolClass> schoolClasses;
    private LinkedList<Teacher> teachers;

    public LinkedList<Teacher> getTeachers() {
        return this.teachers;
    }

    public void setTeacher(Teacher teachers) {
        this.teachers.add(teachers);
    }


    public School() {
        this.schoolClasses = new LinkedList<SchoolClass>();
        this.teachers = new LinkedList<Teacher>();
    }

    public static SchoolClass createSchoolClass() {
        return new SchoolClass();
    }

    public List<SchoolClass> getSchoolClasses() {
        return this.schoolClasses;
    }

    public void addSchoolClass(SchoolClass schoolClass) {
        this.schoolClasses.add(schoolClass);
    }
}
