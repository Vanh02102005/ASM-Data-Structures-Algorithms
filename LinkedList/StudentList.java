/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author nguye
 */
public class StudentList {
    private Node head;  
    private Node tail;   
    
    private boolean isEmpty() {  
        return head == null;  
    }  
    
    public void add(Student s) {  
        Node q = new Node(s);  
        if (isEmpty()) {  
            head = tail = q;  
        } else {  
            tail.next = q;  
            tail = q;  
        }  
    }  
    
    public void addMany(Student[] students) {  
        for (Student s : students) {  
            add(s);  
        }  
    }  
    
    public void traverse() {  
        Node p = head;  
        while (p != null) {  
            System.out.println(p.student.toString());  
            p = p.next;  
        }  
    }  
    
    public boolean updateStudent(int id, int newId, String newName, double newMarks) {  
        Node p = head;  
        while (p != null) {  
            if (p.student.getID() == id) {  
                p.student.setId(newId);  
                p.student.setName(newName);  
                p.student.setMarks(newMarks);  
                return true;  
            }  
            p = p.next;  
        }  
        return false;  
    }  
    
    public boolean deleteStudent(int id) {  
        if (isEmpty()) return false;  
        if (head.student.getID() == id) {  
            head = head.next;  
            if (head == null) tail = null;  
            return true;  
        }  
        Node prev = head, curr = head.next;  
        while (curr != null) {  
            if (curr.student.getID() == id) {  
                prev.next = curr.next;  
                if (curr == tail) tail = prev;  
                return true;  
            }  
            prev = curr;  
            curr = curr.next;  
        }  
        return false; 
    } 
}