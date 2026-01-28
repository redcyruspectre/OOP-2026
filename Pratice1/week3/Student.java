package Pratice1.week3;
public class Student {
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;
    static int totalStudent = 0;

    public Student(){
    public  displayStudentInfo(int studentId, String firstName, String middleName, String lastName, String gender, String email){

    this.studentId = studentId;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.gender = gender;
    this.email = email;
    

    }
    public static int getTotalStudent(){
    totalStudents();

        }
    }
}
