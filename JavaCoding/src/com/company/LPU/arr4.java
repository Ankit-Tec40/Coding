package com.company.LPU;

import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=0;
        int b=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                a++;
            }else{
                b++;
            }
        }

        if(a>b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }

    }
}
