package com.shibu;

import java.util.Scanner;

public class Recursion_2 {
    static int stepCount = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b) + " " + stepCount);
        stepCount = 0;
        System.out.println(fastPower(a,b) + " " +  stepCount);
    }
    static int power(int a, int b){
        stepCount++;
        if (b==0){ return 1;}
        return power(a, b-1)*a ;
    }

    static int fastPower(int a , int b){
        stepCount++;
        if (b==0){ return 1;}
         if(b%2==0){
             return fastPower(a*a, b/2);
         }
         return a* fastPower(a, b-1);
    }
}
