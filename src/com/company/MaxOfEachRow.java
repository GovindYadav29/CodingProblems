package com.company;

import java.util.Scanner;

public class MaxOfEachRow {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println();
        System.out.print("enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = scanner.nextInt();


        for (int i = 0; i < rows; i++) {
            int max=arr[i][0];
            int min=arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                max = arr[i][j] > max ? arr[i][j] : max;
                min = arr[i][j] < max ? arr[i][j] : min;
            }
            System.out.println("max of row " + (i+1) +"="+ max);
            System.out.println("min of row " + (i+1) +"="+ min);
        }
    }

}
