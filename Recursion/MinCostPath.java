package com.shibu;

import java.util.Scanner;

public class MinCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(minCostPath(a, row-1, col-1));
    }
    static int minCostPath(int a[][], int row, int col){
        if(row<0 || col<0){return Integer.MAX_VALUE;}; //if its maxcost then give Min_Value
        if(row==0 && col==0){
            return a[row][col];
        }

        return a[row][col]+(Math.min(minCostPath(a, row-1, col), minCostPath(a, row,col-1)));
    }
}
