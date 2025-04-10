/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author nguye
 */
import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        ArrayStack stack = new ArrayStack(5);    
        System.out.print("Enter the number of buttons: ");  
        int n = scanner.nextInt();  
        if (n > 5) {  
            System.out.println("Number of buttons must not exceed 5.");  
            return;  
        }  
        for (int i = 0; i < n; i++) {  
            System.out.print("Enter value for button " + (i + 1) + ": ");  
            int value = scanner.nextInt();  
            Node node = new Node(value);  
            stack.push(node);  
        }  

        System.out.println("Stack:");  
        stack.print();    
        Node poppedNode = stack.pop();  
        if (poppedNode != null) {  
        }  
        System.out.println("Stack after pop:");  
        stack.print();  
        scanner.close();  
    }  
}  
