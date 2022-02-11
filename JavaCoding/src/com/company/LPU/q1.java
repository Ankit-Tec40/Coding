package com.company.LPU;

import java.util.HashMap;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> rooms=new HashMap<>();
        for(int x:arr){
            if(rooms.containsKey(x)){
                rooms.replace(x,rooms.get(x)+1);
            }else{
                rooms.put(x,1);
            }
        }
        int max=0;
        int ans=0;
        for(int x:rooms.values()){
            ans=ans+x;
            if (x>max){
                max=x;
            }
        }
        System.out.println(ans-max);
    }
}
