/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author nguye
 */
public class LinearSpaceComplexity {
     public static int[] storeSquares(int n) {  
        int[] squares = new int[n]; // Duy trì không gian cho n phần tử  
        for (int i = 0; i < n; i++) {  
            squares[i] = i * i; // Tính bình phương  
        }  
        return squares;  
    }  

    public static void main(String[] args) {  
        int n = 5;  
        int[] result = storeSquares(n);  
        for (int num : result) {  
            System.out.print(num + " ");  
        }  
        System.out.println(); // Xuống dòng sau khi in xong  
    }  
}
