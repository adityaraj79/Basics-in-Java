package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static void addTwoNumbers(int sum){
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

        addTwoNumbers(sum);  //call the function

    }
}
