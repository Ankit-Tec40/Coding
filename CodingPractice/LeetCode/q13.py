str="MCMXCIV"
res=0
pre=0
roman={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
for x in str:
    res=res+roman[x]
    if(pre<roman[x]):
        res=res-2*pre
    pre=roman[x]


print(res)