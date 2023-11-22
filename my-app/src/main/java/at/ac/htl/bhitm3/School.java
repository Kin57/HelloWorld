package at.ac.htl.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class School {
    private LinkedList<SchoolClass> schoolClasses;

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(LinkedList<Teacher> teachers) {
        this.teachers = teachers;
    }

    private LinkedList<Teacher> teachers;

    public School() {
        this.schoolClasses = new LinkedList<SchoolClass>();
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
