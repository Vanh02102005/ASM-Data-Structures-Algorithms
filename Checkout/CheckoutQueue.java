/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Checkout;

/**
 *
 * @author nguye
 */
public class CheckoutQueue {
    class Node {  
    String customer;  
    Node next;  

    public Node(String customer) {  
        this.customer = customer;  
        this.next = null;  
    }  
}   
    private Node front, rear;  

    public CheckoutQueue() {  
        this.front = this.rear = null;  
    }  

    public void arrive(String customer) {  
        Node newNode = new Node(customer);  
        System.out.println(customer + " arrives and joins the queue.");  
        if (rear == null) { 
            front = rear = newNode;  
            return;  
        }  
        rear.next = newNode;  
        rear = newNode;  
    }  

    public void processPayment() {  
        if (front == null) {  
            System.out.println("No customers in queue.");  
            return;  
        }  
        System.out.println("Processing payment for " + front.customer + "...");  
        System.out.println(front.customer + " has completed payment and leaves the queue.");  
        front = front.next;  
        if (front == null) {  
            rear = null;
        }  
    }  

    public static void main(String[] args) {  
        CheckoutQueue checkout = new CheckoutQueue();  
        checkout.arrive("Customer A");  
        checkout.arrive("Customer B");  
        checkout.arrive("Customer C");  
        checkout.processPayment();  
        checkout.processPayment();  
        checkout.processPayment();  
    }  
}  
