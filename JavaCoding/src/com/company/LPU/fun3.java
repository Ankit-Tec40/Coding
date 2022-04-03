package com.company.LPU;

import java.util.Scanner;

public class fun3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        System.out.println(fiboLastDigit(x)%10);
    }

    public static int fiboLastDigit(int x) {
        if(x<=1){
            return x;
        }else{
            return (fiboLastDigit(x-1)+fiboLastDigit(x-2));
        }

    }
}
