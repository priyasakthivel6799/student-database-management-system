
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks in 5 Subjects: ");

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            int mark = sc.nextInt();
            total += mark;
        }

        double average = total / 5.0;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade: A+");
        else if (average >= 80)
            System.out.println("Grade: A");
        else if (average >= 70)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else if (average >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: Fail");

        sc.close();
    }
}
