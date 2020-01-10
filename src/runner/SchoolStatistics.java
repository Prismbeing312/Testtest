package runner;

import objects.*;

import java.util.ArrayList;
import java.util.List;

import static tools.Averages. *;
import static tools.GradeInit. *;


public class SchoolStatistics {
    public static void main(String[] args) {
        List<Student> enoshList = new ArrayList<>(15);
        List<Student> vardaList = new ArrayList<>(15);
        List<Student> taliList = new ArrayList<>(15);
        List<Student> nisimList = new ArrayList<>(15);
        enoshList.add(new Student("jake", 23));
        enoshList.add(new Student("yonatan", 32));
        enoshList.add(new Student("omer", 29));
        enoshList.add(new Student("Dylan", 45));
        vardaList.add(new Student("Avner", 34));
        vardaList.add(new Student("Limor", 67));
        vardaList.add(new Student("Noelle", 76));
        vardaList.add(new Student("Mika", 98));
        taliList.add(new Student("Christine", 21));
        taliList.add(new Student("Mike", 20));
        taliList.add(new Student("John", 111));
        nisimList.add(new Student("Mark", 47));
        nisimList.add(new Student("Freddy", 27));
        nisimList.add(new Student("Michelle", 34));
        nisimList.add(new Student("Debby", 30));
        Teacher physicsTeacher = new Teacher("Enosh", 29, Profession.PHYSICS);
        Teacher literatureTeacher = new Teacher("Varda", 35, Profession.LITERATURE);
        Teacher mathTeacher = new Teacher("Tali", 55, Profession.MATH);
        Teacher sportsTeacher = new Teacher("Nisim", 43, Profession.SPORTS);
        ClassRoom class1 = new ClassRoom("Computers", physicsTeacher);
        ClassRoom class2 = new ClassRoom("literature", literatureTeacher);
        ClassRoom class3 = new ClassRoom("Math", mathTeacher);
        ClassRoom class4 = new ClassRoom("Sports", sportsTeacher);
        class1.setStudentList(enoshList);
        class2.setStudentList(vardaList);
        class3.setStudentList(taliList);
        class4.setStudentList(nisimList);
        List<ClassRoom> classRoomList = new ArrayList<>(5);
        classRoomList.add(class1);
        classRoomList.add(class2);
        classRoomList.add(class3);
        classRoomList.add(class4);
        School school = new School(classRoomList);
        schoolGrades(school);
        System.out.println(school);
        System.out.println();
        schoolAvg(school);
        classAvg(school);
        allProfessionAvg(school);



    }
}
