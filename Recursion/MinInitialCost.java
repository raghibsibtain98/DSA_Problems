package com.shibu;

import java.util.Scanner;

public class MinInitialCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int row=3, col=3;
        int[][] arr = {{-2,-3,3},
                {-5,-10,1},
                {10,30,-5}};
        int[][] arr1 = minInitialPoint(arr);
        for(int i = 0; i<arr1.length;i++){
            for(int j=0; j<arr[1].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
    }
    static int[][] minInitialPoint(int[][] a){
        int row = a.length;
        int col = a[0].length;
        int[][] points = new int[row][col];
        points[row-1][col-1] = a[row-1][col-1]>0? 1: Math.abs(a[row-1][col-1])+1;

        for(int i = (row-2); i>=0; i--){
            points[i][col-1] = Math.max((points[i+1][col-1] - a[i][col-1]),1);
        }
        for(int j = (col-2); j>=0; j--){
            points[row-1][j] = Math.max((points[row-1][j+1] - a[row-1][j]),1);
        }
        for(int i = (row-2) ; i>=0; i--){
            for(int j = (col-2); j>=0; j--){
                int min_exit_point = Math.min(points[i+1][j], points[i][j+1]);
                points[i][j] = Math.max((min_exit_point - a[i][j]), 1);
            }
        }
        //return points[0][0];
        return points;
    }
}
