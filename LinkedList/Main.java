/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student number " + (i + 1) + ":");
            System.out.print("  ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print(" Name: ");
            String name = sc.nextLine();

            System.out.print(" Mark: ");
            double marks = Double.parseDouble(sc.nextLine());

            Student s = new Student(id, name, marks);
            list.add(s);
        }

        System.out.println("\n List of students:");
        list.traverse();

        // Cập nhật sinh viên
        System.out.print("\n Enter the student ID to be updated: ");
        int oldId = Integer.parseInt(sc.nextLine());

        System.out.print("  Enter new ID: ");
        int newId = Integer.parseInt(sc.nextLine());

        System.out.print("  Enter a new name: ");
        String newName = sc.nextLine();

        System.out.print("  Enter new marks: ");
        double newMarks = Double.parseDouble(sc.nextLine());

        boolean updated = list.updateStudent(oldId, newId, newName, newMarks);
        if (updated) {
            System.out.println("Update successful.");
        } else {
            System.out.println("No student found to update.");
        }

        System.out.println("\n List after update:");
        list.traverse();

        // Xóa sinh viên
        System.out.print("\n️ Enter the student ID to delete: ");
        int deleteId = Integer.parseInt(sc.nextLine());
        boolean deleted = list.deleteStudent(deleteId);

        if (deleted) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("No student found to delete.");
        }

        System.out.println("\n Final list:");
        list.traverse();

        sc.close();
    }
}