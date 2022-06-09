def sortArr(arr):
    n=len(arr)
    for i in range(1,n):
        val=arr[i]
        for j in range(i-1,-1,-1):
            if val<arr[j]:
                arr[j+1]=arr[j]
                arr[j]=val
            else:
                break
    return arr


        





arr=[3,6,4,9,22,56,75,41,2,90,57]
print(sortArr(arr))


# ------->O(n^2)