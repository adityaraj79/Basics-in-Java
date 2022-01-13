package com.basicsinjava;

        import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int [size];        //  We have not mention the numbers.

        for(int i=0; i<size; i++){
            System.out.println(number [i] );
        }
    }
}

package com.basicsinjava;

        import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int [size];        //  We have mentioned the numbers to take as input.

        for(int i = 0; i<size; i++){
            number[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            System.out.println(number [i] );
        }
    }
}
