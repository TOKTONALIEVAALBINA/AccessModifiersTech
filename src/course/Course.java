package course;

import group.Group;

import java.util.Arrays;

public class Course {
    private String nameOfCourse;
    private String nameOfTaher;
    Group[] array;
   public Course(){

    }

    public Course(String nameOfCourse, String nameOfTaher, Group[] array) {
        this.nameOfCourse = nameOfCourse;
        this.nameOfTaher = nameOfTaher;
        this.array = array;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getNameOfTaher() {
        return nameOfTaher;
    }

    public void setNameOfTaher(String nameOfTaher) {
        this.nameOfTaher = nameOfTaher;
    }

    public Group[] getArray() {
        return array;
    }

    public void setArray(Group[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nameOfCourse='" + nameOfCourse + '\'' +
                ", nameOfTaher='" + nameOfTaher + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
