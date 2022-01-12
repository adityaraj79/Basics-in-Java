package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static void findFactorial(int a){
        int factorial = 1;

        for(int i = a; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

       findFactorial(a);  //call the function
    }
}
