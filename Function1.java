package com.basicsinjava;

import java.util.Scanner;

public class Main {
    public static void printMyName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name);

    }
}
