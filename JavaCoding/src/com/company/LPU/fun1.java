package com.company.LPU;

import java.util.Scanner;

public class fun1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println(findValue(x,y));
    }

    public static int findValue(int x,int y){
        if(y==0) {
            return x;
        }
        return findValue(y,x%y);
    }
}
