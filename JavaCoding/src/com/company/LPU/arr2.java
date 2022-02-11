package com.company.LPU;

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int w=0;
        int l=0;
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                w=w+1;
                if(w==11){
                    ans="Win";
                    break;
                }
            }else{
                l=l+1;
                if(l==11) {
                    ans = "Lose";
                    break;
                }
            }
        }
if(ans.equals("")){
    if(w==10 && l==10){
        ans="Win";
    }

}

        System.out.println(ans);
    }
}
