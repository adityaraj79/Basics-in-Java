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
            
             // 4) Compare

        String name1 = "Tony";
        String name2 = "Tony";
        //s1>s2: +ve value
        //s1<s2: -ve value
        //s1==s2: 0

        //hello < wello
        //ahello < abello
        //ello>allo

        if( name1.compareTo(name2)==0 ){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
          

    }
}
