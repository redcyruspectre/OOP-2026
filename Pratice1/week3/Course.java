package Pratice1.week3;

//part 1 done - Course name
public class Course {
    // part 2 done - Instance Fields
    String courseCode;
    String courseTitle;

    Student[] enrolledStudents;
    int enrollementCount = 0;
    // part 3 done - Static Field
    static String schoolName = "My University";

    public Course() {
    }

    public Course(String courseCode, String courseTitle) {
        // part 4 done - Constructor
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];
    }

    // part 5 - Instance Methods
    public void enrollStudents(Student student) {
  enrolledStudents[enrollementCount]=student;
  enrollementCount++;
    }

    public void displayCourseInfo(){

        for (int i = 0; i <enrollementCount;i++ ){
         enrolledStudents[i].displayStudentInfo();
        }
       }

    // part 6 done - Static Method
    public static String getSchoolName() {
        return schoolName;
    }
}
