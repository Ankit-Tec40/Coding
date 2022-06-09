# Bubble Sort ----------->O(n^2)
def sortArr(arr):
    n=len(arr)
    for i in range(n-1):
        for j in range(n-1-i):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1]=arr[j+1],arr[j]
    return arr
        


arr=[3,6,4,9,22,56,75,41,2,90,57]
print(sortArr(arr))