package com.company.LPU;

import java.util.Scanner;

public class a2dQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int count=0;
        for(int[] x:arr){
            for(int y:x){
                if(y>18 && y<60){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
