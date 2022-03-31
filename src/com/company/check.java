package com.company;

public class check {
    public static  void main(String args[]){
        int x=5;
        if(x<5)
            System.out.println("Hello");
        System.out.println("first pass: "+sum(1,7));
        System.out.println("second pass: "+sum( 1,3,9));
        System.out.println("third pass: "+sum(new int[]{1,3,6}));
    }
    private static int sum(int ... num){
        int sum=0;
       for(int i=0;i<num.length;i++)

          sum+=num[i];
        return sum;
    }
}
