package group;

import students.Students;

import java.util.Arrays;

public class Group {
  Students []array;
  private String subject;
  private String dateOfBegin;
  private int number;
 public Group(){

  }

    public Group(Students[] array, String subject, String dateOfBegin,int number) {
        this.array = array;
        this.subject = subject;
        this.dateOfBegin = dateOfBegin;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Students[] getArray() {
        return array;
    }

    public void setArray(Students[] array) {
        this.array = array;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDateOfBegin() {
        return dateOfBegin;
    }

    public void setDateOfBegin(String dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }

    @Override
    public String toString() {
        return "Group{" +
                "array=" + Arrays.toString(array) +
                ", subject='" + subject + '\'' +
                ", dateOfBegin='" + dateOfBegin + '\'' +
                ", number=" + number +
                '}';
    }
}
