
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Student {
    Main() {
        super("", new ArrayList<Double>());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter student name: ");
            String name = sc.next();

            ArrayList<Double> marks = new ArrayList<>();

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            for (int j = 0; j < subjects; j++) {
                double mark;

                do {
                    System.out.print("Enter mark (0-100): ");
                    mark = sc.nextDouble();

                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid mark. Try again.");
                    }
                } while (mark < 0 || mark > 100);

                marks.add(mark);
            }
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        System.out.println("\n===== STUDENT GRADE REPORT =====");
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "Name", "Average", "Highest", "Lowest");

        for (Student s : students) {
            System.out.printf("%-20s %-10.2f %-10.2f %-10.2f%n",
                    s.name, s.average(), s.highest(), s.lowest());
        }

        sc.close();
    }
}
