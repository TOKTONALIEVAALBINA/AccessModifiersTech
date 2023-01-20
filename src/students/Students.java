package students;

public class Students {
    private String name;
    private String sirName;
    private int age;
    private int birthYear;
    private String gMail;

    public Students(String name, String sirName, int birthYear, String gMail) {
        this.name = name;
        this.sirName = sirName;
        this.birthYear = birthYear;
        this.gMail = gMail;
        this.age = age;

    }
   public Students(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age<0){
            System.out.println("wrong age");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getgMail() {
        return gMail;
    }
    public void setgMail(String gMail) {
        this.gMail = gMail;
    }

        @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sirName='" + sirName + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", gMail='" + gMail + '\'' +
                '}';
    }

}
