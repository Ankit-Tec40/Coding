package com.company.DSA_Arrays;

import java.io.*;
import java.util.*;


class GFG{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }

    }
}// } Driver Code Ends

class Solution
{
    int[] sortArr(int[] arr, int n)
    {
        // code here
        int []a={1,2};
        return a;

    }
}
