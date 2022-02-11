package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lst=new ArrayList<>(List.of(1,1,1,1,1,1,2,3,4,4));
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=lst.size();
        for(int i=0;i<n;i++){
            int key=lst.get(i);
            if (map.containsKey(key)){
                map.replace(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }

        ArrayList<Integer> val=new ArrayList<>();
        for(int x:map.keySet()){
            val.add(x);
        }





        System.out.println(val);

    }
}
