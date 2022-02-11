package com.company.LPU;

import java.util.HashMap;
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char key=s.charAt(i);
            if(hm.containsKey(key)){
                hm.replace(key,hm.get(key)+1);
            }else{
                hm.put(key,1);
            }
        }

        int sumall=0;
        for(int y:hm.values()){
            sumall=sumall+y;
        }

        String ans="NO";
        for(int x:hm.values()){
            if(sumall-x==x){
                ans="Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}
