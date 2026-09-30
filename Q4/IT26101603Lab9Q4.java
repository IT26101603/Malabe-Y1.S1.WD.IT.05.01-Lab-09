import java.util.Scanner;

public class IT26101603Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println("Name: " + name);
        System.out.println("Final Mark: " + finalMark);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            double exam = input.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);

            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);

            input.nextLine();
        }
    }
}