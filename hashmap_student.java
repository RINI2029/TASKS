import java.util.HashMap;
import java.util.Scanner;

public class hashmap_student
{
    private final HashMap<String, Integer> studentGrades = new HashMap<>();
    public void addStudent(String name, int grade)
    {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    public void removeStudent(String name)
    {
        if (studentGrades.containsKey(name))
        {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public void displayStudentGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Student " + name + " has a grade of " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        hashmap_student sg = new hashmap_student();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions: \n1. Add Student \n2. Remove Student \n3. Display Student Grade \n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    sg.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    sg.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.nextLine();
                    sg.displayStudentGrade(displayName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
