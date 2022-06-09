# Count Inversion
arr=[2,4,1,3,5]
n=len(arr)
ans=[]
for i in range(n):
    for j in range(i+1,n):
        if(arr[j]<arr[i]):
            ans.append((arr[i],arr[j]))

print(ans)