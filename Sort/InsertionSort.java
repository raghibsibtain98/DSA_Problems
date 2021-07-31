package com.shibu;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, num);
        for(int i = 0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void insertionSort(int arr[], int length){
        for(int i = 1; i<length; i++){
            int j = i-1;
            int temp = arr[j+1];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
