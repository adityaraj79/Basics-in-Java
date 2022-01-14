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
              //output:Tony Stark
      
      // 2) Length
       
        System.out.println(fullname.length());
                //output:10
      
      // 3) CharAt
      
         for(int i = 0; i<fullname.length(); i++){
           System.out.println(fullname.charAt(i));
         }  
                 //output:  T
                 //         o
                 //         n
                 //         y
                 //           
                 //         S
                 //         t
                 //         a
                 //         r
                 //         k   
            
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
              //output:String are equal
            
        //if( name1 == name2 ){
        //    System.out.println("String are equal");
        //}else{                                                 //we can also use this in place of the above
        //    System.out.println("String are not equal");          But it doesn't work in some case .
        //}  
            
        // 5) Substring

        String sentence = "My name is Tony Stark";
        String name = sentence.substring(11,15);
        System.out.println(name);
              //output:Tony

    }
}
