/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author nguye
 */
public class Node {
    Student student;
    Node left, right;
    public Node( Student student){
        this.student = student;
        this.left = this.right = null;
    }
}



