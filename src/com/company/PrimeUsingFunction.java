package com.company;

import java.util.Scanner;

public class PrimeUsingFunction {
    public static void main(String go[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the last number upto which you want to print the prime numbers");

        int end = sc.nextInt();
        printPrimeBetween(1,end);
    }
    public static boolean isPrime(int num){
        for(int i=2;i<=num/2;i++)
            if(num%i==0)
                return false;
            return true;

    }
    public static void printPrimeBetween(int start ,int end){
        for(int i= start;i<=end;i++)
            if(isPrime(i))
                System.out.print(i+" ");
    }

}
