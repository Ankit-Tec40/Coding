# Spiral traversal on a Matrix
mat=[
    [1,2,3,4,5],
    [6,7,8,9,10],
    [11,12,13,14,15],
    [16,17,18,19,20],
    [21,22,23,24,25]
]

n=len(mat[0])
m=len(mat)
t,d=0,n-1
l,r=0,m-1
dir=0
while(l<=r or t<=d):
    match dir:
        case 0:
            for i in range(l,r+1):
                print(mat[t][i],end=" ")
            t+=1
        case 1:
            for i in range(t,d+1):
                print(mat[r][i],end=" ")
            r-=1
        case 2:
            for i in range(r,l-1,-1):
                print(mat[d][i],end=" ")
            d-=1
        case 3:
            for i in range(d,t-1,-1):
                print(mat[l][i],end=" ")
            l+=1
    dir=(dir+1)%4

