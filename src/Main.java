import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        System.out.println("Input your Student Id, FirstName, LastName, Course, Section.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your Id: ");
        String studentId = scanner.nextLine();

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Course: ");
        String course = scanner.nextLine();

        System.out.println("Section: ");
        String section = scanner.nextLine();

        System.out.println("STUDENT INFORMATION");
        System.out.println("student id: " + studentId );
        System.out.println("student name: " + firstName + lastName );
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.println(" ");
        System.out.println("Enter midterm Exam Score: ");
        int midtermExamScore = scanner.nextInt();
        System.out.println("Enter Final Exam Score : ");
        int finalExamScore = scanner.nextInt();
        System.out.println("Enter Project Score: ");
        int projectScore = scanner.nextInt();
        System.out.println("Enter Attendance Percentage: ");
        int attendancePercentage = scanner.nextInt();

        int allOverScore = midtermExamScore + finalExamScore + projectScore + attendancePercentage;
        int averageScore = allOverScore / 400;

        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermExamScore);
        System.out.println("Final Exam Score : " + finalExamScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendancePercentage);

        System.out.println(" ");
        System.out.println("Average Score: " + averageScore);
        if(averageScore < 75){
            System.out.println("Remarks: " + "Failed");
        }else{
            System.out.println("Remarks: " + "Passed");
        }



    }
}
