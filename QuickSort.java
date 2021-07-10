package com.shibu;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, num-1);
        for(int i = 0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<= pivot && i<high){i++;}
            while(arr[j]> pivot && j>low){j--;}

            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
}

