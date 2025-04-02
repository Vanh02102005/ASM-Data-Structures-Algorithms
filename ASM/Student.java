/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author nguye
 */
public class Student {
    private int ID;
    private String Name;
    private double Mark;  

    public Student(int ID, String Name, double Mark) {
        this.ID = ID;
        this.Name = Name;
        this.Mark = Mark;
    }
    public String getRank() {
        if (Mark < 5.0) return "Fail";
        else if (Mark < 6.5) return "Medium";
        else if (Mark < 7.5) return "Good";
        else if (Mark < 9.0) return "Very Good";
        else return "Excellent";
    }
    public double getMarks() {
        return Mark;
    }
    public void setMarks(double marks) {
        this.Mark = marks;
    }
    public int getID(){
        return ID;
    }
    public void setId(int id) {
        this.ID = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }   
    @Override
    public String toString() {
        return "Student{" + "ID = " + ID + ", Name = '" + Name + '\'' + ", Mark = " + Mark + ", Rank = " + getRank() + 
               '}';
    }
}

