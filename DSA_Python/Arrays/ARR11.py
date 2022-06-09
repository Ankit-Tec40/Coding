# find duplicate in an array of N+1 Integers
def dub(arr):
    dic={}
    for x in arr:
        if x in dic:
            return x
        else:
            dic[x]=1



print(dub([1,3,4,2,2]))