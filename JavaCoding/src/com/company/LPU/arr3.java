package com.company.LPU;

import java.util.Scanner;

public class arr3 {

    public static String check(String x,String y){
        int n1=x.length();
        int n2=y.length();
        if(n1!=n2){
            return "No";
        }
        String ans="Yes";
        for(int i=0;i<n1;i++){
            if(x.charAt(i)==y.charAt(i) || x.charAt(i)=='?' || y.charAt(i)=='?'){
                ans="Yes";
            }else{
                ans="No";
                break;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        System.out.println();
        System.out.println(check(x,y));
    }
}
