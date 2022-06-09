# Merge Intervals
def mergeInt(arr):
    ans=[]
    n=len(arr)
    if(n<=1):
        return arr

    arr.sort(key=lambda i: i[0])
    curr=arr[0]
    for i in range(1,n):
        if (arr[i][0]<=curr[1]):
            if(arr[i][1]>curr[1]):
                curr[1]=arr[i][1]
        else:
            ans.append(curr)
            curr=arr[i]

    ans.append(curr)
    return ans
    



intervals = [[1,3],[8,10],[15,18],[2,6]]
print(mergeInt(intervals))