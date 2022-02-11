package com.company.LPU;

import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
        sc.nextLine();
        String[] s=sc.nextLine().split(" ");
        int [] arr=new int[s.length];


        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }

        if(arr.length==n){
            Arrays.sort(arr);
            System.out.println(arr[0]+" "+arr[n-1]);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
