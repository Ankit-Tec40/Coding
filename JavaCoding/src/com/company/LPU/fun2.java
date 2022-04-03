package com.company.LPU;

import java.util.Scanner;

public class fun2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println(findValue(x,y));
    }

    public static String findValue(int x,int y) {
        int ny = 1;
        int t=y;
        while (t > 0) {
            t = (int) t / 10;
            ny=ny*10;
        }
        x=x-y;
        if(x%ny==0){
            return "Yes";
        }else{
            return "No";
        }
    }
}
