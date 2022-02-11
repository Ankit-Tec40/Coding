package com.company.LPU;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the side of square hall");
        x=sc.nextInt();
        System.out.println("Enter the side of square table");
        y=sc.nextInt();
        z=(x*x)-(y*y);
        System.out.println("Area to be decorated is "+z);


    }
}
