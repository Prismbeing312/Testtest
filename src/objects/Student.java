package objects;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<Grade> grades;

    public Student(String name, int age) {
        super(name, age);
        this.grades = new ArrayList<>(6);
    }

    public Student(String name, int age, List<Grade> grades) {
        super(name, age);
        this.grades = grades;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "\nThe student " + getName() + " Grades " + grades + " \n";
    }
}
