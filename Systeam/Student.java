package Systeam;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Student {
    public Scanner scanner = new Scanner(System.in);
    private int id;
    private StringBuilder name;
    private StringBuilder email;
    private Set<Course> enrolledCourseList;
    public Student(){
        id=0;
        name=new StringBuilder();
        enrolledCourseList=new HashSet<>();
        email=new StringBuilder();
    }
    public Student(int id, String email, String name) {
        this.id = id;
        this.email = new StringBuilder(email);
        this.name=new StringBuilder(name);
        this.enrolledCourseList=new HashSet<>();
    }


    public void setName(String temp) {

        this.name.append(temp);

    }
    public void setEmail(String temp) {
        this.name.append(temp);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void addCourse(Course course) {
        this.enrolledCourseList.add(course);
    }
    public int getId() {
        return id;
    }
    public StringBuilder getEmail() {
        return email;
    }
    public Set<Course> getEnrolledCourseList() {
        return enrolledCourseList;
    }
    public StringBuilder getName() {
        return name;
    }
    public void removeCourse(int courseId){
        enrolledCourseList.removeIf(corse -> corse.getCourseCode() == courseId);

    }
}
