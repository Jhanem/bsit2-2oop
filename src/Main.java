//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Christian Cabalde", 18, "BSIT", 71.0, 71.0, 71.5);
        Student student2 = new Student("Johnden Llatuna", 20, "BSIT", 85.0, 75.8, 85.5);
        Student student3 = new Student("Jose Malong", 40, "BSIT", 99.9, 92.0, 94.7);

        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        student3.displayInfo();
        System.out.println();
        student1.calculateAverage();
        System.out.println();
        student2.calculateAverage();
        System.out.println();
        student3.calculateAverage();
        System.out.println();
        student1.getLetterGrade();
        System.out.println();
        student2.getLetterGrade();
        System.out.println();
        student3.getLetterGrade();
        System.out.println();
        student1.isPassing();
        System.out.println();
        student2.isPassing();
        System.out.println();
        student3.isPassing();
    }
}
