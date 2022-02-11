package com.company.LPU;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] l=new int[n];
        int[] r=new int[n];
        int[] lr=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            r[j]=sc.nextInt();
            lr[j]=l[j]*r[j];
        }

        int max=0;
        for(int x:lr){
            if(max<x){
                max=x;
            }
        }
        int ans=-1;
        for(int k=0;k<n;k++){
            if(lr[k]==max){
                if(ans==-1){
                    ans=k;
                }
                else if (r[k]>r[ans]){
                    ans=k;
                }else{
                    continue;
                }
            }
        }
        System.out.println(ans+1);
    }
}
