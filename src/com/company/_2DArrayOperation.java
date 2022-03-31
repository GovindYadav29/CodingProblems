package com.company;

public class _2DArrayOperation {
    public static void main(String[] operation){
        int [][] numbers= {{1,2,3},{4,5,6,7}};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=0;
            for(int j=0;j<numbers[i].length;j++){
                sum+=numbers[i][j];
               // sum2 = numbers[j][i];
            }
            System.out.println("sum of row "+(i+1)+" is: "+ sum);
        }
        //System.out.println("sum by rows "+ sum);
       // System.out.println("sum by columns "+ sum2);
    }
}
