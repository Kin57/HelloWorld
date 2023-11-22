package at.ac.htl.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class School {
    private LinkedList<SchoolClass> schoolClasses;

    public School() {
        this.schoolClasses = new LinkedList<SchoolClass>();
    }

    public static SchoolClass createSchoolClass() {
        return new SchoolClass();
    }

    public List getSchoolClasses() {
        return this.schoolClasses;
    }

    public void addSchoolClass(SchoolClass schoolClass) {
        this.schoolClasses.add(schoolClass);
    }
}
