package tools;

import objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeInit {
    public static void schoolGrades(School school){
        for (ClassRoom classRoom:school.getClassRoomList()) {
            initGrades(classRoom);
        }
    }

    public static void initGrades(ClassRoom classRoom){
        for (Student student:classRoom.getStudentList()) {
            student.setGrades(gradeInitializer(student.getGrades()));
        }
    }

    public static List<Grade> gradeInitializer(List<Grade> grades){
        Random rand = new Random();
        List<Grade> initGradelist = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
           initGradelist.add(new Grade(randomEnum(), rand.nextInt(60)+40));
        }
        return initGradelist;
    }

    private static Profession randomEnum(){
        return Profession.values()[new Random().nextInt(Profession.values().length)];
    }
}
