package tools;

import objects.*;

public class Averages {

    public static int studentAvg(Student student){
        int sum = 0;
        int counter = 0;
        for (Grade grade: student.getGrades()) {
            sum += grade.getScore();
            counter++;
        }
        int avg = sum/counter;
        return avg;
    }

    public static int classCalcAvg(ClassRoom classRoom){
        int sum = 0;
        int counter = 0;
        for (Student student:classRoom.getStudentList()) {
            sum += studentAvg(student);
            counter++;
        }
        int avg = sum/counter;
        return avg;
    }

    public static void schoolAvg(School school){
        int sum = 0;
        int counter = 0;
        for (ClassRoom classRoom:school.getClassRoomList()) {
            sum += classCalcAvg(classRoom);
            counter++;
        }
        int avg = sum/counter;
        System.out.println("This is the school average " + avg);
    }

    public static void classAvg(School school){
        for (ClassRoom classRoom:school.getClassRoomList()) {
            System.out.println("The class " + classRoom.getName() + " avg is " + classCalcAvg(classRoom));
        }
    }

    public static void allProfessionAvg(School school){
        for (Profession profession:Profession.values()) {
            System.out.println("The average of this profession " + profession.name() +" is " + professionAvg(school, profession));
        }
    }

    public static int professionAvg(School school, Profession profession){
        int sum = 0;
        int counter = 0;
        for (ClassRoom classRoom:school.getClassRoomList()) {
               sum += studentProfession(classRoom, profession);
               counter++;
        }
        int avg = sum/counter;
        return avg;
    }

    public static int studentProfession(ClassRoom classRoom, Profession profession){
        int sum = 0;
        int counter = 0;
        for (Student student:classRoom.getStudentList()) {
            for (Grade grade:student.getGrades()){
                if (grade.getProfession() == profession){
                    sum += grade.getScore();
                    counter++;
                }
            }
        }
        int avg = sum/counter;
        return avg;
    }
}
