package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlaceOddElementsFirst {
    public static void main(String [] args){


        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number of elements of array:");
        int size = scanner.nextInt();
        int[] arr= new int[size];
        System.out.println("enter the elements:-");
        for(int i =0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        //PlaceOddFirst( arr);
        int temp[]= new int[size];
        Arrays.fill(temp,0);
        int j=0,k=temp.length-1,count=0;
        for(int i=0;i< temp.length;i++){
            if(arr[i]%2!=0){
                temp[j++]=arr[i];
                count++;
            }
            else{
                temp[k--]=arr[i];
            }
        }
        Arrays.sort(temp,count,arr.length);
        System.out.println(Arrays.toString(temp));

    }

  /*  private static void PlaceOddFirst(int[] arr) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        for(int i =0;i< arr.length;i++){
             if(arr[i]%2!=0) {
                 arrayList.add(arr[i]);
             }
            else
                arrayList.add(arr[i]);

        }

        System.out.println(arrayList);
    }*/
}
