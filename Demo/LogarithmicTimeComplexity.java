/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author nguye
 */
public class LogarithmicTimeComplexity {
     public static int binarySearch(int[] arr, int key) {  
        int left = 0, right = arr.length - 1;  
        while (left <= right) {  
            int mid = left + (right - left) / 2;  
            if (arr[mid] == key) {  
                return mid;  
            } else if (arr[mid] < key) {  
                left = mid + 1;  
            } else {  
                right = mid - 1;  
            }  
        }  
        return -1;
    }  

    public static void main(String[] args) {  
        int[] arr = {10, 20, 30, 40, 50};  
        int key = 30;  
        int result = binarySearch(arr, key);  
        System.out.println(result != -1 ? "Element found at index " + result : "Element not found");  
    }  
}
