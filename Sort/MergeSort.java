package com.shibu;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        for(int i = 0; i<num; i++){
            a[i] = sc.nextInt();
        }
        mergeSort(a,0,(num-1));
        for(int i = 0; i<num; i++){
            System.out.print(a[i] + " ");
        }
    }
    static void mergeSort(int arr[], int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    static void merge(int arr[], int l ,int mid, int r){
        int i = l;
        int k = l;
        int j = mid+1;
        int[] b = new int[arr.length];
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                b[k] = arr[i];
                k++; i++;
            }else{
                b[k]= arr[j];
                k++; j++;
            }
        }
        if(i>mid){
            while(j<=r){
                b[k] = arr[j];
                k++ ; j++;
            }
        }else if(j>r){
            while(i<=mid){
                b[k] = arr[i];
                k++; i++;
            }
        }
        for(int m = l; m <=r; m++){
            arr[m] = b[m];
        }
    }
}
