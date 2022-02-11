x=121
y=x
num=0
if(x<0):
    print("False")
while(x>0):
    num=num*10+(x%10)
    x=int(x/10)

if(num==y):
    print("True")
    print(num)
else:
    print ("False")
    print(num)