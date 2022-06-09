# Move all the negative elements to one side of the array
arr=[1,-3,5,-2,7,-4,4,-13,6,-11]
l=0
for i in range(len(arr)):
    if(arr[i]<0):
        arr[l],arr[i]=arr[i],arr[l]
        l+=1

print(arr)
