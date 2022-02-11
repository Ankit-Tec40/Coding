package com.company.LPU;

import java.util.Scanner;

public class arr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int z=0;
        int o=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                z++;
            }else{
                o++;
            }
        }

        if(z==1 || o==1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
