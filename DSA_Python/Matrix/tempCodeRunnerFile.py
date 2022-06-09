n=len(mat)
m=len(mat[0])
t,d,l,r=0,n-1,0,m-1
dir=0
while(l<=r and t<=d):
    match dir:
        case 0:
            for i in range(t,r+1):
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
            for i in range(d,t+1):
                print(mat[l][i],end=" ")
            l-=1
    dir=(dir+1)%4