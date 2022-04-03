package com.company.DSA_Arrays;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(peakElement(arr,n));
    }

    public static int peakElement(int[] arr,int n)
    {
        if(n==1){
            return(0);
        }
        if(arr[0]>arr[1]){
            return(0);
        }
        if(arr[n-1]>arr[n-2]){
            return(n-1);
        }
        for (int j=1;j<n-1;j++){
            if(arr[j]>arr[j-1] && arr[j]>arr[j+1]){
                return(j);
            }
        }
        return(-1);

    }
}
