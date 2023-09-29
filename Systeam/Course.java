package Systeam;

import java.util.Scanner;

public class Course {
       public Scanner scanner = new Scanner(System.in);
       private int courseCode;
       private StringBuilder title;
       private StringBuilder instructor;
       private  int maximumCapacity;

       public Course(){
              courseCode=0;
              title=new StringBuilder(" ");
              instructor=new StringBuilder(" ");
              maximumCapacity =60;

       }
       public Course(int coursecode,String courseTitle,String instructor,int max ){
              title=new StringBuilder(courseTitle);
              this.instructor =new StringBuilder(instructor);
              this.courseCode=coursecode;
              this.maximumCapacity=max;

       }
       public void setCourseCode(int courseCode) {
              this.courseCode = courseCode;
       }
       public void setTitle(String temp) {
           this.title.append(temp);
       }
       public void setInstructor(String temp) {
           this.instructor.append(temp);
       }
       public void setMaximumCapacity(int maximumCapacity) {
              this.maximumCapacity = maximumCapacity;
       }
       public int getCourseCode() {
              return courseCode;
       }
       public StringBuilder getTitle() {
              return title;
       }
       public StringBuilder getInstructor() {
              return instructor;
       }
       public int getMaximumCapacity() {
              return maximumCapacity;
       }

}
