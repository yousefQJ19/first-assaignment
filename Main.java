import Systeam.universite;


public class Main {
   public static void main(String [] args){
      universite uni=new universite();

      uni.addCourse();
      uni.addCourse();
      uni.addCourse();
      uni.addStudent();
      uni.enrollStudent(1234,1234);
      uni.enrollStudent(1234,12345);
      uni.enrollStudent(1234,123456);

      uni.printStudent();
      //uni.printCourses();


   }
}
