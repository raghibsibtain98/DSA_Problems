package com.shibu;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr, num);
        for(int i = 0; i<num; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selectionSort(int arr[], int num){
        for(int i = 0; i<num; i++){
            int min = i;
            for(int j = i; j<num; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
