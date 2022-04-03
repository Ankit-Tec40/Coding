package com.company.DSA_Arrays;

import java.util.HashMap;

class Solution2{
    int findFrequency(int A[], int x){
        int ans=0;
        for(int val:A){
            if (val==x){
                ans+=1;
            }
        }
        return ans;

    }
}
