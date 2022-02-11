s="-2147483648"
num=0
sign=1
numbers={'0','1','2','3','4','5','6','7','8','9'}
space={" "}
sin={"-","+"}

for x in s:
    if x in space:
        continue
    elif x in sin:
        if(x=="-"):
            sign=-1
            sin={}
            space={}
            continue
        else:
            sign=+1
            sin={}
            space={}
            continue
    elif x in numbers:
        num=num*10+int(x)
        sin={}
        space={}
        continue
    else:
        break
        


num=sign*num
if(num>-2147483648 and num<2147483647):
    print(num)
elif(num<=-2147483648):
    print(-2147483648)
else:
    print (2147483647)
