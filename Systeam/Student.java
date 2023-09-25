package Systeam;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Student {
    public Scanner scanner = new Scanner(System.in);
    private int id;
    private StringBuilder name;
    private StringBuilder email;
    private Set<Integer> enrolledCourseList;
    public Student(){
        id=0;
        name=new StringBuilder();
        enrolledCourseList=new HashSet<>();
        email=new StringBuilder();
    }


    public void setName(StringBuilder temp) {

        this.name.append(temp.toString());

    }
    public void setEmail(StringBuilder temp) {
        this.name.append(temp.toString());
    }
    public Student(int id, StringBuilder email, StringBuilder name, Set<Integer> enrolledCourseList) {
        this.id = id;
        this.email = email;
        this.enrolledCourseList = enrolledCourseList;
        this.name=name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void addCourse(Integer courseId) {
        this.enrolledCourseList.add(courseId);
    }
    public int getId() {
        return id;
    }
    public StringBuilder getEmail() {
        return email;
    }
    public Set<Integer> getEnrolledCourseList() {
        return enrolledCourseList;
    }
    public StringBuilder getName() {
        return name;
    }
    public void removeCourse(int courseId){
        enrolledCourseList.remove(courseId);
    }
}
