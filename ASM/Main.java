/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author nguye
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentBST studentTree = new StudentBST();
        while (true) {
            System.out.println("\n------ STUDENT MANAGEMENT SYSTEM ------");
            System.out.println("1. Add students");
            System.out.println("2. Update students");
            System.out.println("3. Sort students by marks");
            System.out.println("4. Search student");
            System.out.println("5. Delete students");
            System.out.println("6. Display students");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = checkIntegerInput(scanner);
            switch (choice) {
                case 1:
                    System.out.print("Enter number of students: ");
                    int n = checkIntegerInput(scanner);
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter ID: ");
                        int id = checkIntegerInput(scanner);
                        System.out.print("Enter name: ");
                        String name = checkNameInput(scanner);
                        System.out.print("Enter mark (0 - 10): ");
                        double mark = checkDoubleInput(scanner);
                        studentTree.insert(new Student(id, name, mark));
                    }
                    break;
                case 2:
                    System.out.print("Enter student ID to update: ");
                    int updateID = checkIntegerInput(scanner);
                    System.out.print("Enter new name: ");
                    String newName = checkNameInput(scanner);
                    System.out.print("Enter new mark (0 - 10): ");
                    double newMark = checkDoubleInput(scanner);
                    studentTree.updateStudent(updateID, newName, newMark);
                    break;
                case 3:
                    System.out.println("Select sort type: ");
                    System.out.println("1.Quick Sort (Ascending)");
                    System.out.println("2.Bubble Sort (Descending)");
                    int sortChoice = checkIntegerInput(scanner);
                    studentTree.sortByMarks(sortChoice == 1);
                    break;
                case 4:
                    System.out.println("Select search type: ");
                    System.out.println("1. Binary Search");
                    System.out.println("2. Linear Search");
                    int searchChoice = checkIntegerInput(scanner);
                    System.out.print("Enter student ID to search: ");
                    int searchID = checkIntegerInput(scanner);
                    Student result = (searchChoice == 1) ? studentTree.Binarysearch(searchID) : studentTree.linearSearch(searchID);
                    System.out.println(result != null ? result : "Student not found!");
                    break;
                case 5:
                    System.out.print("Enter student ID to delete: ");
                    studentTree.delete(checkIntegerInput(scanner));
                    break;
                case 6:
                    System.out.println("Choose traversal type:");
                    System.out.println("1. Pre-order");
                    System.out.println("2. In-order");
                    System.out.println("3. Post-order");
                    int traversalChoice = checkIntegerInput(scanner);
                    switch (traversalChoice) {
                        case 1:
                            studentTree.preOrder();
                            break;
                        case 2:
                            studentTree.inOrder();
                            break;
                        case 3:
                            studentTree.postOrder();
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 7:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static int checkIntegerInput(Scanner scanner) {
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num < 0) throw new NumberFormatException();
                return num;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }

    public static String checkNameInput(Scanner scanner) {
        while (true) {
            String name = scanner.nextLine().trim();
            if (name.matches("^[a-zA-Z ]+$")) 
                return name;
            System.out.print("Please enter Name as letters: ");
        }
    }

    public static double checkDoubleInput(Scanner scanner) {
        while (true) {
            try {
                double num = Double.parseDouble(scanner.nextLine());
                if (num < 0 || num > 10) throw new NumberFormatException();
                return num;
            } catch (NumberFormatException e) {
                System.out.print("Please enter Mark as a number(0 - 10): ");
            }
        }
    }
}
