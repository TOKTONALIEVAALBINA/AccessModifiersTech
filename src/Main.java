import course.Course;
import group.Group;
import students.Students;

public class Main {
    public static void main(String[] args) {

        Students students = new Students("Albina","Toctonalieva",1998,"toctonalieva98gmail.com");
        Students students1 = new Students("Sam","Scavo",1996,"sam75gmail.com");
        Students students2 = new Students("Maik","Deifino",1999,"Delfino43gmail.com");
        Students students3 = new Students("Bree","Hotch",1995,"breehotch95gmail.com");
        System.out.println(students );
        System.out.println(students1);
        System.out.println(students2);
        System.out.println(students3);

        Group group = new Group(new Students[]{students3,students2},"Java","05.12.2022",5);
        Group group1 = new Group(new Students[]{students,students1},"Java","01.09.2022",4);
        System.out.println("First group: " +group + "Second group : " + group1);

        Course course = new Course("Java","Timur",new Group[]{group,group1});
        System.out.println(course);

    }
}