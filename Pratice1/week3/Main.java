package Pratice1.week3;
//Part 1 done - Class Name
public class Main {
    public static void main(String[] args) {

        //Part 2 - Demonstrate
        System.out.println(Student.getTotalStudent());

        Student name1 = new Student(2510818, "red cyrus", "F", "Oloresisimo", "male", "email@" );
        Student name2 = new Student(111, "red cyrus", "F", "Oloresisimo", "male", "email@" );
        Student name3 = new Student(111, "red cyrus", "F", "Oloresisimo", "male", "email@" );
        System.out.println(Student.getTotalStudent());

        System.out.println(Course.getSchoolName());

        Course course = new Course("Cs101", "Introduction Programming");
        
        course.enrollStudents(name1);
        course.enrollStudents(name2);
        course.displayCourseInfo();

    }
}
