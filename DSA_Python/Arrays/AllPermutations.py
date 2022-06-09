

def allPermutations(arr):
    ans=[]
    n=len(arr)
    if (n==0):
        return []
    if (n==1):
        return [arr]
    return (permutations(arr))
    

def permutations(arr):
    pass


    



arr=[1,2,3]
print(permutations(arr))