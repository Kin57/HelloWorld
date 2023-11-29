package at.ac.htl.bhitm3;

public class Teacher extends Person{
    public int salary;
    public int matrNumb;
    private static int matrNumbCounter = 1;
    private final static int MIN_SALARY = 1000;

    public Teacher() {
        super("Franz", "Mayer", "18.09.1977", "Linz 2");
        this.salary = MIN_SALARY;
        matrNumbCounter++;
        this.matrNumb = matrNumbCounter;
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
}
