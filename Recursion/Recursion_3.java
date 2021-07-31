package com.shibu;
import java.util.*;

public class Recursion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println(paths(row, col));
    }
    static int paths(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        return (paths(row,col-1) + paths(col, row-1));
    }
}
