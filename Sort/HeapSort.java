package com.shibu;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {10,30,5, 60, -100, 9};
        int size = arr.length;
        buildHeap(arr, size);
        System.out.println(Arrays.toString(arr));
        heapSort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
    //n--> size of the array (a)
    static void heapify(int[] a, int n, int i){
        int largest = i;
        int left = (2*i)+1;
        int right = (2*i)+2;

        if(left<n && a[left]>a[largest]){
            largest = left;
        }
        if(right<n && a[right]>a[largest]){
            largest = right;
        }
        if(largest!=i){
            int temp = a[i]; //swapping
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, n, largest);
        }
    }
    static void buildHeap(int[] a, int n){
        for(int i=(n/2)-1 ; i >=0; i--){
            heapify(a,n,i);
        }
    }
    static void heapSort(int[] a, int n){
        for(int i=n-1; i>=1; i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i,0);
         }
    }
}
