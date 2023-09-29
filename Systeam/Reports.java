package Systeam;


import java.util.Objects;

public  class Reports  {
    private static Student getStudentById(int studId,university uni){
        for(Student stu:uni.getStudents()){
            if(stu.getId()==studId){
                return stu;
            }
        }
        return null;
    }
    public static void allAvalabliCourses(university uni){
        System.out.println("all available courses in the collage ");
        for (Course cor:uni.getExcestedCourses()){
            System.out.print(cor.getCourseCode()+"\t");
            System.out.print(cor.getTitle()+"\t");
            System.out.print(cor.getInstructor()+"\t");
            System.out.print(cor.getMaximumCapacity()+"\n");
        }

    }
    public static void singleStudentCourses(university uni,int stuId){
        System.out.println(Objects.requireNonNull(getStudentById(stuId, uni)).getName()+" courses");
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
    public static void singleCourseStudents(university uni,int courseId){

                for(Course cor: uni.getExcestedCourses()){
                    if(cor.getCourseCode()==courseId){
                        System.out.println(cor.getTitle()+" students\n");
                    }
                }
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
    public static void generalReport(university uni){
        allAvalabliCourses(uni);
        System.out.println("\n");
        System.out.println("<-Students reports->" +"\n");

        for(Student stu:uni.getStudents()){
            singleStudentCourses(uni,stu.getId());
            System.out.println("\n");
        }
        System.out.println("\n");

        System.out.println("<-Courses report->"+"\n");

        for (Course cor:uni.getExcestedCourses()){
            singleCourseStudents(uni,cor.getCourseCode());
            System.out.println("\n");

        }


    }



}
