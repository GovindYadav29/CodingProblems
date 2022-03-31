package com.company;

import java.util.Scanner;

public class CheckWhiteSpace {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st=sc.nextLine();
        for(int i=0;i<st.length();i++)
        {
            if(Character.isWhitespace(st.charAt(i))){
                System.out.print(st.charAt(i)+" ");
        }
            else {
                System.out.print(st.charAt(i)+" ");
            }
        }
    }
}
