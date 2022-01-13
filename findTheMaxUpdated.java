package com.basicsinjava;

        import java.util.Scanner;

public class Main {

    public static int printTheMax(int a, int b){
        if(a>b){
            System.out.println(a);
            return a;
        }else if(a<b){
            System.out.println(b);
            return b;
        }else if(a==b){
            System.out.println(a);
            return a;
        }
        return printTheMax(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printTheMax(a,b);
    }
}
