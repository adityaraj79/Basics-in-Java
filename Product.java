package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static int findMultiply(int a, int b){
        int multiply = a*b;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = findMultiply(a,b);

        System.out.println("Product of two numbers is : " + multiply);  //call the function

    }
}
