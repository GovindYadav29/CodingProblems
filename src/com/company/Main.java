package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter the 10 elements ");
        Scanner sc = new Scanner(System.in);


        for(int i =1;i<=10;i++)
        {
            int numbers=sc.nextInt();
            if(!num.contains(numbers))
                num.add(numbers);

        }
        Collections.sort(num);
        System.out.println(num);
    }
    }

