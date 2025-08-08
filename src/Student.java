class Student {
    String name = "";
    int age = 0;
    String course = "";
    double grade1 = 0;
    double grade2 = 0;
    double grade3 = 0;
    double average = 0;

    public Student(String studentName, int studentAge, String studentCourse,double studentGrade1, double studentGrade2, double studentGrade3  ) {

        name = studentName;
        age = studentAge;
        course = studentCourse;
        grade1 = studentGrade1;
        grade2 = studentGrade2;
        grade3 = studentGrade3;

    }
    public void displayInfo() {
        System.out.println("Name:" + name );
        System.out.println("Age:" + age );
        System.out.println("Course:" + course);
        System.out.println("Grade 1:" + grade1);
        System.out.println("Grade 2:" + grade2);
        System.out.println("Grade 3:" + grade3);
    }
    public void calculateAverage(){
        System.out.println("Name: " + name);
        average = (grade1 + grade2 + grade3) / 3.0;
        average = Math.round(average);
        System.out.println("Average: " + average);

    }
    public void getLetterGrade(){
        System.out.println("Name:" + name);
        if(average >= 90){
            System.out.println("Letter Grade is A");
        }
        else if(average >= 80 || average <= 89){
            System.out.println("Letter Grade is B");
        } else if (average >= 70 || average <= 79) {
            System.out.println("Letter Grade is C");
        }
        else if (average >= 60 || average <= 79) {
            System.out.println("Letter Grade is D");
        } else if (average < 60) {
            System.out.println("Letter Grade is F");

        }
    }
    public void isPassing(){
        System.out.println("Name:" + name);
        if(average >= 75){
            System.out.println("PASSING");
        }
        else{
            System.out.println("FAILED");
        }
    }
}
