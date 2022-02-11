package com.company.LPU;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] ml=new int[m];
        int[] kl=new int[k];
        for(int i=0;i<m;i++){
            ml[i]=sc.nextInt();
        }
        for(int j=0;j<k;j++){
            kl[j]=sc.nextInt();
        }
        int ans=0;
        for(int x:ml){
            for(int y:kl){
                if(x==y){
                    ans++;
                }
            }
        }


        System.out.println(ans+" "+(n-(m+k-ans)));
    }
}
