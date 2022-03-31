package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class fillArry {
    public static void main(String [ ] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 20");
        int num=scanner.nextInt();
        int [] arr= new int[num];
        Arrays.fill(arr,8);
        System.out.println(Arrays.toString(arr));
        Pointfill();
    }
    public static void Pointfill(){
        Point[] pint=new Point[4];
        Arrays.fill(pint,0,2,new Point(1,2));
        System.out.println(Arrays.toString(pint));
    }
}
