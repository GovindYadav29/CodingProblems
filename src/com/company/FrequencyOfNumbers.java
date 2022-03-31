package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyOfNumbers {
    public static void main(String govind[]){
       /* int count=0;
        System.out.println("enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array= new int[size];
        System.out.println("enter the elements of array:");
        for(int i =0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        for(int j=0;j<array.length;j++){
            count=1;
            for(int k=j+1;k<array.length;k++){
                if(array[j]==array[k])
                    count++;
            }
            System.out.println(array[j]+" occurs "+ count);
            count=0;

        }

        */
       /* ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements array");
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            integers.add(scanner.nextInt());
        }
        int count=0;
        System.out.println("enter the elements you want the frequency");
        int check= scanner.nextInt();

            if(integers.contains(check)){
                count++;
                System.out.println(check +"  occurs "+ count);
            }
           // System.out.println();
            else {
                System.out.println(check+"  not present ");
            }

*/
        int[] numbers={1,1, 2,3,3,4,4,5};
        int searchElement=3;
        System.out.println();
        GetOccurrenece(numbers,searchElement);
    }

    private static int GetOccurrenece(int[] numbers, int searchElement) {
        int occ=0;
        for(int i=0 ; i < numbers.length; i++){
            if(searchElement==numbers[ i ]){
                occ++;

            }
        }
        return occ;
    }
}
