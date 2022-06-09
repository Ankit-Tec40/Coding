# Minimum no. of Jumps to reach end of an array

from operator import indexOf


def maxJump(arr):
    n=len(arr)
    if n==0 or n==1:
        return 0

    ans=0
    curr=0
    while curr<n:
        lst=curr+arr[curr] if curr+arr[curr]<=n else n
        maxidx=curr
        for i in range(curr+1,lst+1):
            if arr[i]>arr[maxidx]:
                maxidx=i
        curr=maxidx
        ans+=1
    return ans







arr=[1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
print(maxJump(arr))
