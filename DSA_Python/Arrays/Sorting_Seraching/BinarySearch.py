#Binary Search  -----------TC=O(log n)
def search(arr,val,l,r): 
    if r>=l:
        mid=l+(r-l)//2
        if arr[mid]==val:
            return mid
        elif arr[mid]>val:
            return search(arr,val,l,mid-1)
        else:
            return search(arr,val,mid+1,r)
    else:
        return -1

def search2(arr,val):
    start=0
    end=len(arr)-1
    while(end>=start):
        mid=start+(end-start)//2
        if arr[mid]==val:
            return mid

        elif val>arr[mid]:
            start=mid+1
        else:
            end=mid-1

    return -1
        
    



arr=[1,2,3,4,5,6,7,8,9,10]
print(search(arr,6,0,len(arr)-1))
print(search2(arr,10))