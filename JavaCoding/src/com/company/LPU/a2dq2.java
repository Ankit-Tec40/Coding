package com.company.LPU;

import java.util.Scanner;

public class a2dq2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==20){
                    if(i>0&&i<n-1 && j>0&&j<n-1){
                        if(arr[i][j-1]!=arr[i][j+1] || arr[i-1][j]!=arr[i+1][j]
                                || arr[i][j-1]!=arr[i-1][j] || arr[i+1][j]!=arr[i][j+1]
                                ||arr[i][j-1]!=arr[i+1][j] || arr[i-1][j]!=arr[i][j+1]){
                            arr[i][j]=0;
                        }
                    }
                    else if(i==0 && j==0 || i==n-1 &&j==n-1 || i==0&&j==n-1 || i==n-1&&j==0){

                    }
                }
            }
        }

    }
}


/*
5
20 2 20 20 20
3 20 20 6 20
20 20 20 20 0
20 2 20 0 1
20 20 20 20 0
 */