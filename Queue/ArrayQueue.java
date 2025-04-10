/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author nguye
 */
public class ArrayQueue {
     Node[] a;  
    int max;  
    int first, last;  
    int size;  

    public ArrayQueue(int max) {  
        this.max = max;  
        a = new Node[max];  
        first = last = 0;  
        size = 0;  
    }  

    public boolean isEmpty() {  
        return size == 0;  
    }  

    public boolean isFull() {  
        return (size == max);  
    }  

    public void enqueue(Node X) {  
        if (isFull()) {  
            System.out.println("Stack is Full");  
            return;  
        }  
        size++;  
        a[last] = X;  
        last++;  
        if (last == max) {  
            last = 0;  
        }  
    }  

    public Node dequeue() {  
        if (isEmpty()) {  
            System.out.println("Stack is Empty");  
            return null;  
        }  
        size--;  
        Node X = a[first];  
        first++;  
        return X;  
    }  

    public void print() {  
        for (int i = 0; i < size; i++)  
            System.out.println(a[i].data);  
    }  
}
