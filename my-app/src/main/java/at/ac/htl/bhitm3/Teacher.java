package at.ac.htl.bhitm3;

public class Teacher extends Person{
    public int salary;
    public int matrNumb;

    public Teacher() {
        super("Franz", "Mayer", "18.09.1977", "Linz 2");
        this.salary = 1;
        this.matrNumb = 1;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMatrNumb() {
        return this.matrNumb;
    }

    public void setMatrNumb(int matrNumb) {
        this.matrNumb = matrNumb;
    }


}
