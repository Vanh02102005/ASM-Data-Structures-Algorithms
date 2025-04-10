/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author nguye
 */
public class ArrayStack {
     Node[] a;  
    int top, max;  
    public ArrayStack(int max) {  
        this.max = max;  
        top = -1;  
        a = new Node[max];  
    }  

    public boolean isEmpty() {  
        return top == -1;  
    }  

    public boolean isFull() {  
        return top == max - 1;  
    }  

    public void push(Node x) {  
        if (isFull()) {  
            System.out.println("Stack is full");  
            return;  
        }  
        top++;  
        a[top] = x;  
    }  

    public Node pop() {  
        if (isEmpty()) {  
            System.out.println("Stack is empty");  
            return null;  
        }  
        Node x = a[top];  
        top--;  
        return x;  
    }  

    public void print() {  
        for (int i = 0; i <= top; i++) {  
            a[i].printNode();  
        }  
    }  
}
