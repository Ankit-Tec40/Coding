# Merge 2 sorted arrays without using Extra space.
def merge(arr1,arr2):
    n1=len(arr1)
    n2=len(arr2)
    for i in range(n1):
        if arr1[i]>arr2[0]:
            arr1[i],arr2[0]=arr2[0],arr1[i]
            arr2.sort()


    return arr1+arr2

def mergeSort(arr1,arr2):
    ans=[]
    n1=len(arr1)
    n2=len(arr2)
    i=0
    j=0
    while(i<n1 and j<n2):
        if arr1[i]<arr2[j]:
            ans.append(arr1[i])
            i+=1
        else:
            ans.append(arr2[j])
            j+=1

    if i<n1:
        ans+=arr1[i:]
    if j<n2:
        ans+=arr2[j:]

    return ans






print(mergeSort([1,3,6,8,13],[2,7,9,14,17,25,28]))