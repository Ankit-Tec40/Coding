# Minimise the maximum difference between heights [V.IMP]
def minHeight(arr,k):
    n=len(arr)
    arr.sort()
    minDiff=arr[-1]-arr[0]
    smallest=arr[0]+k
    largest=arr[-1]-k
    for i in range(1,n):
        if arr[i]-k<smallest and arr[i]-k>0:
            smallest=arr[i]-k
        if arr[i]+k>largest:
            largest=arr[i]+k
        if largest-smallest<minDiff:
            minDiff=largest-smallest
    return minDiff



arr=[1, 5, 8, 10]
print(minHeight(arr,2))

