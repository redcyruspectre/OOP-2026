package Pratice1.week3;
//Part 1 done - Class Name
public class Student {
    //Part 2 done - Instance Fields
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;
    //Part 3 done - Static Field
    static int totalStudent = 0;

    public Student(){}
    
    //Part 4 done - Constructor - that prints the details for the student
     public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email){
    
    this.studentId = studentId;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.gender = gender;
    this.email = email;
    totalStudent++;
    
    }
    //Part 5 done - Instance Method
    public void displayStudentInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
    }   
    //Part 6 done - Static Method
    public static int getTotalStudent(){
    
    return totalStudent;
    }
}
