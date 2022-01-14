package com.basicsinjava;

        import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Properties of String
        // 1) Concatenation

        String firstname = "Tony";
        String lastname ="Stark";
        String fullname = firstname+" "+lastname;
        System.out.println(fullname);
      
      // 2) Length
       
        System.out.println(fullname.length());
      
      // 3) CharAt
      
         for(int i = 0; i<fullname.length(); i++){
           System.out.println(fullname.charAt(i));
         }  
          

    }
}
