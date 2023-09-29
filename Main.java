import Systeam.Reports;
import Systeam.university;


public class Main {
   public static void main(String [] args){
      university uni=new university();
       Reports rep=new Reports();
      uni.addCourse(1234,"math","noor",60);
      uni.addCourse(12345,"oop","ammar",60);
      uni.addCourse(123456,"ds","alaa",60);
      uni.addCourse(12028492,"web","ma7da",60);

      uni.addStudent(1234,"yousef","yousefa7a@gmail.com");
      uni.addStudent(12345,"ahmad","ahamd@gmail.com");
      uni.addStudent(123456,"kiki","kiki@gmail.com");

      uni.enrollStudent(1234,1234);
     uni.enrollStudent(1234,12345);
     uni.enrollStudent(1234,123456);

      uni.enrollStudent(1234,12028492);
      uni.enrollStudent(12345,12028492);
      uni.enrollStudent(123456,12028492);


      rep.allAvalabliCourses(uni);
      System.out.println();
      System.out.println();
      System.out.println();
     rep.singleCourseStudents(uni,1234);
      System.out.println();
      System.out.println();
      System.out.println();
    rep.singleStudentCourses(uni,1234);
   }
}
