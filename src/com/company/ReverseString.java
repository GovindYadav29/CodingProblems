package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
    public static void main(String govind[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String st= sc.nextLine();
        String reverse="";
        //ArrayList<String> strings= new ArrayList<>();
        //  strings
        for(int i = st.length()-1;i>=0;i--){

            //first method System.out.print(st.charAt(i));
            reverse+=st.charAt(i);


        }
        if(reverse.equals(st)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        //System.out.print(reverse);

    }
}
