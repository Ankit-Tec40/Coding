# Find the "Kth" max and min element of an array
from heapq import *
from heapq import _heapify_max
arr=[2,4,2,4,5,7,87,82,1,5,9]
heapify(arr)
# _heapify_max(arr)


kmax=nlargest(2,arr)
kmin=nsmallest(3,arr)

print(kmax[-1])
print(kmin[-1])
