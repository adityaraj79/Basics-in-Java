package com.basicsinjava;

        import java.util.Scanner;

public class Main {

    public static int sumOfAllOdds(int a){
        int sum = 0;
        for(int i=1; i<=a; i=i+4){
            sum = sum+i;
        }
        System.out.println("sum of all odds is : " + diff);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOfAllOdds(a);
    }
}
