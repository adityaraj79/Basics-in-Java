package com.basicsinjava;

        import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks [0] = 97;
        marks[1] = 98;                                //   This is quite Lengthy.
        marks[2] = 95;
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
//    OR
package com.basicsinjava;

        import java.util.*;

public class Main {

    public static void main(String[] args) {
        int marks[] = {97,98,95};                      //    This is OK.
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
