package objects;

import java.util.ArrayList;
import java.util.List;


public class School {
    private List<ClassRoom> classRoomList;

    public School(List<ClassRoom> classRoomList) {
        this.classRoomList = classRoomList;
    }

    public School() {
        classRoomList = new ArrayList<>(5);
    }

    public List<ClassRoom> getClassRoomList() {
        return classRoomList;
    }

    public void setClassRoomList(List<ClassRoom> classRoomList) {
        this.classRoomList = classRoomList;
    }



    @Override
    public String toString() {
        return "School{" +
                "classRoomList=" + classRoomList +
                '}';
    }
}
