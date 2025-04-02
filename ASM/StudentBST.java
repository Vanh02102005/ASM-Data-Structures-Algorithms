/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;
/**
 *
 * @author nguye
 */
//Binary Search Tree:Cấu trúc dữ liệu chính để lưu trữ danh sách sinh viên.
public class StudentBST {
     private Node root;

    public StudentBST() {
        root = null;
    }

    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private Node insertRec(Node root, Student student) {
        if (root == null) return new Node(student);
        if (student.getID() < root.student.getID()) root.left = insertRec(root.left, student);
        else if (student.getID() > root.student.getID()) root.right = insertRec(root.right, student);
        return root;
    }
// Thuật toán tìm kiếm Binary Search
    public Student Binarysearch(int id) {
        Node node = searchRec(root, id);
        return (node != null) ? node.student : null;
    }
// Thuật toán tìm kiếm Linear Search 
    public Student linearSearch(int id) {
        int size = countNodes(root);
        Student[] list = new Student[size];
        int[] index = {0};
        getStudentsInOrder(root, list, index);
        for (int i = 0; i < size; i++) {
        if (list[i].getID() == id) {
            return list[i];
        }
    }
     return null;
    }
   private Node searchRec(Node root, int id) {
      if (root == null || root.student.getID() == id) return root;
     return (id < root.student.getID()) ? searchRec(root.left, id) : searchRec(root.right, id);
    } 
    public void delete(int id) {
        root = deleteRec(root, id);
    }

    private Node deleteRec(Node root, int id) {
        if (root == null) return root;
        if (id < root.student.getID()) root.left = deleteRec(root.left, id);
        else if (id > root.student.getID()) root.right = deleteRec(root.right, id);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.student = minNode(root.right);
            root.right = deleteRec(root.right, root.student.getID());
        }
        return root;
    }

    private Student minNode(Node root) {
        while (root.left != null) root = root.left;
        return root.student;
    }

    public void preOrder() { preOrderRec(root); }
    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.student);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void inOrder() { inOrderRec(root); }
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.student);
            inOrderRec(root.right);
        }
    }

    public void postOrder() { postOrderRec(root); }
    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.student);
        }
    }

    private void getStudentsInOrder(Node root, Student[] list, int[] index) {
       if (root != null) {
           getStudentsInOrder(root.left, list, index);
           list[index[0]++] = root.student;
           getStudentsInOrder(root.right, list, index);
       }
   }

   public void sortByMarks(boolean ascending) {
       int size = countNodes(root);
       Student[] list = new Student[size];
       int[] index = {0};
       getStudentsInOrder(root, list, index);

       if (ascending) {
           bubbleSort(list, size);
       } else {
           quickSort(list, 0, size - 1);
       }

       for (Student student : list) {
           System.out.println(student);
       }
   }

   private int countNodes(Node root) {
       if (root == null) return 0;
       return 1 + countNodes(root.left) + countNodes(root.right);
   }

   private void bubbleSort(Student[] list, int n) {
       for (int i = 0; i < n - 1; i++) {
           for (int j = n - 1; j > i; j--) {
               if (list[j].getMarks() < list[j - 1].getMarks()) {
                   Student temp = list[j];
                   list[j] = list[j - 1];
                   list[j - 1] = temp;
               }
           }
       }
   }

   private void quickSort(Student[] list, int low, int high) {
       if (low < high) {
           int pi = partition(list, low, high);
           quickSort(list, low, pi - 1);
           quickSort(list, pi + 1, high);
       }
   }

   private int partition(Student[] list, int low, int high) {
       double pivot = list[high].getMarks();
       int i = low - 1;
       for (int j = low; j < high; j++) {
           if (list[j].getMarks() >= pivot) {
               i++;
               Student temp = list[i];
               list[i] = list[j];
               list[j] = temp;
           }
       }
       Student temp = list[i + 1];
       list[i + 1] = list[high];
       list[high] = temp;
       return i + 1;
   }

    public void updateStudent(int id, String name, double marks) {
        Node node = searchRec(root, id);
        if (node != null) {
            node.student.setName(name);
            node.student.setMarks(marks);
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}