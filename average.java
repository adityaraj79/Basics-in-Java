package com.basicsinjava;

        import java.util.Scanner;

public class Main {

    public static int averageOfThreeNumbers(int a, int b, int c){
        int average = (a+b+c)/3;
        System.out.println("average of three numbers is : " + average);
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        averageOfThreeNumbers(a,b,c);
    }
}
