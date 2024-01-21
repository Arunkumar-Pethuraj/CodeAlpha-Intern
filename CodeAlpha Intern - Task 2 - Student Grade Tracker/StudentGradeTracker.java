import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student {
    String name;
    ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student name (or 'q' to quit):");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("q")) {
                break;
            }

            Student student = new Student(name);
            students.add(student);

            while (true) {
                System.out.println("Enter student grade (or 'q' to quit):");
                String gradeInput = scanner.nextLine();
                if (gradeInput.equalsIgnoreCase("q")) {
                    break;
                }

                int grade = Integer.parseInt(gradeInput);
                student.addGrade(grade);
            }
        }

        for (Student student : students) {
            System.out.println("\nStudent: " + student.name);

            int sum = 0;
            for (int grade : student.grades) {
                sum += grade;
            }
            int average = sum / student.grades.size();
            System.out.println("Average Grade: " + average);

            int highest = Collections.max(student.grades);
            System.out.println("Highest Grade: " + highest);

            int lowest = Collections.min(student.grades);
            System.out.println("Lowest Grade: " + lowest);
        }
        scanner.close();
    }
}
