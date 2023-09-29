package Systeam;

import java.security.PublicKey;

public  class Reports extends university {
    private Student getStudentById(int studId,university uni){
        for(Student stu:uni.getStudents()){
            if(stu.getId()==studId){
                return stu;
            }
        }
        return null;
    }
//    private Course getCourseById(int corseid){
//        for()
//
//    }
//    a. A report of all available courses in the university.
//    b. A report of courses in which a specific student is enrolled.
//    c. A report of students enrolled in a specific course.
//    d. A report that includes all the reports mentioned above.

    public void allAvalabliCourses(university uni){
        System.out.println("all avalable courses in the collage ");
        for (Course cor:uni.getExcestedCourses()){
            System.out.print(cor.getCourseCode()+"\t");
            System.out.print(cor.getTitle()+"\t");
            System.out.print(cor.getInstructor()+"\t");
            System.out.print(cor.getMaximumCapacity()+"\n");
        }

    }
    public  void singleStudentCourses(university uni,int stuId){
        System.out.println(getStudentById(stuId,uni).getName()+" corses");
        for(Student stu:uni.getStudents()){
            if(stu.getId()==stuId){
                for(Course cor:stu.getEnrolledCourseList()){
                    System.out.print(cor.getCourseCode()+"\t");
                    System.out.print(cor.getTitle()+"\t");
                    System.out.print(cor.getInstructor()+"\t");
                    System.out.print(cor.getMaximumCapacity()+"\n");
                }
            }
        }

    }
    public void singleCourseStudents(university uni,int courseId){

                System.out.println(getCourseById(courseId).getTitle()+" students");
                for (Student stu: uni.getStudents()){
                    for(Course cor:stu.getEnrolledCourseList()){
                        if(cor.getCourseCode()==courseId){
                            System.out.print(stu.getId()+"\t");
                            System.out.print(stu.getName()+"\t");
                            System.out.print(stu.getEmail()+"\n");

                        }
                    }
                }
    }
    public void generalReport(university uni){

    }


}
