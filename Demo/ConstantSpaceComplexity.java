/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author nguye
 */
public class ConstantSpaceComplexity {
    public static int sumArray(int[] arr) {  
        int sum = 0;
        for (int num : arr) {  
            sum += num;  
        }  
        return sum;  
    }  

    public static void main(String[] args) {  
        int[] arr = {10, 20, 30, 40, 50};  
        System.out.println("Sum: " + sumArray(arr));  
    }  
}
