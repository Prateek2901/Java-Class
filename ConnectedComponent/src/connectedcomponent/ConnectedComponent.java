/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectedcomponent;


import java.util.Scanner;
import java.util.ArrayList;


public class ConnectedComponent {
    private static int rows;
    private static int cols; 
    
    public static void main(String [] args) {
        /* Save input grid */
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        cols = scan.nextInt();
        int [][] grid = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                grid[row][col] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println(largestRegion(grid));
    }
    
       public static int largestRegion(int [][] grid) {
        int maxRegion = 0;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    int size  = findLargestRegion(grid, row, col);
                    maxRegion = Math.max(maxRegion, size);
                }
            }
        }
        return maxRegion;
    }
    
    private static int findLargestRegion(int [][] grid, int row, int col) {
      
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid == null || grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0; 
        int size = 1;       
 
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (!(r == row && c == col)) {
                    size += findLargestRegion(grid, r, c);
                }
            }
        }

        return size;
    }
}