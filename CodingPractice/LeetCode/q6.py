s="ABCDE"
R=2
n=len(s)
d={}
ans=[]
for i in range(2):
    d[i]=[]

pos=0
sgn=1
for j in range(n):
    d[pos].append(s[j])
    if(pos==R-1):
        sgn=-1
    if(pos==0):
        sgn=1
    if(sgn==1):
        pos+=1
    if(sgn==-1):
        pos-=1

for x in d:
    ans=ans+d[x]

print("".join(ans))

