package com.company;

public class answer {
    public static  void main(String [] args) {
        String str1="amazon";
        String str2="azonam";
        System.out.println(isRotated(str1,str2));

    }
        public static boolean isRotated(String str1, String str2)
        {
            // Your code here
            String st =" ";
            if(str1.length() != str2.length())
            {
                return false;
            }
            st = str1.substring(2,str1.length()) + str1.substring(0,2);
            System.out.println(st);
            if(st.equalsIgnoreCase(str2))
            {
                return true;
            }
            return false;
        }
    }

