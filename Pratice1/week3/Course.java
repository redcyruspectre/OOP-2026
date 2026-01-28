package Pratice1.week3;
public class Course {
    String courseCode;
    String courseTitle;

    Student [] enrollmentStudent;
    int enrollementCount = 0;
    static String schoolName = "My University";
   
    
    public Course(){}
    public Course(String courseCode, String courseTitle, Student [] enrollmentStudent, ){

        this.enrollementCount = new Student[50];

    }
}
