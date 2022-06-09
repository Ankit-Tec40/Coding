# Write a program to cyclically rotate an array by one.
arr=[1,2,3,4,5,6,7,8]
k=1
n=len(arr)
print(arr[n-k:]+arr[0:n-k])