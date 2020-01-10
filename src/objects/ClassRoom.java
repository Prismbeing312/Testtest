package objects;

import java.util.ArrayList;
import java.util.List;


public class ClassRoom {
    private String name;
    private Teacher teacher;
    List<Student> studentList;

    public ClassRoom(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        studentList = new ArrayList<>(15);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }



    @Override
    public String toString() {
        return "Class name is: " + name + ", the teacher is " + teacher + "\n the students " + studentList;
    }
}
