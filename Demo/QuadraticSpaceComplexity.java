/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author nguye
 */
public class QuadraticSpaceComplexity {
     public static int[][] createMatrix(int n) {  
        int[][] matrix = new int[n][n];
        return matrix;  
    }  

    public static void main(String[] args) {  
        int n = 3;  
        int[][] matrix = createMatrix(n);  
        
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {  
                System.out.print(matrix[i][j] + " ");  
            }  
            System.out.println();
        }  
    }
}
