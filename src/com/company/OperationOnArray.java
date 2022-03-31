package com.company;

import java.util.Scanner;

public class OperationOnArray {
    public static void  main(String govindSonam[]){
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr= new int[size];
        System.out.println("enter the " +size+" elements of array");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sumOfArray(arr);
        ProductOfArray(arr);
    }

    private static void sumOfArray(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("sum:");
        System.out.print(sum);
        System.out.print("   average:");
        System.out.print(sum/ arr.length);
    }

    private static void ProductOfArray(int[] arr) {
        int product=1;
        for (int i =0;i< arr.length;i++){
            product*=arr[i];
        }
        System.out.print("   product:");
        System.out.print(product);
    }
}
