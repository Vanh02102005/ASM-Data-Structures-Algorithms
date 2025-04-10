/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author nguye
 */
import java.util.Scanner;  
public class Main {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        ArrayQueue queue = new ArrayQueue(5); 
        System.out.println("Enter the number to add to the expected row:");  
        while (true) {  
            int input = scanner.nextInt();
            if (input == -1) {  
                break;  
            }  
            queue.enqueue(new Node(input));  
        }  
        System.out.println("Queue:");  
        queue.print();  
        Node dequeuedNode = queue.dequeue();  
        System.out.println("Dequeued: " + (dequeuedNode != null ? dequeuedNode.data : "null"));   
        System.out.println("Queue after dequeue:");  
        queue.print();  
        scanner.close(); 
    }  
}
