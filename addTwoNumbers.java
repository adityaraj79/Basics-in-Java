package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static int addTwoNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addTwoNumbers(a,b);

        System.out.println("sum of two numbers is : " + sum);  //call the function

    }
}
