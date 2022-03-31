package com.company;

//public class CountInversion {
//}
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class CountInversion
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for(long i = 0; i < n; i++)
                arr[(int)i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, n));

        }
    }
}
// } Driver Code Ends



      /*  int countInvers=0;
        for(int i =0;i<N;i++)
        {
            for(int j =i+1;j<N;j++)
            {
                if(arr[i]>arr[j] && i<j)
                {
                    countInvers++;
                }
            }
        }
        return (long)countInvers;
        */


class Solution
{
    static long merge(long [] arr, long l, long mid, long r){
        long n1 = mid - l + 1;
        long n2 = r - mid;
        long count = 0;

        long [] arr1 = new long[(int)n1];
        long [] arr2 = new long[(int)n2];

        for (int i = 0; i < n1; i++){
            arr1[i] = arr[(int)l + i];
        }

        for (int i = 0; i < n2; i++){
            arr2[i] = arr[(int)mid + 1 + i];
        }

        int k = (int)l;
        int p1 = 0, p2 = 0;

        while (p1 < n1 && p2 < n2){
            if (arr1[p1] > arr2[p2]){
                arr[k++] = arr2[p2++];
                count += n1 - p1;
            }

            else if (arr1[p1] < arr2[p2]){
                arr[k++] = arr1[p1++];
            }

            else
                arr[k++] = arr1[p1++];
        }

        while (p1 < n1)
            arr[k++] = arr1[p1++];
        while (p2 < n2)
            arr[k++] = arr2[p2++];

        return count;
    }

    static long mergeCount(long [] arr, long l, long r){
        long count = 0;

        if (l < r)
        {
            long mid = (l + r) / 2;

            count += mergeCount(arr, l, mid);
            count += mergeCount(arr, mid + 1, r);
            count += merge(arr, l, mid, r);
        }

        return count;
    }

    static long inversionCount(long arr[], long N)
    {
        return mergeCount(arr, 0, N - 1);
    }
}






