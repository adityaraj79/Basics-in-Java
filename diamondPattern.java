package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=m-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = m-1; i>=1; i--){
            for(int j = 1; j<=m-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
