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
            for(int j = i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
