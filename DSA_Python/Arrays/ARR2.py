#Find the maximum and minimum element in an array
arr=[4,1,7,8,3,5,6,4,8,25]
min,max=arr[0],arr[0]
for x in arr:
    if x<min:
        min=x;
    if x>max:
        max=x
print("min=",min," max=",max)