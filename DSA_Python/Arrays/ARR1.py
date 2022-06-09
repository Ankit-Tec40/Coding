#Reverse the array
arr=[1,2,3,4,5,6,7,8]
n=len(arr)
for i in range(n//2):
    arr[i],arr[n-1-i]=arr[n-1-i],arr[i]
print(arr)