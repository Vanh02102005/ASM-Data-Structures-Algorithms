/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author nguye
 */
public class Student {
    private int id;  
    private String name;  
    private double marks;  
    private String rank;  

    public Student(int id, String name, double marks) {  
        this.id = id;  
        this.name = name;  
        this.marks = marks;  
        this.rank = calculateRank(marks);  
    }  

    private String calculateRank(double marks) {  
        if (marks >= 8.0) {  
            return "Very Good";  
        } else if (marks >= 6.5) {  
            return "Good";  
        } else {  
            return "Average";  
        }  
    }  

    public int getID() {  
        return id;  
    }  

    public String getName() {  
        return name;  
    }  

    public double getMarks() {  
        return marks;  
    }  

    public String getRank() {  
        return rank;  
    }  

    // ✅ Thêm các setter để sửa lỗi trong updateStudent
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        this.rank = calculateRank(marks); // Cập nhật lại xếp loại khi điểm thay đổi
    }

    @Override  
    public String toString() {  
        return "Student{ID = " + id + ", Name = '" + name + "', Mark = " + marks + ", Rank = " + rank + "}";  
    }  
}