# Selection sort ---------------> Tc=

def sortArr(arr):
    initial=0
    while(initial<len(arr)-1):
        minIdx=initial
        for i in range(initial,len(arr)):
            if arr[i]<arr[minIdx]:
                minIdx=i
        arr[initial],arr[minIdx]=arr[minIdx],arr[initial]
        initial+=1
    return arr



arr=[3,6,4,9,22,56,75,41,2,90,57]
print(sortArr(arr))