package Systeam;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class universite {
    public Scanner scanner = new Scanner(System.in);
    private Set<Student> students;
    private Set <Course> excestedCourses;

    public universite(){
         students=new HashSet<>();
         excestedCourses=new HashSet<>();
    }

    public void addStudent(){
            Student studentTemp=new Student();
            System.out.println("Enter the name of student \n");
            studentTemp.setName(new StringBuilder(scanner.next()));
            System.out.println("Enter student id \n");
            studentTemp.setId(scanner.nextInt());
            System.out.println("Enter student email \n");
            studentTemp.setEmail(new StringBuilder(scanner.next()));
            students.add(studentTemp);
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


    public void enrollStudent(int studentId,int courseId){
        for (Student stu:students){
            if(stu.getId()==studentId){
                stu.addCourse(courseId);
            }
        }
    }


    public void printStudent(){
        for(Student temp: students){
            System.out.println(temp.getName());

                if(temp.getEnrolledCourseList().isEmpty())break;
                else{
                    for(Integer courseId:temp.getEnrolledCourseList()){
                        try {
                            System.out.println(getCourseById(courseId).getTitle());
                        }
                        catch (Exception err){
                            System.out.println(err.getMessage());
                        }

                    }
                }


        }
    }
    public void printCourses(){
        for(Course temp: excestedCourses){
           System.out.println(temp.getTitle()+"\n");
        }
    }

    private Course getCourseById(int courseId){
        for(Course temp:excestedCourses){
            if(temp.getCourseCode()==courseId){
                return temp;
            }
        }
          return null;
    }



    public void generateReports(){

    }

}
