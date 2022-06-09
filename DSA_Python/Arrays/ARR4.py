# Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
arr=[1,2,0,1,0,2,0,1,1,0,2,0,1]
n=len(arr)
l=0
m=0
h=n-1

while(m<=h):
    if(arr[m]==0):
        arr[l],arr[m]=arr[m],arr[l]
        l+=1
        m+=1
    elif(arr[m]==1):
        m+=1
    else:
        arr[m],arr[h]=arr[h],arr[m]
        h-=1


print(arr)