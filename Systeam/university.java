package Systeam;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Scanner;


public class university {
    public Scanner scanner = new Scanner(System.in);
    private Set<Student> students;

    private Set <Course> excestedCourses;






    public Set<Student> getStudents() {
        return students;
    }
    public Set<Course> getExcestedCourses() {
        return excestedCourses;
    }
    public university(){
         students=new HashSet<>();
         excestedCourses=new HashSet<>();
    }
    public void addStudent(){
            Student studentTemp=new Student();
            System.out.println("Enter the name of student \n");
            studentTemp.setName(scanner.next());
            System.out.println("Enter student id \n");
            studentTemp.setId(scanner.nextInt());
            System.out.println("Enter student email \n");
            studentTemp.setEmail(scanner.next());
            students.add(studentTemp);
    }
    public void addStudent(int id,String name,String email){
        Student temp=new Student(id,email,name);
        students.add(temp);
    }
    public  void addCourse(){
        Course courseTemp=new Course();
            System.out.println("Enter course code \n");
            courseTemp.setCourseCode(scanner.nextInt());
            System.out.println("Enter your course title");
            courseTemp.setTitle(scanner.next());
            System.out.println("Enter you course instructor name");
            courseTemp.setInstructor(scanner.next());
            System.out.println("Enter the maximum capacity of the course\n");
            courseTemp.setMaximumCapacity(scanner.nextInt());
            excestedCourses.add(courseTemp);
    }
    public  void addCourse(int code,String title,String instructor,int max){
        Course temp=new Course();
        temp.setCourseCode(code);
        temp.setMaximumCapacity(max);
        temp.setInstructor(instructor);
        temp.setTitle(title);
        excestedCourses.add(temp);
    }
    public void enrollStudent(int studentId,int courseId){
        for (Student stu:students){
            if(stu.getId()==studentId){
                stu.addCourse(getCourseById(courseId));
            }
        }
    }
    public void dropStudent(int studentId,int courseId){
        for (Student stu:students){
            if(stu.getId()==studentId){
                stu.removeCourse(courseId);
            }
        }
    }
    public Course getCourseById(int courseId){

        for(Course cor:this.getExcestedCourses()){
            if(cor.getCourseCode()==courseId){
                return cor;
            }
        }
        return null;
    }
}
