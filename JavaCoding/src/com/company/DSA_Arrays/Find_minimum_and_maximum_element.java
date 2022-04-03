package com.company.DSA_Arrays;


class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}


class Compute
{
    static pair getMinMax(long a[], long n)
    {
        //Write your code
        pair data = new pair(a[0],a[0]);
        long min=a[0];
        long max=a[0];
        for(long x:a){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }

        data.first=min;
        data.second=max;
        return data;

    }
}

