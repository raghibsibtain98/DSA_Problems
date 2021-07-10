package com.shibu;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for(int i = 0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void bubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){ //stopping till n-i-1 because the last element in arr
                                          // after each j for loop is the largest number in the array
                if(arr[j+1]<arr[j]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swapped){break;}
        }
    }
}
