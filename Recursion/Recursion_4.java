package com.shibu;

import java.util.*;

public class Recursion_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = {{1, 1, 1, 1, 1, 1},
                     {1, 1, 0, 0, 2, 2},
                     {0, 0, 0, 0, 2, 2},
                     {0, 1, 1, 0, 0, 0},
                     {1, 1, 2, 2, 0, 0},
                     {2, 2, 2, 2, 0, 0}};
        int r = sc.nextInt();
        int c = sc.nextInt();
        int prevFill = sc.nextInt();
        int toFill = sc.nextInt();
        matrixFill(a, r, c, prevFill, toFill);
        printArray(a);
    }
    static void matrixFill(int arr[][], int r, int c, int prevFill, int toFill){
        int rows = arr.length;
        int cols = arr[0].length;
        if(r<0 || r>=rows || c<0 || c>=cols){
            return;
        }
        if(arr[r][c]!= prevFill){
            return;
        }
        arr[r][c] = toFill;
        matrixFill(arr, r-1, c, prevFill, toFill);
        matrixFill(arr, r ,c-1, prevFill, toFill);
        matrixFill(arr,r+1, c, prevFill, toFill);
        matrixFill(arr, r,c+1, prevFill, toFill);
    }
    static void printArray(int a[][]){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
