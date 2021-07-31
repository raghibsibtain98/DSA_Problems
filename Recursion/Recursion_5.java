package com.shibu;
import java.util.*;

public class Recursion_5{
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        stringPermutations(s,0, s.length()-1);
    }
    static void stringPermutations(String s, int l, int r){
        if(l==r) {
            if (!set.contains(s)) {
                set.add(s);
                System.out.println(s);
            }
        }

        for(int i = l; i<=r; i++)
        {
            s = interChange(s, l ,i);
            stringPermutations(s, l+1, r);
            s = interChange(s, l ,i);
        }
    }
    static String interChange(String s , int a, int b){
        char[] arr = s.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return String.valueOf(arr);
    }
}

