package com.company.LPU;

import java.util.Scanner;

public class a2dq3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] bd=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                bd[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int[] x:bd ){
            for(int y:x){
                if(y!=20){
                    sum+=y;
                }
            }
        }

        System.out.println(sum);






    }
}

/*
5
20 20 1 20 3
20 20 20 20 20
20 20 20 20 20
20 20 20 20 20
6 20 3 20 20
 */

