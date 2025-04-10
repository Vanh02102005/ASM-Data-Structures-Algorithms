/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author nguye
 */
public class LinearTimeComplexity {
    public static void printArray(int[] arr) {  
        for (int num : arr) {  
            System.out.print(num + " ");
        }  
        System.out.println();
    }  

    public static void main(String[] args) {  
        int[] arr = {10, 20, 30, 40, 50};  
        printArray(arr);  
    }  
}
