# find Largest sum contiguous Subarray [V. IMP]  --> Kadane's Algorithm
arr=[2,7,-5,9,3,-2,6,-5]
ans=arr[0]
sum=0
for i in range(len(arr)):
    sum=sum+arr[i]
    if sum>ans:
        ans=sum
    if sum<0:
        sum=0

print(ans)
