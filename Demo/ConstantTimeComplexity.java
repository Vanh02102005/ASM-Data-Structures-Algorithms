/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author nguye
 */
public class ConstantTimeComplexity {
     public static int getFirstElement(int[] arr) {  
        return arr[0];  
    }  

    public static void main(String[] args) {  
        int[] arr = {10, 20, 30, 40, 50};  
        System.out.println("First element: " + getFirstElement(arr));  
    }  
}
